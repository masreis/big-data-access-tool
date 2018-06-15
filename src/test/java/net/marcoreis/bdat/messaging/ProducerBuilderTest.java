package net.marcoreis.bdat.messaging;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.clients.producer.RecordMetadata;
import org.apache.log4j.Logger;
import org.junit.Test;

public class ProducerBuilderTest {

	private static Logger logger =
			Logger.getLogger(ProducerBuilderTest.class);

	@Test
	public void testSendSyncedMessage()
			throws InterruptedException, ExecutionException {

		String value = "Olá";
		ProducerRecord<Long, String> record =
				new ProducerRecord<Long, String>(
						IMessagingConstants.TOPIC_NAME, value);
		Producer<Long, String> producer =
				ProducerBuilder.createProducer();
		Future<RecordMetadata> sent = producer.send(record);
		RecordMetadata metadata = sent.get();
		logger.info("Offset: " + metadata.offset());
		producer.flush();
		producer.close();
	}

	@Test
	public void testSendAsyncedMessage()
			throws InterruptedException {
		final CountDownLatch countDownLatch =
				new CountDownLatch(10);
		Producer<Long, String> producer =
				ProducerBuilder.createProducer();

		String value = "Olá";
		ProducerRecord<Long, String> record =
				new ProducerRecord<Long, String>(
						IMessagingConstants.TOPIC_NAME, value);

		producer.send(record, (metadata, exception) -> {
			long time = System.currentTimeMillis();
			long elapsedTime = System.currentTimeMillis() - time;
			if (metadata != null) {
				System.out.printf("sent record(key=%s value=%s) "
						+ "meta(partition=%d, offset=%d) time=%d\n",
						record.key(), record.value(),
						metadata.partition(), metadata.offset(),
						elapsedTime);
			} else {
				exception.printStackTrace();
			}
			countDownLatch.countDown();
		});

		countDownLatch.await(25, TimeUnit.SECONDS);

	}
}

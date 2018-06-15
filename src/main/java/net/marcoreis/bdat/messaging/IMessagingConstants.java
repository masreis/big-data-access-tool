package net.marcoreis.bdat.messaging;

public interface IMessagingConstants {
	public static String KAFKA_BROKERS = "localhost:9092";
	public static Integer MESSAGE_COUNT = 5000;
	public static String CLIENT_ID = "data-ingestion-client";
	public static String TOPIC_NAME = "data-ingestion";
	public static String GROUP_ID_CONFIG =
			"group-consumer-data-ingestion";
	public static Integer MAX_NO_MESSAGE_FOUND_COUNT = 100;
	public static String OFFSET_RESET_LATEST = "latest";
	public static String OFFSET_RESET_EARLIER = "earliest";
	public static Integer MAX_POLL_RECORDS = 1;
}
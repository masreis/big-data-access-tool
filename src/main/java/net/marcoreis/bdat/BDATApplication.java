package net.marcoreis.bdat;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class BDATApplication {

//	private static Logger logger =
//			Logger.getLogger(BDATApplication.class);
//	private Session session;
//	private Cluster cluster;
	private String contactPoints =
			System.getProperty("server.cassandra");
	private String user = System.getProperty("user.cassandra");
	private String pwd =
			System.getProperty("password.cassandra");

	public static void main(String[] args) {
		SpringApplication.run(BDATApplication.class, args);
	}

//	@Bean(destroyMethod = "close")
//	public Session session() throws Exception {
//		if (session == null) {
//			session = cluster().connect();
//			logger.info("Session connect");
//		}
//		return session;
//	}
//
//	@Bean(destroyMethod = "close")
//	public Cluster cluster() throws Exception {
//		if (cluster == null) {
//			logger.info("Servidor Cassandra: " + contactPoints);
//			cluster = Cluster.builder()
//					.addContactPoints(contactPoints)
//					.withCredentials(user, pwd).build();
//			logger.info("Build cluster");
//		}
//		return cluster;
//	}

	// protected SpringApplicationBuilder configure(SpringApplicationBuilder
	// application) {
	// Application obj = new Application();
	// @SuppressWarnings("resource")
	// ConfigurableApplicationContext applicationContext = new
	// ClassPathXmlApplicationContext(
	// "META-INF/spring/applicationContext.xml");
	// applicationContext.registerShutdownHook();
	// applicationContext.getBeanFactory().autowireBeanProperties(obj,
	// AutowireCapableBeanFactory.AUTOWIRE_NO, false);
	// return application.sources(Application.class);
	// }
}

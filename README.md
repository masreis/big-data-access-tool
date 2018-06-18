# Big Data Access Tool
Big Data Access Tool (BDAT) is used creating big data systems. The tool provides an access mechanism and an ETL (extract, transform and load) framework, helping to shorten the path to create and deploy big data solutions. It could be used in the cloud, actually, this is the main purpose.

The main functionalities provided are: 

* An API based on RESTful web services;
* Import from relational databases;
* Export to relational databases;
* Messaging system;
* Bulk import to NoSQL databases;
* Supports data lakes based on HDFS and Object Storage;

The toos used or supported in the BDAT are:

* Sqoop;
* Spring Boot;
* Kafka;
* Cassandra;
* Hive;
* Spark;
* OpenStack Swift;

With the BDAT, the users have fast access to the data services, and the operations team has a simplified big data environment.

This is part of a Big Data as a Service (BDaaS) implementation, based on OpenStack. The BDaaS supports Hadoop, Spark, Cassandra, HBase and Hive solutions. The BDAT uses specialized techniques for creating big data systems in a BDaaS environment.

What is missing:

* An authentication mechanism;
* Docker;
* Kubernetes;

Parameters to start the application: 

* user.cassandra: Cassandra user;
* server.cassandra: Cassandra server;
* password.cassandra: Cassandra password;

Tutorial to configure Kafka (missing):

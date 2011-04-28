## Purpose ##

Provide an integrated Hello World application demonstrating standalone JPA persistence using Hibernate and PostgreSQL.

## Technologies ##

* Maven
* Hibernate
* JPA annotations
* PostgreSQL
* Log4J via SLF4J
* JUnit
* Hibernate maven plugin

## Setup and run ##

1. mvn clean package -DskipTests
2. Use target/hibernate3/sql/schema.ddl to create your database schema
3. mvn test
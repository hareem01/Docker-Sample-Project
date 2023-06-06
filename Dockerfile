FROM maven:3.6.3-openjdk-17

ADD target/testApp-0.0.1-SNAPSHOT.jar testApp-0.0.1-SNAPSHOT.jar

ENTRYPOINT ["java", "-jar", "/testApp-0.0.1-SNAPSHOT.jar"]

FROM java:8
ADD ./target/demo-0.0.1-SNAPSHOT.jar //
ENTRYPOINT ["java", "-jar", "./target/demo-0.0.1-SNAPSHOT.jar"]

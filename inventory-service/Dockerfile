FROM openjdk:17
VOLUME /tmp
COPY inventory-service/target/inventory-service-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar","/app.jar"]
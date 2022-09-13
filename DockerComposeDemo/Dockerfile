FROM adoptopenjdk/openjdk11
COPY ./target/*.jar /app.jar
ENTRYPOINT ["java", "-jar" ,"/app.jar"]
EXPOSE 8080
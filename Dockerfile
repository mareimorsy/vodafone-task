FROM mareimorsy/maven:1.0 AS build
ADD . /app
WORKDIR /app
RUN mvn package

FROM java:8
COPY --from=build /app/target/vodafone-demo-0.1.0.jar /app/vodafone-demo-0.1.0.jar
COPY --from=build /app/file.txt /app/file.txt
EXPOSE 8080
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/vodafone-demo-0.1.0.jar"]

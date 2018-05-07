# This docker file consists of a multi-stage builds.

# First stage : building the application
# --------------------------------------

# Customized maven image built on top of java:8 image
FROM mareimorsy/maven:1.0 AS build
ADD . /app
WORKDIR /app
RUN mvn package


# Second stage : building the production image
# --------------------------------------------------

FROM java:8
# Copying the jar file from the first stage image the the second stage image
COPY --from=build /app/target/vodafone-demo-0.1.0.jar /app/vodafone-demo-0.1.0.jar
COPY --from=build /app/file.txt /app/file.txt
EXPOSE 8080
WORKDIR /app
ENTRYPOINT ["java", "-jar", "/app/vodafone-demo-0.1.0.jar"]

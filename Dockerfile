FROM maven:3.5-jdk-8-alpine
WORKDIR /
COPY /Server/ / 
RUN mvn verify --fail-never
ENTRYPOINT ["mvn", "clean", "package", "jetty:run"]

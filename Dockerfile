FROM maven:3.8.1-openjdk-11
COPY src /carina-demo/src
COPY pom.xml /carina-demo
WORKDIR /carina-demo
RUN mvn clean test
CMD mvn test -Dsuite=${SUITE_NAME}
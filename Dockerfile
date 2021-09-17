FROM openjdk:8
COPY ./target/demo-0.0.1-SNAPSHOT.jar /tmp/app-matrix.jar
WORKDIR /tmp
ENTRYPOINT ["java","-jar","app-matrix.jar"]
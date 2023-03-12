FROM openjdk:11
COPY target/Sci_Calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java","-jar","Sci_Calculator-1.0-SNAPSHOT.jar"]

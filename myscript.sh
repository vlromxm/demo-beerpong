#!/bin/bash
mvn  clean install -DskipTests

java -DJDBC_DATABASE_PASSWORD=ce90037e66ef1d2b1101b7f360d8c3bf0a8d4dc8df66ad9f04a5170bad41dacb -DJDBC_DATABASE_USERNAME=msufbxtzpahtaz -DJDBC_DATABASE_URL=jdbc:postgresql://ec2-34-250-16-127.eu-west-1.compute.amazonaws.com:5432/ddi49qdphnc0rp -jar target/Spring-Initializr-Demo-0.0.1-SNAPSHOT.jar
FROM maven:3.9.7-eclipse-temurin-22-alpine AS build
LABEL maintainer="Michael <mizitoh@hotmail.com>"
WORKDIR /home/java/app
COPY . .
RUN chmod +x mvnw
RUN ./mvnw -B dependency:go-offline
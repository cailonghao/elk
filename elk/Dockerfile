FROM openjdk:8-jre-alpine

MAINTAINER cailonghao1234@foxmail.com

EXPOSE 10000

WORKDIR /usr/local/src

ADD target/*.jar app.jar

CMD ["java","-jar","app.jar"]
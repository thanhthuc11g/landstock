FROM openjdk:11-jre

RUN apt-get update -y
RUN apt-get install -y libfreetype6

#CHANGE THIS
COPY ./target/landstock-app-be-1.jar /opt/app.jar

ENV TZ=Asia/Ho_Chi_Minh

ENTRYPOINT ["java","-jar","/opt/app.jar"]

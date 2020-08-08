FROM openjdk:8-jdk-alpine
LABEL Maintainer="puc"

# This is where we will keep the config file.
RUN mkdir -p /opt/pucapp

COPY target/pdf-0.0.1-SNAPSHOT.jar /opt/pucapp
COPY start.sh /opt/pucapp
COPY puc.html /opt/pucapp

RUN chmod 755 /opt/pucapp/start.sh 

EXPOSE 8080

ENTRYPOINT [ "/opt/pucapp/start.sh" ]
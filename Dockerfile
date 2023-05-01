FROM apache/beam_java17_sdk
MAINTAINER  ihavoc
RUN mkdir -p /opt/springapp
ADD   jpa-test-0.0.1-SNAPSHOT.jar  /opt/springapp
EXPOSE 8080
ENTRYPOINT ["java","-jar","/opt/springapp/jpa-test-0.0.1-SNAPSHOT.jar"]
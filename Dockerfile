FROM openjdk:8-jdk-alpine
EXPOSE 8443 443 7771 7771
VOLUME /tmp
ADD target/demo-*.jar app.jar
ENV JAVA_OPTS="-Xloggc:./gc.log -XX:+HeapDumpOnOutOfMemoryError -XX:HeapDumpPath=./java_pid<pid>.hprof -XX:+UseG1GC -Xms2G -Xmx2G"
ENTRYPOINT exec java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar
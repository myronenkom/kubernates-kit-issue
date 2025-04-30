FROM amazoncorretto:21.0.6-al2
COPY target/*.jar /usr/app/app.jar
USER nobody
EXPOSE 8080
CMD java -jar /usr/app/app.jar
FROM eclipse-temurin:17
COPY target/awstask.jar awstask.jar
CMD [ "java","-jar","awstask.jar" ]
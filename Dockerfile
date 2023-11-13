FROM openjdk:17-ea-slim
VOLUME /tmp
RUN ["mkdir", "/images"]
COPY build/libs/trade-trend-1.0.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
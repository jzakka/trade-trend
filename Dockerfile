FROM --platform=linux/amd64 openjdk:17-ea-slim
VOLUME /tmp
COPY build/libs/trade-trend-1.0.jar app.jar
WORKDIR /root
RUN ["mkdir", "images"]
ENTRYPOINT ["java", "-jar", "/app.jar"]
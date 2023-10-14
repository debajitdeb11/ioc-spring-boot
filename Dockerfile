FROM eclipse-temurin:17-jdk-jammy
LABEL authors="debajitdeb"

WORKDIR /app
COPY .mvn/ .mvn
COPY mvnw pom.xml ./
RUN ./mvnw dependency:resolve

COPY src ./src

EXPOSE 8080
CMD ["./mvnw", "spring-boot:run"]
FROM eclipse-temurin:21-jdk

WORKDIR /app

COPY src /app/src

RUN javac -d /app/out /app/src/CustomerDemo.java

ENTRYPOINT ["java", "-cp", "/app/out", "CustomerDemo"]

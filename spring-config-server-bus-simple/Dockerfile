FROM gradle:jdk15 AS build

COPY --chown=gradle:gradle . /home/gradle/src

WORKDIR /home/gradle/src
RUN gradle build -x test --no-daemon


FROM openjdk:15-alpine
LABEL maintainer="eltonsandre" author="Elton Sandré" source='https://github.com/eltonsandre'

ENV LANG en_US.UTF-8
ENV LANGUAGE en_US:en
ENV LC_ALL en_US.UTF-8

COPY --from=build /home/gradle/src/build/libs/*.jar /app.jar

EXPOSE 80 443
ENTRYPOINT java --enable-preview $JAVA_OPTS -jar /app.jar



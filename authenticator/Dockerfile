# FROM <repo name>:<tag>
FROM openjdk:11-alpine-jdk

MAINTAINER Ed Muhlestein

# all commands are relative to this path
WORKDIR /usr/local/bin/

# because WORKDIR is set, don’t need to use path in COPY or any other command
# COPY ./target/resource-manager.jar /usr/local/bin/webapp.jar
# can just do this
COPY ./target/authenticator.jar webapp.jar

ENTRYPOINT ["java","-jar","/webapp.jar"]

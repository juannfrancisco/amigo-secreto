FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER Juan Francisco juan.maldonado.leon@gmail.com
ADD secret-friend.jar secret-friend.jar
EXPOSE 8080
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/secret-friend.jar"]
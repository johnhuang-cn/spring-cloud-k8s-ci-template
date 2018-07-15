FROM maven:3.5.4-jdk-8-alpine
MAINTAINER John Huang <john.h.cn@gmail.com>
COPY settings.xml /usr/share/maven/ref/
RUN apk add --no-cache \
        ca-certificates \
        curl \
        openssl
RUN set -x; \
    curl -fSL "https://download.docker.com/linux/static/stable/x86_64/docker-18.03.1-ce.tgz" -o docker.tgz; \
    tar -xzvf docker.tgz; \
    mv docker/* /usr/local/bin/; \
    rmdir docker; \
    rm docker.tgz; \
    docker -v
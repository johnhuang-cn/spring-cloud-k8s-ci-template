# Spring Cloud & GitLab & Docker & K8S CI搭建
Spring Cloud template projects and CI with GitLab, Docker, Kubernetes
[Spring Cloud & K8S CI搭建.pdf](Spring%20Cloud%20K8S%20CI搭建.pdf)

##	目标
搭建Spring Cloud + GitLab + Docker + K8S的持续集成开发环境。

## 内容
*	Spring Cloud Hello World工程: 基于SpringCloud 2.0.3，含Eureka，Feign/Hystrix，Gateway 
*	GitLab及持续集成配置
*	Docker及本地Docker仓库
*   Kubernetes Minikube搭建及部署

## 预备环境
CentOS7 Linux主机两台：
主机A: GitLab及GitLab Runner环境，本文档中IP为192.168.1.211
主机B：Kubernetes Minikube环境, 本文档中IP为192.168.1.201

##	预备知识
1. 掌握基本Spring Boot开发
2. 掌握Linux，Git，Maven基础操作
3. 了解Kubernetes基础知识
https://kubernetes.io/docs/tutorials/hello-minikube/
4. 了解Docker基本概念和命令
https://docs.docker.com/get-started/ 
5. 了解持续集成基础知识
6. 了解Spring Cloud各基本组件：Eureka Server/Client，Feign，Gateway   
中文参考文档：https://springcloud.cc/ 
英文参考文档：http://cloud.spring.io/spring-cloud-static/Finchley.RELEASE/multi/multi_spring-cloud.html 

## 架构图

![Spring Cloud Hello World Template](diagram/Spring%20Cloud%20Hello%20World%20Diagram.png)

![CI DIagram](diagram/GitLab%26K8S%20CI%20Diagram.png)

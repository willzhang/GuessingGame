# GuessingGame

介绍：基于java spring-boot实现简单的猜数字游戏，并使用maven进行构建。

## 快速入门

运行容器

```
docker run -d --name sampleweb-java-maven -p 8080:8080 \
registry.cn-shenzhen.aliyuncs.com/cnmirror/guessinggame-spring-boot:v1.0
```

浏览器访问

```
http://localhost:8080
```

## 构建示例

```
git clone https://github.com/willzhang/GuessingGame.git
cd GuessingGame
docker build -t registry.cn-shenzhen.aliyuncs.com/cnmirror/guessinggame-spring-boot:v1.0 .
```


* 基于`node` `java` `spring-boot` `vue` `nuxt` 开发的博客系统
* 支持`docker`一键部署


### 部署方式
* 拉取代码
```
git clone git@github.com:luzhaoxin/JavaEE.git
```
* 首先保证有Docker和Docker Compose的环境
* 命令行进入Fame文件根目录
* 运行```docker-compose up```或 ```docker-compose up -d```命令，第一次运行建议使用```docker-compose up```可以看见启动日志，等待镜像和依赖下载完毕。
```[root@localhost Fame]# docker-compose up -d
  Starting fame-front ...
  Starting fame-admin ...
  Starting fame-front ... done
  Starting fame-admin ... done
  Starting fame-nginx ... done
```
* 本地启动完成后，浏览器访问
```
  前端页面：http://127.0.0.1
  管理后台页面：http://127.0.0.1/admin
  初始用户名: fame
  初始密码: 123456
  ```
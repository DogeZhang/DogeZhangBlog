# idea导出war包并部署Ubuntu服务器

### 1. 将idea项目导出
1. File ---> project structure ---> Artifacts
`+` ---> Web Application: Archive ---> For ....
2. Build ---> Build Aritifacts ---> 目标项目

### 2. 上传服务器

```
apt-get install lrzsz
使用
rz
```

### 3. 安装tomcat

```
sudo apt-get install tomcat8 tomcat8-docs tomcat8-examples tomcat8-admin
```

### 4. 将项目放至webapp下
```
/var/lib/tomcat8/webapps
```

### 5. 重启tomcat
使用
```
111.11.111.111:8080/project_name
```
地址浏览

> 可能会遇到tomcat重启会耗时很久的问题，表现就是在使用`service tomcat8 restart`指令后访问地址没有反应，等很久之后才能进入网页。
> 这种原因是因为 org.apache.catalina.util.SessionIdGeneratorBase.createSecureRandom类产生安全随机类SecureRandom的实例作为会话ID 会耗时很久。
> 有两种解决办法：
> 1. 在Tomcat环境中解决可以通过配置JRE使用非阻塞的Entropy Source。在catalina.sh中加入这么一行：
> `-Djava.security.egd=file:/dev/./urandom`
> 即可。加入后再启动Tomcat，整个启动耗时会下降不少。
> 2. 在JVM环境中解决打开$JAVA_PATH/jre/lib/security/java.security这个文件，找到下面的内容：
> `securerandom.source=file:/dev/urandom`
> 替换成
> `securerandom.source=file:/dev/./urandom`



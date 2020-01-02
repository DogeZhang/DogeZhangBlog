# Ubuntu 服务器搭建Mysql并远程连接

### 1. 安装MySQL服务端
```
sudo apt-get install mysql-server
```
**一定记住设置的密码！！**
**一定记住设置的密码！！**
**一定记住设置的密码！！**

### 2. 配置MySQL
测试服务器版MySQL是否可以运行：
```
mysql -u root -p
```

找到MySQL的配置文件，注释掉 `bind-address` 

(我的在 `/etc/mysql/mysql.conf.d/mysql.cnf` ,有可能在其他位置，找一下即可。)

```
tmpdir          = /tmp
lc-messages-dir = /usr/share/mysql
skip-external-locking
#
# Instead of skip-networking the default is now to listen only on
# localhost which is more compatible and is not less secure.
# bind-address          = 127.0.0.1  <----注释掉这个
#
# * Fine Tuning
#
key_buffer_size         = 16M
max_allowed_packet      = 16M
```

进入MySQL服务，即登陆进MySQL的命令行界面，输入：

```
grant all on *.* to root@'%' identified by '数据库密码' with grant option;
flush privileges;
```
将MySQL数据库用户的From Host要设置成%。

### 3. 连接MySQL

使用的是navicat。连接方法不多说。

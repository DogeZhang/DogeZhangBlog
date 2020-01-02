# Github Pages入坑记录

今天了解到一个个人博客的另一种打开方式，便是GitHub上的Page页面，想到能在Github上面开个人博客，那简直了

简单记录一下过程

1.  打开百度
2.  输入GitHub Pages
3.  开始痛苦之旅
4.  回到步骤 1

## 正经开始：
总的来说，在GitHub上搭建个人博客，一不用花钱，二不用花钱，三不用花钱。它是一个免费的，无流量限制的平台。当然提供的功能比较简单，是一个静态博客。我们可以实现一些博客最基本的功能，剥去花里胡哨的噱头，返璞归真，专专心心写博客。

搭建环境：Ubuntu 18.04
必备组件：`Ruby`, `RubyGems`, `Jekyll`

## 1. 安装nodejs
```
sudo apt-get install nodejs
nodejs -v // 验证安装是否正确
```
这个也算是个坑，因为很多博客默认你是老手，向这种运行环境并没有提到，这会在后面使很多绊子。

## 2. 安装Ruby
安装带有dev的Ruby！
这一点很重要，网络博客中的复制粘贴中很少提到要安装Ruby-dev，这导致很多人第一步就扑街。
> 不是ruby，也不是ruby-doc,是ruby-dev

对于Ubuntu用户来说，比较简单的是直接用自带的软件管理工具apt安装

``` 
sudo apt-get install ruby-dev
```
可以在官网下载压缩包解压后手动安装，不过推荐上面的方式。可以加上版本号安装对应版本的Ruby，比如：
```
sudo apt-get install ruby2.5-dev
```
不带标识的话默认安装最新版本。

**关于RubyGems**
网络有些教程中需要安装RubyGems，不过我在安装玩Ruby后输入
```
gem -v
```
显示了gem的版本号，边没有安装，不过可以从官网下载安装包，并不大。
  - 下载安装包
[https://rubygems.org/pages/download](https://rubygems.org/pages/download)
  -  解压并进入目录 执行命令 ruby setup.rb
  -  以上命令在ubuntu的终端中进行

## 安装Jekyll
经过上面的安装终于能进入很重要的一步，安装Jekyll。当然对我来说问题出现最多的地方也是在这里。

```
gem install jekyll
```
首先需要说明的是，如果是使用ubuntu的新手，或者是最简安装的ubunt（比如我），很多指令是无法运行的，在安装过程中会因为这些指令的不存在而出现各种奇怪的问题。这是只需要安装过这些不能运行的指令后再次执行上面指令即可。

1.make不存在

```
Building native extensions. This could take a while...
ERROR:  Error installing jekyll:
	ERROR: Failed to build gem native extension.

    current directory: /var/lib/gems/2.5.0/gems/http_parser.rb-0.6.0/ext/ruby_http_parser
/usr/bin/ruby2.5 -r ./siteconf20190122-5438-165ew4a.rb extconf.rb
creating Makefile

current directory: /var/lib/gems/2.5.0/gems/http_parser.rb-0.6.0/ext/ruby_http_parser
make "DESTDIR=" clean
sh: 1: make: not found

current directory: /var/lib/gems/2.5.0/gems/http_parser.rb-0.6.0/ext/ruby_http_parser
make "DESTDIR="
sh: 1: make: not found

make failed, exit code 127

Gem files will remain installed in /var/lib/gems/2.5.0/gems/http_parser.rb-0.6.0 for inspection.
Results logged to /var/lib/gems/2.5.0/extensions/x86_64-linux/2.5.0/http_parser.rb-0.6.0/gem_make.out

```

有很多是需要make指令的地方，所以需要执行
```
sudo apt-get install make
```
2.gcc

```
compiling ruby_http_parser.c
make: gcc: Command not found
Makefile:242: recipe for target 'ruby_http_parser.o' failed
make: *** [ruby_http_parser.o] Error 127

make failed, exit code 2
```
其他的错误代码就不贴了，最关键的是这一句。“make: gcc: Command not found”，可以看到很多文件是用c写的，并且make中用到了gcc，便可以安装gcc
```
sudo apt-get install gcc
```
3.g++

```
compiling binder.cpp
make: g++: Command not found
Makefile:234: recipe for target 'binder.o' failed
make: *** [binder.o] Error 127

make failed, exit code 2
```
不多说 装g++
```
sudo apt-get install g++
```
4.安装速度慢

关于这一点我其实踩了很多坑，因为伟大的qiang的存在，程序员不得不更加勤劳（此处省略5000字）

因为服务器在国外的原因，安装的速度可能会很慢，不过现在不推荐更换gem的源，因为现在的淘宝源似乎没有再维护了，在你使用
```
gem sources --remove https://rubygems.org/
gem sources -a http://ruby.taobao.org/
```
你会发现你卡在了第二步。因为百度到的教程一般都在2015年与2016年这个时段，几年过去这个源是否仍在维护不得而知，另外国内源的更新可能会存在延迟，会出现一些意想不到的问题。但是不得不感谢这群人的付出。

有心人可能会限制搜索时间范围，不过可能会出现ssh证书不通过等很多麻烦的问题。建议大家还是耐心等待，其实没有很长时间。

## 创建博客目录

```
jekyll -v
```
如果您在运行过这句指令并且有了正确的输出，那么恭喜您，已经摸到了成功的小尾巴。

我们可以创建一个**空目录**，这个空目录名称可以自己起，这是我们的工作空间。
```
mkdir workspacename
```
接下来进度这个目录，然后创建我们的博客目录
```
cd workspacename
jekyll new mybolg
```
有几点需要注意：

 - 因为在安装程序的时候使用的是root权限，所以在生成博客目录时，在安装的过程中可能会提示你输入密码，有人可能就会蒙，什么密码？？？其实就是你的账户密码。
 - mybolg这个名字也是自己定的，这条指令会在当前目录下创建一个名为“myblog”的文件夹，里面便是完整的博客目录
 - 如果之前有存在名为**myblog**这个文件夹，那么这个文件夹必须为空，它无法在不为空的文件夹中创建博客目录
 - 如果提示：
```
Could not load Bundler. Bundle install skipped.
 ```
 说明Bundler未安装
 ```
 sudo gem install jekyll bundle
 ```
 再次执行即可

至此博客目录就创建完成

## 初始化目录并在浏览器浏览我们的博客
```
sudo jekyll serve --watch
```
运行结果：
```
Configuration file: /home/zhang/Projects/DogeZhang/_config.yml
            Source: /home/zhang/Projects/DogeZhang
       Destination: /home/zhang/Projects/DogeZhang/_site
 Incremental build: disabled. Enable with --incremental
      Generating... 
       Jekyll Feed: Generating feed for posts
                    done in 0.33 seconds.
 Auto-regeneration: enabled for '/home/zhang/Projects/DogeZhang'
    Server address: http://127.0.0.1:4000/
  Server running... press ctrl-c to stop.
```
至此便大功告成，在点击上方连接便可以在浏览器看到我们的博客。
之后将整个博客目录上传至GitHub中，访问setting中的连接，边可以看到我们的博客了。

感谢并祝贺

看到这里的每一位。

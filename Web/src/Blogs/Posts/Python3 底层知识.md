# Python3 底层知识

我只用的开发环境为Linux系统，使用了Ubuntu自带的python3，因此比较方便可以直接使用。

* * *

python3 默认安装在`/usr/local/python3`中。而启动方式在`/usr/bin`的目录下，所以这就是为什么在`python3 基础语法`的开头使用了`#!/usr/bin/python3`来运行脚本。

Python的解释器可以让我们交互式编程，无需编译，写入一条指令即 运行一条指令。

同样，Python的解释器不止一种，有`CPython`, `IPython`, `JPython`, `PyPy` 等。

>   顾名思义，CPython 就是用 C 语言开发的了，是官方标准实现，拥有良好的生态，所以应用也就最为广泛了。
>   
>   而 IPython 是在 CPython 的基础之上在交互式方面得到增强的解释器（http://ipython.org/）。
>   
>   Jython 是专为 Java 平台设计的 Python 解释器（http://www.jython.org/），它把 Python 代码编译成 Java 字节码执行。
>   
>   PyPy 是 Python 语言（2.7.13和3.5.3）的一种快速、兼容的替代实现（http://pypy.org/），以速度快著称。
>   
>  ———— 引用自[chengdu](http://www.runoob.com/python3/python3-interpreter.html)评论区。

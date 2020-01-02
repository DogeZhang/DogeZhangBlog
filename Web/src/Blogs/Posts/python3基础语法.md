# python3基础语法

首先可以将文件开头作为：
```
#!/usr/bin/python3
```
这样子就可以在linux下使用
```
chmod +x xxx.py
./xxx.py
```
当作脚本一样直接运行该文件

### python 保留字
可以通过下述代码来查看：
```
import keyword
keyword.kwlist
```

### python 行与缩进

需要知道的是python不需要使用大括号`{}`来表示代码块，而是使用缩进来表示，加强了代码规范。

> 同一个代码块的语句必须包含相同的缩进空格数。

### Number

* int #仅此一种
* bool
* float
* complex #复数

> python3中没有python2中的Long

### String

* 使用三引号('''或""")可以指定一个多行字符串。
* 反转义：`r` 使转义符 `/` 失效
* 如：` r"/n /r" ` 输出为 `/n /r `
* 字符串的截取的语法格式：`变量[头下标:尾下标:步长]`

### 多行语句

python的一大特色就是没有`;`。每条指令结束后不需要加上额外的分号，所以一般一条语句写在一行。但是如果是很长的语句需要换行，可以使用反斜杠`\`。

```
sum = a + b + \
         c + d

# 在 `[]` `{}` `()`中不需要反斜杠

class = ['class_one', 'class_two',
           'class_three', 'class_four']
```
如果要在一行中写入多条语句，使用分号`;`分隔

### Input() 等待用户输入

```
input("输入提示内容")
```
此代码会在屏幕中打印函数参数内容，然后等待用户输入，按下回车后读取内容。

### Print() 输出

```
a = "这里的内容将输出到屏幕。"
print(a) # 默认输出换行
print(a, end="") # 输出不能换行
```

### Import, from ... import

很简单：
整个模块导入：`import ...`
导入某个函数：`from ... import fun`
导入某些函数：`from ... import fun1, fun2 ...`
导入全部函数：`from ... import *`
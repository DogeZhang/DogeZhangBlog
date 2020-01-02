# AngularJS 基础内容

### ng-directives

#### 1. ng-app 定义一个AngularJS应用程序。
在`<div>`中加入ng-app，AngularJS将把这个`<div>`视作应用程序的所有者。
```
<div ng-app="">
    <!-- 这将是AngularJS应用程序的内容部分 -->
</div>
```
> 如果没有ng-app，则其他的标签与功能将不会起作用。

#### 2. ng-model 绑定元素值到应用程序。

```
<input ng-model="content"/>
```
在JavaScript中相应的变量`content`的值便和输入框绑定起来，表现出来的效果就是双向一致：
1. 在修改输入框中的值时，js的`content`变量随之改变。
2. 在改变js变量`content`时，输入框中显示的值也发生改变。

#### 3. ng-bind 将应用程序数据绑定到HTML视图。
```
<p ng-bind="content"></p>
```
在`<p>`标签中将显示`content`变量中的内容。

* * *


> `ng-model`、`{{ }}`表达式和`ng-bind`的区别：（以下是我的理解）
> 首先都是数据的双向绑定
> 1. `ng-model` 是**输入域的绑定**：
> 也就是说，在触发输入的时候，`ng-model`会读取输入的值，修改js中的变量。
> 2. `ng-bind` 是修改**innerHTML**：
> 也就是说，它是对应修改标签内的内容。
> 3. `{{ }}表达式` 与`ng-bind` 有异曲同工之妙，都是修改标签内部的内容，不过是**显示表达**

因此：
> `<p>{{content}}</p> <=> <p ng-bind="content"></p>`

### AngularJS 应用

AngularJS模块：
```
var app = angular.module('myApp', []);
```

AngularJS 控制器：
```
app.controller('myCtrl', function($scope) { $scope.firstName= "John"; $scope.lastName= "Doe"; });
```
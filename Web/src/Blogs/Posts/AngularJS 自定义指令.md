# AngularJS 自定义指令

### 创建自定义指令
```
<body ng-app="myApp">
<!-- E 作为元素名使用 -->
<my-directive></my-directive>

<!-- A 作为属性使用 -->
<div my-directive></div>

<!-- C 作为类名使用 -->
<div class="my-directive"></div>

<!-- M 作为注释使用 -->
<!-- directive: my-directive -->

<script>
var app = angular.module("myApp", []);
app.directive("myDirective", function() {
    return {
        // restrict: "A",
        template : "<p>我的自定义指令!</p>"
    };
});
</script>
</body>
```
> 注意的点：
> 1. JS中的命名需要使用驼峰法命名 `myDirective`。
> 2. 使用时要以 `-` 分割，因为html并不区分大小写：`my-directive`。
> 3. `restrict` 限制了以如何方式被调用，默认“EA”，即“元素名”和“属性名”调用指令。
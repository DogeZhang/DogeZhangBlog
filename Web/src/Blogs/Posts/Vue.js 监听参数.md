# Vue.js 监听参数

### 写在前面
> 1. 在`myBlog`项目中，要实现纯前端跳转，所以博客的markdown无法从后台获取，便需要一个数组来储存markdown文件。
> 2. 自己创建一个显示markdown的组件，可以根据传入的markdown自动编码。
> 3. 使用router.push将参数传进vue组件

### 遇到的问题
> 当vue $router的路径一致时，默认不进行操作，因此当参数不同，但路径相同时便没有数据的更新。

```
// Menu.vue
this.$router.push({path: '/menu/myBlogs', query: {postIndex: row.index}})
```

### 解决方法
> 使用`watch`来监听参数的变化，如果变化，便变更绑定的markdown文件，并重新解析。

```
// Myblogs.vue
watch: {
    '$route.query.postIndex' (val) { // 监听"route.query"中的"postIndex"参数
        console.log('changed!__' + val) // 在控制台输出变更后的值
        var markedPost = this.blogs[val].blog // 提取markdown文件
        this.compiledMarkdown = marked(markedPost) // 将markdown文件编码成HTML
    }
}
```
<template>
  <div>
    <el-row type="flex" justify="center">
      <el-col :lg="23" :md="23" :sm="23" :xs="24" class="content">
        <div v-html="compiledMarkdown"></div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import axios from 'axios'
import GithubPages from './posts/GithubPages.md'
import Docker入门 from './posts/Docker 入门.md'
import AngularJS基础内容 from './posts/AngularJS 基础内容.md'
import AngularJS自定义指令 from './posts/AngularJS 自定义指令.md'
import idea导出war包并部署Ubuntu服务器 from './posts/idea导出war包并部署Ubuntu服务器.md'
import Python3底层知识 from './posts/Python3 底层知识.md'
import Python3运算符 from './posts/Python3 运算符.md'
import python3基础语法 from './posts/python3基础语法.md'
import Ubuntu服务器搭建Mysql并远程连接 from './posts/Ubuntu 服务器搭建Mysql并远程连接.md'
import 官网下载Chrome离线包 from './posts/官网下载Chrome离线包.md'
import Vuejs监听参数 from './posts/Vue.js 监听参数.md'
var marked = require('marked')
export default {
  name: 'MyBlogs',
  mounted () {
    this.index = this.$route.query.postIndex
  },
  data () {
    return {
      blogs: [
        {
          blog: GithubPages // 0
        }, {
          blog: Docker入门 // 1
        }, {
          blog: AngularJS基础内容 // 2
        }, {
          blog: AngularJS自定义指令 // 3
        }, {
          blog: idea导出war包并部署Ubuntu服务器 // 4
        }, {
          blog: Python3底层知识 // 5
        }, {
          blog: Python3运算符 // 6
        }, {
          blog: python3基础语法 // 7
        }, {
          blog: Ubuntu服务器搭建Mysql并远程连接 // 8
        }, {
          blog: 官网下载Chrome离线包 // 9
        }, {
          blog: Vuejs监听参数 // 10
        }
      ],
      index: '',
      compiledMarkdown: ''
    }
  },
  methods: {
    compileMarkdown (index) {
      // console.log(index)
      var t = this
      var rendererMD = new marked.Renderer()
      marked.setOptions({
        renderer: rendererMD,
        gfm: true,
        tables: true,
        breaks: false,
        pedantic: false,
        sanitize: false,
        smartLists: true,
        smartypants: false
      })
      var markedPost
      axios.get('/upload/getPostById', {
        params: {
          'id': index
        }
      })
        .then(function (response) {
          markedPost = response.data
          t.compiledMarkdown = marked(markedPost)
        })
        .catch(function (error) {
          console.log(error)
        })
      // console.log(this.compiledMarkdown)
    }
  },
  watch: {
    '$route.query.postIndex' (val) {
      this.compileMarkdown(val)
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import './../assets/css/myBlogs.css';
</style>

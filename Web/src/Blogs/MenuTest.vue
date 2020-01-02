<template>
  <div>
    <el-row>
      <el-col :span="24" class="container">
        <b-card v-bind="post"></b-card>
        <!-- <form>
          <input type="file" @change="getFile($event)">
          <select name="type" id="type" v-model="type">
            <option value ="0">Python3</option>
            <option value ="1">Docker容器技术</option>
            <option value="2">前端技术</option>
            <option value="3">日常记录</option>
          </select>
          <button class="" @click="submit($event)">提交</button>
        </form>
        <el-button @click="getPost"></el-button> -->
      </el-col>
    </el-row>
  </div>
</template>

<script>
import axios from 'axios'
var bCard = {
  props: {
    title: String,
    index: Number,
    date: String,
    synopsis: String
  },
  data: function () {
    return {
    }
  },
  template: `
    <el-card style="margin-bottom: 20px;" :body-style="{ padding: '0px' }" shadow="always">
      <el-container>
        <el-aside width="80px" style="border-right: 2px solid #f0f0f0;">
          <div style="font-size: 45px; font-weight: 600; text-align: center; margin-top: 45px;">{{index}}</div>
        </el-aside>
        <el-container>
          <el-header style="height: 30px; padding-top: 10px;">
            <div style="font-size: 18px; font-weight: 600; line-height: 30px;">{{title}}</div>
          </el-header>
          <el-main style="padding: 10px; height: 100px;"><div style="font-size: 14px; margin-top: 10px;">&nbsp;&nbsp;&nbsp;&nbsp;{{synopsis}}</div></el-main>
          <el-footer style="height: 30px;"><div style="clear: both; text-align: end; padding: 0 10px 10px 0; color: grey">{{date}}</div></el-footer>
        </el-container>
      </el-container>
    </el-card>
  `
}
export default {
  name: 'MenuTest',
  components: {
    'b-card': bCard
  },
  mounted () {
  },
  data () {
    return {
      post: {
        title: '自定义组件<b-card>测试',
        index: 2,
        date: '2019-03-07',
        synopsis: '这是文章的简介，虽然文章没有任何内容，但是还是要写一些简介。这是我为移动端设计的博客浏览html标签<b-card v-bind="post">，暂未开发完毕，请用宽屏设备浏览~(｡･ω･｡)ﾉ♡'
      },
      file: '',
      type: 1
    }
  },
  methods: {
    getFile (event) {
      this.file = event.target.files[0]
      console.log(this.file)
    },
    getType (event) {
      console.log(this.type)
    },
    submit (event) {
      event.preventDefault()
      let formData = new FormData()
      formData.append('file', this.file)
      formData.append('type', this.type)
      axios.post('/upload/singleUpload', formData)
        .then(function (response) {
          console.log(response)
        })
        .catch(function (error) {
          console.log(error)
        })
    },
    getPost () {
      // axios.get('http://localhost:8081/upload/getPostById', {
      //   params: {
      //     'id': 4
      //   }
      // })
      //   .then(function (response) {
      //     console.log(response)
      //   })
      //   .catch(function (error) {
      //     console.log(error)
      //   })
      this.$router.push({path: '/menu/myBlogs', query: {postIndex: 4}})
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    @import './../assets/css/menuTest.css';
</style>

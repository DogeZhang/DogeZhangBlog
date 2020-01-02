<template>
  <div id="container">
    <el-row style="margin-top: 10%;">
      <transition name="fade-in-title">
        <div v-show="show1">
          <el-col><div class="title">{{msg}}</div></el-col>
        </div>
      </transition>
    </el-row>
    <el-row style="margin-top: 2%;">
      <transition name="el-fade-in-linear">
        <div v-if="show2" class="sculpter-container">
          <img src="./../assets/images/touxiang.jpg" alt="sculpter" class="sculpter">
        </div>
      </transition>
    </el-row>
    <el-row style="margin-top: 2%;">
      <transition name="el-fade-in-linear">
        <div v-if="show3" class="sculpter-container">
          <el-button class="hidden-xs-only" style="width: 150px;" type="primary" @click="goBlogPage(true)">Start !</el-button>
          <el-button class="hidden-sm-and-up" style="width: 150px;" type="primary" @click="goBlogPage(false)">Start !</el-button>
        </div>
      </transition>
    </el-row>
  </div>
</template>

<script>
export default {
  name: 'Home',
  mounted () {
    var t = this
    var showTitleTimer1 = setTimeout(showTitle1, 500)
    function showTitle1 () {
      t.show1 = true
      clearTimeout(showTitleTimer1) // 删除定时器 释放内存
    }
    var showTitleTimer2 = setTimeout(showTitle2, 560)
    function showTitle2 () {
      t.show2 = true
      clearTimeout(showTitleTimer2) // 删除定时器 释放内存
    }
    var showTitleTimer3 = setTimeout(showTitle3, 620)
    function showTitle3 () {
      t.show3 = true
      clearTimeout(showTitleTimer3) // 删除定时器 释放内存
    }
  },
  data () {
    return {
      msg: '久等了， 快进来吧 !',
      show1: false,
      show2: false,
      show3: false
    }
  },
  methods: {
    goBlogPage (_isShow) {
      // console.log('goBlogPage()')
      this.$router.push({name: 'BlogPage', params: {isShow: _isShow}})
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../assets/css/home.css';
</style>

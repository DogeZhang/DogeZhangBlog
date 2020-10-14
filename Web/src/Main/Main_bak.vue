<template>
  <div>
    <el-carousel @change="carouselChange" :interval="5000" arrow="always" height="100%" class="carousel-pane" indicator-position="inside">
      <!-- 第一张介绍 -->
      <el-carousel-item class="carousel-pane-item">
        <div class="fullscreen_post_bg cat-1"></div>
        <el-row type="flex" justify="end">
          <el-col :lg="8" :md="8" :sm="12" :xs="24">
            <div class="text-pane">
              <transition name="title">
                <p v-if="show1" class="title">这是我的世界！</p>
              </transition>
              <transition name="title">
                <p v-if="show2" class="content">个人信息、学习记录、资料笔记应有尽有</p>
              </transition>
            </div>
          </el-col>
        </el-row>
      </el-carousel-item>
      <!-- 第二张介绍 -->
      <el-carousel-item class="carousel-pane-item">
        <div class="fullscreen_post_bg cat"></div>
        <el-row type="flex" justify="end">
          <el-col :lg="8" :md="8" :sm="12" :xs="24">
            <div class="text-pane">
              <transition name="title">
                <p v-if="show3" class="title">不断向上！</p>
              </transition>
              <transition name="title">
                <p v-if="show4" class="content">坚持学习，坚持记录，努力到达更精彩的世界</p>
              </transition>
            </div>
          </el-col>
        </el-row>
      </el-carousel-item>
      <!-- <el-carousel-item class="carousel-pane-item">
        <div class="fullscreen_post_bg cat-moon"></div>
        <el-row>
          <el-col :span="6" :offset="12">
            <p style="color: white">YIZHUO</p>
          </el-col>
        </el-row>
      </el-carousel-item>
      <el-carousel-item class="carousel-pane-item">
        <div class="fullscreen_post_bg moon"></div>
        <el-row>
          <el-col :span="6" :offset="12">
            <p style="color: white">ZHANG</p>
          </el-col>
        </el-row>
      </el-carousel-item> -->
    </el-carousel>
  </div>
</template>

<script>
export default {
  name: 'Main',
  mounted () {
  },
  data () {
    return {
      msg: 'Welcome to My World !',
      interval: 5000,
      show1: false,
      show2: false,
      show3: true,
      show4: true
    }
  },
  methods: {
    carouselChange (key1, key2) {
      if (key1 === 0) {
        this.show1 = !this.show1
        this.show2 = !this.show2
        this.show3 = !this.show3
        this.show4 = !this.show4
      }
      if (key2 === 0) {
        this.show1 = !this.show1
        this.show2 = !this.show2
        this.show3 = !this.show3
        this.show4 = !this.show4
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import '../assets/css/main.css';
</style>

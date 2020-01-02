<template>
  <div>
      <el-row type="flex" justify="center">
        <el-col :span="20">
          <div style="text-align: center">
            <transition name="intro">
              <div style="margin-top: 80px;" class="intro-text" v-if="show1">嗨！你好！</div>
            </transition>
            <transition name="intro">
              <div class="intro-text" v-if="show2">欢迎来我的主页！</div>
            </transition>
            <transition name="intro">
              <div class="intro-text" v-if="show3">我叫张翊卓</div>
            </transition>
            <transition name="intro">
              <div class="intro-text" v-if="show4">很高兴认识你！</div>
            </transition>
          </div>
        </el-col>
      </el-row>
      <transition name="bus">
        <div v-if="showBus" class="bus-card">
          <div style="height: 65px;"></div>
          <transition name="line-top">
            <div v-if="showName" class="name-h-t-line"></div>
          </transition>
          <transition name="line-left">
            <div v-if="showName" class="name-v-l-line"></div>
          </transition>
          <transition name="line-right">
            <div v-if="showName" class="name-v-r-line"></div>
          </transition>
          <transition name="bus-card">
            <p v-if="showName" class="card-name">张翊卓</p>
          </transition>
          <transition name="line-bottom">
            <div v-if="showName" class="name-h-b-line"></div>
          </transition>
        </div>
      </transition>
      <transition name="info-box">
        <div v-if="showInfoBox1" class="infor-box" style="background-color: #e1d28f">
          <div class="icon-box">
            <img src="./../assets/svg/school.svg" width="22px" height="22px" alt="学校："/>
          </div>福州大学
        </div>
      </transition>
      <transition name="info-box">
        <div v-if="showInfoBox2" class="infor-box" style="background-color: #ebaa4a">
          <div class="icon-box">
            <img src="./../assets/svg/book.svg" width="22px" height="22px" alt="专业："/>
          </div>软件工程
        </div>
      </transition>
      <transition name="info-box">
        <div v-if="showInfoBox3" class="infor-box" style="background-color: #eb6a2d">
          <div class="icon-box">
            <img src="./../assets/svg/thumb-up.svg" width="22px" height="22px" alt="技能："/>
          </div>Java / C++ / Web
        </div>
      </transition>
      <transition name="info-box">
        <div v-if="showInfoBox4" class="infor-box" style="background-color: #a32c1c">
          <div class="icon-box">
            <img src="./../assets/svg/phone.svg" width="22px" height="22px" alt="手机："/>
          </div>13110523668
        </div>
      </transition>
      <transition name="info-box">
        <div v-if="showInfoBox5" class="infor-box" style="background-color: #563b2f">
          <div class="icon-box">
            <img src="./../assets/svg/email.svg" width="22px" height="22px" alt="邮箱："/>
          </div>zhangyz86@hotmail.com
        </div>
      </transition>
      <transition name="info-box">
        <div v-if="showInfoBox6" class="infor-box" style="background-color: #bdd4c7; color: #eb6a2d">
          <span @click="goResume" style="cursor: pointer">查看我的简历</span>
        </div>
      </transition>
  </div>
</template>

<script>
export default {
  name: 'PersonalInfo',
  mounted () {
    setTimeout(this.animationen, 1000)
  },
  data () {
    return {
      msg: 'Welcome to My World !',
      show1: false,
      show2: false,
      show3: false,
      show4: false,
      showBus: false,
      showName: false,
      showInfoBox1: false,
      showInfoBox2: false,
      showInfoBox3: false,
      showInfoBox4: false,
      showInfoBox5: false,
      showInfoBox6: false,
      time1: '',
      time2: '',
      time3: '',
      time4: '',
      time5: '',
      time6: '',
      time7: '',
      time8: '',
      time9: '',
      time10: '',
      time11: '',
      time12: '',
      time13: '',
      time14: '',
      time15: '',
      time16: ''
    }
  },
  methods: {
    animationen () {
      var t = this
      this.time1 = setTimeout(t._show1, 500)
      this.time2 = setTimeout(t._show2, 700)
      this.time3 = setTimeout(t._show3, 900)
      this.time4 = setTimeout(t._show4, 1700)
      this.time5 = setTimeout(t._show4, 2800)
      this.time6 = setTimeout(t._show3, 2900)
      this.time7 = setTimeout(t._show2, 3000)
      this.time8 = setTimeout(t._show1, 3100)
      this.time9 = setTimeout(t._showBus, 3500)
      this.time10 = setTimeout(t._showName, 4000)
      this.time11 = setTimeout(t._showInfoBox1, 4300)
      this.time12 = setTimeout(t._showInfoBox2, 4500)
      this.time13 = setTimeout(t._showInfoBox3, 4700)
      this.time14 = setTimeout(t._showInfoBox4, 4900)
      this.time15 = setTimeout(t._showInfoBox5, 5100)
      this.time16 = setTimeout(t._showInfoBox6, 5300)
    },
    _show1 () {
      this.show1 = !this.show1
    },
    _show2 () {
      this.show2 = !this.show2
    },
    _show3 () {
      this.show3 = !this.show3
    },
    _show4 () {
      this.show4 = !this.show4
    },
    _showBus () {
      this.showBus = !this.showBus
    },
    _showName () {
      this.showName = !this.showName
    },
    _showInfoBox1 () {
      this.showInfoBox1 = !this.showInfoBox1
    },
    _showInfoBox2 () {
      this.showInfoBox2 = !this.showInfoBox2
    },
    _showInfoBox3 () {
      this.showInfoBox3 = !this.showInfoBox3
    },
    _showInfoBox4 () {
      this.showInfoBox4 = !this.showInfoBox4
    },
    _showInfoBox5 () {
      this.showInfoBox5 = !this.showInfoBox5
    },
    _showInfoBox6 () {
      this.showInfoBox6 = !this.showInfoBox6
      this.clearAllTimeout()
    },
    clearAllTimeout () {
      clearTimeout(this.time1)
      clearTimeout(this.time2)
      clearTimeout(this.time3)
      clearTimeout(this.time4)
      clearTimeout(this.time5)
      clearTimeout(this.time6)
      clearTimeout(this.time7)
      clearTimeout(this.time8)
      clearTimeout(this.time9)
      clearTimeout(this.time10)
      clearTimeout(this.time11)
      clearTimeout(this.time12)
      clearTimeout(this.time13)
      clearTimeout(this.time14)
      clearTimeout(this.time15)
      clearTimeout(this.time16)
    },
    goResume () {
      this.$router.push('/resume')
      document.getElementById('show_info').click()
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import './../assets/css/personalInfo.css';
</style>

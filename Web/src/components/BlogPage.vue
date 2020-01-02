<template>
  <div>
      <el-container class="main">
        <el-header height="50px" class="main-header">
          <!-- 顶部内容 -->
          <transition name="el-zoom-in-top">
            <el-row v-if="show">
              <!-- 左部内容 -->
              <el-col :lg="7" :md="9" style="background-color: white;">
                <div style="float: left;">
                  <img style="cursor: pointer" @click="showFooter = !showFooter" class="header-img" src="./../assets/images/touxiang.jpg" alt="头像">
                </div>
                <div class="header-name" @click="goResume()">zhangyizhuo</div>
                <transition name="info-button">
                  <div v-if="showInfoButton" class="header-info">
                    <span style="color: black;cursor: pointer;"><i @click="showInfo()" id="show_info" class="el-icon-info"></i></span>
                  </div>
                </transition>
                <transition name="el-zoom-in-top">
                  <div v-show="show_info" class="personalInfo-box"><router-view/></div>
                </transition>
                <el-button class="hidden-sm-and-up" style="position: fixed; right: 10px; top: 10px;" size="small" icon="el-icon-menu" @click="showMenu = !showMenu"></el-button>
              </el-col>
              <div style="position: fixed;top: 50px; left: 0; right: 0; background-color: black;">
                <el-collapse-transition>
                  <div v-show="showMenu">
                    <el-row type="flex" justify="end">
                      <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                        <span @click="goMain(); showMenu = !showMenu" class="el-dropdown-link">
                          主页
                        </span>
                      </el-col>
                      <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                        <el-dropdown trigger="click" placement="bottom">
                          <span class="el-dropdown-link">
                            我的
                          </span>
                          <el-dropdown-menu slot="dropdown">
                            <div @click="goResume(); showMenu = !showMenu"><el-dropdown-item><span>我的简历</span></el-dropdown-item></div>
                            <div @click="goAckTree(); showMenu = !showMenu"><el-dropdown-item><span>知识图谱</span></el-dropdown-item></div>
                          </el-dropdown-menu>
                        </el-dropdown>
                      </el-col>
                      <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                        <span @click="goMenu(); showMenu = !showMenu" class="hidden-xs-only el-dropdown-link">
                          博客
                        </span>
                        <span @click="goMenuTest(); showMenu = !showMenu" class="hidden-sm-and-up el-dropdown-link">
                          博客*
                        </span>
                      </el-col>
                      <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                        <span @click="goMenuTest(); showMenu = !showMenu" class="el-dropdown-link">
                            博客
                        </span>
                      </el-col>
                    </el-row>
                  </div>
                </el-collapse-transition>
              </div>
              <!-- 右部内容 -->
              <el-col :lg="17" :md="15" class="hidden-xs-only" >
                <el-row type="flex" justify="end">
                  <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                    <span @click="goMain" class="el-dropdown-link">
                      主页
                    </span>
                  </el-col>
                  <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                    <el-dropdown trigger="click" placement="bottom">
                      <span class="el-dropdown-link">
                        我的
                      </span>
                      <el-dropdown-menu slot="dropdown">
                        <div @click="goResume"><el-dropdown-item><span>我的简历</span></el-dropdown-item></div>
                        <div @click="goAckTree"><el-dropdown-item><span>知识图谱</span></el-dropdown-item></div>
                      </el-dropdown-menu>
                    </el-dropdown>
                  </el-col>
                  <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                    <span @click="goMenu" class="hidden-xs-only el-dropdown-link">
                      博客
                    </span>
                    <span @click="goMenuTest" class="hidden-sm-and-up el-dropdown-link">
                      博客*
                    </span>
                  </el-col>
                  <el-col style="text-align: center" :lg="3" :md="3" :sm="4" :xs="6">
                    <span @click="goMenuTest" class="el-dropdown-link">
                        博客
                    </span>
                  </el-col>
                </el-row>
              </el-col>
            </el-row>
          </transition>
        </el-header>
        <!-- 中间内容 -->
        <el-container style="overflow-y: hidden;">
          <!-- <el-aside class="hidden-xs-only">
            <router-view name="aside"/>
          </el-aside> -->
          <el-main style="overflow-y: scroll; -webkit-overflow-scrolling : touch; padding: 0;">
            <div style="color: white; height: 30px;" class="hidden-md-and-up hidden-xs-only"></div>
            <router-view name="main"/>
          </el-main>
        </el-container>
        <!-- 脚部内容 -->
        <el-footer height="40px" class="main-footer hidden-sm-and-down">
          <transition name="el-zoom-in-bottom">
            <el-row type="flex" justify="center" v-if="showFooter">
              <el-col :lg="18" :md="18" :sm="24" :xs="24">
                <div class="footer-container">
                  <div style="background-color: #bdd4c7" class="footer-left"></div>
                  <div style="background-color: #e1d28f" class="footer-left"></div>
                  <div style="background-color: #ebaa4a" class="footer-left"></div>
                  <div style="background-color: #eb6a2d" class="footer-left"></div>
                  <div style="background-color: #a32c1c" class="footer-left"></div>
                  <div style="background-color: #563b2f" class="footer-left"></div>
                  <div style="text-align"></div>
                  <div class="footer-right">
                    <el-dropdown trigger="click" placement="bottom">
                      <span class="el-dropdown-link">
                        <img class="link-svg" src="./../assets/svg/github.svg" alt="github">
                      </span>
                      <el-dropdown-menu slot="dropdown">
                        <el-button style="padding-left:10px;padding-right:10px;" type="text">这将跳转到github界面</el-button>
                      </el-dropdown-menu>
                    </el-dropdown>
                  </div>
                  <div class="footer-right">
                    <el-dropdown trigger="click" placement="bottom">
                      <span class="el-dropdown-link-footer">
                        <img class="link-svg" src="./../assets/svg/qq.svg" alt="qq">
                      </span>
                      <el-dropdown-menu slot="dropdown">
                        <img src="./../assets/images/QQ.jpg" alt="qqQR" width="225px" height="225px">
                      </el-dropdown-menu>
                    </el-dropdown>
                  </div>
                  <div class="footer-right">
                    <el-dropdown trigger="click" placement="bottom">
                      <span class="el-dropdown-link">
                        <img class="link-svg" src="./../assets/svg/weixin.svg" alt="weixin">
                      </span>
                      <el-dropdown-menu slot="dropdown">
                        <img src="./../assets/images/wechat.jpg" alt="wechatQR" width="225px" height="225px">
                      </el-dropdown-menu>
                    </el-dropdown>
                  </div>
                </div>
              </el-col>
            </el-row>
          </transition>
        </el-footer>
    </el-container>
  </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/display.css'
export default {
  name: 'BlogPage',
  mounted () {
    this.$router.push('/main')
    this.showAmin()
  },
  data () {
    return {
      msg: 'Welcome to My World !',
      isShow: this.$route.params.isShow,
      show_info: false,
      show: false,
      showFooter: false,
      showInfoButton: false,
      time1: '',
      time2: '',
      time3: '',
      time4: '',
      showMenu: false
    }
  },
  methods: {
    showAmin () {
      console.log(this.isShow)
      var t = this
      this.time1 = setTimeout(t._show, 150)
      if (this.isShow) {
        this.time2 = setTimeout(t.showInfo, 800)
        this.time3 = setTimeout(t.showInfo, 8500)
        this.time4 = setTimeout(t._showInfoButton, 8700)
        this.isShow = false
      } else {
        this.time4 = setTimeout(t._showInfoButton, 250)
      }
    },
    _show () {
      this.show = !this.show
      this.showFooter = !this.showFooter
    },
    showInfo () {
      this.show_info = !this.show_info
    },
    _showInfoButton () {
      this.showInfoButton = !this.showInfoButton
      this.clearAllTimeout()
    },
    goMain () {
      this.$router.push('/main')
    },
    clearAllTimeout () {
      clearTimeout(this.time1)
      clearTimeout(this.time2)
      clearTimeout(this.time3)
      clearTimeout(this.time4)
    },
    goResume () {
      this.$router.push('/resume')
    },
    goAckTree () {
      this.$router.push('/acktree')
    },
    goMenu () {
      this.$router.push({name: 'MyBlogs', query: {postIndex: 1}})
      // this.$router.push('Menu')
    },
    goMenuTest () {
      this.$router.push('/menuTest')
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
    @import './../assets/css/BlogPage.css';
</style>

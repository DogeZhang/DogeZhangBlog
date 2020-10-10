<template>
  <!-- 简历 -->
  <div>
    <el-row type="flex" justify="center">
      <!-- 简历盒子 -->
      <el-col :lg="20" :md="23" :sm="23" :xs="24" class="resume-container">
        <el-row>
          <!-- 简历左侧 -->
          <el-col class="R" :lg="11" :md="10" :sm="24" :xs="24">
            <!-- 第一部分 姓名头像 -->
            <p class="R-name">张&nbsp;翊&nbsp;卓</p>
            <p class="R-name-s">zhangyizhuo</p>
            <el-row type="flex" justify="center">
              <img src="./../assets/images/touxiang.jpg" class="R-img" alt="zyz">
            </el-row>
            <!-- 第二部分 联系方式 -->
            <div class="title">
              联系方式 CONTACT
            </div>
            <div class="R-contact-cell">
              <div class="R-contact-icon-box">
                <img class="R-contact-icon" src="./../assets/svg/email-black.svg" alt="email">
              </div>
              <div class="R-contact-text">
                zhangyz86@hotmail.com
              </div>
            </div>
            <div class="R-contact-cell">
              <div class="R-contact-icon-box">
                <img class="R-contact-icon" src="./../assets/svg/phone-black.svg" alt="phone">
              </div>
              <div class="R-contact-text">
                13110523668
              </div>
            </div>
            <div class="R-contact-cell">
              <div class="R-contact-icon-box">
                <img class="R-contact-icon" src="./../assets/svg/qq-black.svg" alt="email">
              </div>
              <div class="R-contact-text">
                821477497
              </div>
            </div>
            <!-- 第三部分 自我简介 -->
            <div class="self-introduction">
              <p>
                <ul>
                  <li>福州大学大四在读全日制软件工程本科生。在校期间没有挂科记录，没有受到过任何违规记录。</li>
                  <li>参与较多实际项目，在导师指导下完成了门诊诊所管理系统等多个实际项目。</li>
                  <li>熟练使用Java开发，熟悉C/C++编程。自学了Aue、Angular、Bootstrap前端开发框架，并应用于实际项目当中。会使用</li>
                  <li>Springboot、SpringMVC后端框架开发J2EE项目。熟练使用Git、Svn代码管理工具。</li>
                  <li>有很强的学习能力，遇到不会的问题会自己搜索解决方案，经常访问CSDN、Github、StackOverflow学习。</li>
                  <li>坚持学习，目前在学习Python和Docker容器技术。</li>
                  <li>英语CET4/6级证书，曾获三等奖学金。</li>
                  <li>担任过班长，校社联副部长，院分团委部长。</li>
                </ul>
              </p>
            </div>
            <!-- 第四部分 技能部分 -->
            <div class="title">
              技能及荣誉 SKELLS & AWARDS
            </div>
            <p class="skill-title">SKILLS (*-Learning)</p>
            <el-row class="skill-cell">
              <el-col :lg="6" :md="6" :sm="24" :xs="24">C/C++</el-col>
              <el-col style="text-align: end" :lg="18" :md="18" :sm="24" :xs="24"><el-progress :percentage="70" color="#bdd4c7"></el-progress></el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :lg="6" :md="6" :sm="24" :xs="24">JAVA</el-col>
              <el-col style="text-align: end" :lg="18" :md="18" :sm="24" :xs="24"><el-progress :percentage="70" color="#e1d28f"></el-progress></el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :lg="6" :md="6" :sm="24" :xs="24">HTML/CSS</el-col>
              <el-col style="text-align: end" :lg="18" :md="18" :sm="24" :xs="24"><el-progress :percentage="70" color="#ebaa4a"></el-progress></el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :lg="6" :md="6" :sm="24" :xs="24">*Python</el-col>
              <el-col style="text-align: end" :lg="18" :md="18" :sm="24" :xs="24"><el-progress :percentage="50" color="#eb6a2d"></el-progress></el-col>
            </el-row>
            <el-row class="skill-title">
              <el-col :span="12">IDE</el-col>
              <el-col :span="12">Frame</el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :span="12">Idea</el-col>
              <el-col :span="12">Angular JS</el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :span="12">Eclipse</el-col>
              <el-col :span="12">Vue.JS</el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :span="12">Microsoft visual Studio</el-col>
              <el-col :span="12">Spring boot</el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :span="12">Android Studio</el-col>
              <el-col :span="12">bootStrap</el-col>
            </el-row>
            <el-row class="skill-cell">
              <el-col :span="12">Dev C++</el-col>
              <el-col :span="12">*Docker/Kubernetes</el-col>
            </el-row>
            <p class="skill-title">AWARDS</p>
            <p class="skill-cell">CET 4/6</p>
            <p class="skill-cell">福州大学综合三等奖学金</p>
            <p class="skill-cell">福州大学“优秀共青团员”</p>
            <p class="skill-cell"></p>
            <p class="skill-cell"></p>
            <p class="skill-cell"></p>
          </el-col>
          <!-- 简历右侧 -->
          <el-col class="L" :lg="13" :md="14" :sm="24" :xs="24">
            <!-- 第五部分 教育经历 -->
            <div class="title" style="margin-bottom: 40px;">
              教育 EDUCATION
            </div>
            <el-row class="timelist">
              <el-col class="timelist-time">2015<br>-<br>2019</el-col>
              <el-col :span="20" class="timelist-content">
                <div class="timelist-point hidden-xs-only"></div>
                <p class="timelist-title">本科 福州大学/211</p>
                <p class="timelist-text" style="font-style: italic">数学与计算机科学学院/软件学院</p>
                <p class="timelist-text">软件工程专业</p>
              </el-col>
            </el-row>
            <el-row class="timelist">
              <el-col class="timelist-time">2019<br>-<br>2021</el-col>
              <el-col :span="20" class="timelist-content">
                <div class="timelist-point hidden-xs-only"></div>
                <p class="timelist-title">研究生 福州大学/211</p>
                <p class="timelist-text" style="font-style: italic">数学与计算机科学学院</p>
                <p class="timelist-text">计算机技术/机器学习方向</p>
              </el-col>
            </el-row>
            <!-- 第六部分 实践经历 -->
            <div class="title" style="margin-bottom: 40px;">
              实践经历 EXPERIENCE
            </div>
            <el-row class="timelist">
              <el-col class="timelist-time">2019.01<br>-<br>2010.03</el-col>
              <el-col :span="20" class="timelist-content">
                <div class="timelist-point hidden-xs-only"></div>
                <p class="timelist-title">个人主页（此网页）</p>
                <p class="timelist-text" style="font-style: italic">开发者</p>
                <div class="timelist-text">
                  <ol>
                    <li>此项目为本人的个人情况展示网站，记录日常学习，所学技能以及简历的展示，独立开发。采用前后端分离技术，Vue+springboot。从中学习动画、布局、webpack打包</li>
                    <li>为更好的展示markdown文本，自行编写了一个独立组建，能够解析成html文件，并自己编写了css展示样式，能在不用的页面中引用。
                      <ul>
                        <li>支持静态markdown文件传入并解析</li>
                        <li>支持使用Ajax异步的方式从后端获取markdown文件并解析</li>
                        <li>自己设计的显示样式，支持h1-6、表格、代码段、行内代码、引用等常用markdown的样式。</li>
                      </ul>
                    </li>
                    <li>页面自适应移动设备和PC端。</li>
                    <li>项目地址：<a href="https://github.com/DogeZhang/myBlog">https://github.com/DogeZhang/myBlog</a></li>
                  </ol>
                </div>
              </el-col>
            </el-row>
            <el-row class="timelist">
              <el-col class="timelist-time">2018.09<br>-<br>2019.01</el-col>
              <el-col :span="20" class="timelist-content">
                <div class="timelist-point hidden-xs-only"></div>
                <p class="timelist-title">在线小型诊所信息管理系统</p>
                <p class="timelist-text" style="font-style: italic">用户管理模块负责人</p>
                <div class="timelist-text">
                  <ol>
                    <li>参与完成项目中的用户管理模块（包括病人信息、就诊记录、会员模块）；</li>
                    <li>项目使用JavaEE Spring boot框架，前端采用Angular Js，使用SubVersion进行版本控制，集成开发环境为Idea；</li>
                    <li>当中自学AngularJs 与 Bootstrap前端开发框架，并用于实际操作。</li>
                  </ol>
                </div>
              </el-col>
            </el-row>
            <el-row class="timelist">
              <el-col class="timelist-time">2018.07<br>-<br>2018.06</el-col>
              <el-col :span="20" class="timelist-content">
                <div class="timelist-point hidden-xs-only"></div>
                <p class="timelist-title">福州大学学生论坛</p>
                <p class="timelist-text" style="font-style: italic">前端开发人员</p>
                <div class="timelist-text">
                  <ol>
                    <li>该项目旨在帮助学生在学习方面的交流以及方便教师布置任务和检查作业。
                      <ul>
                        <li>拥有完整的发帖功能，可以发布帖子，评论帖子以及评论子评论。可以发表图片，文章等多媒体信息，拥有已解决、置顶
帖、无效贴功能。允许用户之间私信，仅私信用户之间可见.</li>
                        <li>教师用户能够发布作业，学生用户上传作业后教师可以将批改结果发布。</li>
                        <li>具有完整的后台管理功能，管理员可以查看当天、周发帖数，发帖最多用户及评论数。管理帖子各项功能.</li>
                      </ul>
                    </li>
                    <li>该项目使用Springboot+easyUI+mysql搭建，并部署在Ubuntu服务器上。</li>
                    <li>项目地址：<a href="https://github.com/windgust/Fzu-TeachBo">https://github.com/windgust/Fzu-TeachBo</a></li>
                    <li>本人在此软件工程实践当中获得“优秀”。</li>
                  </ol>
                </div>
              </el-col>
            </el-row>
            <el-row class="timelist">
              <el-col class="timelist-time">2017.10<br>-<br>2018.03</el-col>
              <el-col :span="20" class="timelist-content">
                <div class="timelist-point hidden-xs-only"></div>
                <p class="timelist-title">大学生资源共享与交易平台</p>
                <p class="timelist-text" style="font-style: italic">需求共享模块开发人员</p>
                <div class="timelist-text">
                  <ol>
                    <li>项目采用Springboot+Vue.js作为开发框架，为单页面应用，前端使用路由完成页面跳转.</li>
                    <li>负责大学生需求发布与接收模块的编写，是一个发布需求，其他同学帮助解决问题的平台.
                      <ul>
                        <li>拥有一套完整的 发布->浏览->其他用户提供帮助->完成需求->评论->查看已完成需求的功能。</li>
                        <li>能够做到需求的关键词检索，需求发布列表按状态过滤，分页显示.</li>
                        <li>能够对自己账号内所发布的需求和已经接受的需求进行管理。拥有评论和管理评论的功能。</li>
                      </ul>
                    </li>
                    <li>项目地址：<a href="https://github.com/MinRam/OTOD">https://github.com/MinRam/OTOD</a></li>
                  </ol>
                </div>
              </el-col>
            </el-row>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import 'element-ui/lib/theme-chalk/display.css'
export default {
  name: 'Template',
  mounted () {
  },
  data () {
    return {
      selfIntro: `福州大学大四在读全日制软件工程本科生。在校期间没有挂科记录，没有受到过任何违规记录。
                  参与较多实际项目，在导师指导下完成了门诊诊所管理系统等多个实际项目。
                  熟练使用Java开发，熟悉C/C++编程。自学了Aue、Angular、Bootstrap前端开发框架，并应用于实际项目当中。会使用
                  Springboot、SpringMVC后端框架开发J2EE项目。熟练使用Git、Svn代码管理工具。
                  有很强的学习能力，遇到不会的问题会自己搜索解决方案，经常访问CSDN、Github、StackOverflow学习。
                  坚持学习，目前在学习Python和Docker容器技术。
                  英语CET4/6级证书，曾获三等奖学金。
                  担任过班长，校社联副部长，院分团委部长。`
    }
  },
  methods: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import './../assets/css/resume.css'
</style>

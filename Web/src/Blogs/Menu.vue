<template>
  <div>
    <div class="nav-bar">
      <div class="nav-item" @click="goFirst">P</div>
      <div class="nav-item" @click="goSecond">前</div>
      <div class="nav-item" @click="goThird">D</div>
      <div class="nav-item" @click="goForth">日</div>
    </div>
    <el-row type="flex" justify="center">
      <!-- 博客目录 -->
      <el-col :lg="20" :md="23" :sm="23" :xs="24" class="container">
        <el-row>
          <el-col :lg="18" :md="18" :sm="16">
            <router-view></router-view>
          </el-col>
          <el-col :lg="6" :md="6" :sm="8">
            <el-collapse v-model="activeName" class="menu" accordion>
              <div id="one"></div>
              <el-collapse-item id="first" title="Python3" class="header-one" name="1">
                <div class="menu-container">
                  <div class="menu-title orenge-one">Python3</div>
                  <div class="menu-sub-title menu-sub-title-one">记录了Python3的学习历程</div>
                  <el-table :data="python" @row-click="showPost" :header-cell-style="renderHeader">
                    <el-table-column prop="name"></el-table-column>
                    <el-table-column prop="date" width="100px"></el-table-column>
                  </el-table>
                </div>
              </el-collapse-item>
              <div id="two"></div>
              <el-collapse-item id="second" title="前端" name="2">
                <div class="menu-container">
                  <div class="menu-title orenge-two">前端</div>
                  <div class="menu-sub-title menu-sub-title-two">记录了前端框架的学习历程</div>
                  <el-table :data="foreEnd" @row-click="showPost" :header-cell-style="renderHeader">
                    <el-table-column prop="name"></el-table-column>
                    <el-table-column prop="date" width="100px"></el-table-column>
                  </el-table>
                </div>
              </el-collapse-item>
              <div id="three"></div>
              <el-collapse-item id="third" title="Docker" name="3">
                <div class="menu-container">
                  <div class="menu-title orenge-three">Docker</div>
                  <div class="menu-sub-title menu-sub-title-three">记录了Docker技术的学习历程</div>
                  <el-table :data="docker" @row-click="showPost" :header-cell-style="renderHeader">
                    <el-table-column prop="name"></el-table-column>
                    <el-table-column prop="date" width="100px"></el-table-column>
                  </el-table>
                </div>
              </el-collapse-item>
              <div id="four"></div>
              <el-collapse-item id="forth" title="日常笔记" name="4">
                <div class="menu-container">
                  <div class="menu-title orenge-four">日常笔记</div>
                  <div class="menu-sub-title menu-sub-title-four">平时的一些零碎知识点</div>
                  <el-table :data="daliy" @row-click="showPost" :header-cell-style="renderHeader">
                    <el-table-column prop="name"></el-table-column>
                    <el-table-column prop="date" width="100px"></el-table-column>
                  </el-table>
                </div>
              </el-collapse-item>
            </el-collapse>
          </el-col>
        </el-row>
      </el-col>
    </el-row>
    <div class="bottom-intro">我的学习记录，本页使用自己定义的markdown布局。</div>
  </div>
</template>

<script>
export default {
  name: 'Menu',
  mounted () {
    // this.$router.push({name: 'MyBlogs', params: {postIndex: 1}})
  },
  data () {
    return {
      python: [
        {
          name: 'Python3底层知识',
          date: '2019-01-01',
          index: 14
        },
        {
          name: 'Python3运算符',
          date: '2019-01-01',
          index: 15
        },
        {
          name: 'python3基础语法',
          date: '2019-01-01',
          index: 16
        }
      ],
      docker: [
        {
          name: 'Docker入门',
          date: '2019-01-01',
          index: 11
        }
      ],
      foreEnd: [
        {
          name: 'AngularJS基础内容',
          date: '2019-01-01',
          index: 9
        },
        {
          name: 'AngularJS自定义指令',
          date: '2019-01-01',
          index: 10
        },
        {
          name: 'Vue.js 监听参数',
          date: '2019-01-01',
          index: 18
        }
      ],
      daliy: [
        {
          name: 'GithubPages',
          date: '2019-01-01',
          index: 12
        },
        {
          name: 'idea导出war包并部署Ubuntu服务器',
          date: '2019-01-01',
          index: 13
        },
        {
          name: 'Ubuntu服务器搭建Mysql并远程连接',
          date: '2019-01-01',
          index: 17
        },
        {
          name: '官网下载Chrome离线包',
          date: '2019-01-01',
          index: 19
        }
      ],
      title: '顶级目录一',
      activeName: '1'
    }
  },
  methods: {
    showTable (index, indexPath) {
      // console.log(index, indexPath)
    },
    showPost (row, event, column) {
      console.log(row.name)
      this.$router.push({path: '/menu/myBlogs', query: {postIndex: row.index}})
    },
    renderHeader () {
      return 'padding: 4px;'
    },
    goFirst () {
      document.getElementById('one').scrollIntoView()
      this.activeName = '1'
      var showTitleTimer1 = setTimeout(showTitle1, 300)
      function showTitle1 () {
        document.getElementById('one').scrollIntoView()
        clearTimeout(showTitleTimer1) // 删除定时器 释放内存
      }
    },
    goSecond () {
      document.getElementById('one').scrollIntoView()
      this.activeName = '2'
      var showTitleTimer2 = setTimeout(showTitle2, 300)
      function showTitle2 () {
        document.getElementById('one').scrollIntoView()
        clearTimeout(showTitleTimer2) // 删除定时器 释放内存
      }
    },
    goThird () {
      document.getElementById('one').scrollIntoView()
      this.activeName = '3'
      var showTitleTimer3 = setTimeout(showTitle3, 300)
      function showTitle3 () {
        document.getElementById('one').scrollIntoView()
        clearTimeout(showTitleTimer3) // 删除定时器 释放内存
      }
    },
    goForth () {
      document.getElementById('one').scrollIntoView()
      this.activeName = '4'
      var showTitleTimer4 = setTimeout(showTitle4, 300)
      function showTitle4 () {
        document.getElementById('one').scrollIntoView()
        clearTimeout(showTitleTimer4) // 删除定时器 释放内存
      }
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import './../assets/css/menu.css';
</style>

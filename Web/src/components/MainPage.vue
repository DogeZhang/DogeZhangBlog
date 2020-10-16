<template>
  <div>
    <div @click="movementRight()" class="click-panel">right</div>
    <div @click="movementLeft()" class="click-panel">left</div>
    <div @click="setOne()" class="click-panel">one</div>
    <div @click="setTwo()" class="click-panel">two</div>
    <div @click="setThree()" class="click-panel">three</div>
    <!-- 宽屏设备展示 -->
    <el-row class="hidden-md-and-down main-container">
      <div style="position: absolute; left: 10%">
        <transition name="textpain">
          <div v-if="showTextpain === 'one'" style="position: absolute">
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">Document</p>
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">To do</p>
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">Continue</p>
          </div>
        </transition>
        <transition name="textpain">
          <div v-if="showTextpain === 'two'" style="position: absolute">
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">Document2</p>
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">To do2</p>
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">Continue2</p>
          </div>
        </transition>
        <transition name="textpain">
          <div v-if="showTextpain === 'three'" style="position: absolute">
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">Document3</p>
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">To do3</p>
            <p v-bind:class="movement" style="position: relative; left: 0%; font-size: 50px;">Continue3</p>
          </div>
        </transition>
      </div>
      <div style="position: absolute; left: 40%">
        <transition name="textpain">
          <div v-if="showTextpain">B</div>
        </transition>
      </div>
      <div style="position: absolute; left: 70%">
        <transition name="textpain">
          <div v-if="showTextpain">C</div>
        </transition>
      </div>
    </el-row>
    <!-- 小屏设备展示 -->
    <el-row class="hidden-lg-and-up">md, sm, xs</el-row>
  </div>
</template>

<script>
export default {
  name: 'Template',
  mounted () {
    window.onmousewheel = document.onmousewheel = this.handleScroll
    window.addEventListener('mousewheel', this.handleScroll, false)
    // window.addEventListener('DOMMouseScroll', this.handleScroll, false)
    window.addEventListener('touchstart', this.handleScroll, false)
    window.addEventListener('touchmove', this.handleScroll, false)
  },
  data () {
    return {
      msg: 'Welcome to My World !',
      startX: 0,
      startY: 0,
      showTextpain: 'one',
      testShow: true,
      movement: [],
      movementsytle: {},
      textpain: ['one', 'two', 'three']
    }
  },
  methods: {
    movementRight () {
      this.movement = ['movement']
      console.log('movementRight')
    },
    movementLeft () {
      this.movement = ['movement-reverse']
      console.log('movementLeft')
    },
    setOne () {
      this.showTextpain = this.textpain[0]
    },
    setTwo () {
      this.showTextpain = this.textpain[1]
    },
    setThree () {
      this.showTextpain = this.textpain[2]
    },
    handleScroll: function (event) {
      switch (event.type) {
        case 'mousewheel':
          this.msg = 'mousewheel'
          if (event.wheelDelta > 0) {
            this.showTextpain = false
          } else {
            this.showTextpain = true
          }
          break
        case 'touchstart':
          this.msg = 'touchstart'
          this.startX = event.touches[0].pageX
          this.startY = event.touches[0].pageY
          break
        case 'touchmove':
          this.msg = 'touchmove'
          var endX = event.touches[0].pageX
          var endY = event.touches[0].pageY
          var distanceX = this.startX - endX
          var distanceY = this.startY - endY
          if (Math.abs(distanceX) > Math.abs(distanceY) && distanceX > 0) {
            // this.msg = '往右滑动'
            this.movementShow = false
          } else if (Math.abs(distanceX) > Math.abs(distanceY) && distanceX < 0) {
            // this.msg = '往左滑动'
            this.movementShow = true
          } else if (Math.abs(distanceY) > Math.abs(distanceX) && distanceY > 0) {
            // this.msg = '往上滑动'
            this.showTextpain = false
          } else if (Math.abs(distanceY) > Math.abs(distanceX) && distanceY < 0) {
            // this.msg = '往下滑动'
            this.showTextpain = true
          } else {
            // this.msg = '点击未滑动'
          }
          break
      }
      // console.log(event)
      // var str = ''
      // for (var item in event) {
      //   str += item + ':' + event[item] + '\n'
      // }
      // this.msg = str
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import './../assets/css/mainPage.css'
</style>

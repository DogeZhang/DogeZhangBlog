<template>
  <div>
    <div @click="movement()" style="height: 100px; width: 100px; background-color: black;"></div>
    <!-- 宽屏设备展示 -->
    <el-row class="hidden-md-and-down" style="margin-top: 300px;">
      <div style="position: absolute; left: 10%">
        <transition name="textpain">
          <div v-if="showTextpain">A</div>
        </transition>
      </div>
      <div >
        <div v-bind:class="[isMove ? 'movement' : 'movement-reverse']" style="position: absolute; left: 40%">
          <transition name="textpain" id="sss">
            <div v-if="showTextpain">B</div>
          </transition>
        </div>
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
      showTextpain: true,
      testShow: true,
      isMove: true,
      movementsytle: {}
    }
  },
  methods: {
    movement () {
      this.isMove = !this.isMove
      console.log('movement')
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

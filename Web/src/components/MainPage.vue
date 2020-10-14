<template>
  <div>
    <div class="block_one">
      <pre>{{msg}}</pre>
      <div style="height: 200px"></div>
      <transition name="textpain">
        <div v-if="showTextpain" class="textpain"></div>
      </transition>
      <div style="opacity: 0.5; background: white"> sdfsdfksjdhfkjshdf</div>
      <div @click="show()" style="position: fixed; height: 25px; width: 25px; top: 200px; right: 0; background-color: yellow; z-index: 200;"></div>
      <transition name="test">
        <div v-if="testShow" class="test">sdfsdf</div>
      </transition>
    </div>
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
      showTextpain: false,
      testShow: false
    }
  },
  methods: {
    show () {
      this.testShow = !this.testShow
      console.log('test')
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
          } else if (Math.abs(distanceX) > Math.abs(distanceY) && distanceX < 0) {
            // this.msg = '往左滑动'
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
      console.log(event)
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

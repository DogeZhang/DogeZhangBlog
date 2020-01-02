<template>
  <div>
    Aside
  </div>
</template>

<script>
// fade/zoom 等

// collapse 展开折叠
import CollapseTransition from 'element-ui/lib/transitions/collapse-transition'
import Vue from 'vue'

Vue.component(CollapseTransition.name, CollapseTransition)
export default {
  name: 'Aside',
  mounted () {
  },
  data () {
    return {
      msg: 'Welcome to My World !',
      show3: true
    }
  },
  methods: {
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
  @import './../assets/css/aside.css';
</style>

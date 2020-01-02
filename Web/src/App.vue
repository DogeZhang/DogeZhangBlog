<template>
  <div>
    <div class="fullscreen_post_bg"></div>
    <router-view/>
  </div>
</template>

<script>
export default {
  name: 'App'
}
</script>

<style>
.fullscreen_post_bg{
  position: fixed;
  top:0;
  right:0;
  bottom:0;
  left:0;
  background-position: 50% 50%;
  background: #000000 url(./assets/images/cat-1.jpg) no-repeat fixed center;
  /* background-color: #d9e2ef; */
}
</style>

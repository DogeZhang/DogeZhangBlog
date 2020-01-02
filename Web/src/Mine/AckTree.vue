<template>
  <div>
    <el-row type="flex" justify="center">
      <el-col :lg="20" :md="20" :sm="24" :xs="24">
        <div id="myChart" :style="{width: '100%', height: '2400px'}"></div>
      </el-col>
    </el-row>
  </div>
</template>

<script>
import Ack from '../../static/Ack.json'
let echarts = require('echarts/lib/echarts')
require('echarts/lib/chart/tree')
export default {
  name: 'AckTree',
  data () {
    return {
      data: '',
      msg: 'Welcome to Your Vue.js App'
    }
  },
  mounted () {
    this.data = Ack
    this.drawLine()
  },
  methods: {
    drawLine () {
      var t = this
      let myChart = echarts.init(document.getElementById('myChart'))
      console.log(t.data)
      myChart.setOption({
        tooltip: {
          trigger: 'item',
          triggerOn: 'mousemove'
        },
        series: [
          {
            type: 'tree',
            data: [t.data],
            top: '1%',
            left: '7%',
            bottom: '1%',
            right: '20%',
            symbolSize: 7,
            label: {
              normal: {
                position: 'left',
                verticalAlign: 'middle',
                align: 'right',
                fontSize: 14
              }
            },
            leaves: {
              label: {
                normal: {
                  position: 'right',
                  verticalAlign: 'middle',
                  align: 'left'
                }
              }
            },
            expandAndCollapse: false,
            animationDuration: 550,
            animationDurationUpdate: 750
          }
        ],
        backgroundColor: '#f3f3f3'
      })
    }
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>

</style>

import Vue from 'vue'
import Router from 'vue-router'
// import Home from '@/components/Home'
import BlogPage from '@/components/BlogPage'
import personalInfo from '@/components/PersonalInfo'
import Aside from '@/components/Aside'
import Main from '@/main/Main'
import Resume from '@/Mine/Resume'
import AckTree from '@/Mine/AckTree'
import MyBlogs from '@/Blogs/MyBlogs'
import Menu from '@/Blogs/Menu'
import MenuTest from '@/Blogs/MenuTest'
import MainPage from '@/components/MainPage'

Vue.use(Router)

export default new Router({
  routes: [
    // {
    //   path: '/',
    //   name: 'Home',
    //   component: Home
    // },
    {
      path: '/',
      name: 'MainPage',
      component: MainPage
    },
    {
      path: '/blogPage',
      name: 'BlogPage',
      component: BlogPage,
      children: [
        {
          path: '/main',
          name: 'Main',
          components: {
            default: personalInfo,
            aside: Aside,
            main: Main
          }
        },
        {
          path: '/resume',
          name: 'Resume',
          components: {
            default: personalInfo,
            aside: Aside,
            main: Resume
          }
        },
        {
          path: '/acktree',
          name: 'AckTree',
          components: {
            default: personalInfo,
            aside: Aside,
            main: AckTree
          }
        },
        // {
        //   path: '/myBlogs',
        //   name: 'MyBlogs',
        //   components: {
        //     default: personalInfo,
        //     aside: Aside,
        //     main: MyBlogs
        //   }
        // },
        {
          path: '/menu',
          name: 'Menu',
          components: {
            default: personalInfo,
            aside: Aside,
            main: Menu
          },
          children: [
            {
              path: 'myBlogs',
              name: 'MyBlogs',
              component: MyBlogs
            }
          ]
        },
        {
          path: '/menuTest',
          name: 'MenuTest',
          components: {
            default: personalInfo,
            aside: Aside,
            main: MenuTest
          }
        }
      ]
    }
  ]
})

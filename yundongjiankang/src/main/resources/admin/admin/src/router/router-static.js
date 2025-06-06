import Vue from 'vue';
//配置路由
import VueRouter from 'vue-router'
Vue.use(VueRouter);
//1.创建组件
import Index from '@/views/index'
import Home from '@/views/home'
import Login from '@/views/login'
import NotFound from '@/views/404'
import UpdatePassword from '@/views/update-password'
import pay from '@/views/pay'
import register from '@/views/register'
import center from '@/views/center'

     import users from '@/views/modules/users/list'
    import address from '@/views/modules/address/list'
    import cart from '@/views/modules/cart/list'
    import dictionary from '@/views/modules/dictionary/list'
    import meishi from '@/views/modules/meishi/list'
    import meishiCommentback from '@/views/modules/meishiCommentback/list'
    import meishiOrder from '@/views/modules/meishiOrder/list'
    import news from '@/views/modules/news/list'
    import shiwufenxi from '@/views/modules/shiwufenxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import yundongmokuai from '@/views/modules/yundongmokuai/list'
    import config from '@/views/modules/config/list'
    import dictionaryIsdefault from '@/views/modules/dictionaryIsdefault/list'
    import dictionaryMeishi from '@/views/modules/dictionaryMeishi/list'
    import dictionaryMeishiOrder from '@/views/modules/dictionaryMeishiOrder/list'
    import dictionaryMeishiOrderPayment from '@/views/modules/dictionaryMeishiOrderPayment/list'
    import dictionaryNews from '@/views/modules/dictionaryNews/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryShiwufenxi from '@/views/modules/dictionaryShiwufenxi/list'
    import dictionaryYundongmokuai from '@/views/modules/dictionaryYundongmokuai/list'





//2.配置路由   注意：名字
const routes = [{
    path: '/index',
    name: '首页',
    component: Index,
    children: [{
      // 这里不设置值，是把main作为默认页面
      path: '/',
      name: '首页',
      component: Home,
      meta: {icon:'', title:'center'}
    }, {
      path: '/updatePassword',
      name: '修改密码',
      component: UpdatePassword,
      meta: {icon:'', title:'updatePassword'}
    }, {
      path: '/pay',
      name: '支付',
      component: pay,
      meta: {icon:'', title:'pay'}
    }, {
      path: '/center',
      name: '个人信息',
      component: center,
      meta: {icon:'', title:'center'}
    } ,{
        path: '/users',
        name: '管理信息',
        component: users
      }
    ,{
        path: '/dictionaryIsdefault',
        name: '是否默认地址',
        component: dictionaryIsdefault
    }
    ,{
        path: '/dictionaryMeishi',
        name: '商品类型',
        component: dictionaryMeishi
    }
    ,{
        path: '/dictionaryMeishiOrder',
        name: '订单类型',
        component: dictionaryMeishiOrder
    }
    ,{
        path: '/dictionaryMeishiOrderPayment',
        name: '订单支付类型',
        component: dictionaryMeishiOrderPayment
    }
    ,{
        path: '/dictionaryNews',
        name: '公告类型',
        component: dictionaryNews
    }
    ,{
        path: '/dictionarySex',
        name: '性别类型',
        component: dictionarySex
    }
    ,{
        path: '/dictionaryShangxia',
        name: '上下架',
        component: dictionaryShangxia
    }
    ,{
        path: '/dictionaryShiwufenxi',
        name: '食物类型',
        component: dictionaryShiwufenxi
    }
    ,{
        path: '/dictionaryYundongmokuai',
        name: '运动类型',
        component: dictionaryYundongmokuai
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/address',
        name: '收货地址',
        component: address
      }
    ,{
        path: '/cart',
        name: '购物车',
        component: cart
      }
    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/meishi',
        name: '商品',
        component: meishi
      }
    ,{
        path: '/meishiCommentback',
        name: '商品评价',
        component: meishiCommentback
      }
    ,{
        path: '/meishiOrder',
        name: '商品订单',
        component: meishiOrder
      }
    ,{
        path: '/news',
        name: '公告信息',
        component: news
      }
    ,{
        path: '/shiwufenxi',
        name: '食物营养分析',
        component: shiwufenxi
      }
    ,{
        path: '/yonghu',
        name: '用户',
        component: yonghu
      }
    ,{
        path: '/yundongmokuai',
        name: '运动模块',
        component: yundongmokuai
      }


    ]
  },
  {
    path: '/login',
    name: 'login',
    component: Login,
    meta: {icon:'', title:'login'}
  },
  {
    path: '/register',
    name: 'register',
    component: register,
    meta: {icon:'', title:'register'}
  },
  {
    path: '/',
    name: '首页',
    redirect: '/index'
  }, /*默认跳转路由*/
  {
    path: '*',
    component: NotFound
  }
]
//3.实例化VueRouter  注意：名字
const router = new VueRouter({
  mode: 'hash',
  /*hash模式改为history*/
  routes // （缩写）相当于 routes: routes
})

export default router;

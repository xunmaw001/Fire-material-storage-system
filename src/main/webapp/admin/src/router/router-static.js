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
    import rukuxinxi from '@/views/modules/rukuxinxi/list'
    import yonghu from '@/views/modules/yonghu/list'
    import anquanjianchatixing from '@/views/modules/anquanjianchatixing/list'
    import cangwei from '@/views/modules/cangwei/list'
    import cangku from '@/views/modules/cangku/list'
    import wuzixiangqing from '@/views/modules/wuzixiangqing/list'
    import baojingtongzhi from '@/views/modules/baojingtongzhi/list'
    import chukuxinxi from '@/views/modules/chukuxinxi/list'


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
    }
      ,{
	path: '/rukuxinxi',
        name: '入库信息',
        component: rukuxinxi
      }
      ,{
	path: '/yonghu',
        name: '用户',
        component: yonghu
      }
      ,{
	path: '/anquanjianchatixing',
        name: '安全检查提醒',
        component: anquanjianchatixing
      }
      ,{
	path: '/cangwei',
        name: '仓位',
        component: cangwei
      }
      ,{
	path: '/cangku',
        name: '仓库',
        component: cangku
      }
      ,{
	path: '/wuzixiangqing',
        name: '物资详情',
        component: wuzixiangqing
      }
      ,{
	path: '/baojingtongzhi',
        name: '报警通知',
        component: baojingtongzhi
      }
      ,{
	path: '/chukuxinxi',
        name: '出库信息',
        component: chukuxinxi
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

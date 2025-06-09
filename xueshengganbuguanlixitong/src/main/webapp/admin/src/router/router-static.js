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
    import dictionary from '@/views/modules/dictionary/list'
    import forum from '@/views/modules/forum/list'
    import gonggao from '@/views/modules/gonggao/list'
    import huodong from '@/views/modules/huodong/list'
    import huodongCollection from '@/views/modules/huodongCollection/list'
    import huodongLiuyan from '@/views/modules/huodongLiuyan/list'
    import huodongYuyue from '@/views/modules/huodongYuyue/list'
    import xuesheng from '@/views/modules/xuesheng/list'
    import xueshengKaoqin from '@/views/modules/xueshengKaoqin/list'
    import xueshengKaoqinList from '@/views/modules/xueshengKaoqinList/list'
    import xueshengToupiao from '@/views/modules/xueshengToupiao/list'
    import xueshengToupiaoList from '@/views/modules/xueshengToupiaoList/list'
    import ganbu from '@/views/modules/ganbu/list'
    import config from '@/views/modules/config/list'
    import dictionaryBanji from '@/views/modules/dictionaryBanji/list'
    import dictionaryForum from '@/views/modules/dictionaryForum/list'
    import dictionaryForumState from '@/views/modules/dictionaryForumState/list'
    import dictionaryGonggao from '@/views/modules/dictionaryGonggao/list'
    import dictionaryHuodong from '@/views/modules/dictionaryHuodong/list'
    import dictionaryHuodongCollection from '@/views/modules/dictionaryHuodongCollection/list'
    import dictionaryHuodongYuyueYesno from '@/views/modules/dictionaryHuodongYuyueYesno/list'
    import dictionarySex from '@/views/modules/dictionarySex/list'
    import dictionaryShangxia from '@/views/modules/dictionaryShangxia/list'
    import dictionaryXueshengKaoqinList from '@/views/modules/dictionaryXueshengKaoqinList/list'
    import dictionaryXueshengToupiao from '@/views/modules/dictionaryXueshengToupiao/list'
    import dictionaryZhiwei from '@/views/modules/dictionaryZhiwei/list'





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
        path: '/dictionaryBanji',
        name: '班级类型',
        component: dictionaryBanji
    }
    ,{
        path: '/dictionaryForum',
        name: '帖子类型',
        component: dictionaryForum
    }
    ,{
        path: '/dictionaryForumState',
        name: '帖子状态',
        component: dictionaryForumState
    }
    ,{
        path: '/dictionaryGonggao',
        name: '通知类型',
        component: dictionaryGonggao
    }
    ,{
        path: '/dictionaryHuodong',
        name: '活动类型',
        component: dictionaryHuodong
    }
    ,{
        path: '/dictionaryHuodongCollection',
        name: '收藏表类型',
        component: dictionaryHuodongCollection
    }
    ,{
        path: '/dictionaryHuodongYuyueYesno',
        name: '订单类型',
        component: dictionaryHuodongYuyueYesno
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
        path: '/dictionaryXueshengKaoqinList',
        name: '打卡状态',
        component: dictionaryXueshengKaoqinList
    }
    ,{
        path: '/dictionaryXueshengToupiao',
        name: '投票类型',
        component: dictionaryXueshengToupiao
    }
    ,{
        path: '/dictionaryZhiwei',
        name: '职位类型',
        component: dictionaryZhiwei
    }
    ,{
        path: '/config',
        name: '轮播图',
        component: config
    }


    ,{
        path: '/dictionary',
        name: '字典',
        component: dictionary
      }
    ,{
        path: '/forum',
        name: '论坛',
        component: forum
      }
    ,{
        path: '/gonggao',
        name: '通知',
        component: gonggao
      }
    ,{
        path: '/huodong',
        name: '活动',
        component: huodong
      }
    ,{
        path: '/huodongCollection',
        name: '活动收藏',
        component: huodongCollection
      }
    ,{
        path: '/huodongLiuyan',
        name: '活动留言',
        component: huodongLiuyan
      }
    ,{
        path: '/huodongYuyue',
        name: '活动报名',
        component: huodongYuyue
      }
    ,{
        path: '/xuesheng',
        name: '学生',
        component: xuesheng
      }
    ,{
        path: '/xueshengKaoqin',
        name: '考勤',
        component: xueshengKaoqin
      }
    ,{
        path: '/xueshengKaoqinList',
        name: '考勤详情',
        component: xueshengKaoqinList
      }
    ,{
        path: '/xueshengToupiao',
        name: '投票',
        component: xueshengToupiao
      }
    ,{
        path: '/xueshengToupiaoList',
        name: '投票详情',
        component: xueshengToupiaoList
      }
    ,{
        path: '/ganbu',
        name: '干部',
        component: ganbu
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

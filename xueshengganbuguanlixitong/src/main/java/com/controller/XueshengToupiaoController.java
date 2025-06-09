
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 投票
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/xueshengToupiao")
public class XueshengToupiaoController {
    private static final Logger logger = LoggerFactory.getLogger(XueshengToupiaoController.class);

    private static final String TABLE_NAME = "xueshengToupiao";

    @Autowired
    private XueshengToupiaoService xueshengToupiaoService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表非注册的service
    //有list表
    @Autowired
    private XueshengToupiaoListService xueshengToupiaoListService;
    @Autowired
    private XueshengService xueshengService;
    @Autowired
    private GanbuService ganbuService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        else if("干部".equals(role))
            params.put("ganbuId",request.getSession().getAttribute("userId"));
        CommonUtil.checkMap(params);
        PageUtils page = xueshengToupiaoService.queryPage(params);

        //字典表数据转换
        List<XueshengToupiaoView> list =(List<XueshengToupiaoView>)page.getList();
        for(XueshengToupiaoView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XueshengToupiaoEntity xueshengToupiao = xueshengToupiaoService.selectById(id);
        if(xueshengToupiao !=null){
            //entity转view
            XueshengToupiaoView view = new XueshengToupiaoView();
            BeanUtils.copyProperties( xueshengToupiao , view );//把实体数据重构到view中
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"查不到数据");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody XueshengToupiaoEntity xueshengToupiao, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,xueshengToupiao:{}",this.getClass().getName(),xueshengToupiao.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<XueshengToupiaoEntity> queryWrapper = new EntityWrapper<XueshengToupiaoEntity>()
            .eq("xuesheng_toupiao_uuid_number", xueshengToupiao.getXueshengToupiaoUuidNumber())
            .eq("xuesheng_toupiao_name", xueshengToupiao.getXueshengToupiaoName())
            .eq("xuesheng_toupiao_types", xueshengToupiao.getXueshengToupiaoTypes())
            .eq("xuesheng_toupiao_neirong", xueshengToupiao.getXueshengToupiaoNeirong())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengToupiaoEntity xueshengToupiaoEntity = xueshengToupiaoService.selectOne(queryWrapper);
        if(xueshengToupiaoEntity==null){
            xueshengToupiao.setInsertTime(new Date());
            xueshengToupiao.setCreateTime(new Date());
            xueshengToupiaoService.insert(xueshengToupiao);
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody XueshengToupiaoEntity xueshengToupiao, HttpServletRequest request) throws NoSuchFieldException, ClassNotFoundException, IllegalAccessException, InstantiationException {
        logger.debug("update方法:,,Controller:{},,xueshengToupiao:{}",this.getClass().getName(),xueshengToupiao.toString());
        XueshengToupiaoEntity oldXueshengToupiaoEntity = xueshengToupiaoService.selectById(xueshengToupiao.getId());//查询原先数据

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<XueshengToupiaoEntity> queryWrapper = new EntityWrapper<XueshengToupiaoEntity>()
            .notIn("id",xueshengToupiao.getId())
            .andNew()
            .eq("xuesheng_toupiao_uuid_number", xueshengToupiao.getXueshengToupiaoUuidNumber())
            .eq("xuesheng_toupiao_name", xueshengToupiao.getXueshengToupiaoName())
            .eq("xuesheng_toupiao_types", xueshengToupiao.getXueshengToupiaoTypes())
            .eq("xuesheng_toupiao_neirong", xueshengToupiao.getXueshengToupiaoNeirong())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengToupiaoEntity xueshengToupiaoEntity = xueshengToupiaoService.selectOne(queryWrapper);
        if(xueshengToupiaoEntity==null){
            xueshengToupiaoService.updateById(xueshengToupiao);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids, HttpServletRequest request){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        List<XueshengToupiaoEntity> oldXueshengToupiaoList =xueshengToupiaoService.selectBatchIds(Arrays.asList(ids));//要删除的数据
        xueshengToupiaoService.deleteBatchIds(Arrays.asList(ids));
        xueshengToupiaoListService.delete(new EntityWrapper<XueshengToupiaoListEntity>().in("xuesheng_toupiao_id",ids));

        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer xueshengId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<XueshengToupiaoEntity> xueshengToupiaoList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("../../upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            XueshengToupiaoEntity xueshengToupiaoEntity = new XueshengToupiaoEntity();
//                            xueshengToupiaoEntity.setXueshengToupiaoUuidNumber(data.get(0));                    //投票唯一编号 要改的
//                            xueshengToupiaoEntity.setXueshengToupiaoName(data.get(0));                    //投票标题 要改的
//                            xueshengToupiaoEntity.setXueshengToupiaoTypes(Integer.valueOf(data.get(0)));   //投票类型 要改的
//                            xueshengToupiaoEntity.setXueshengToupiaoNeirong(data.get(0));                    //投票内容 要改的
//                            xueshengToupiaoEntity.setXueshengToupiaoContent("");//详情和图片
//                            xueshengToupiaoEntity.setInsertTime(date);//时间
//                            xueshengToupiaoEntity.setJiezhiTime(sdf.parse(data.get(0)));          //投票截止时间 要改的
//                            xueshengToupiaoEntity.setCreateTime(date);//时间
                            xueshengToupiaoList.add(xueshengToupiaoEntity);


                            //把要查询是否重复的字段放入map中
                                //投票唯一编号
                                if(seachFields.containsKey("xueshengToupiaoUuidNumber")){
                                    List<String> xueshengToupiaoUuidNumber = seachFields.get("xueshengToupiaoUuidNumber");
                                    xueshengToupiaoUuidNumber.add(data.get(0));//要改的
                                }else{
                                    List<String> xueshengToupiaoUuidNumber = new ArrayList<>();
                                    xueshengToupiaoUuidNumber.add(data.get(0));//要改的
                                    seachFields.put("xueshengToupiaoUuidNumber",xueshengToupiaoUuidNumber);
                                }
                        }

                        //查询是否重复
                         //投票唯一编号
                        List<XueshengToupiaoEntity> xueshengToupiaoEntities_xueshengToupiaoUuidNumber = xueshengToupiaoService.selectList(new EntityWrapper<XueshengToupiaoEntity>().in("xuesheng_toupiao_uuid_number", seachFields.get("xueshengToupiaoUuidNumber")));
                        if(xueshengToupiaoEntities_xueshengToupiaoUuidNumber.size() >0 ){
                            ArrayList<String> repeatFields = new ArrayList<>();
                            for(XueshengToupiaoEntity s:xueshengToupiaoEntities_xueshengToupiaoUuidNumber){
                                repeatFields.add(s.getXueshengToupiaoUuidNumber());
                            }
                            return R.error(511,"数据库的该表中的 [投票唯一编号] 字段已经存在 存在数据为:"+repeatFields.toString());
                        }
                        xueshengToupiaoService.insertBatch(xueshengToupiaoList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }





    /**
    * 前端列表
    */
    @IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("list方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));

        CommonUtil.checkMap(params);
        PageUtils page = xueshengToupiaoService.queryPage(params);

        //字典表数据转换
        List<XueshengToupiaoView> list =(List<XueshengToupiaoView>)page.getList();
        for(XueshengToupiaoView c:list)
            dictionaryService.dictionaryConvert(c, request); //修改对应字典表字段

        return R.ok().put("data", page);
    }

    /**
    * 前端详情
    */
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("detail方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        XueshengToupiaoEntity xueshengToupiao = xueshengToupiaoService.selectById(id);
            if(xueshengToupiao !=null){


                //entity转view
                XueshengToupiaoView view = new XueshengToupiaoView();
                BeanUtils.copyProperties( xueshengToupiao , view );//把实体数据重构到view中

                //修改对应字典表字段
                dictionaryService.dictionaryConvert(view, request);
                return R.ok().put("data", view);
            }else {
                return R.error(511,"查不到数据");
            }
    }


    /**
    * 前端保存
    */
    @RequestMapping("/add")
    public R add(@RequestBody XueshengToupiaoEntity xueshengToupiao, HttpServletRequest request){
        logger.debug("add方法:,,Controller:{},,xueshengToupiao:{}",this.getClass().getName(),xueshengToupiao.toString());
        Wrapper<XueshengToupiaoEntity> queryWrapper = new EntityWrapper<XueshengToupiaoEntity>()
            .eq("xuesheng_toupiao_uuid_number", xueshengToupiao.getXueshengToupiaoUuidNumber())
            .eq("xuesheng_toupiao_name", xueshengToupiao.getXueshengToupiaoName())
            .eq("xuesheng_toupiao_types", xueshengToupiao.getXueshengToupiaoTypes())
            .eq("xuesheng_toupiao_neirong", xueshengToupiao.getXueshengToupiaoNeirong())
            ;
        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        XueshengToupiaoEntity xueshengToupiaoEntity = xueshengToupiaoService.selectOne(queryWrapper);
        if(xueshengToupiaoEntity==null){
            xueshengToupiao.setInsertTime(new Date());
            xueshengToupiao.setCreateTime(new Date());
        xueshengToupiaoService.insert(xueshengToupiao);

            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }

}

package com.dao;

import com.entity.XueshengToupiaoListEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.XueshengToupiaoListView;

/**
 * 投票详情 Dao 接口
 *
 * @author 
 */
public interface XueshengToupiaoListDao extends BaseMapper<XueshengToupiaoListEntity> {

   List<XueshengToupiaoListView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

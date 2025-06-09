package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XueshengToupiaoEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 投票
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xuesheng_toupiao")
public class XueshengToupiaoView extends XueshengToupiaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 投票类型的值
	*/
	@ColumnInfo(comment="投票类型的字典表值",type="varchar(200)")
	private String xueshengToupiaoValue;




	public XueshengToupiaoView() {

	}

	public XueshengToupiaoView(XueshengToupiaoEntity xueshengToupiaoEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengToupiaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 投票类型的值
	*/
	public String getXueshengToupiaoValue() {
		return xueshengToupiaoValue;
	}
	/**
	* 设置： 投票类型的值
	*/
	public void setXueshengToupiaoValue(String xueshengToupiaoValue) {
		this.xueshengToupiaoValue = xueshengToupiaoValue;
	}




	@Override
	public String toString() {
		return "XueshengToupiaoView{" +
			", xueshengToupiaoValue=" + xueshengToupiaoValue +
			"} " + super.toString();
	}
}

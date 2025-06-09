package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.HuodongYuyueEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 活动报名
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("huodong_yuyue")
public class HuodongYuyueView extends HuodongYuyueEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 报名状态的值
	*/
	@ColumnInfo(comment="报名状态的字典表值",type="varchar(200)")
	private String huodongYuyueYesnoValue;

	//级联表 活动
					 
		/**
		* 活动 的 干部
		*/
		@ColumnInfo(comment="干部",type="int(11)")
		private Integer huodongGanbuId;
		/**
		* 活动名称
		*/

		@ColumnInfo(comment="活动名称",type="varchar(200)")
		private String huodongName;
		/**
		* 活动编号
		*/

		@ColumnInfo(comment="活动编号",type="varchar(200)")
		private String huodongUuidNumber;
		/**
		* 活动照片
		*/

		@ColumnInfo(comment="活动照片",type="varchar(200)")
		private String huodongPhoto;
		/**
		* 活动类型
		*/
		@ColumnInfo(comment="活动类型",type="int(11)")
		private Integer huodongTypes;
			/**
			* 活动类型的值
			*/
			@ColumnInfo(comment="活动类型的字典表值",type="varchar(200)")
			private String huodongValue;
		/**
		* 剩余可参与人数
		*/

		@ColumnInfo(comment="剩余可参与人数",type="int(11)")
		private Integer huodongKucunNumber;
		/**
		* 活动热度
		*/

		@ColumnInfo(comment="活动热度",type="int(11)")
		private Integer huodongClicknum;
		/**
		* 活动介绍
		*/

		@ColumnInfo(comment="活动介绍",type="text")
		private String huodongContent;
		/**
		* 是否上架
		*/
		@ColumnInfo(comment="是否上架",type="int(11)")
		private Integer shangxiaTypes;
			/**
			* 是否上架的值
			*/
			@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
			private String shangxiaValue;
		/**
		* 逻辑删除
		*/

		@ColumnInfo(comment="逻辑删除",type="int(11)")
		private Integer huodongDelete;
	//级联表 学生
		/**
		* 学生姓名
		*/

		@ColumnInfo(comment="学生姓名",type="varchar(200)")
		private String xueshengName;
		/**
		* 学生手机号
		*/

		@ColumnInfo(comment="学生手机号",type="varchar(200)")
		private String xueshengPhone;
		/**
		* 学生身份证号
		*/

		@ColumnInfo(comment="学生身份证号",type="varchar(200)")
		private String xueshengIdNumber;
		/**
		* 学生头像
		*/

		@ColumnInfo(comment="学生头像",type="varchar(200)")
		private String xueshengPhoto;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String xueshengEmail;

	//重复字段
			/**
			* 重复字段 的值
			*/
			@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
			private String sexValue;
			/**
			* 重复字段 的值
			*/
			@ColumnInfo(comment="重复字段 的值",type="varchar(200)")
			private String banjiValue;


	public HuodongYuyueView() {

	}

	public HuodongYuyueView(HuodongYuyueEntity huodongYuyueEntity) {
		try {
			BeanUtils.copyProperties(this, huodongYuyueEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 报名状态的值
	*/
	public String getHuodongYuyueYesnoValue() {
		return huodongYuyueYesnoValue;
	}
	/**
	* 设置： 报名状态的值
	*/
	public void setHuodongYuyueYesnoValue(String huodongYuyueYesnoValue) {
		this.huodongYuyueYesnoValue = huodongYuyueYesnoValue;
	}


	//级联表的get和set 活动
		/**
		* 获取：活动 的 干部
		*/
		public Integer getHuodongGanbuId() {
			return huodongGanbuId;
		}
		/**
		* 设置：活动 的 干部
		*/
		public void setHuodongGanbuId(Integer huodongGanbuId) {
			this.huodongGanbuId = huodongGanbuId;
		}

		/**
		* 获取： 活动名称
		*/
		public String getHuodongName() {
			return huodongName;
		}
		/**
		* 设置： 活动名称
		*/
		public void setHuodongName(String huodongName) {
			this.huodongName = huodongName;
		}

		/**
		* 获取： 活动编号
		*/
		public String getHuodongUuidNumber() {
			return huodongUuidNumber;
		}
		/**
		* 设置： 活动编号
		*/
		public void setHuodongUuidNumber(String huodongUuidNumber) {
			this.huodongUuidNumber = huodongUuidNumber;
		}

		/**
		* 获取： 活动照片
		*/
		public String getHuodongPhoto() {
			return huodongPhoto;
		}
		/**
		* 设置： 活动照片
		*/
		public void setHuodongPhoto(String huodongPhoto) {
			this.huodongPhoto = huodongPhoto;
		}
		/**
		* 获取： 活动类型
		*/
		public Integer getHuodongTypes() {
			return huodongTypes;
		}
		/**
		* 设置： 活动类型
		*/
		public void setHuodongTypes(Integer huodongTypes) {
			this.huodongTypes = huodongTypes;
		}


			/**
			* 获取： 活动类型的值
			*/
			public String getHuodongValue() {
				return huodongValue;
			}
			/**
			* 设置： 活动类型的值
			*/
			public void setHuodongValue(String huodongValue) {
				this.huodongValue = huodongValue;
			}

		/**
		* 获取： 剩余可参与人数
		*/
		public Integer getHuodongKucunNumber() {
			return huodongKucunNumber;
		}
		/**
		* 设置： 剩余可参与人数
		*/
		public void setHuodongKucunNumber(Integer huodongKucunNumber) {
			this.huodongKucunNumber = huodongKucunNumber;
		}

		/**
		* 获取： 活动热度
		*/
		public Integer getHuodongClicknum() {
			return huodongClicknum;
		}
		/**
		* 设置： 活动热度
		*/
		public void setHuodongClicknum(Integer huodongClicknum) {
			this.huodongClicknum = huodongClicknum;
		}

		/**
		* 获取： 活动介绍
		*/
		public String getHuodongContent() {
			return huodongContent;
		}
		/**
		* 设置： 活动介绍
		*/
		public void setHuodongContent(String huodongContent) {
			this.huodongContent = huodongContent;
		}
		/**
		* 获取： 是否上架
		*/
		public Integer getShangxiaTypes() {
			return shangxiaTypes;
		}
		/**
		* 设置： 是否上架
		*/
		public void setShangxiaTypes(Integer shangxiaTypes) {
			this.shangxiaTypes = shangxiaTypes;
		}


			/**
			* 获取： 是否上架的值
			*/
			public String getShangxiaValue() {
				return shangxiaValue;
			}
			/**
			* 设置： 是否上架的值
			*/
			public void setShangxiaValue(String shangxiaValue) {
				this.shangxiaValue = shangxiaValue;
			}

		/**
		* 获取： 逻辑删除
		*/
		public Integer getHuodongDelete() {
			return huodongDelete;
		}
		/**
		* 设置： 逻辑删除
		*/
		public void setHuodongDelete(Integer huodongDelete) {
			this.huodongDelete = huodongDelete;
		}
	//级联表的get和set 学生

		/**
		* 获取： 学生姓名
		*/
		public String getXueshengName() {
			return xueshengName;
		}
		/**
		* 设置： 学生姓名
		*/
		public void setXueshengName(String xueshengName) {
			this.xueshengName = xueshengName;
		}

		/**
		* 获取： 学生手机号
		*/
		public String getXueshengPhone() {
			return xueshengPhone;
		}
		/**
		* 设置： 学生手机号
		*/
		public void setXueshengPhone(String xueshengPhone) {
			this.xueshengPhone = xueshengPhone;
		}

		/**
		* 获取： 学生身份证号
		*/
		public String getXueshengIdNumber() {
			return xueshengIdNumber;
		}
		/**
		* 设置： 学生身份证号
		*/
		public void setXueshengIdNumber(String xueshengIdNumber) {
			this.xueshengIdNumber = xueshengIdNumber;
		}

		/**
		* 获取： 学生头像
		*/
		public String getXueshengPhoto() {
			return xueshengPhoto;
		}
		/**
		* 设置： 学生头像
		*/
		public void setXueshengPhoto(String xueshengPhoto) {
			this.xueshengPhoto = xueshengPhoto;
		}

		/**
		* 获取： 电子邮箱
		*/
		public String getXueshengEmail() {
			return xueshengEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setXueshengEmail(String xueshengEmail) {
			this.xueshengEmail = xueshengEmail;
		}

	//重复字段
			/**
			* 获取： 重复字段 的值
			*/
			public String getSexValue() {
			return sexValue;
			}
			/**
			* 设置： 重复字段 的值
			*/
			public void setSexValue(String sexValue) {
			this.sexValue = sexValue;
			}
			/**
			* 获取： 重复字段 的值
			*/
			public String getBanjiValue() {
			return banjiValue;
			}
			/**
			* 设置： 重复字段 的值
			*/
			public void setBanjiValue(String banjiValue) {
			this.banjiValue = banjiValue;
			}

	@Override
	public String toString() {
		return "HuodongYuyueView{" +
			", huodongYuyueYesnoValue=" + huodongYuyueYesnoValue +
			", xueshengName=" + xueshengName +
			", xueshengPhone=" + xueshengPhone +
			", xueshengIdNumber=" + xueshengIdNumber +
			", xueshengPhoto=" + xueshengPhoto +
			", xueshengEmail=" + xueshengEmail +
			", huodongName=" + huodongName +
			", huodongUuidNumber=" + huodongUuidNumber +
			", huodongPhoto=" + huodongPhoto +
			", huodongKucunNumber=" + huodongKucunNumber +
			", huodongClicknum=" + huodongClicknum +
			", huodongContent=" + huodongContent +
			", huodongDelete=" + huodongDelete +
			"} " + super.toString();
	}
}

package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.HuodongEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 活动
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("huodong")
public class HuodongView extends HuodongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 活动类型的值
	*/
	@ColumnInfo(comment="活动类型的字典表值",type="varchar(200)")
	private String huodongValue;
	/**
	* 是否上架的值
	*/
	@ColumnInfo(comment="是否上架的字典表值",type="varchar(200)")
	private String shangxiaValue;

	//级联表 干部
		/**
		* 干部姓名
		*/

		@ColumnInfo(comment="干部姓名",type="varchar(200)")
		private String ganbuName;
		/**
		* 干部手机号
		*/

		@ColumnInfo(comment="干部手机号",type="varchar(200)")
		private String ganbuPhone;
		/**
		* 干部身份证号
		*/

		@ColumnInfo(comment="干部身份证号",type="varchar(200)")
		private String ganbuIdNumber;
		/**
		* 干部头像
		*/

		@ColumnInfo(comment="干部头像",type="varchar(200)")
		private String ganbuPhoto;
		/**
		* 班级
		*/
		@ColumnInfo(comment="班级",type="int(11)")
		private Integer banjiTypes;
			/**
			* 班级的值
			*/
			@ColumnInfo(comment="班级的字典表值",type="varchar(200)")
			private String banjiValue;
		/**
		* 职位
		*/
		@ColumnInfo(comment="职位",type="int(11)")
		private Integer zhiweiTypes;
			/**
			* 职位的值
			*/
			@ColumnInfo(comment="职位的字典表值",type="varchar(200)")
			private String zhiweiValue;
		/**
		* 电子邮箱
		*/

		@ColumnInfo(comment="电子邮箱",type="varchar(200)")
		private String ganbuEmail;



	public HuodongView() {

	}

	public HuodongView(HuodongEntity huodongEntity) {
		try {
			BeanUtils.copyProperties(this, huodongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
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
	//当前表的
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


	//级联表的get和set 干部

		/**
		* 获取： 干部姓名
		*/
		public String getGanbuName() {
			return ganbuName;
		}
		/**
		* 设置： 干部姓名
		*/
		public void setGanbuName(String ganbuName) {
			this.ganbuName = ganbuName;
		}

		/**
		* 获取： 干部手机号
		*/
		public String getGanbuPhone() {
			return ganbuPhone;
		}
		/**
		* 设置： 干部手机号
		*/
		public void setGanbuPhone(String ganbuPhone) {
			this.ganbuPhone = ganbuPhone;
		}

		/**
		* 获取： 干部身份证号
		*/
		public String getGanbuIdNumber() {
			return ganbuIdNumber;
		}
		/**
		* 设置： 干部身份证号
		*/
		public void setGanbuIdNumber(String ganbuIdNumber) {
			this.ganbuIdNumber = ganbuIdNumber;
		}

		/**
		* 获取： 干部头像
		*/
		public String getGanbuPhoto() {
			return ganbuPhoto;
		}
		/**
		* 设置： 干部头像
		*/
		public void setGanbuPhoto(String ganbuPhoto) {
			this.ganbuPhoto = ganbuPhoto;
		}
		/**
		* 获取： 班级
		*/
		public Integer getBanjiTypes() {
			return banjiTypes;
		}
		/**
		* 设置： 班级
		*/
		public void setBanjiTypes(Integer banjiTypes) {
			this.banjiTypes = banjiTypes;
		}


			/**
			* 获取： 班级的值
			*/
			public String getBanjiValue() {
				return banjiValue;
			}
			/**
			* 设置： 班级的值
			*/
			public void setBanjiValue(String banjiValue) {
				this.banjiValue = banjiValue;
			}
		/**
		* 获取： 职位
		*/
		public Integer getZhiweiTypes() {
			return zhiweiTypes;
		}
		/**
		* 设置： 职位
		*/
		public void setZhiweiTypes(Integer zhiweiTypes) {
			this.zhiweiTypes = zhiweiTypes;
		}


			/**
			* 获取： 职位的值
			*/
			public String getZhiweiValue() {
				return zhiweiValue;
			}
			/**
			* 设置： 职位的值
			*/
			public void setZhiweiValue(String zhiweiValue) {
				this.zhiweiValue = zhiweiValue;
			}

		/**
		* 获取： 电子邮箱
		*/
		public String getGanbuEmail() {
			return ganbuEmail;
		}
		/**
		* 设置： 电子邮箱
		*/
		public void setGanbuEmail(String ganbuEmail) {
			this.ganbuEmail = ganbuEmail;
		}


	@Override
	public String toString() {
		return "HuodongView{" +
			", huodongValue=" + huodongValue +
			", shangxiaValue=" + shangxiaValue +
			", ganbuName=" + ganbuName +
			", ganbuPhone=" + ganbuPhone +
			", ganbuIdNumber=" + ganbuIdNumber +
			", ganbuPhoto=" + ganbuPhoto +
			", ganbuEmail=" + ganbuEmail +
			"} " + super.toString();
	}
}

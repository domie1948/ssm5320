package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XueshengToupiaoListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 投票详情
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xuesheng_toupiao_list")
public class XueshengToupiaoListView extends XueshengToupiaoListEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表

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
	//级联表 投票
		/**
		* 投票唯一编号
		*/

		@ColumnInfo(comment="投票唯一编号",type="varchar(200)")
		private String xueshengToupiaoUuidNumber;
		/**
		* 投票标题
		*/

		@ColumnInfo(comment="投票标题",type="varchar(200)")
		private String xueshengToupiaoName;
		/**
		* 投票类型
		*/
		@ColumnInfo(comment="投票类型",type="int(11)")
		private Integer xueshengToupiaoTypes;
			/**
			* 投票类型的值
			*/
			@ColumnInfo(comment="投票类型的字典表值",type="varchar(200)")
			private String xueshengToupiaoValue;
		/**
		* 投票内容
		*/

		@ColumnInfo(comment="投票内容",type="varchar(200)")
		private String xueshengToupiaoNeirong;
		/**
		* 投票详情
		*/

		@ColumnInfo(comment="投票详情",type="text")
		private String xueshengToupiaoContent;
		/**
		* 投票截止时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="投票截止时间",type="timestamp")
		private Date jiezhiTime;

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


	public XueshengToupiaoListView() {

	}

	public XueshengToupiaoListView(XueshengToupiaoListEntity xueshengToupiaoListEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengToupiaoListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
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
	//级联表的get和set 投票

		/**
		* 获取： 投票唯一编号
		*/
		public String getXueshengToupiaoUuidNumber() {
			return xueshengToupiaoUuidNumber;
		}
		/**
		* 设置： 投票唯一编号
		*/
		public void setXueshengToupiaoUuidNumber(String xueshengToupiaoUuidNumber) {
			this.xueshengToupiaoUuidNumber = xueshengToupiaoUuidNumber;
		}

		/**
		* 获取： 投票标题
		*/
		public String getXueshengToupiaoName() {
			return xueshengToupiaoName;
		}
		/**
		* 设置： 投票标题
		*/
		public void setXueshengToupiaoName(String xueshengToupiaoName) {
			this.xueshengToupiaoName = xueshengToupiaoName;
		}
		/**
		* 获取： 投票类型
		*/
		public Integer getXueshengToupiaoTypes() {
			return xueshengToupiaoTypes;
		}
		/**
		* 设置： 投票类型
		*/
		public void setXueshengToupiaoTypes(Integer xueshengToupiaoTypes) {
			this.xueshengToupiaoTypes = xueshengToupiaoTypes;
		}


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

		/**
		* 获取： 投票内容
		*/
		public String getXueshengToupiaoNeirong() {
			return xueshengToupiaoNeirong;
		}
		/**
		* 设置： 投票内容
		*/
		public void setXueshengToupiaoNeirong(String xueshengToupiaoNeirong) {
			this.xueshengToupiaoNeirong = xueshengToupiaoNeirong;
		}

		/**
		* 获取： 投票详情
		*/
		public String getXueshengToupiaoContent() {
			return xueshengToupiaoContent;
		}
		/**
		* 设置： 投票详情
		*/
		public void setXueshengToupiaoContent(String xueshengToupiaoContent) {
			this.xueshengToupiaoContent = xueshengToupiaoContent;
		}

		/**
		* 获取： 投票截止时间
		*/
		public Date getJiezhiTime() {
			return jiezhiTime;
		}
		/**
		* 设置： 投票截止时间
		*/
		public void setJiezhiTime(Date jiezhiTime) {
			this.jiezhiTime = jiezhiTime;
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
		return "XueshengToupiaoListView{" +
			", xueshengToupiaoUuidNumber=" + xueshengToupiaoUuidNumber +
			", xueshengToupiaoName=" + xueshengToupiaoName +
			", xueshengToupiaoNeirong=" + xueshengToupiaoNeirong +
			", xueshengToupiaoContent=" + xueshengToupiaoContent +
			", jiezhiTime=" + DateUtil.convertString(jiezhiTime,"yyyy-MM-dd") +
			", xueshengName=" + xueshengName +
			", xueshengPhone=" + xueshengPhone +
			", xueshengIdNumber=" + xueshengIdNumber +
			", xueshengPhoto=" + xueshengPhoto +
			", xueshengEmail=" + xueshengEmail +
			"} " + super.toString();
	}
}

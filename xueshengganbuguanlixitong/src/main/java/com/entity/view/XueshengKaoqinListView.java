package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.XueshengKaoqinListEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 考勤详情
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("xuesheng_kaoqin_list")
public class XueshengKaoqinListView extends XueshengKaoqinListEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 打卡状态的值
	*/
	@ColumnInfo(comment="打卡状态的字典表值",type="varchar(200)")
	private String xueshengKaoqinListValue;

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
	//级联表 考勤
		/**
		* 考勤唯一编号
		*/

		@ColumnInfo(comment="考勤唯一编号",type="varchar(200)")
		private String xueshengKaoqinUuidNumber;
		/**
		* 考勤标题
		*/

		@ColumnInfo(comment="考勤标题",type="varchar(200)")
		private String xueshengKaoqinName;
		/**
		* 考勤详情
		*/

		@ColumnInfo(comment="考勤详情",type="text")
		private String xueshengKaoqinContent;
		/**
		* 考勤截止时间
		*/
		@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
		@DateTimeFormat
		@ColumnInfo(comment="考勤截止时间",type="timestamp")
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


	public XueshengKaoqinListView() {

	}

	public XueshengKaoqinListView(XueshengKaoqinListEntity xueshengKaoqinListEntity) {
		try {
			BeanUtils.copyProperties(this, xueshengKaoqinListEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 打卡状态的值
	*/
	public String getXueshengKaoqinListValue() {
		return xueshengKaoqinListValue;
	}
	/**
	* 设置： 打卡状态的值
	*/
	public void setXueshengKaoqinListValue(String xueshengKaoqinListValue) {
		this.xueshengKaoqinListValue = xueshengKaoqinListValue;
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
	//级联表的get和set 考勤

		/**
		* 获取： 考勤唯一编号
		*/
		public String getXueshengKaoqinUuidNumber() {
			return xueshengKaoqinUuidNumber;
		}
		/**
		* 设置： 考勤唯一编号
		*/
		public void setXueshengKaoqinUuidNumber(String xueshengKaoqinUuidNumber) {
			this.xueshengKaoqinUuidNumber = xueshengKaoqinUuidNumber;
		}

		/**
		* 获取： 考勤标题
		*/
		public String getXueshengKaoqinName() {
			return xueshengKaoqinName;
		}
		/**
		* 设置： 考勤标题
		*/
		public void setXueshengKaoqinName(String xueshengKaoqinName) {
			this.xueshengKaoqinName = xueshengKaoqinName;
		}

		/**
		* 获取： 考勤详情
		*/
		public String getXueshengKaoqinContent() {
			return xueshengKaoqinContent;
		}
		/**
		* 设置： 考勤详情
		*/
		public void setXueshengKaoqinContent(String xueshengKaoqinContent) {
			this.xueshengKaoqinContent = xueshengKaoqinContent;
		}

		/**
		* 获取： 考勤截止时间
		*/
		public Date getJiezhiTime() {
			return jiezhiTime;
		}
		/**
		* 设置： 考勤截止时间
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
		return "XueshengKaoqinListView{" +
			", xueshengKaoqinListValue=" + xueshengKaoqinListValue +
			", xueshengKaoqinUuidNumber=" + xueshengKaoqinUuidNumber +
			", xueshengKaoqinName=" + xueshengKaoqinName +
			", xueshengKaoqinContent=" + xueshengKaoqinContent +
			", jiezhiTime=" + DateUtil.convertString(jiezhiTime,"yyyy-MM-dd") +
			", xueshengName=" + xueshengName +
			", xueshengPhone=" + xueshengPhone +
			", xueshengIdNumber=" + xueshengIdNumber +
			", xueshengPhoto=" + xueshengPhoto +
			", xueshengEmail=" + xueshengEmail +
			"} " + super.toString();
	}
}

package com.entity.view;

import org.apache.tools.ant.util.DateUtils;
import com.annotation.ColumnInfo;
import com.entity.ForumEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import com.utils.DateUtil;

/**
* 论坛
* 后端返回视图实体辅助类
* （通常后端关联的表或者自定义的字段需要返回使用）
*/
@TableName("forum")
public class ForumView extends ForumEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	//当前表
	/**
	* 帖子类型的值
	*/
	@ColumnInfo(comment="帖子类型的字典表值",type="varchar(200)")
	private String forumValue;
	/**
	* 帖子状态的值
	*/
	@ColumnInfo(comment="帖子状态的字典表值",type="varchar(200)")
	private String forumStateValue;

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
	//级联表 用户表
		/**
		* 用户名
		*/
		@ColumnInfo(comment="用户名",type="varchar(100)")
		private String uusername;
		/**
		* 密码
		*/
		@ColumnInfo(comment="密码",type="varchar(100)")
		private String upassword;
		/**
		* 角色
		*/
		@ColumnInfo(comment="角色",type="varchar(100)")
		private String urole;
		/**
		* 新增时间
		*/
		@ColumnInfo(comment="新增时间",type="timestamp")
		private Date uaddtime;

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


	public ForumView() {

	}

	public ForumView(ForumEntity forumEntity) {
		try {
			BeanUtils.copyProperties(this, forumEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



	//当前表的
	/**
	* 获取： 帖子类型的值
	*/
	public String getForumValue() {
		return forumValue;
	}
	/**
	* 设置： 帖子类型的值
	*/
	public void setForumValue(String forumValue) {
		this.forumValue = forumValue;
	}
	//当前表的
	/**
	* 获取： 帖子状态的值
	*/
	public String getForumStateValue() {
		return forumStateValue;
	}
	/**
	* 设置： 帖子状态的值
	*/
	public void setForumStateValue(String forumStateValue) {
		this.forumStateValue = forumStateValue;
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
	//级联表的get和set 用户表
		/**
		* 获取： 用户名
		*/
		public String getUusername() {
			return uusername;
		}
		/**
		* 设置： 用户名
		*/
		public void setUusername(String uusername) {
			this.uusername = uusername;
		}
		/**
		* 获取： 密码
		*/
		public String getUpassword() {
			return upassword;
		}
		/**
		* 设置： 密码
		*/
		public void setUpassword(String upassword) {
			this.upassword = upassword;
		}
		/**
		* 获取： 角色
		*/
		public String getUrole() {
			return urole;
		}
		/**
		* 设置： 角色
		*/
		public void setUrole(String urole) {
			this.urole = urole;
		}
		/**
		* 获取： 新增时间
		*/
		public Date getUaddtime() {
			return uaddtime;
		}
		/**
		* 设置： 新增时间
		*/
		public void setUaddtime(Date uaddtime) {
			this.uaddtime = uaddtime;
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
		return "ForumView{" +
			", forumValue=" + forumValue +
			", forumStateValue=" + forumStateValue +
			", xueshengName=" + xueshengName +
			", xueshengPhone=" + xueshengPhone +
			", xueshengIdNumber=" + xueshengIdNumber +
			", xueshengPhoto=" + xueshengPhoto +
			", xueshengEmail=" + xueshengEmail +
			", ganbuName=" + ganbuName +
			", ganbuPhone=" + ganbuPhone +
			", ganbuIdNumber=" + ganbuIdNumber +
			", ganbuPhoto=" + ganbuPhoto +
			", ganbuEmail=" + ganbuEmail +
			"} " + super.toString();
	}
}

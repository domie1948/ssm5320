package com.entity;

import com.annotation.ColumnInfo;
import javax.validation.constraints.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;
import java.io.Serializable;
import java.util.*;
import org.apache.tools.ant.util.DateUtils;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import com.baomidou.mybatisplus.enums.IdType;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.utils.DateUtil;


/**
 * 干部
 *
 * @author 
 * @email
 */
@TableName("ganbu")
public class GanbuEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GanbuEntity() {

	}

	public GanbuEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @ColumnInfo(comment="主键",type="int(11)")
    @TableField(value = "id")

    private Integer id;


    /**
     * 账户
     */
    @ColumnInfo(comment="账户",type="varchar(200)")
    @TableField(value = "username")

    private String username;


    /**
     * 密码
     */
    @ColumnInfo(comment="密码",type="varchar(200)")
    @TableField(value = "password")

    private String password;


    /**
     * 干部姓名
     */
    @ColumnInfo(comment="干部姓名",type="varchar(200)")
    @TableField(value = "ganbu_name")

    private String ganbuName;


    /**
     * 干部手机号
     */
    @ColumnInfo(comment="干部手机号",type="varchar(200)")
    @TableField(value = "ganbu_phone")

    private String ganbuPhone;


    /**
     * 干部身份证号
     */
    @ColumnInfo(comment="干部身份证号",type="varchar(200)")
    @TableField(value = "ganbu_id_number")

    private String ganbuIdNumber;


    /**
     * 干部头像
     */
    @ColumnInfo(comment="干部头像",type="varchar(200)")
    @TableField(value = "ganbu_photo")

    private String ganbuPhoto;


    /**
     * 性别
     */
    @ColumnInfo(comment="性别",type="int(11)")
    @TableField(value = "sex_types")

    private Integer sexTypes;


    /**
     * 班级
     */
    @ColumnInfo(comment="班级",type="int(11)")
    @TableField(value = "banji_types")

    private Integer banjiTypes;


    /**
     * 职位
     */
    @ColumnInfo(comment="职位",type="int(11)")
    @TableField(value = "zhiwei_types")

    private Integer zhiweiTypes;


    /**
     * 电子邮箱
     */
    @ColumnInfo(comment="电子邮箱",type="varchar(200)")
    @TableField(value = "ganbu_email")

    private String ganbuEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="创建时间",type="timestamp")
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 设置：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：账户
	 */
    public String getUsername() {
        return username;
    }
    /**
	 * 设置：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 获取：密码
	 */
    public String getPassword() {
        return password;
    }
    /**
	 * 设置：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 获取：干部姓名
	 */
    public String getGanbuName() {
        return ganbuName;
    }
    /**
	 * 设置：干部姓名
	 */

    public void setGanbuName(String ganbuName) {
        this.ganbuName = ganbuName;
    }
    /**
	 * 获取：干部手机号
	 */
    public String getGanbuPhone() {
        return ganbuPhone;
    }
    /**
	 * 设置：干部手机号
	 */

    public void setGanbuPhone(String ganbuPhone) {
        this.ganbuPhone = ganbuPhone;
    }
    /**
	 * 获取：干部身份证号
	 */
    public String getGanbuIdNumber() {
        return ganbuIdNumber;
    }
    /**
	 * 设置：干部身份证号
	 */

    public void setGanbuIdNumber(String ganbuIdNumber) {
        this.ganbuIdNumber = ganbuIdNumber;
    }
    /**
	 * 获取：干部头像
	 */
    public String getGanbuPhoto() {
        return ganbuPhoto;
    }
    /**
	 * 设置：干部头像
	 */

    public void setGanbuPhoto(String ganbuPhoto) {
        this.ganbuPhoto = ganbuPhoto;
    }
    /**
	 * 获取：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }
    /**
	 * 设置：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 获取：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }
    /**
	 * 设置：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 获取：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }
    /**
	 * 设置：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 获取：电子邮箱
	 */
    public String getGanbuEmail() {
        return ganbuEmail;
    }
    /**
	 * 设置：电子邮箱
	 */

    public void setGanbuEmail(String ganbuEmail) {
        this.ganbuEmail = ganbuEmail;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Ganbu{" +
            ", id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", ganbuName=" + ganbuName +
            ", ganbuPhone=" + ganbuPhone +
            ", ganbuIdNumber=" + ganbuIdNumber +
            ", ganbuPhoto=" + ganbuPhoto +
            ", sexTypes=" + sexTypes +
            ", banjiTypes=" + banjiTypes +
            ", zhiweiTypes=" + zhiweiTypes +
            ", ganbuEmail=" + ganbuEmail +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}

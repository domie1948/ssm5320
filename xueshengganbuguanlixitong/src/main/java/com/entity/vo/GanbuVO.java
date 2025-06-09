package com.entity.vo;

import com.entity.GanbuEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 干部
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("ganbu")
public class GanbuVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 账户
     */

    @TableField(value = "username")
    private String username;


    /**
     * 密码
     */

    @TableField(value = "password")
    private String password;


    /**
     * 干部姓名
     */

    @TableField(value = "ganbu_name")
    private String ganbuName;


    /**
     * 干部手机号
     */

    @TableField(value = "ganbu_phone")
    private String ganbuPhone;


    /**
     * 干部身份证号
     */

    @TableField(value = "ganbu_id_number")
    private String ganbuIdNumber;


    /**
     * 干部头像
     */

    @TableField(value = "ganbu_photo")
    private String ganbuPhoto;


    /**
     * 性别
     */

    @TableField(value = "sex_types")
    private Integer sexTypes;


    /**
     * 班级
     */

    @TableField(value = "banji_types")
    private Integer banjiTypes;


    /**
     * 职位
     */

    @TableField(value = "zhiwei_types")
    private Integer zhiweiTypes;


    /**
     * 电子邮箱
     */

    @TableField(value = "ganbu_email")
    private String ganbuEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：账户
	 */
    public String getUsername() {
        return username;
    }


    /**
	 * 获取：账户
	 */

    public void setUsername(String username) {
        this.username = username;
    }
    /**
	 * 设置：密码
	 */
    public String getPassword() {
        return password;
    }


    /**
	 * 获取：密码
	 */

    public void setPassword(String password) {
        this.password = password;
    }
    /**
	 * 设置：干部姓名
	 */
    public String getGanbuName() {
        return ganbuName;
    }


    /**
	 * 获取：干部姓名
	 */

    public void setGanbuName(String ganbuName) {
        this.ganbuName = ganbuName;
    }
    /**
	 * 设置：干部手机号
	 */
    public String getGanbuPhone() {
        return ganbuPhone;
    }


    /**
	 * 获取：干部手机号
	 */

    public void setGanbuPhone(String ganbuPhone) {
        this.ganbuPhone = ganbuPhone;
    }
    /**
	 * 设置：干部身份证号
	 */
    public String getGanbuIdNumber() {
        return ganbuIdNumber;
    }


    /**
	 * 获取：干部身份证号
	 */

    public void setGanbuIdNumber(String ganbuIdNumber) {
        this.ganbuIdNumber = ganbuIdNumber;
    }
    /**
	 * 设置：干部头像
	 */
    public String getGanbuPhoto() {
        return ganbuPhoto;
    }


    /**
	 * 获取：干部头像
	 */

    public void setGanbuPhoto(String ganbuPhoto) {
        this.ganbuPhoto = ganbuPhoto;
    }
    /**
	 * 设置：性别
	 */
    public Integer getSexTypes() {
        return sexTypes;
    }


    /**
	 * 获取：性别
	 */

    public void setSexTypes(Integer sexTypes) {
        this.sexTypes = sexTypes;
    }
    /**
	 * 设置：班级
	 */
    public Integer getBanjiTypes() {
        return banjiTypes;
    }


    /**
	 * 获取：班级
	 */

    public void setBanjiTypes(Integer banjiTypes) {
        this.banjiTypes = banjiTypes;
    }
    /**
	 * 设置：职位
	 */
    public Integer getZhiweiTypes() {
        return zhiweiTypes;
    }


    /**
	 * 获取：职位
	 */

    public void setZhiweiTypes(Integer zhiweiTypes) {
        this.zhiweiTypes = zhiweiTypes;
    }
    /**
	 * 设置：电子邮箱
	 */
    public String getGanbuEmail() {
        return ganbuEmail;
    }


    /**
	 * 获取：电子邮箱
	 */

    public void setGanbuEmail(String ganbuEmail) {
        this.ganbuEmail = ganbuEmail;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

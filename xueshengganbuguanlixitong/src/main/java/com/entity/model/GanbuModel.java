package com.entity.model;

import com.entity.GanbuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 干部
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GanbuModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 账户
     */
    private String username;


    /**
     * 密码
     */
    private String password;


    /**
     * 干部姓名
     */
    private String ganbuName;


    /**
     * 干部手机号
     */
    private String ganbuPhone;


    /**
     * 干部身份证号
     */
    private String ganbuIdNumber;


    /**
     * 干部头像
     */
    private String ganbuPhoto;


    /**
     * 性别
     */
    private Integer sexTypes;


    /**
     * 班级
     */
    private Integer banjiTypes;


    /**
     * 职位
     */
    private Integer zhiweiTypes;


    /**
     * 电子邮箱
     */
    private String ganbuEmail;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
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

    }

package com.entity.model;

import com.entity.XueshengToupiaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 投票
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengToupiaoModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 投票唯一编号
     */
    private String xueshengToupiaoUuidNumber;


    /**
     * 投票标题
     */
    private String xueshengToupiaoName;


    /**
     * 投票类型
     */
    private Integer xueshengToupiaoTypes;


    /**
     * 投票内容
     */
    private String xueshengToupiaoNeirong;


    /**
     * 投票详情
     */
    private String xueshengToupiaoContent;


    /**
     * 投票发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 投票截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date jiezhiTime;


    /**
     * 创建时间 show3 listShow
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
	 * 获取：投票唯一编号
	 */
    public String getXueshengToupiaoUuidNumber() {
        return xueshengToupiaoUuidNumber;
    }


    /**
	 * 设置：投票唯一编号
	 */
    public void setXueshengToupiaoUuidNumber(String xueshengToupiaoUuidNumber) {
        this.xueshengToupiaoUuidNumber = xueshengToupiaoUuidNumber;
    }
    /**
	 * 获取：投票标题
	 */
    public String getXueshengToupiaoName() {
        return xueshengToupiaoName;
    }


    /**
	 * 设置：投票标题
	 */
    public void setXueshengToupiaoName(String xueshengToupiaoName) {
        this.xueshengToupiaoName = xueshengToupiaoName;
    }
    /**
	 * 获取：投票类型
	 */
    public Integer getXueshengToupiaoTypes() {
        return xueshengToupiaoTypes;
    }


    /**
	 * 设置：投票类型
	 */
    public void setXueshengToupiaoTypes(Integer xueshengToupiaoTypes) {
        this.xueshengToupiaoTypes = xueshengToupiaoTypes;
    }
    /**
	 * 获取：投票内容
	 */
    public String getXueshengToupiaoNeirong() {
        return xueshengToupiaoNeirong;
    }


    /**
	 * 设置：投票内容
	 */
    public void setXueshengToupiaoNeirong(String xueshengToupiaoNeirong) {
        this.xueshengToupiaoNeirong = xueshengToupiaoNeirong;
    }
    /**
	 * 获取：投票详情
	 */
    public String getXueshengToupiaoContent() {
        return xueshengToupiaoContent;
    }


    /**
	 * 设置：投票详情
	 */
    public void setXueshengToupiaoContent(String xueshengToupiaoContent) {
        this.xueshengToupiaoContent = xueshengToupiaoContent;
    }
    /**
	 * 获取：投票发起时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：投票发起时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：投票截止时间
	 */
    public Date getJiezhiTime() {
        return jiezhiTime;
    }


    /**
	 * 设置：投票截止时间
	 */
    public void setJiezhiTime(Date jiezhiTime) {
        this.jiezhiTime = jiezhiTime;
    }
    /**
	 * 获取：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show3 listShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

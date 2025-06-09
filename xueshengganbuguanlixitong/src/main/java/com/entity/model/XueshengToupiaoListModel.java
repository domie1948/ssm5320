package com.entity.model;

import com.entity.XueshengToupiaoListEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 投票详情
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class XueshengToupiaoListModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 投票
     */
    private Integer xueshengToupiaoId;


    /**
     * 投票内容
     */
    private String xueshengToupiaoListNeirong;


    /**
     * 投票发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


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
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：投票
	 */
    public Integer getXueshengToupiaoId() {
        return xueshengToupiaoId;
    }


    /**
	 * 设置：投票
	 */
    public void setXueshengToupiaoId(Integer xueshengToupiaoId) {
        this.xueshengToupiaoId = xueshengToupiaoId;
    }
    /**
	 * 获取：投票内容
	 */
    public String getXueshengToupiaoListNeirong() {
        return xueshengToupiaoListNeirong;
    }


    /**
	 * 设置：投票内容
	 */
    public void setXueshengToupiaoListNeirong(String xueshengToupiaoListNeirong) {
        this.xueshengToupiaoListNeirong = xueshengToupiaoListNeirong;
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

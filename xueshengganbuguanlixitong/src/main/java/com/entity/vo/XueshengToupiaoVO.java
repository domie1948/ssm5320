package com.entity.vo;

import com.entity.XueshengToupiaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 投票
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuesheng_toupiao")
public class XueshengToupiaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 投票唯一编号
     */

    @TableField(value = "xuesheng_toupiao_uuid_number")
    private String xueshengToupiaoUuidNumber;


    /**
     * 投票标题
     */

    @TableField(value = "xuesheng_toupiao_name")
    private String xueshengToupiaoName;


    /**
     * 投票类型
     */

    @TableField(value = "xuesheng_toupiao_types")
    private Integer xueshengToupiaoTypes;


    /**
     * 投票内容
     */

    @TableField(value = "xuesheng_toupiao_neirong")
    private String xueshengToupiaoNeirong;


    /**
     * 投票详情
     */

    @TableField(value = "xuesheng_toupiao_content")
    private String xueshengToupiaoContent;


    /**
     * 投票发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 投票截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "jiezhi_time")
    private Date jiezhiTime;


    /**
     * 创建时间 show3 listShow
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
	 * 设置：投票唯一编号
	 */
    public String getXueshengToupiaoUuidNumber() {
        return xueshengToupiaoUuidNumber;
    }


    /**
	 * 获取：投票唯一编号
	 */

    public void setXueshengToupiaoUuidNumber(String xueshengToupiaoUuidNumber) {
        this.xueshengToupiaoUuidNumber = xueshengToupiaoUuidNumber;
    }
    /**
	 * 设置：投票标题
	 */
    public String getXueshengToupiaoName() {
        return xueshengToupiaoName;
    }


    /**
	 * 获取：投票标题
	 */

    public void setXueshengToupiaoName(String xueshengToupiaoName) {
        this.xueshengToupiaoName = xueshengToupiaoName;
    }
    /**
	 * 设置：投票类型
	 */
    public Integer getXueshengToupiaoTypes() {
        return xueshengToupiaoTypes;
    }


    /**
	 * 获取：投票类型
	 */

    public void setXueshengToupiaoTypes(Integer xueshengToupiaoTypes) {
        this.xueshengToupiaoTypes = xueshengToupiaoTypes;
    }
    /**
	 * 设置：投票内容
	 */
    public String getXueshengToupiaoNeirong() {
        return xueshengToupiaoNeirong;
    }


    /**
	 * 获取：投票内容
	 */

    public void setXueshengToupiaoNeirong(String xueshengToupiaoNeirong) {
        this.xueshengToupiaoNeirong = xueshengToupiaoNeirong;
    }
    /**
	 * 设置：投票详情
	 */
    public String getXueshengToupiaoContent() {
        return xueshengToupiaoContent;
    }


    /**
	 * 获取：投票详情
	 */

    public void setXueshengToupiaoContent(String xueshengToupiaoContent) {
        this.xueshengToupiaoContent = xueshengToupiaoContent;
    }
    /**
	 * 设置：投票发起时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：投票发起时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：投票截止时间
	 */
    public Date getJiezhiTime() {
        return jiezhiTime;
    }


    /**
	 * 获取：投票截止时间
	 */

    public void setJiezhiTime(Date jiezhiTime) {
        this.jiezhiTime = jiezhiTime;
    }
    /**
	 * 设置：创建时间 show3 listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show3 listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

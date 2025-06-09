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
 * 投票
 *
 * @author 
 * @email
 */
@TableName("xuesheng_toupiao")
public class XueshengToupiaoEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengToupiaoEntity() {

	}

	public XueshengToupiaoEntity(T t) {
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
     * 投票唯一编号
     */
    @ColumnInfo(comment="投票唯一编号",type="varchar(200)")
    @TableField(value = "xuesheng_toupiao_uuid_number")

    private String xueshengToupiaoUuidNumber;


    /**
     * 投票标题
     */
    @ColumnInfo(comment="投票标题",type="varchar(200)")
    @TableField(value = "xuesheng_toupiao_name")

    private String xueshengToupiaoName;


    /**
     * 投票类型
     */
    @ColumnInfo(comment="投票类型",type="int(11)")
    @TableField(value = "xuesheng_toupiao_types")

    private Integer xueshengToupiaoTypes;


    /**
     * 投票内容
     */
    @ColumnInfo(comment="投票内容",type="varchar(200)")
    @TableField(value = "xuesheng_toupiao_neirong")

    private String xueshengToupiaoNeirong;


    /**
     * 投票详情
     */
    @ColumnInfo(comment="投票详情",type="text")
    @TableField(value = "xuesheng_toupiao_content")

    private String xueshengToupiaoContent;


    /**
     * 投票发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="投票发起时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 投票截止时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="投票截止时间",type="timestamp")
    @TableField(value = "jiezhi_time")

    private Date jiezhiTime;


    /**
     * 创建时间  listShow
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
	 * 获取：创建时间  listShow
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 设置：创建时间  listShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "XueshengToupiao{" +
            ", id=" + id +
            ", xueshengToupiaoUuidNumber=" + xueshengToupiaoUuidNumber +
            ", xueshengToupiaoName=" + xueshengToupiaoName +
            ", xueshengToupiaoTypes=" + xueshengToupiaoTypes +
            ", xueshengToupiaoNeirong=" + xueshengToupiaoNeirong +
            ", xueshengToupiaoContent=" + xueshengToupiaoContent +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", jiezhiTime=" + DateUtil.convertString(jiezhiTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}

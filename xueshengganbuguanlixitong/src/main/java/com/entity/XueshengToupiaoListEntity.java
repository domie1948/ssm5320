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
 * 投票详情
 *
 * @author 
 * @email
 */
@TableName("xuesheng_toupiao_list")
public class XueshengToupiaoListEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public XueshengToupiaoListEntity() {

	}

	public XueshengToupiaoListEntity(T t) {
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
     * 学生
     */
    @ColumnInfo(comment="学生",type="int(11)")
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 投票
     */
    @ColumnInfo(comment="投票",type="int(11)")
    @TableField(value = "xuesheng_toupiao_id")

    private Integer xueshengToupiaoId;


    /**
     * 投票内容
     */
    @ColumnInfo(comment="投票内容",type="varchar(200)")
    @TableField(value = "xuesheng_toupiao_list_neirong")

    private String xueshengToupiaoListNeirong;


    /**
     * 投票发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @ColumnInfo(comment="投票发起时间",type="timestamp")
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


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
        return "XueshengToupiaoList{" +
            ", id=" + id +
            ", xueshengId=" + xueshengId +
            ", xueshengToupiaoId=" + xueshengToupiaoId +
            ", xueshengToupiaoListNeirong=" + xueshengToupiaoListNeirong +
            ", insertTime=" + DateUtil.convertString(insertTime,"yyyy-MM-dd") +
            ", createTime=" + DateUtil.convertString(createTime,"yyyy-MM-dd") +
        "}";
    }
}

package com.entity.vo;

import com.entity.GonggaoEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 通知
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("gonggao")
public class GonggaoVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 通知名称
     */

    @TableField(value = "gonggao_name")
    private String gonggaoName;


    /**
     * 通知图片
     */

    @TableField(value = "gonggao_photo")
    private String gonggaoPhoto;


    /**
     * 通知类型
     */

    @TableField(value = "gonggao_types")
    private Integer gonggaoTypes;


    /**
     * 通知发布时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 通知详情
     */

    @TableField(value = "gonggao_content")
    private String gonggaoContent;


    /**
     * 创建时间 show1 show2 nameShow
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
	 * 设置：通知名称
	 */
    public String getGonggaoName() {
        return gonggaoName;
    }


    /**
	 * 获取：通知名称
	 */

    public void setGonggaoName(String gonggaoName) {
        this.gonggaoName = gonggaoName;
    }
    /**
	 * 设置：通知图片
	 */
    public String getGonggaoPhoto() {
        return gonggaoPhoto;
    }


    /**
	 * 获取：通知图片
	 */

    public void setGonggaoPhoto(String gonggaoPhoto) {
        this.gonggaoPhoto = gonggaoPhoto;
    }
    /**
	 * 设置：通知类型
	 */
    public Integer getGonggaoTypes() {
        return gonggaoTypes;
    }


    /**
	 * 获取：通知类型
	 */

    public void setGonggaoTypes(Integer gonggaoTypes) {
        this.gonggaoTypes = gonggaoTypes;
    }
    /**
	 * 设置：通知发布时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 获取：通知发布时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：通知详情
	 */
    public String getGonggaoContent() {
        return gonggaoContent;
    }


    /**
	 * 获取：通知详情
	 */

    public void setGonggaoContent(String gonggaoContent) {
        this.gonggaoContent = gonggaoContent;
    }
    /**
	 * 设置：创建时间 show1 show2 nameShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 获取：创建时间 show1 show2 nameShow
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

}

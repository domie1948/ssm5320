package com.entity.vo;

import com.entity.XueshengToupiaoListEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 投票详情
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("xuesheng_toupiao_list")
public class XueshengToupiaoListVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 学生
     */

    @TableField(value = "xuesheng_id")
    private Integer xueshengId;


    /**
     * 投票
     */

    @TableField(value = "xuesheng_toupiao_id")
    private Integer xueshengToupiaoId;


    /**
     * 投票内容
     */

    @TableField(value = "xuesheng_toupiao_list_neirong")
    private String xueshengToupiaoListNeirong;


    /**
     * 投票发起时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


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
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：投票
	 */
    public Integer getXueshengToupiaoId() {
        return xueshengToupiaoId;
    }


    /**
	 * 获取：投票
	 */

    public void setXueshengToupiaoId(Integer xueshengToupiaoId) {
        this.xueshengToupiaoId = xueshengToupiaoId;
    }
    /**
	 * 设置：投票内容
	 */
    public String getXueshengToupiaoListNeirong() {
        return xueshengToupiaoListNeirong;
    }


    /**
	 * 获取：投票内容
	 */

    public void setXueshengToupiaoListNeirong(String xueshengToupiaoListNeirong) {
        this.xueshengToupiaoListNeirong = xueshengToupiaoListNeirong;
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

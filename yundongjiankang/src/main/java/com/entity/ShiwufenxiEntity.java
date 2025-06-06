package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 食物营养分析
 *
 * @author 
 * @email
 */
@TableName("shiwufenxi")
public class ShiwufenxiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public ShiwufenxiEntity() {

	}

	public ShiwufenxiEntity(T t) {
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
    @TableField(value = "id")

    private Integer id;


    /**
     * 标题
     */
    @TableField(value = "shiwufenxi_name")

    private String shiwufenxiName;


    /**
     * 食物图片
     */
    @TableField(value = "shiwufenxi_photo")

    private String shiwufenxiPhoto;


    /**
     * 适宜年龄
     */
    @TableField(value = "shiwufenxi_age")

    private String shiwufenxiAge;


    /**
     * 增加卡路里
     */
    @TableField(value = "shiwufenxi_kaululi")

    private Integer shiwufenxiKaululi;


    /**
     * 食物类型
     */
    @TableField(value = "shiwufenxi_types")

    private Integer shiwufenxiTypes;


    /**
     * 食物分析详情
     */
    @TableField(value = "shiwufenxi_content")

    private String shiwufenxiContent;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

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
	 * 设置：标题
	 */
    public String getShiwufenxiName() {
        return shiwufenxiName;
    }


    /**
	 * 获取：标题
	 */

    public void setShiwufenxiName(String shiwufenxiName) {
        this.shiwufenxiName = shiwufenxiName;
    }
    /**
	 * 设置：食物图片
	 */
    public String getShiwufenxiPhoto() {
        return shiwufenxiPhoto;
    }


    /**
	 * 获取：食物图片
	 */

    public void setShiwufenxiPhoto(String shiwufenxiPhoto) {
        this.shiwufenxiPhoto = shiwufenxiPhoto;
    }
    /**
	 * 设置：适宜年龄
	 */
    public String getShiwufenxiAge() {
        return shiwufenxiAge;
    }


    /**
	 * 获取：适宜年龄
	 */

    public void setShiwufenxiAge(String shiwufenxiAge) {
        this.shiwufenxiAge = shiwufenxiAge;
    }
    /**
	 * 设置：增加卡路里
	 */
    public Integer getShiwufenxiKaululi() {
        return shiwufenxiKaululi;
    }


    /**
	 * 获取：增加卡路里
	 */

    public void setShiwufenxiKaululi(Integer shiwufenxiKaululi) {
        this.shiwufenxiKaululi = shiwufenxiKaululi;
    }
    /**
	 * 设置：食物类型
	 */
    public Integer getShiwufenxiTypes() {
        return shiwufenxiTypes;
    }


    /**
	 * 获取：食物类型
	 */

    public void setShiwufenxiTypes(Integer shiwufenxiTypes) {
        this.shiwufenxiTypes = shiwufenxiTypes;
    }
    /**
	 * 设置：食物分析详情
	 */
    public String getShiwufenxiContent() {
        return shiwufenxiContent;
    }


    /**
	 * 获取：食物分析详情
	 */

    public void setShiwufenxiContent(String shiwufenxiContent) {
        this.shiwufenxiContent = shiwufenxiContent;
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

    @Override
    public String toString() {
        return "Shiwufenxi{" +
            "id=" + id +
            ", shiwufenxiName=" + shiwufenxiName +
            ", shiwufenxiPhoto=" + shiwufenxiPhoto +
            ", shiwufenxiAge=" + shiwufenxiAge +
            ", shiwufenxiKaululi=" + shiwufenxiKaululi +
            ", shiwufenxiTypes=" + shiwufenxiTypes +
            ", shiwufenxiContent=" + shiwufenxiContent +
            ", createTime=" + createTime +
        "}";
    }
}

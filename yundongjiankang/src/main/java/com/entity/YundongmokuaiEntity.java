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
 * 运动模块
 *
 * @author 
 * @email
 */
@TableName("yundongmokuai")
public class YundongmokuaiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public YundongmokuaiEntity() {

	}

	public YundongmokuaiEntity(T t) {
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
     * 运动名称
     */
    @TableField(value = "yundongmokuai_name")

    private String yundongmokuaiName;


    /**
     * 封面
     */
    @TableField(value = "yundongmokuai_photo")

    private String yundongmokuaiPhoto;


    /**
     * 适宜年龄
     */
    @TableField(value = "yundongmokuai_age")

    private String yundongmokuaiAge;


    /**
     * 消耗卡路里
     */
    @TableField(value = "yundongmokuai_kaululi")

    private Integer yundongmokuaiKaululi;


    /**
     * 运动运动类型
     */
    @TableField(value = "yundongmokuai_types")

    private Integer yundongmokuaiTypes;


    /**
     * 运动详情
     */
    @TableField(value = "yundongmokuai_content")

    private String yundongmokuaiContent;


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
	 * 设置：运动名称
	 */
    public String getYundongmokuaiName() {
        return yundongmokuaiName;
    }


    /**
	 * 获取：运动名称
	 */

    public void setYundongmokuaiName(String yundongmokuaiName) {
        this.yundongmokuaiName = yundongmokuaiName;
    }
    /**
	 * 设置：封面
	 */
    public String getYundongmokuaiPhoto() {
        return yundongmokuaiPhoto;
    }


    /**
	 * 获取：封面
	 */

    public void setYundongmokuaiPhoto(String yundongmokuaiPhoto) {
        this.yundongmokuaiPhoto = yundongmokuaiPhoto;
    }
    /**
	 * 设置：适宜年龄
	 */
    public String getYundongmokuaiAge() {
        return yundongmokuaiAge;
    }


    /**
	 * 获取：适宜年龄
	 */

    public void setYundongmokuaiAge(String yundongmokuaiAge) {
        this.yundongmokuaiAge = yundongmokuaiAge;
    }
    /**
	 * 设置：消耗卡路里
	 */
    public Integer getYundongmokuaiKaululi() {
        return yundongmokuaiKaululi;
    }


    /**
	 * 获取：消耗卡路里
	 */

    public void setYundongmokuaiKaululi(Integer yundongmokuaiKaululi) {
        this.yundongmokuaiKaululi = yundongmokuaiKaululi;
    }
    /**
	 * 设置：运动运动类型
	 */
    public Integer getYundongmokuaiTypes() {
        return yundongmokuaiTypes;
    }


    /**
	 * 获取：运动运动类型
	 */

    public void setYundongmokuaiTypes(Integer yundongmokuaiTypes) {
        this.yundongmokuaiTypes = yundongmokuaiTypes;
    }
    /**
	 * 设置：运动详情
	 */
    public String getYundongmokuaiContent() {
        return yundongmokuaiContent;
    }


    /**
	 * 获取：运动详情
	 */

    public void setYundongmokuaiContent(String yundongmokuaiContent) {
        this.yundongmokuaiContent = yundongmokuaiContent;
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
        return "Yundongmokuai{" +
            "id=" + id +
            ", yundongmokuaiName=" + yundongmokuaiName +
            ", yundongmokuaiPhoto=" + yundongmokuaiPhoto +
            ", yundongmokuaiAge=" + yundongmokuaiAge +
            ", yundongmokuaiKaululi=" + yundongmokuaiKaululi +
            ", yundongmokuaiTypes=" + yundongmokuaiTypes +
            ", yundongmokuaiContent=" + yundongmokuaiContent +
            ", createTime=" + createTime +
        "}";
    }
}

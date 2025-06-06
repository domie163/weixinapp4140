package com.entity.model;

import com.entity.YundongmokuaiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 运动模块
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class YundongmokuaiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 运动名称
     */
    private String yundongmokuaiName;


    /**
     * 封面
     */
    private String yundongmokuaiPhoto;


    /**
     * 适宜年龄
     */
    private String yundongmokuaiAge;


    /**
     * 消耗卡路里
     */
    private Integer yundongmokuaiKaululi;


    /**
     * 运动运动类型
     */
    private Integer yundongmokuaiTypes;


    /**
     * 运动详情
     */
    private String yundongmokuaiContent;


    /**
     * 创建时间 show1 show2 photoShow
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
	 * 获取：运动名称
	 */
    public String getYundongmokuaiName() {
        return yundongmokuaiName;
    }


    /**
	 * 设置：运动名称
	 */
    public void setYundongmokuaiName(String yundongmokuaiName) {
        this.yundongmokuaiName = yundongmokuaiName;
    }
    /**
	 * 获取：封面
	 */
    public String getYundongmokuaiPhoto() {
        return yundongmokuaiPhoto;
    }


    /**
	 * 设置：封面
	 */
    public void setYundongmokuaiPhoto(String yundongmokuaiPhoto) {
        this.yundongmokuaiPhoto = yundongmokuaiPhoto;
    }
    /**
	 * 获取：适宜年龄
	 */
    public String getYundongmokuaiAge() {
        return yundongmokuaiAge;
    }


    /**
	 * 设置：适宜年龄
	 */
    public void setYundongmokuaiAge(String yundongmokuaiAge) {
        this.yundongmokuaiAge = yundongmokuaiAge;
    }
    /**
	 * 获取：消耗卡路里
	 */
    public Integer getYundongmokuaiKaululi() {
        return yundongmokuaiKaululi;
    }


    /**
	 * 设置：消耗卡路里
	 */
    public void setYundongmokuaiKaululi(Integer yundongmokuaiKaululi) {
        this.yundongmokuaiKaululi = yundongmokuaiKaululi;
    }
    /**
	 * 获取：运动运动类型
	 */
    public Integer getYundongmokuaiTypes() {
        return yundongmokuaiTypes;
    }


    /**
	 * 设置：运动运动类型
	 */
    public void setYundongmokuaiTypes(Integer yundongmokuaiTypes) {
        this.yundongmokuaiTypes = yundongmokuaiTypes;
    }
    /**
	 * 获取：运动详情
	 */
    public String getYundongmokuaiContent() {
        return yundongmokuaiContent;
    }


    /**
	 * 设置：运动详情
	 */
    public void setYundongmokuaiContent(String yundongmokuaiContent) {
        this.yundongmokuaiContent = yundongmokuaiContent;
    }
    /**
	 * 获取：创建时间 show1 show2 photoShow
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间 show1 show2 photoShow
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }

package com.entity.model;

import com.entity.ShiwufenxiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 食物营养分析
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ShiwufenxiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 标题
     */
    private String shiwufenxiName;


    /**
     * 食物图片
     */
    private String shiwufenxiPhoto;


    /**
     * 适宜年龄
     */
    private String shiwufenxiAge;


    /**
     * 增加卡路里
     */
    private Integer shiwufenxiKaululi;


    /**
     * 食物类型
     */
    private Integer shiwufenxiTypes;


    /**
     * 食物分析详情
     */
    private String shiwufenxiContent;


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
	 * 获取：标题
	 */
    public String getShiwufenxiName() {
        return shiwufenxiName;
    }


    /**
	 * 设置：标题
	 */
    public void setShiwufenxiName(String shiwufenxiName) {
        this.shiwufenxiName = shiwufenxiName;
    }
    /**
	 * 获取：食物图片
	 */
    public String getShiwufenxiPhoto() {
        return shiwufenxiPhoto;
    }


    /**
	 * 设置：食物图片
	 */
    public void setShiwufenxiPhoto(String shiwufenxiPhoto) {
        this.shiwufenxiPhoto = shiwufenxiPhoto;
    }
    /**
	 * 获取：适宜年龄
	 */
    public String getShiwufenxiAge() {
        return shiwufenxiAge;
    }


    /**
	 * 设置：适宜年龄
	 */
    public void setShiwufenxiAge(String shiwufenxiAge) {
        this.shiwufenxiAge = shiwufenxiAge;
    }
    /**
	 * 获取：增加卡路里
	 */
    public Integer getShiwufenxiKaululi() {
        return shiwufenxiKaululi;
    }


    /**
	 * 设置：增加卡路里
	 */
    public void setShiwufenxiKaululi(Integer shiwufenxiKaululi) {
        this.shiwufenxiKaululi = shiwufenxiKaululi;
    }
    /**
	 * 获取：食物类型
	 */
    public Integer getShiwufenxiTypes() {
        return shiwufenxiTypes;
    }


    /**
	 * 设置：食物类型
	 */
    public void setShiwufenxiTypes(Integer shiwufenxiTypes) {
        this.shiwufenxiTypes = shiwufenxiTypes;
    }
    /**
	 * 获取：食物分析详情
	 */
    public String getShiwufenxiContent() {
        return shiwufenxiContent;
    }


    /**
	 * 设置：食物分析详情
	 */
    public void setShiwufenxiContent(String shiwufenxiContent) {
        this.shiwufenxiContent = shiwufenxiContent;
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

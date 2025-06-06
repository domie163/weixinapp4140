package com.entity.view;

import com.entity.ShiwufenxiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 食物营养分析
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("shiwufenxi")
public class ShiwufenxiView extends ShiwufenxiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 食物类型的值
		*/
		private String shiwufenxiValue;



	public ShiwufenxiView() {

	}

	public ShiwufenxiView(ShiwufenxiEntity shiwufenxiEntity) {
		try {
			BeanUtils.copyProperties(this, shiwufenxiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 食物类型的值
			*/
			public String getShiwufenxiValue() {
				return shiwufenxiValue;
			}
			/**
			* 设置： 食物类型的值
			*/
			public void setShiwufenxiValue(String shiwufenxiValue) {
				this.shiwufenxiValue = shiwufenxiValue;
			}













}

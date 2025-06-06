package com.entity.view;

import com.entity.YundongmokuaiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 运动模块
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("yundongmokuai")
public class YundongmokuaiView extends YundongmokuaiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 运动运动类型的值
		*/
		private String yundongmokuaiValue;



	public YundongmokuaiView() {

	}

	public YundongmokuaiView(YundongmokuaiEntity yundongmokuaiEntity) {
		try {
			BeanUtils.copyProperties(this, yundongmokuaiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 运动运动类型的值
			*/
			public String getYundongmokuaiValue() {
				return yundongmokuaiValue;
			}
			/**
			* 设置： 运动运动类型的值
			*/
			public void setYundongmokuaiValue(String yundongmokuaiValue) {
				this.yundongmokuaiValue = yundongmokuaiValue;
			}













}

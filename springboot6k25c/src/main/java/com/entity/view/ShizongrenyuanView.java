package com.entity.view;

import com.entity.ShizongrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 失踪人员
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
@TableName("shizongrenyuan")
public class ShizongrenyuanView  extends ShizongrenyuanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShizongrenyuanView(){
	}
 
 	public ShizongrenyuanView(ShizongrenyuanEntity shizongrenyuanEntity){
 	try {
			BeanUtils.copyProperties(this, shizongrenyuanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

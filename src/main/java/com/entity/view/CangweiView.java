package com.entity.view;

import com.entity.CangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 仓位
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
@TableName("cangwei")
public class CangweiView  extends CangweiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CangweiView(){
	}
 
 	public CangweiView(CangweiEntity cangweiEntity){
 	try {
			BeanUtils.copyProperties(this, cangweiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

package com.entity.view;

import com.entity.CangkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 仓库
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
@TableName("cangku")
public class CangkuView  extends CangkuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public CangkuView(){
	}
 
 	public CangkuView(CangkuEntity cangkuEntity){
 	try {
			BeanUtils.copyProperties(this, cangkuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

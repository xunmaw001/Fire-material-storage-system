package com.entity.view;

import com.entity.AnquanjianchatixingEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 安全检查提醒
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
@TableName("anquanjianchatixing")
public class AnquanjianchatixingView  extends AnquanjianchatixingEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public AnquanjianchatixingView(){
	}
 
 	public AnquanjianchatixingView(AnquanjianchatixingEntity anquanjianchatixingEntity){
 	try {
			BeanUtils.copyProperties(this, anquanjianchatixingEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

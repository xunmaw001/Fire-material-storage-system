package com.entity.view;

import com.entity.BaojingtongzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 报警通知
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
@TableName("baojingtongzhi")
public class BaojingtongzhiView  extends BaojingtongzhiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public BaojingtongzhiView(){
	}
 
 	public BaojingtongzhiView(BaojingtongzhiEntity baojingtongzhiEntity){
 	try {
			BeanUtils.copyProperties(this, baojingtongzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}

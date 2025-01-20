package com.entity.vo;

import com.entity.CangkuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 仓库
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public class CangkuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 仓库类型
	 */
	
	private String cangkuleixing;
		
	/**
	 * 仓库位置
	 */
	
	private String cangkuweizhi;
		
	/**
	 * 数量
	 */
	
	private Integer shuliang;
		
	/**
	 * 图片
	 */
	
	private String tupian;
				
	
	/**
	 * 设置：仓库类型
	 */
	 
	public void setCangkuleixing(String cangkuleixing) {
		this.cangkuleixing = cangkuleixing;
	}
	
	/**
	 * 获取：仓库类型
	 */
	public String getCangkuleixing() {
		return cangkuleixing;
	}
				
	
	/**
	 * 设置：仓库位置
	 */
	 
	public void setCangkuweizhi(String cangkuweizhi) {
		this.cangkuweizhi = cangkuweizhi;
	}
	
	/**
	 * 获取：仓库位置
	 */
	public String getCangkuweizhi() {
		return cangkuweizhi;
	}
				
	
	/**
	 * 设置：数量
	 */
	 
	public void setShuliang(Integer shuliang) {
		this.shuliang = shuliang;
	}
	
	/**
	 * 获取：数量
	 */
	public Integer getShuliang() {
		return shuliang;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
			
}

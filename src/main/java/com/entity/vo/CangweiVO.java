package com.entity.vo;

import com.entity.CangweiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 仓位
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public class CangweiVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 物资编号
	 */
	
	private String wuzibianhao;
		
	/**
	 * 物资名称
	 */
	
	private String wuzimingcheng;
		
	/**
	 * 对应仓库号
	 */
	
	private String duiyingcangkuhao;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
	/**
	 * 长度
	 */
	
	private String zhangdu;
		
	/**
	 * 仓位详情
	 */
	
	private String cangweixiangqing;
				
	
	/**
	 * 设置：物资编号
	 */
	 
	public void setWuzibianhao(String wuzibianhao) {
		this.wuzibianhao = wuzibianhao;
	}
	
	/**
	 * 获取：物资编号
	 */
	public String getWuzibianhao() {
		return wuzibianhao;
	}
				
	
	/**
	 * 设置：物资名称
	 */
	 
	public void setWuzimingcheng(String wuzimingcheng) {
		this.wuzimingcheng = wuzimingcheng;
	}
	
	/**
	 * 获取：物资名称
	 */
	public String getWuzimingcheng() {
		return wuzimingcheng;
	}
				
	
	/**
	 * 设置：对应仓库号
	 */
	 
	public void setDuiyingcangkuhao(String duiyingcangkuhao) {
		this.duiyingcangkuhao = duiyingcangkuhao;
	}
	
	/**
	 * 获取：对应仓库号
	 */
	public String getDuiyingcangkuhao() {
		return duiyingcangkuhao;
	}
				
	
	/**
	 * 设置：状态
	 */
	 
	public void setZhuangtai(String zhuangtai) {
		this.zhuangtai = zhuangtai;
	}
	
	/**
	 * 获取：状态
	 */
	public String getZhuangtai() {
		return zhuangtai;
	}
				
	
	/**
	 * 设置：长度
	 */
	 
	public void setZhangdu(String zhangdu) {
		this.zhangdu = zhangdu;
	}
	
	/**
	 * 获取：长度
	 */
	public String getZhangdu() {
		return zhangdu;
	}
				
	
	/**
	 * 设置：仓位详情
	 */
	 
	public void setCangweixiangqing(String cangweixiangqing) {
		this.cangweixiangqing = cangweixiangqing;
	}
	
	/**
	 * 获取：仓位详情
	 */
	public String getCangweixiangqing() {
		return cangweixiangqing;
	}
			
}

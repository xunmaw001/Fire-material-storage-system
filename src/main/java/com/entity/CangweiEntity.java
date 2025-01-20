package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 仓位
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
@TableName("cangwei")
public class CangweiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public CangweiEntity() {
		
	}
	
	public CangweiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 序列号
	 */
					
	private String xuliehao;
	
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
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：序列号
	 */
	public void setXuliehao(String xuliehao) {
		this.xuliehao = xuliehao;
	}
	/**
	 * 获取：序列号
	 */
	public String getXuliehao() {
		return xuliehao;
	}
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

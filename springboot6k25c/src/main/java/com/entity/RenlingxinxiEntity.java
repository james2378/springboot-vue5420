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
 * 认领信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
@TableName("renlingxinxi")
public class RenlingxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public RenlingxinxiEntity() {
		
	}
	
	public RenlingxinxiEntity(T t) {
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
	 * dna编号
	 */
					
	private String dnabianhao;
	
	/**
	 * 标题
	 */
					
	private String biaoti;
	
	/**
	 * 姓名
	 */
					
	private String xingming;
	
	/**
	 * 性别
	 */
					
	private String xingbie;
	
	/**
	 * 年龄
	 */
					
	private String nianling;
	
	/**
	 * 民族
	 */
					
	private String minzu;
	
	/**
	 * 照片
	 */
					
	private String zhaopian;
	
	/**
	 * 外貌
	 */
					
	private String waimao;
	
	/**
	 * 检验dna
	 */
					
	private String jianyandna;
	
	/**
	 * 出生日期
	 */
					
	private String chushengriqi;
	
	/**
	 * 身份证号
	 */
					
	private String shenfenzhenghao;
	
	/**
	 * 户籍地址
	 */
					
	private String hujidizhi;
	
	/**
	 * 现住地址
	 */
					
	private String xianzhudizhi;
	
	/**
	 * 工作单位
	 */
					
	private String gongzuodanwei;
	
	/**
	 * 失踪时间
	 */
					
	private String shizongshijian;
	
	/**
	 * 失踪地点
	 */
					
	private String shizongdidian;
	
	/**
	 * 衣着装束
	 */
					
	private String yizhezhuangshu;
	
	/**
	 * 说话口音
	 */
					
	private String shuohuakouyin;
	
	/**
	 * 认领时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date renlingshijian;
	
	/**
	 * 用户账号
	 */
					
	private String yonghuzhanghao;
	
	/**
	 * 用户姓名
	 */
					
	private String yonghuxingming;
	
	/**
	 * 联系方式
	 */
					
	private String lianxifangshi;
	
	/**
	 * 备注
	 */
					
	private String beizhu;
	
	/**
	 * 认领账号
	 */
					
	private String renlingzhanghao;
	
	
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
	 * 设置：dna编号
	 */
	public void setDnabianhao(String dnabianhao) {
		this.dnabianhao = dnabianhao;
	}
	/**
	 * 获取：dna编号
	 */
	public String getDnabianhao() {
		return dnabianhao;
	}
	/**
	 * 设置：标题
	 */
	public void setBiaoti(String biaoti) {
		this.biaoti = biaoti;
	}
	/**
	 * 获取：标题
	 */
	public String getBiaoti() {
		return biaoti;
	}
	/**
	 * 设置：姓名
	 */
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
	/**
	 * 设置：性别
	 */
	public void setXingbie(String xingbie) {
		this.xingbie = xingbie;
	}
	/**
	 * 获取：性别
	 */
	public String getXingbie() {
		return xingbie;
	}
	/**
	 * 设置：年龄
	 */
	public void setNianling(String nianling) {
		this.nianling = nianling;
	}
	/**
	 * 获取：年龄
	 */
	public String getNianling() {
		return nianling;
	}
	/**
	 * 设置：民族
	 */
	public void setMinzu(String minzu) {
		this.minzu = minzu;
	}
	/**
	 * 获取：民族
	 */
	public String getMinzu() {
		return minzu;
	}
	/**
	 * 设置：照片
	 */
	public void setZhaopian(String zhaopian) {
		this.zhaopian = zhaopian;
	}
	/**
	 * 获取：照片
	 */
	public String getZhaopian() {
		return zhaopian;
	}
	/**
	 * 设置：外貌
	 */
	public void setWaimao(String waimao) {
		this.waimao = waimao;
	}
	/**
	 * 获取：外貌
	 */
	public String getWaimao() {
		return waimao;
	}
	/**
	 * 设置：检验dna
	 */
	public void setJianyandna(String jianyandna) {
		this.jianyandna = jianyandna;
	}
	/**
	 * 获取：检验dna
	 */
	public String getJianyandna() {
		return jianyandna;
	}
	/**
	 * 设置：出生日期
	 */
	public void setChushengriqi(String chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	/**
	 * 获取：出生日期
	 */
	public String getChushengriqi() {
		return chushengriqi;
	}
	/**
	 * 设置：身份证号
	 */
	public void setShenfenzhenghao(String shenfenzhenghao) {
		this.shenfenzhenghao = shenfenzhenghao;
	}
	/**
	 * 获取：身份证号
	 */
	public String getShenfenzhenghao() {
		return shenfenzhenghao;
	}
	/**
	 * 设置：户籍地址
	 */
	public void setHujidizhi(String hujidizhi) {
		this.hujidizhi = hujidizhi;
	}
	/**
	 * 获取：户籍地址
	 */
	public String getHujidizhi() {
		return hujidizhi;
	}
	/**
	 * 设置：现住地址
	 */
	public void setXianzhudizhi(String xianzhudizhi) {
		this.xianzhudizhi = xianzhudizhi;
	}
	/**
	 * 获取：现住地址
	 */
	public String getXianzhudizhi() {
		return xianzhudizhi;
	}
	/**
	 * 设置：工作单位
	 */
	public void setGongzuodanwei(String gongzuodanwei) {
		this.gongzuodanwei = gongzuodanwei;
	}
	/**
	 * 获取：工作单位
	 */
	public String getGongzuodanwei() {
		return gongzuodanwei;
	}
	/**
	 * 设置：失踪时间
	 */
	public void setShizongshijian(String shizongshijian) {
		this.shizongshijian = shizongshijian;
	}
	/**
	 * 获取：失踪时间
	 */
	public String getShizongshijian() {
		return shizongshijian;
	}
	/**
	 * 设置：失踪地点
	 */
	public void setShizongdidian(String shizongdidian) {
		this.shizongdidian = shizongdidian;
	}
	/**
	 * 获取：失踪地点
	 */
	public String getShizongdidian() {
		return shizongdidian;
	}
	/**
	 * 设置：衣着装束
	 */
	public void setYizhezhuangshu(String yizhezhuangshu) {
		this.yizhezhuangshu = yizhezhuangshu;
	}
	/**
	 * 获取：衣着装束
	 */
	public String getYizhezhuangshu() {
		return yizhezhuangshu;
	}
	/**
	 * 设置：说话口音
	 */
	public void setShuohuakouyin(String shuohuakouyin) {
		this.shuohuakouyin = shuohuakouyin;
	}
	/**
	 * 获取：说话口音
	 */
	public String getShuohuakouyin() {
		return shuohuakouyin;
	}
	/**
	 * 设置：认领时间
	 */
	public void setRenlingshijian(Date renlingshijian) {
		this.renlingshijian = renlingshijian;
	}
	/**
	 * 获取：认领时间
	 */
	public Date getRenlingshijian() {
		return renlingshijian;
	}
	/**
	 * 设置：用户账号
	 */
	public void setYonghuzhanghao(String yonghuzhanghao) {
		this.yonghuzhanghao = yonghuzhanghao;
	}
	/**
	 * 获取：用户账号
	 */
	public String getYonghuzhanghao() {
		return yonghuzhanghao;
	}
	/**
	 * 设置：用户姓名
	 */
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
	/**
	 * 设置：联系方式
	 */
	public void setLianxifangshi(String lianxifangshi) {
		this.lianxifangshi = lianxifangshi;
	}
	/**
	 * 获取：联系方式
	 */
	public String getLianxifangshi() {
		return lianxifangshi;
	}
	/**
	 * 设置：备注
	 */
	public void setBeizhu(String beizhu) {
		this.beizhu = beizhu;
	}
	/**
	 * 获取：备注
	 */
	public String getBeizhu() {
		return beizhu;
	}
	/**
	 * 设置：认领账号
	 */
	public void setRenlingzhanghao(String renlingzhanghao) {
		this.renlingzhanghao = renlingzhanghao;
	}
	/**
	 * 获取：认领账号
	 */
	public String getRenlingzhanghao() {
		return renlingzhanghao;
	}

}

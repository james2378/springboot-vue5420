package com.entity.vo;

import com.entity.ShizongrenyuanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 失踪人员
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
public class ShizongrenyuanVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date chushengriqi;
		
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date shizongshijian;
		
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
	 * 特征描述
	 */
	
	private String tezhengmiaoshu;
		
	/**
	 * 具体原因
	 */
	
	private String jutiyuanyin;
		
	/**
	 * 发布时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date fabushijian;
		
	/**
	 * 状态
	 */
	
	private String zhuangtai;
		
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
	 
	public void setChushengriqi(Date chushengriqi) {
		this.chushengriqi = chushengriqi;
	}
	
	/**
	 * 获取：出生日期
	 */
	public Date getChushengriqi() {
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
	 
	public void setShizongshijian(Date shizongshijian) {
		this.shizongshijian = shizongshijian;
	}
	
	/**
	 * 获取：失踪时间
	 */
	public Date getShizongshijian() {
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
	 * 设置：特征描述
	 */
	 
	public void setTezhengmiaoshu(String tezhengmiaoshu) {
		this.tezhengmiaoshu = tezhengmiaoshu;
	}
	
	/**
	 * 获取：特征描述
	 */
	public String getTezhengmiaoshu() {
		return tezhengmiaoshu;
	}
				
	
	/**
	 * 设置：具体原因
	 */
	 
	public void setJutiyuanyin(String jutiyuanyin) {
		this.jutiyuanyin = jutiyuanyin;
	}
	
	/**
	 * 获取：具体原因
	 */
	public String getJutiyuanyin() {
		return jutiyuanyin;
	}
				
	
	/**
	 * 设置：发布时间
	 */
	 
	public void setFabushijian(Date fabushijian) {
		this.fabushijian = fabushijian;
	}
	
	/**
	 * 获取：发布时间
	 */
	public Date getFabushijian() {
		return fabushijian;
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
			
}

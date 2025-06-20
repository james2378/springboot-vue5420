package com.dao;

import com.entity.DiscussshizongrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.DiscussshizongrenyuanVO;
import com.entity.view.DiscussshizongrenyuanView;


/**
 * 失踪人员评论表
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
public interface DiscussshizongrenyuanDao extends BaseMapper<DiscussshizongrenyuanEntity> {
	
	List<DiscussshizongrenyuanVO> selectListVO(@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);
	
	DiscussshizongrenyuanVO selectVO(@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);
	
	List<DiscussshizongrenyuanView> selectListView(@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);

	List<DiscussshizongrenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);
	
	DiscussshizongrenyuanView selectView(@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);
	

}

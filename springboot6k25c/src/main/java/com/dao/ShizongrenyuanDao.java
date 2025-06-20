package com.dao;

import com.entity.ShizongrenyuanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShizongrenyuanVO;
import com.entity.view.ShizongrenyuanView;


/**
 * 失踪人员
 * 
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
public interface ShizongrenyuanDao extends BaseMapper<ShizongrenyuanEntity> {
	
	List<ShizongrenyuanVO> selectListVO(@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);
	
	ShizongrenyuanVO selectVO(@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);
	
	List<ShizongrenyuanView> selectListView(@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);

	List<ShizongrenyuanView> selectListView(Pagination page,@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);
	
	ShizongrenyuanView selectView(@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);
	

}

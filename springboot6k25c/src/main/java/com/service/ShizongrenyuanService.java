package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShizongrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShizongrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShizongrenyuanView;


/**
 * 失踪人员
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
public interface ShizongrenyuanService extends IService<ShizongrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShizongrenyuanVO> selectListVO(Wrapper<ShizongrenyuanEntity> wrapper);
   	
   	ShizongrenyuanVO selectVO(@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);
   	
   	List<ShizongrenyuanView> selectListView(Wrapper<ShizongrenyuanEntity> wrapper);
   	
   	ShizongrenyuanView selectView(@Param("ew") Wrapper<ShizongrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShizongrenyuanEntity> wrapper);
   	

}


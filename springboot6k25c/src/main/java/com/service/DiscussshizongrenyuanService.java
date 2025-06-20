package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.DiscussshizongrenyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.DiscussshizongrenyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.DiscussshizongrenyuanView;


/**
 * 失踪人员评论表
 *
 * @author 
 * @email 
 * @date 2023-01-18 18:35:00
 */
public interface DiscussshizongrenyuanService extends IService<DiscussshizongrenyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<DiscussshizongrenyuanVO> selectListVO(Wrapper<DiscussshizongrenyuanEntity> wrapper);
   	
   	DiscussshizongrenyuanVO selectVO(@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);
   	
   	List<DiscussshizongrenyuanView> selectListView(Wrapper<DiscussshizongrenyuanEntity> wrapper);
   	
   	DiscussshizongrenyuanView selectView(@Param("ew") Wrapper<DiscussshizongrenyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<DiscussshizongrenyuanEntity> wrapper);
   	

}


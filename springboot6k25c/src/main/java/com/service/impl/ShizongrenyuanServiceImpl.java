package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShizongrenyuanDao;
import com.entity.ShizongrenyuanEntity;
import com.service.ShizongrenyuanService;
import com.entity.vo.ShizongrenyuanVO;
import com.entity.view.ShizongrenyuanView;

@Service("shizongrenyuanService")
public class ShizongrenyuanServiceImpl extends ServiceImpl<ShizongrenyuanDao, ShizongrenyuanEntity> implements ShizongrenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShizongrenyuanEntity> page = this.selectPage(
                new Query<ShizongrenyuanEntity>(params).getPage(),
                new EntityWrapper<ShizongrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShizongrenyuanEntity> wrapper) {
		  Page<ShizongrenyuanView> page =new Query<ShizongrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ShizongrenyuanVO> selectListVO(Wrapper<ShizongrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShizongrenyuanVO selectVO(Wrapper<ShizongrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShizongrenyuanView> selectListView(Wrapper<ShizongrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShizongrenyuanView selectView(Wrapper<ShizongrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

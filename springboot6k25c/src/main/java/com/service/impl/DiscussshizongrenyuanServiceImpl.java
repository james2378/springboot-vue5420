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


import com.dao.DiscussshizongrenyuanDao;
import com.entity.DiscussshizongrenyuanEntity;
import com.service.DiscussshizongrenyuanService;
import com.entity.vo.DiscussshizongrenyuanVO;
import com.entity.view.DiscussshizongrenyuanView;

@Service("discussshizongrenyuanService")
public class DiscussshizongrenyuanServiceImpl extends ServiceImpl<DiscussshizongrenyuanDao, DiscussshizongrenyuanEntity> implements DiscussshizongrenyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<DiscussshizongrenyuanEntity> page = this.selectPage(
                new Query<DiscussshizongrenyuanEntity>(params).getPage(),
                new EntityWrapper<DiscussshizongrenyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<DiscussshizongrenyuanEntity> wrapper) {
		  Page<DiscussshizongrenyuanView> page =new Query<DiscussshizongrenyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<DiscussshizongrenyuanVO> selectListVO(Wrapper<DiscussshizongrenyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public DiscussshizongrenyuanVO selectVO(Wrapper<DiscussshizongrenyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<DiscussshizongrenyuanView> selectListView(Wrapper<DiscussshizongrenyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public DiscussshizongrenyuanView selectView(Wrapper<DiscussshizongrenyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

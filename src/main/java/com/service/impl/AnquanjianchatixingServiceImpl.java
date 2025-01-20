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


import com.dao.AnquanjianchatixingDao;
import com.entity.AnquanjianchatixingEntity;
import com.service.AnquanjianchatixingService;
import com.entity.vo.AnquanjianchatixingVO;
import com.entity.view.AnquanjianchatixingView;

@Service("anquanjianchatixingService")
public class AnquanjianchatixingServiceImpl extends ServiceImpl<AnquanjianchatixingDao, AnquanjianchatixingEntity> implements AnquanjianchatixingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<AnquanjianchatixingEntity> page = this.selectPage(
                new Query<AnquanjianchatixingEntity>(params).getPage(),
                new EntityWrapper<AnquanjianchatixingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<AnquanjianchatixingEntity> wrapper) {
		  Page<AnquanjianchatixingView> page =new Query<AnquanjianchatixingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<AnquanjianchatixingVO> selectListVO(Wrapper<AnquanjianchatixingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public AnquanjianchatixingVO selectVO(Wrapper<AnquanjianchatixingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<AnquanjianchatixingView> selectListView(Wrapper<AnquanjianchatixingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public AnquanjianchatixingView selectView(Wrapper<AnquanjianchatixingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

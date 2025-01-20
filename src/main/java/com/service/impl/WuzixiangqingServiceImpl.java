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


import com.dao.WuzixiangqingDao;
import com.entity.WuzixiangqingEntity;
import com.service.WuzixiangqingService;
import com.entity.vo.WuzixiangqingVO;
import com.entity.view.WuzixiangqingView;

@Service("wuzixiangqingService")
public class WuzixiangqingServiceImpl extends ServiceImpl<WuzixiangqingDao, WuzixiangqingEntity> implements WuzixiangqingService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<WuzixiangqingEntity> page = this.selectPage(
                new Query<WuzixiangqingEntity>(params).getPage(),
                new EntityWrapper<WuzixiangqingEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<WuzixiangqingEntity> wrapper) {
		  Page<WuzixiangqingView> page =new Query<WuzixiangqingView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<WuzixiangqingVO> selectListVO(Wrapper<WuzixiangqingEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public WuzixiangqingVO selectVO(Wrapper<WuzixiangqingEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<WuzixiangqingView> selectListView(Wrapper<WuzixiangqingEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public WuzixiangqingView selectView(Wrapper<WuzixiangqingEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<WuzixiangqingEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<WuzixiangqingEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<WuzixiangqingEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }

}

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


import com.dao.CangweiDao;
import com.entity.CangweiEntity;
import com.service.CangweiService;
import com.entity.vo.CangweiVO;
import com.entity.view.CangweiView;

@Service("cangweiService")
public class CangweiServiceImpl extends ServiceImpl<CangweiDao, CangweiEntity> implements CangweiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<CangweiEntity> page = this.selectPage(
                new Query<CangweiEntity>(params).getPage(),
                new EntityWrapper<CangweiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<CangweiEntity> wrapper) {
		  Page<CangweiView> page =new Query<CangweiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<CangweiVO> selectListVO(Wrapper<CangweiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public CangweiVO selectVO(Wrapper<CangweiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<CangweiView> selectListView(Wrapper<CangweiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public CangweiView selectView(Wrapper<CangweiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

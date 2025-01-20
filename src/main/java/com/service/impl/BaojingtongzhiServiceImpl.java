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


import com.dao.BaojingtongzhiDao;
import com.entity.BaojingtongzhiEntity;
import com.service.BaojingtongzhiService;
import com.entity.vo.BaojingtongzhiVO;
import com.entity.view.BaojingtongzhiView;

@Service("baojingtongzhiService")
public class BaojingtongzhiServiceImpl extends ServiceImpl<BaojingtongzhiDao, BaojingtongzhiEntity> implements BaojingtongzhiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<BaojingtongzhiEntity> page = this.selectPage(
                new Query<BaojingtongzhiEntity>(params).getPage(),
                new EntityWrapper<BaojingtongzhiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<BaojingtongzhiEntity> wrapper) {
		  Page<BaojingtongzhiView> page =new Query<BaojingtongzhiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<BaojingtongzhiVO> selectListVO(Wrapper<BaojingtongzhiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public BaojingtongzhiVO selectVO(Wrapper<BaojingtongzhiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<BaojingtongzhiView> selectListView(Wrapper<BaojingtongzhiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public BaojingtongzhiView selectView(Wrapper<BaojingtongzhiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}

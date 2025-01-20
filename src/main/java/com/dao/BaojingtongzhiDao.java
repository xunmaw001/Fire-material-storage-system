package com.dao;

import com.entity.BaojingtongzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.BaojingtongzhiVO;
import com.entity.view.BaojingtongzhiView;


/**
 * 报警通知
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface BaojingtongzhiDao extends BaseMapper<BaojingtongzhiEntity> {
	
	List<BaojingtongzhiVO> selectListVO(@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);
	
	BaojingtongzhiVO selectVO(@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);
	
	List<BaojingtongzhiView> selectListView(@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);

	List<BaojingtongzhiView> selectListView(Pagination page,@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);
	
	BaojingtongzhiView selectView(@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);
	

}

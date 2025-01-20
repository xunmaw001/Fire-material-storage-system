package com.dao;

import com.entity.AnquanjianchatixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.AnquanjianchatixingVO;
import com.entity.view.AnquanjianchatixingView;


/**
 * 安全检查提醒
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface AnquanjianchatixingDao extends BaseMapper<AnquanjianchatixingEntity> {
	
	List<AnquanjianchatixingVO> selectListVO(@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);
	
	AnquanjianchatixingVO selectVO(@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);
	
	List<AnquanjianchatixingView> selectListView(@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);

	List<AnquanjianchatixingView> selectListView(Pagination page,@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);
	
	AnquanjianchatixingView selectView(@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);
	

}

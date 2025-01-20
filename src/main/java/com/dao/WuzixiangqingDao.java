package com.dao;

import com.entity.WuzixiangqingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.WuzixiangqingVO;
import com.entity.view.WuzixiangqingView;


/**
 * 物资详情
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface WuzixiangqingDao extends BaseMapper<WuzixiangqingEntity> {
	
	List<WuzixiangqingVO> selectListVO(@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
	
	WuzixiangqingVO selectVO(@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
	
	List<WuzixiangqingView> selectListView(@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);

	List<WuzixiangqingView> selectListView(Pagination page,@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
	
	WuzixiangqingView selectView(@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
}

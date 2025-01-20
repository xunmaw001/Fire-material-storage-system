package com.dao;

import com.entity.CangkuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangkuVO;
import com.entity.view.CangkuView;


/**
 * 仓库
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface CangkuDao extends BaseMapper<CangkuEntity> {
	
	List<CangkuVO> selectListVO(@Param("ew") Wrapper<CangkuEntity> wrapper);
	
	CangkuVO selectVO(@Param("ew") Wrapper<CangkuEntity> wrapper);
	
	List<CangkuView> selectListView(@Param("ew") Wrapper<CangkuEntity> wrapper);

	List<CangkuView> selectListView(Pagination page,@Param("ew") Wrapper<CangkuEntity> wrapper);
	
	CangkuView selectView(@Param("ew") Wrapper<CangkuEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params")Map<String, Object> params,@Param("ew") Wrapper<CangkuEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CangkuEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<CangkuEntity> wrapper);
}

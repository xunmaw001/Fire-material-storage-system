package com.dao;

import com.entity.CangweiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.CangweiVO;
import com.entity.view.CangweiView;


/**
 * 仓位
 * 
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface CangweiDao extends BaseMapper<CangweiEntity> {
	
	List<CangweiVO> selectListVO(@Param("ew") Wrapper<CangweiEntity> wrapper);
	
	CangweiVO selectVO(@Param("ew") Wrapper<CangweiEntity> wrapper);
	
	List<CangweiView> selectListView(@Param("ew") Wrapper<CangweiEntity> wrapper);

	List<CangweiView> selectListView(Pagination page,@Param("ew") Wrapper<CangweiEntity> wrapper);
	
	CangweiView selectView(@Param("ew") Wrapper<CangweiEntity> wrapper);
	

}

package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.WuzixiangqingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.WuzixiangqingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.WuzixiangqingView;


/**
 * 物资详情
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface WuzixiangqingService extends IService<WuzixiangqingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<WuzixiangqingVO> selectListVO(Wrapper<WuzixiangqingEntity> wrapper);
   	
   	WuzixiangqingVO selectVO(@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
   	
   	List<WuzixiangqingView> selectListView(Wrapper<WuzixiangqingEntity> wrapper);
   	
   	WuzixiangqingView selectView(@Param("ew") Wrapper<WuzixiangqingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<WuzixiangqingEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<WuzixiangqingEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<WuzixiangqingEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<WuzixiangqingEntity> wrapper);
}


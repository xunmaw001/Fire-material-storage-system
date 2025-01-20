package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.CangweiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.CangweiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.CangweiView;


/**
 * 仓位
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface CangweiService extends IService<CangweiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<CangweiVO> selectListVO(Wrapper<CangweiEntity> wrapper);
   	
   	CangweiVO selectVO(@Param("ew") Wrapper<CangweiEntity> wrapper);
   	
   	List<CangweiView> selectListView(Wrapper<CangweiEntity> wrapper);
   	
   	CangweiView selectView(@Param("ew") Wrapper<CangweiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<CangweiEntity> wrapper);
   	

}


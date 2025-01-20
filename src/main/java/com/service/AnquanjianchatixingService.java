package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.AnquanjianchatixingEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.AnquanjianchatixingVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.AnquanjianchatixingView;


/**
 * 安全检查提醒
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface AnquanjianchatixingService extends IService<AnquanjianchatixingEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<AnquanjianchatixingVO> selectListVO(Wrapper<AnquanjianchatixingEntity> wrapper);
   	
   	AnquanjianchatixingVO selectVO(@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);
   	
   	List<AnquanjianchatixingView> selectListView(Wrapper<AnquanjianchatixingEntity> wrapper);
   	
   	AnquanjianchatixingView selectView(@Param("ew") Wrapper<AnquanjianchatixingEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<AnquanjianchatixingEntity> wrapper);
   	

}


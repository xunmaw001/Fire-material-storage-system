package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.BaojingtongzhiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.BaojingtongzhiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.BaojingtongzhiView;


/**
 * 报警通知
 *
 * @author 
 * @email 
 * @date 2022-05-14 10:48:30
 */
public interface BaojingtongzhiService extends IService<BaojingtongzhiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<BaojingtongzhiVO> selectListVO(Wrapper<BaojingtongzhiEntity> wrapper);
   	
   	BaojingtongzhiVO selectVO(@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);
   	
   	List<BaojingtongzhiView> selectListView(Wrapper<BaojingtongzhiEntity> wrapper);
   	
   	BaojingtongzhiView selectView(@Param("ew") Wrapper<BaojingtongzhiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<BaojingtongzhiEntity> wrapper);
   	

}


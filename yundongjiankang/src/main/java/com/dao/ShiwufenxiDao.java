package com.dao;

import com.entity.ShiwufenxiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ShiwufenxiView;

/**
 * 食物营养分析 Dao 接口
 *
 * @author 
 */
public interface ShiwufenxiDao extends BaseMapper<ShiwufenxiEntity> {

   List<ShiwufenxiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

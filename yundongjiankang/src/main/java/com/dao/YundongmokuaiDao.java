package com.dao;

import com.entity.YundongmokuaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.YundongmokuaiView;

/**
 * 运动模块 Dao 接口
 *
 * @author 
 */
public interface YundongmokuaiDao extends BaseMapper<YundongmokuaiEntity> {

   List<YundongmokuaiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}

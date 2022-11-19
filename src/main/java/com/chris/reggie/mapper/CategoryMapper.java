package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/8 1:32
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {
}

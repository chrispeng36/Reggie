package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.ShoppingCart;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/12 19:31
 */
@Mapper
public interface ShoppingCarMapper extends BaseMapper<ShoppingCart> {
}

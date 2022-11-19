package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.Orders;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/12 19:33
 */
@Mapper
public interface OrderMapper extends BaseMapper<Orders> {
}

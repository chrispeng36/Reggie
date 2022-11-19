package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.OrderDetail;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/12 19:36
 */
@Mapper
public interface OrderDetailMapper extends BaseMapper<OrderDetail> {
}

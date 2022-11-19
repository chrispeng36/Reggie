package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/12 10:43
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

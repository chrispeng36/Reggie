package com.chris.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chris.reggie.entity.AddressBook;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author ChrisPeng
 * @date 2022/11/12 16:21
 */
@Mapper
public interface AddressBookMapper extends BaseMapper<AddressBook> {
}

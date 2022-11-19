package com.chris.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chris.reggie.entity.AddressBook;
import com.chris.reggie.mapper.AddressBookMapper;
import com.chris.reggie.service.AddressBookService;
import org.springframework.stereotype.Service;

/**
 * @author ChrisPeng
 * @date 2022/11/12 18:58
 */
@Service
public class AddressBookServiceImpl extends ServiceImpl<AddressBookMapper, AddressBook> implements AddressBookService {
}

package com.chris.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chris.reggie.entity.Category;

/**
 * @author ChrisPeng
 * @date 2022/11/8 1:33
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}

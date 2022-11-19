package com.chris.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.chris.reggie.dto.SetmealDto;
import com.chris.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author ChrisPeng
 * @date 2022/11/8 10:46
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时需要删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}

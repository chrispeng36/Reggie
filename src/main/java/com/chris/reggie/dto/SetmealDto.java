package com.chris.reggie.dto;

import com.chris.reggie.entity.SetmealDish;
import com.chris.reggie.entity.Setmeal;
import com.chris.reggie.entity.SetmealDish;
import lombok.Data;
import java.util.List;

@Data
public class SetmealDto extends Setmeal {

    private List<SetmealDish> setmealDishes;

    private String categoryName;

}

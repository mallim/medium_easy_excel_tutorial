package org.example.convert.exceldatatolist;

import cn.afterturn.easypoi.excel.annotation.Excel;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class FoodInfo {

    @ExcelProperty("Category")
    @Excel(name="Category")
    private String category;

    @ExcelProperty("Name")
    @Excel(name="Name")
    private String name;

    @ExcelProperty("Measure")
    @Excel(name="Measure")
    private String measure;

    @ExcelProperty("Calories")
    @Excel(name="Calories")
    private double calories;
}

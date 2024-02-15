package org.example.convert.exceldatatolist;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FoodInfo {

    @ExcelProperty("Category")
    private String category;

    @ExcelProperty("Name")
    private String name;

    @ExcelProperty("Measure")
    private String measure;

    @ExcelProperty("Calories")
    private double calories;
}

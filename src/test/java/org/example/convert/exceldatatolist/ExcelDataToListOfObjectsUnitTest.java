package org.example.convert.exceldatatolist;

import org.example.convert.exceldatatolist.easyexcel.ExcelDataToListOfObjectsEasyExcel;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelDataToListOfObjectsUnitTest {

    @Test
    public void whenParsingExcelFileWithPOIJI_thenConvertsToList() {
        List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyExcel.excelDataToListOfObjets_withEasyExcel("src/main/resources/food_info.xlsx");

        assertEquals("Beverages", foodInfoList.get(0).getCategory());
        assertEquals("Dairy", foodInfoList.get(3).getCategory());
    }

    @Test
    public void excelDataToListOfObjets_withEasyExcelByBatch() {
        List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyExcel.excelDataToListOfObjets_withEasyExcelByBatch("src/main/resources/food_info.xlsx");

        assertEquals("Beverages", foodInfoList.get(0).getCategory());
        assertEquals("Dairy", foodInfoList.get(3).getCategory());
    }
}

package org.example.convert.exceldatatolist;

import org.example.convert.exceldatatolist.easyexcel.ExcelDataToListOfObjectsEasyExcel;
import org.example.convert.exceldatatolist.easypoi.ExcelDataToListOfObjectsEasyPoi;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ExcelDataToListOfObjectsUnitTest {

    @Test
    public void whenParsingExcelFileWithEasyExcel_thenConvertsToList() {
        List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyExcel.excelDataToListOfObjets_withEasyExcel("src/main/resources/food_info.xlsx");

        assertEquals("Beverages", foodInfoList.get(0).getCategory());
        assertEquals("Dairy", foodInfoList.get(3).getCategory());
    }

    @Test
    public void whenParsingExcelFileWithEasyExcelByBatch_thenConvertsToList() {
        List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyExcel.excelDataToListOfObjets_withEasyExcelByBatch("src/main/resources/food_info.xlsx");

        assertEquals("Beverages", foodInfoList.get(0).getCategory());
        assertEquals("Dairy", foodInfoList.get(3).getCategory());
    }

    @Test
    public void whenParsingExcelFileWithEasyExcelEasyPoi_thenConvertsToList(){
        List<FoodInfo> foodInfoList = ExcelDataToListOfObjectsEasyPoi.excelDataToListOfObjets_withEasyPoi("src/main/resources/food_info.xlsx");

        assertEquals("Beverages", foodInfoList.get(0).getCategory());
        assertEquals("Dairy", foodInfoList.get(3).getCategory());
    }
}

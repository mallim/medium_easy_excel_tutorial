package org.example.convert.exceldatatolist.easyexcel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.read.listener.PageReadListener;
import org.example.convert.exceldatatolist.FoodInfo;

import java.io.File;
import java.util.List;
import java.util.ArrayList;

public class ExcelDataToListOfObjectsEasyExcel {

    public static List<FoodInfo> excelDataToListOfObjets_withEasyExcel(String fileLocation){
        return EasyExcel.read(new File(fileLocation)).head(FoodInfo.class).sheet().doReadSync();
    }

    public static List<FoodInfo> excelDataToListOfObjets_withEasyExcelByBatch(String fileLocation){
        List<FoodInfo> result = new ArrayList<>();
        var rowsPerBatch = 100;
        PageReadListener<FoodInfo> listener = new PageReadListener<>( voList ->{
            result.addAll( voList );
        }, rowsPerBatch);
        EasyExcel.read(new File(fileLocation), FoodInfo.class, listener).sheet().doRead();
        return result;
    }
}

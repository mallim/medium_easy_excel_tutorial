package org.example.convert.exceldatatolist.easypoi;

import cn.afterturn.easypoi.excel.ExcelImportUtil;
import cn.afterturn.easypoi.excel.entity.ImportParams;
import java.io.File;
import java.util.List;
import org.example.convert.exceldatatolist.FoodInfo;

public class ExcelDataToListOfObjectsEasyPoi {
    public static List<FoodInfo> excelDataToListOfObjets_withEasyPoi(String fileLocation){
        ImportParams params = new ImportParams();
        return ExcelImportUtil.importExcel(new File(fileLocation), FoodInfo.class, params);
    }
}

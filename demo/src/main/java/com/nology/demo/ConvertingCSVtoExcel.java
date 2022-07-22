package com.nology.demo;

import com.aspose.cells.FileFormatType;
import com.aspose.cells.LoadOptions;
import com.aspose.cells.SaveFormat;
import com.aspose.cells.Workbook;

public class ConvertingCSVtoExcel {


    public static void CovertToExcel(String filePath) throws Exception {

		LoadOptions loadOptions = new LoadOptions(FileFormatType.CSV);

		Workbook workbook = new Workbook(filePath + "CSVdata.csv", loadOptions);
		workbook.save(filePath + "CSVtoExcel.xlsx" , SaveFormat.XLSX);

        System.out.println("Conversion Successful");

    }


}

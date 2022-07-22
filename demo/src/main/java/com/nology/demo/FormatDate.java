package com.nology.demo;

import com.aspose.cells.*;

public class FormatDate {

    public static void formattingDate(String filePath) throws Exception {

        Workbook book = new Workbook(filePath+"CSVtoExcel.xlsx");

        // style
        Style style = book.createStyle();
        style.setCustom("dd-mm-yy");
        StyleFlag flag = new StyleFlag();
        flag.setNumberFormat(true);

        // column
        Column col = book.getWorksheets().get(0).getCells().getColumns().get(CellsHelper.columnNameToIndex("G"));
        col.applyStyle(style,flag);

        book.save(filePath + "CSVtoExcel.xlsx");

        System.out.println("formatting was successful");
    }
}

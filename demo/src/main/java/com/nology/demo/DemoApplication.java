package com.nology.demo;

import com.aspose.cells.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(DemoApplication.class, args);

		String filePath = "C://Users//709887M2A//nology//CsvToExcel//demo (1)//";

		ConvertingCSVtoExcel.CovertToExcel(filePath);
		FormatDate.formattingDate(filePath);



	}

}

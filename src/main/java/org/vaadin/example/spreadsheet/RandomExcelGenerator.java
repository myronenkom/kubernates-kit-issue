package org.vaadin.example.spreadsheet;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Random;

public class RandomExcelGenerator {

    private static final Random RANDOM = new Random();

    public Workbook generateData(Workbook workbook) {
        try {
            Sheet sheet = workbook.getSheetAt(0);

            int rows = 20;
            int cols = 20;

            // Header
            Row header = sheet.createRow(0);
            header.createCell(0).setCellValue("ID");
            header.createCell(1).setCellValue("Name");
            header.createCell(2).setCellValue("Score");
            header.createCell(3).setCellValue("Active");
            header.createCell(4).setCellValue("Created");
            header.createCell(5).setCellValue("Comment");

            CellStyle dateStyle = workbook.createCellStyle();
            CreationHelper creationHelper = workbook.getCreationHelper();
            dateStyle.setDataFormat(
                    creationHelper.createDataFormat().getFormat("yyyy-mm-dd")
            );

            for (int r = 1; r <= rows; r++) {
                Row row = sheet.createRow(r);

                row.createCell(0).setCellValue(r); // ID
                row.createCell(1).setCellValue(randomName());
                row.createCell(2).setCellValue(randomDouble(0, 100));
                row.createCell(3).setCellValue(RANDOM.nextBoolean());

                Cell dateCell = row.createCell(4);
                dateCell.setCellValue(randomDate());
                dateCell.setCellStyle(dateStyle);

                row.createCell(5).setCellValue(randomSentence());
            }

            for (int c = 0; c < cols; c++) {
                sheet.autoSizeColumn(c);
            }

            try (FileOutputStream out = new FileOutputStream("random-data.xlsx")) {
                workbook.write(out);
            }

            return workbook;
        } catch (IOException e) {
            return null;
        }
    }

    private static String randomName() {
        String[] names = {"Alice", "Bob", "Charlie", "Diana", "Eve", "Frank"};
        return names[RANDOM.nextInt(names.length)];
    }

    private static double randomDouble(double min, double max) {
        return min + (max - min) * RANDOM.nextDouble();
    }

    private static java.util.Date randomDate() {
        LocalDate start = LocalDate.of(2020, 1, 1);
        LocalDate end = LocalDate.of(2025, 12, 31);
        int days = start.until(end).getDays();
        return java.sql.Date.valueOf(start.plusDays(RANDOM.nextInt(days)));
    }

    private static String randomSentence() {
        String[] words = {"lorem", "ipsum", "dolor", "sit", "amet", "consectetur"};
        int length = 3 + RANDOM.nextInt(5);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i > 0) sb.append(" ");
            sb.append(words[RANDOM.nextInt(words.length)]);
        }
        return sb.toString();
    }
}
package org.vaadin.example.spreadsheet;

import com.vaadin.kubernetes.starter.sessiontracker.UnserializableComponentWrapper;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.CellRangeAddress;
import org.vaadin.example.BeanUtil;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.util.Optional;

public class SpreadsheetWrapper extends UnserializableComponentWrapper<SpreadsheetData, CustomSpreadsheet> {

    public SpreadsheetWrapper(CustomSpreadsheet component) {
        super(component, SpreadsheetWrapper::serialize, SpreadsheetWrapper::deserialize);
    }

    private static SpreadsheetData serialize(CustomSpreadsheet spreadsheet) {
        try(ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            spreadsheet.write(baos);
            var selection = Optional
                    .ofNullable(spreadsheet.getCellSelectionManager().getSelectedCellRange())
                    .map(CellRangeAddress::formatAsString)
                    .orElse(null);
            return new SpreadsheetData(baos.toByteArray(), selection);
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }

    private static CustomSpreadsheet deserialize(SpreadsheetData spreadsheet) {
        try {
            var sheet = BeanUtil.getBean(CustomSpreadsheet.class);
            sheet.setWorkbook(WorkbookFactory.create(new ByteArrayInputStream(spreadsheet.data())));

            if (spreadsheet.selection() != null) {
                sheet.setSelection(spreadsheet.selection());
            }
            return sheet;
        } catch (IOException e) {
            throw new UncheckedIOException(e);
        }
    }
}

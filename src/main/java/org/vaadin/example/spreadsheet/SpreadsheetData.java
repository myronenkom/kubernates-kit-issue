package org.vaadin.example.spreadsheet;

import java.io.Serializable;

public record SpreadsheetData(byte[] data, String selection) implements Serializable { }

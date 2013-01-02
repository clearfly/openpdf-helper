package com.outjected.itext.helper;

import com.lowagie.text.DocumentException;
import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfPCell;
import com.lowagie.text.pdf.PdfPTable;

/**
 * 
 * @author Cody Lerum
 * 
 */
public class Table {
    private PdfPTable table;

    public Table(int columns) {
        table = new PdfPTable(columns);

        table.setWidthPercentage(100);
    }

    public static Table instance(int columns) {
        return new Table(columns);
    }

    public Table totalWidth(float width) {
        table.setTotalWidth(width);
        return this;
    }

    public Table width(float widthPercentage) {
        table.setWidthPercentage(widthPercentage);
        return this;
    }

    public Table widths(float... widths) throws DocumentException {
        table.setWidths(widths);
        return this;
    }

    public Table addCell(Cell cell) {
        table.addCell(cell.get());
        return this;
    }

    public Table addCell(Image image) {
        table.addCell(image);
        return this;
    }

    public Table extendLastRow(boolean extend) {
        table.setExtendLastRow(extend);
        return this;
    }

    public Table headerRows(int rows) {
        table.setHeaderRows(rows);
        return this;
    }

    public Table footerRows(int rows) {
        table.setFooterRows(rows);
        return this;
    }

    public Table skipLastFooter() {
        table.setSkipLastFooter(true);
        return this;
    }

    public PdfPCell getDefaultCell() {
        return table.getDefaultCell();
    }

    public PdfPTable get() {
        return table;
    }

}

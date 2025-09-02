package co.cfly.openpdf.helper;

import org.openpdf.text.DocumentException;
import org.openpdf.text.Image;
import org.openpdf.text.pdf.PdfPTable;

/**
 * @author Cody Lerum
 */
public class Table extends PdfPTable {

    public Table(int columns) {
        super(columns);
        setWidthPercentage(100);
    }

    public static Table instance(int columns) {
        return new Table(columns);
    }

    public Table totalWidth(float width) {
        setTotalWidth(width);
        return this;
    }

    public Table width(float widthPercentage) {
        setWidthPercentage(widthPercentage);
        return this;
    }

    public Table widths(float... widths) throws DocumentException {
        setWidths(widths);
        return this;
    }

    public Table addCell(Cell cell) {
        super.addCell(cell);
        return this;
    }

    public Table addImageCell(Image image) {
        super.addCell(image);
        return this;
    }

    public Table extendLastRow(boolean extend) {
        setExtendLastRow(extend);
        return this;
    }

    public Table headerRows(int rows) {
        setHeaderRows(rows);
        return this;
    }

    public Table footerRows(int rows) {
        setFooterRows(rows);
        return this;
    }

    public Table skipLastFooter() {
        setSkipLastFooter(true);
        return this;
    }
}

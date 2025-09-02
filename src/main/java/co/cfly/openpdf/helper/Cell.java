package co.cfly.openpdf.helper;

import java.awt.*;
import org.openpdf.text.Image;
import org.openpdf.text.pdf.PdfPCell;

/**
 * @author Cody Lerum
 */
public class Cell extends PdfPCell {

    public Cell(CellFormat cellFormat) {
        super();
        setHorizontalAlignment(cellFormat.getHorizontalAlignment().getItextValue());
        setVerticalAlignment(cellFormat.getVerticalAlignment().getItextValue());

        if (cellFormat.getPadding() != null) {
            setPadding(cellFormat.getPadding());
        }
        if (cellFormat.getPaddingLeft() != null) {
            setPaddingLeft(cellFormat.getPaddingLeft());
        }
        if (cellFormat.getPaddingRight() != null) {
            setPaddingRight(cellFormat.getPaddingRight());
        }
        if (cellFormat.getPaddingTop() != null) {
            setPaddingTop(cellFormat.getPaddingTop());
        }
        if (cellFormat.getPaddingBottom() != null) {
            setPaddingBottom(cellFormat.getPaddingBottom());
        }
        if (cellFormat.getBorder() != null) {
            setBorderWidth(cellFormat.getBorder());
        }
        if (cellFormat.getBorderLeft() != null) {
            setBorderWidthLeft(cellFormat.getBorderLeft());
        }
        if (cellFormat.getBorderRight() != null) {
            setBorderWidthRight(cellFormat.getBorderRight());
        }
        if (cellFormat.getBorderTop() != null) {
            setBorderWidthTop(cellFormat.getBorderTop());
        }
        if (cellFormat.getBorderBottom() != null) {
            setBorderWidthBottom(cellFormat.getBorderBottom());
        }

        setNoWrap(cellFormat.isNoWrap());
    }

    public Cell() {
        this(new CellFormat());
    }

    public Cell(int colSpan) {
        this(new CellFormat());
        setColspan(colSpan);
    }

    public Cell(CellFormat cellFormat, int colSpan) {
        this(cellFormat);
        setColspan(colSpan);
    }

    public Cell(Image image) {
        super(image, false);
        setBorder(0);
    }

    public static Cell instance() {
        return new Cell(new CellFormat());
    }

    public static Cell instance(CellFormat cellFormat) {
        return new Cell(cellFormat);
    }

    public static Cell instance(CellFormat cellFormat, int colSpan) {
        return new Cell(cellFormat, colSpan);
    }

    public static Cell instance(int colSpan) {
        return new Cell(new CellFormat(), colSpan);
    }

    public Cell colSpan(int colSpan) {
        setColspan(colSpan);
        return this;
    }

    public Cell add(Anchor anchor) {
        setPhrase(anchor);
        return this;
    }

    public Cell add(Chunk chunk) {
        addElement(chunk);
        return this;
    }

    public Cell add(Phrase phrase) {
        setPhrase(phrase);
        return this;
    }

    public Cell add(org.openpdf.text.Phrase phrase) {
        setPhrase(phrase);
        return this;
    }

    public Cell add(Paragraph paragraph) {
        addElement(paragraph);
        return this;
    }

    public Cell add(Table table) {
        addElement(table);
        return this;
    }

    public Cell add(Image image) {
        addElement(image);
        return this;
    }

    public Cell horizontalAlignment(HorizontalAlignment horizontalAlignment) {
        setHorizontalAlignment(horizontalAlignment.getItextValue());
        return this;
    }

    public Cell verticalAlignment(VerticalAlignment verticalAlignment) {
        setVerticalAlignment(verticalAlignment.getItextValue());
        return this;
    }

    public Cell borderWidth(float width) {
        setBorderWidth(width);
        return this;
    }

    public Cell height(float height) {
        setFixedHeight(height);
        return this;
    }

    public Cell borderWidthTop(float width) {
        setBorderWidthTop(width);
        return this;
    }

    public Cell borderWidthBottom(float width) {
        setBorderWidthBottom(width);
        return this;
    }

    public Cell borderWidthLeft(float width) {
        setBorderWidthLeft(width);
        return this;
    }

    public Cell borderWidthRight(float width) {
        setBorderWidthRight(width);
        return this;
    }

    public Cell padding(float padding) {
        setPadding(padding);
        return this;
    }

    public Cell paddingLeft(float padding) {
        setPaddingLeft(padding);
        return this;
    }

    public Cell paddingRight(float padding) {
        setPaddingRight(padding);
        return this;
    }

    public Cell paddingTop(float padding) {
        setPaddingTop(padding);
        return this;
    }

    public Cell paddingBottom(float padding) {
        setPaddingBottom(padding);
        return this;
    }

    public Cell backgroundColor(Color color) {
        setBackgroundColor(color);
        return this;
    }

    public Cell borderColor(Color color) {
        setBorderColor(color);
        return this;
    }
}

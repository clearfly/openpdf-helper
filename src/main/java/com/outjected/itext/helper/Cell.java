package com.outjected.itext.helper;

import java.awt.Color;

import com.lowagie.text.Image;
import com.lowagie.text.pdf.PdfPCell;

/**
 * 
 * @author Cody Lerum
 * 
 */
public class Cell {
    private PdfPCell cell;

    public Cell(CellFormat cellFormat) {
        cell = new PdfPCell();

        cell.setHorizontalAlignment(cellFormat.getHorizontalAlignment().getItextValue());
        cell.setVerticalAlignment(cellFormat.getVerticalAlignment().getItextValue());

        if (cellFormat.getPadding() != null) {
            cell.setPadding(cellFormat.getPadding());
        }
        if (cellFormat.getPaddingLeft() != null) {
            cell.setPaddingLeft(cellFormat.getPaddingLeft());
        }
        if (cellFormat.getPaddingRight() != null) {
            cell.setPaddingRight(cellFormat.getPaddingRight());
        }
        if (cellFormat.getPaddingTop() != null) {
            cell.setPaddingTop(cellFormat.getPaddingTop());
        }
        if (cellFormat.getPaddingBottom() != null) {
            cell.setPaddingBottom(cellFormat.getPaddingBottom());
        }
        if (cellFormat.getBorder() != null) {
            cell.setBorderWidth(cellFormat.getBorder());
        }
        if (cellFormat.getBorderLeft() != null) {
            cell.setBorderWidthLeft(cellFormat.getBorderLeft());
        }
        if (cellFormat.getBorderRight() != null) {
            cell.setBorderWidthRight(cellFormat.getBorderRight());
        }
        if (cellFormat.getBorderTop() != null) {
            cell.setBorderWidthTop(cellFormat.getBorderTop());
        }
        if (cellFormat.getBorderBottom() != null) {
            cell.setBorderWidthBottom(cellFormat.getBorderBottom());
        }

        cell.setNoWrap(cellFormat.isNoWrap());
    }

    public Cell() {
        this(new CellFormat());
    }

    public Cell(int colSpan) {
        this(new CellFormat());
        cell.setColspan(colSpan);
    }

    public Cell(CellFormat cellFormat, int colSpan) {
        this(cellFormat);
        cell.setColspan(colSpan);
    }

    public Cell(Image image) {
        cell = new PdfPCell(image, false);
        cell.setBorder(0);
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
        cell.setColspan(colSpan);
        return this;
    }

    public Cell add(Anchor anchor) {
        cell.setPhrase(anchor.get());
        return this;
    }

    public Cell add(Phrase phrase) {
        cell.setPhrase(phrase.get());
        return this;
    }

    public Cell add(Paragraph paragraph) {
        cell.addElement(paragraph.get());
        return this;
    }

    public Cell add(Table table) {
        cell.addElement(table.get());
        return this;
    }

    public Cell add(Image image) {
        cell.addElement(image);
        return this;
    }

    public Cell horizontalAlignment(HorizontalAlignment horizontalAlignment) {
        cell.setHorizontalAlignment(horizontalAlignment.getItextValue());
        return this;
    }

    public Cell verticalAlignment(VerticalAlignment verticalAlignment) {
        cell.setVerticalAlignment(verticalAlignment.getItextValue());
        return this;
    }

    public Cell borderWidth(float width) {
        cell.setBorderWidth(width);
        return this;
    }

    public Cell height(float height) {
        cell.setFixedHeight(height);
        return this;
    }

    public Cell borderWidthTop(float width) {
        cell.setBorderWidthTop(width);
        return this;
    }

    public Cell borderWidthBottom(float width) {
        cell.setBorderWidthBottom(width);
        return this;
    }

    public Cell borderWidthLeft(float width) {
        cell.setBorderWidthLeft(width);
        return this;
    }

    public Cell borderWidthRight(float width) {
        cell.setBorderWidthRight(width);
        return this;
    }

    public Cell padding(float padding) {
        cell.setPadding(padding);
        return this;
    }

    public Cell paddingLeft(float padding) {
        cell.setPaddingLeft(padding);
        return this;
    }

    public Cell paddingRight(float padding) {
        cell.setPaddingRight(padding);
        return this;
    }

    public Cell paddingTop(float padding) {
        cell.setPaddingTop(padding);
        return this;
    }

    public Cell paddingBottom(float padding) {
        cell.setPaddingBottom(padding);
        return this;
    }

    public Cell backgroundColor(Color color) {
        cell.setBackgroundColor(color);
        return this;
    }

    public Cell borderColor(Color color) {
        cell.setBorderColor(color);
        return this;
    }

    public PdfPCell get() {
        return cell;
    }
}

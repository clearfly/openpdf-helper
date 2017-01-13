package com.outjected.itext.helper;

import com.lowagie.text.pdf.PdfAction;

/**
 * @author Cody Lerum
 */
public class Chunk {
    private com.lowagie.text.Chunk chunk;

    private Chunk(com.lowagie.text.Chunk chunk) {
        this.chunk = chunk;
    }

    public Chunk(String s) {
        chunk = new com.lowagie.text.Chunk(s);
    }

    public static Chunk instance(String s) {
        return new Chunk(s);
    }

    public static Chunk newLine() {
        return new Chunk(com.lowagie.text.Chunk.NEWLINE);
    }

    public Chunk textSize(float size) {
        chunk.getFont().setSize(size);
        return this;
    }

    public Chunk textStyle(TextStyle style) {
        chunk.getFont().setStyle(style.getItextValue());
        return this;
    }

    public Chunk styleSize(StyleSize styleSize) {
        chunk.getFont().setSize(styleSize.getSize());
        chunk.getFont().setStyle(styleSize.getStyle().getItextValue());
        return this;
    }

    public Chunk underline() {
        return underline(.5f, -2f);
    }

    public Chunk underline(float thinkness, float position) {
        chunk.setUnderline(thinkness, position);
        return this;
    }

    public Chunk font(Font font) {
        chunk.setFont(font.get());
        return this;
    }

    public Chunk action(PdfAction action) {
        chunk.setAction(action);
        return this;
    }

    public com.lowagie.text.Chunk get() {
        return chunk;
    }
}

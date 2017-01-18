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

    public Chunk(String content) {
        chunk = new com.lowagie.text.Chunk(content);
    }

    public Chunk(String content, Font font) {
        chunk = new com.lowagie.text.Chunk(content, font.itextValue());
    }

    public static Chunk instance(String s) {
        return new Chunk(s);
    }

    public static Chunk instance(String s, Font font) {
        return new Chunk(s, font);
    }

    public static Chunk newLine() {
        return new Chunk(com.lowagie.text.Chunk.NEWLINE);
    }

    @Deprecated
    public Chunk textSize(float size) {
        return size(size);
    }

    public Chunk size(float size) {
        chunk.getFont().setSize(size);
        return this;
    }

    @Deprecated
    public Chunk textStyle(TextStyle style) {
        return style(style);
    }

    @Deprecated
    public Chunk styleSize(StyleSize styleSize) {
        return style(styleSize);
    }

    public Chunk style(TextStyle style) {
        chunk.getFont().setStyle(style.getItextValue());
        return this;
    }

    public Chunk style(StyleSize styleSize) {
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
        chunk.setFont(font.itextValue());
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

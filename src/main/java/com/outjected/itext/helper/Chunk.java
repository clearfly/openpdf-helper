package com.outjected.itext.helper;

import com.lowagie.text.pdf.PdfAction;

/**
 * @author Cody Lerum
 */
public class Chunk {
    private final com.lowagie.text.Chunk chunk;
    private boolean applyPhraseFont = true;

    private Chunk(com.lowagie.text.Chunk chunk) {
        this.chunk = chunk;
    }

    public Chunk(String content) {
        chunk = new com.lowagie.text.Chunk(content);
    }

    public Chunk(String content, Font font) {
        this.chunk = new com.lowagie.text.Chunk(content, font.get());
        this.applyPhraseFont = false;
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

    public Chunk textSize(float size) {
        chunk.getFont().setSize(size);
        applyPhraseFont = false;
        return this;
    }

    public Chunk textStyle(TextStyle style) {
        chunk.getFont().setStyle(style.getItextValue());
        applyPhraseFont = false;
        return this;
    }

    public Chunk styleSize(StyleSize styleSize) {
        chunk.getFont().setSize(styleSize.getSize());
        chunk.getFont().setStyle(styleSize.getStyle().getItextValue());
        applyPhraseFont = false;
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
        applyPhraseFont = false;
        return this;
    }

    public Chunk action(PdfAction action) {
        chunk.setAction(action);
        return this;
    }

    public com.lowagie.text.Chunk get() {
        return chunk;
    }

    public boolean isApplyPhraseFont() {
        return applyPhraseFont;
    }
}

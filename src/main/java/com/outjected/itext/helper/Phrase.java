package com.outjected.itext.helper;

import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Cody Lerum
 */
public class Phrase {
    private com.lowagie.text.Phrase phrase = new com.lowagie.text.Phrase();
    private Font font = new Font();
    private ArrayList<Chunk> chunks = new ArrayList<>();

    public Phrase() {
        this.font = new Font();
    }

    public Phrase(Font font) {
        this.font = font;
    }

    public Phrase(Font font, String content) {
        this.font = font;
        chunks.add(new Chunk(content));
    }

    public Phrase(String content) {
        chunks.add(new Chunk(content));
    }

    public Phrase(Chunk chunk) {
        chunks.add(chunk);
    }

    public static Phrase instance(String content) {
        return new Phrase(content);
    }

    public static Phrase instance(Font font) {
        return new Phrase(font);
    }

    public static Phrase instance(Chunk chunk) {
        return new Phrase(chunk);
    }

    public static Phrase instance() {
        return new Phrase();
    }

    public Phrase textSize(float textSize) {
        font = font.with(textSize);
        return this;
    }

    public Phrase textStyle(TextStyle textStyle) {
        font = font.with(textStyle);
        return this;
    }

    public Phrase styleSize(StyleSize styleSize) {
        font = font.with(styleSize);
        return this;
    }

    public Phrase color(Color color) {
        font = font.with(color);
        return this;
    }

    public Phrase leading(float leading) {
        phrase.setLeading(leading);
        return this;
    }

    public Phrase add(Chunk chunk) {
        chunks.add(chunk);
        return this;
    }

    public com.lowagie.text.Phrase get() {
        for (Chunk c : chunks) {
            if (c.isApplyPhraseFont()) {
                c.font(font);
            }
            phrase.add(c.get());
        }
        return phrase;
    }

    public Phrase add(String content) {
        chunks.add(Chunk.instance(content, font));
        return this;
    }
}

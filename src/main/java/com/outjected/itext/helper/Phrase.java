package com.outjected.itext.helper;

import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Cody Lerum
 */
public class Phrase {
    private com.lowagie.text.Phrase phrase = new com.lowagie.text.Phrase();
    private Font font = new Font();
    private Chunk chunk;
    private boolean underline;
    private ArrayList<Chunk> chunks = new ArrayList<>();

    public Phrase() {
        this.font = new Font();
    }

    public Phrase(Font font) {
        this.font = font;
    }

    public Phrase(Font font, String content) {
        this.font = font;
        this.chunk = new Chunk(content);
    }

    public Phrase(String content) {
        chunk = new Chunk(content);
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
        font.with(color);
        return this;
    }

    public Phrase underline() {
        underline = true;
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
        if (chunks.isEmpty()) {
            chunk.font(font);

            if (underline) {
                chunk.underline(.5f, -2f);
            }

            phrase.add(chunk.get());
        }
        else {
            for (Chunk c : chunks) {
                phrase.add(c.get());
            }
        }

        return phrase;
    }

    public Phrase add(String content) {
        chunks.add(Chunk.instance(content).font(font));
        return this;
    }
}

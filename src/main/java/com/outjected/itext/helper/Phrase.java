package com.outjected.itext.helper;

import java.awt.Color;
import java.util.ArrayList;

/**
 * @author Cody Lerum
 */
public class Phrase {
    private com.lowagie.text.Phrase phrase = new com.lowagie.text.Phrase();
    private float textSize = 10;
    private TextStyle textStyle = TextStyle.NORMAL;
    private Color color = Color.BLACK;
    private Chunk chunk;
    private boolean underline;
    private ArrayList<Chunk> chunks = new ArrayList<Chunk>();

    public Phrase() {

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

    public static Phrase instance(Chunk chunk) {
        return new Phrase(chunk);
    }

    public static Phrase instance() {
        return new Phrase();
    }

    public Phrase textSize(float textSize) {
        this.textSize = textSize;
        return this;
    }

    public Phrase textStyle(TextStyle textStyle) {
        this.textStyle = textStyle;
        return this;
    }

    public Phrase styleSize(StyleSize styleSize) {
        this.textSize = styleSize.getSize();
        this.textStyle = styleSize.getStyle();
        return this;
    }

    public Phrase color(Color color) {
        this.color = color;
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
            Font f = new Font();
            f.size(textSize);
            f.style(textStyle);
            f.color(color);

            chunk.font(f);

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
}

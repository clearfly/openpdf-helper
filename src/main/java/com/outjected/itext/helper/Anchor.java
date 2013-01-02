package com.outjected.itext.helper;

/**
 * @author Cody Lerum
 */
public class Anchor {
    private com.lowagie.text.Anchor anchor;

    public Anchor() {
        anchor = new com.lowagie.text.Anchor();
    }

    public Anchor(Phrase phrase) {
        anchor = new com.lowagie.text.Anchor(phrase.get());
    }

    public Anchor(Chunk chunk) {
        anchor = new com.lowagie.text.Anchor(chunk.get());
    }

    public static Anchor instance() {
        return new Anchor();
    }

    public static Anchor instance(Phrase phrase) {
        return new Anchor(phrase);
    }

    public static Anchor instance(Chunk chunk) {
        return new Anchor(chunk);
    }

    public Anchor name(String name) {
        anchor.setName(name);
        return this;
    }

    public Anchor docReference(String reference) {
        anchor.setReference("#" + reference);
        return this;
    }

    public com.lowagie.text.Anchor get() {
        return anchor;
    }
}

package com.outjected.itext.helper;

import java.util.ArrayList;

/**
 * 
 * @author Cody Lerum
 * 
 */
public class Paragraph {

    private com.lowagie.text.Paragraph paragraph;
    private ArrayList<com.lowagie.text.Phrase> phrases = new ArrayList<>();

    public Paragraph() {
        paragraph = new com.lowagie.text.Paragraph();
    }

    public Paragraph(Phrase phrase) {
        paragraph = new com.lowagie.text.Paragraph();
        phrases.add(phrase.get());
    }

    public static Paragraph instance() {
        return new Paragraph();
    }

    public static Paragraph instance(Phrase phrase) {
        return new Paragraph(phrase);
    }

    public Paragraph add(Chunk chunk) {
        phrases.add(Phrase.instance(chunk).get());
        return this;
    }

    public Paragraph add(Phrase phrase) {
        phrases.add(phrase.get());
        return this;
    }

    public Paragraph add(Table table) {
        paragraph.add(table.get());
        return this;
    }

    public Paragraph add(Anchor anchor) {
        paragraph.add(anchor.get());
        return this;
    }

    public Paragraph spacingBefore(float spacing) {
        paragraph.setSpacingBefore(spacing);
        return this;
    }

    public Paragraph spacingAfter(float spacing) {
        paragraph.setSpacingAfter(spacing);
        return this;
    }

    public Paragraph firstIndent(float indent) {
        paragraph.setFirstLineIndent(indent);
        return this;
    }

    public Paragraph indentLeft(float indent) {
        paragraph.setIndentationLeft(indent);
        return this;
    }

    public Paragraph indentRight(float indent) {
        paragraph.setIndentationRight(indent);
        return this;
    }

    public Paragraph alignment(HorizontalAlignment horizontalAlignment) {
        paragraph.setAlignment(horizontalAlignment.getItextValue());
        return this;
    }

    public Paragraph leading(float leading) {
        paragraph.setLeading(leading);
        return this;
    }

    public com.lowagie.text.Paragraph get() {
        paragraph.addAll(phrases);
        return paragraph;
    }
}

package co.cfly.openpdf.helper;

/**
 * @author Cody Lerum
 */
public class Paragraph extends com.lowagie.text.Paragraph {

    public Paragraph() {
        super();
    }

    public Paragraph(Phrase phrase) {
        super();
        this.add(phrase);
    }

    public static Paragraph instance() {
        return new Paragraph();
    }

    public static Paragraph instance(Phrase phrase) {
        return new Paragraph(phrase);
    }

    public Paragraph add(Chunk chunk) {
        super.add(Phrase.instance(chunk));
        return this;
    }

    public Paragraph add(Phrase phrase) {
        super.add(phrase);
        return this;
    }

    public Paragraph add(Table table) {
        super.add(table);
        return this;
    }

    public Paragraph add(Anchor anchor) {
        super.add(anchor);
        return this;
    }

    public Paragraph spacingBefore(float spacing) {
        setSpacingBefore(spacing);
        return this;
    }

    public Paragraph spacingAfter(float spacing) {
        setSpacingAfter(spacing);
        return this;
    }

    public Paragraph firstIndent(float indent) {
        setFirstLineIndent(indent);
        return this;
    }

    public Paragraph indentLeft(float indent) {
        setIndentationLeft(indent);
        return this;
    }

    public Paragraph indentRight(float indent) {
        setIndentationRight(indent);
        return this;
    }

    public Paragraph alignment(HorizontalAlignment horizontalAlignment) {
        setAlignment(horizontalAlignment.getItextValue());
        return this;
    }

    public Paragraph leading(float leading) {
        setLeading(leading);
        return this;
    }
}

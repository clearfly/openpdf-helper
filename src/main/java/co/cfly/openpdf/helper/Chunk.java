package co.cfly.openpdf.helper;

import com.lowagie.text.pdf.PdfAction;

/**
 * @author Cody Lerum
 */
public class Chunk extends com.lowagie.text.Chunk {

    private boolean applyPhraseFont = true;

    public Chunk(String content) {
        super(content);
    }

    public Chunk(String content, Font font) {
        super(content, font);
    }

    public static Chunk instance(String s) {
        return new Chunk(s);
    }

    public static Chunk instance(String s, Font font) {
        return new Chunk(s, font);
    }

    public static Chunk newLine() {
        return new Chunk(System.lineSeparator());
    }

    public Chunk textSize(float size) {
        getFont().setSize(size);
        this.applyPhraseFont = false;
        return this;
    }

    public Chunk textStyle(TextStyle style) {
        getFont().setStyle(style.getItextValue());
        this.applyPhraseFont = false;
        return this;
    }

    public Chunk styleSize(StyleSize styleSize) {
        getFont().setSize(styleSize.getSize());
        getFont().setStyle(styleSize.getStyle().getItextValue());
        this.applyPhraseFont = false;
        return this;
    }

    public Chunk underline() {
        return underline(.5f, -2f);
    }

    public Chunk underline(float thickness, float position) {
        setUnderline(thickness, position);
        return this;
    }

    public Chunk font(Font font) {
        setFont(font);
        this.applyPhraseFont = false;
        return this;
    }

    public Chunk action(PdfAction action) {
        setAction(action);
        return this;
    }

    public boolean isApplyPhraseFont() {
        return applyPhraseFont;
    }
}

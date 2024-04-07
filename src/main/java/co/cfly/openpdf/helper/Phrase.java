package co.cfly.openpdf.helper;

import java.awt.*;

/**
 * @author Cody Lerum
 */
public class Phrase extends com.lowagie.text.Phrase {

    public Phrase() {
        super();
    }

    public Phrase(co.cfly.openpdf.helper.Font font) {
        super();
        applyFont(font);
    }

    public Phrase(co.cfly.openpdf.helper.Font font, String content) {
        super(Chunk.instance(content, font));
    }

    public Phrase(String content) {
        super(Chunk.instance(content));
    }

    public Phrase(Chunk chunk) {
        super(chunk);
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

    public Phrase add(Chunk chunk) {
        if (chunk.isApplyPhraseFont()) {
            chunk.setFont(getFont());
        }
        super.add(chunk);
        return this;
    }

    public Phrase textSize(float textSize) {
        applyFont(new com.lowagie.text.Font(getFont().getBaseFont(), textSize, getFont().getStyle(), getFont().getColor()));
        return this;
    }

    public Phrase textStyle(TextStyle textStyle) {
        applyFont(new com.lowagie.text.Font(getFont().getBaseFont(), getFont().getSize(), textStyle.getItextValue(), getFont().getColor()));
        return this;
    }

    public Phrase styleSize(StyleSize styleSize) {
        applyFont(new com.lowagie.text.Font(getFont().getBaseFont(), styleSize.getSize(), styleSize.getStyle().getItextValue(), getFont().getColor()));
        return this;
    }

    public Phrase color(Color color) {
        applyFont(new com.lowagie.text.Font(getFont().getBaseFont(), getFont().getSize(), getFont().getStyle(), color));
        return this;
    }

    public Phrase leading(float leading) {
        setLeading(leading);
        return this;
    }

    private void applyFont(com.lowagie.text.Font font) {
        setFont(font);
        for (var element : getChunks()) {
            if (element instanceof Chunk chunk && chunk.isApplyPhraseFont()) {
                chunk.setFont(getFont());
            }
        }
    }
}

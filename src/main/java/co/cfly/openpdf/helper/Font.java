package co.cfly.openpdf.helper;

import java.awt.*;
import org.openpdf.text.pdf.BaseFont;

/**
 * @author Cody Lerum
 */
public class Font extends org.openpdf.text.Font {

    private static final ItextFont DEFAULT_FONT = ItextFont.HELVETICA;
    private static final float DEFAULT_SIZE = 12;
    private static final TextStyle DEFAULT_STYLE = TextStyle.NORMAL;
    private static final Color DEFAULT_COLOR = Color.BLACK;

    public Font() {
        super(DEFAULT_FONT.getItextValue(), DEFAULT_SIZE, DEFAULT_STYLE.getItextValue(), DEFAULT_COLOR);
    }

    public Font(BaseFont baseFont, float size, TextStyle style, Color color) {
        super(baseFont, DEFAULT_SIZE, style.getItextValue(), color);
    }

    public Font(BaseFont baseFont, float size, int style, Color color) {
        super(baseFont, size, style, color);
    }

    public Font(ItextFont baseFont, float size, int style, Color color) {
        super(baseFont.getItextValue(), size, style, color);
    }

    public Font(ItextFont baseFont, float size, TextStyle style, Color color) {
        super(baseFont.getItextValue(), DEFAULT_SIZE, style.getItextValue(), color);
    }

    public Font(float size) {
        this(DEFAULT_FONT, size, DEFAULT_STYLE, DEFAULT_COLOR);
    }

    public Font(ItextFont baseFont, float size) {
        this(baseFont, size, DEFAULT_STYLE, DEFAULT_COLOR);
    }

    public Font(ItextFont baseFont) {
        this(baseFont, DEFAULT_SIZE, DEFAULT_STYLE, DEFAULT_COLOR);
    }

    public Font with(ItextFont baseFont, float size) {
        return new Font(baseFont, size, getStyle(), getColor());
    }

    public Font with(float size, TextStyle style) {
        return new Font(getBaseFont(), size, style, getColor());
    }

    public Font with(float size) {
        return new Font(getBaseFont(), size, getStyle(), getColor());
    }

    public Font with(TextStyle style) {
        return new Font(getBaseFont(), getSize(), style, getColor());
    }

    public Font with(StyleSize styleSize) {
        return new Font(getBaseFont(), styleSize.getSize(), styleSize.getStyle(), getColor());
    }

    public Font with(Color color) {
        return new Font(getBaseFont(), getSize(), getStyle(), color);
    }

    public enum ItextFont {
        HELVETICA(org.openpdf.text.Font.HELVETICA),
        TIMES_ROMAN(org.openpdf.text.Font.TIMES_ROMAN);

        private final int itextValue;

        ItextFont(int itextValue) {
            this.itextValue = itextValue;
        }

        public int getItextValue() {
            return itextValue;
        }
    }
}

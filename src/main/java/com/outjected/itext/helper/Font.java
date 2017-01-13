package com.outjected.itext.helper;

import java.awt.Color;

/**
 * @author Cody Lerum
 */
public class Font {

    private static ItextFont DEFAULT_FONT = ItextFont.HELVETICA;
    private static float DEFAULT_SIZE = 12;
    private static TextStyle DEFAULT_STYLE = TextStyle.NORMAL;
    private static Color DEFAULT_COLOR = Color.BLACK;

    private final ItextFont baseFont;
    private final float size;
    private final TextStyle style;
    private final Color color;

    public Font() {
        this(DEFAULT_FONT, DEFAULT_SIZE, DEFAULT_STYLE, DEFAULT_COLOR);
    }

    public Font(ItextFont baseFont, float size, TextStyle style, Color color) {
        this.baseFont = baseFont;
        this.size = size;
        this.style = style;
        this.color = color;
    }

    public Font(ItextFont baseFont, float size) {
        this(baseFont, size, DEFAULT_STYLE, DEFAULT_COLOR);
    }

    public Font with(ItextFont baseFont, float size) {
        return new Font(baseFont, size, style, color);
    }

    public Font with(float size, TextStyle style) {
        return new Font(baseFont, size, style, color);

    }

    public Font with(float size) {
        return new Font(baseFont, size, style, color);
    }

    public Font with(TextStyle style) {
        return new Font(baseFont, size, style, color);
    }

    public Font with(StyleSize styleSize) {
        return new Font(baseFont, styleSize.getSize(), styleSize.getStyle(), color);
    }

    public Font with(Color color) {
        return new Font(baseFont, size, style, color);
    }

    public com.lowagie.text.Font get() {
        return new com.lowagie.text.Font(baseFont.getItextValue(), size, style.getItextValue(), color);
    }

    public enum ItextFont {
        HELVETICA(com.lowagie.text.Font.HELVETICA),
        TIMES_ROMAN(com.lowagie.text.Font.TIMES_ROMAN);

        private int itextValue;

        private ItextFont(int itextValue) {
            this.itextValue = itextValue;
        }

        public int getItextValue() {
            return itextValue;
        }
    }

}

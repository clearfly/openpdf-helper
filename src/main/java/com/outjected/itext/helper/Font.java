package com.outjected.itext.helper;

import java.awt.Color;

/**
 * @author Cody Lerum
 */
public class Font {
    private com.lowagie.text.Font font;

    public Font() {
        font = new com.lowagie.text.Font();
    }

    public Font size(float size) {
        font.setSize(size);
        return this;
    }

    public Font style(TextStyle style) {
        font.setStyle(style.getItextValue());
        return this;
    }

    public Font color(Color color) {
        font.setColor(color);
        return this;
    }

    public com.lowagie.text.Font get() {
        return font;
    }
}

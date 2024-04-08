package co.cfly.openpdf.helper;

import com.lowagie.text.Font;

/**
 * @author Cody Lerum
 */
public enum TextStyle {
    NORMAL(Font.NORMAL),
    BOLD(Font.BOLD),
    BOLD_ITALIC(Font.BOLDITALIC),
    ITALIC(Font.ITALIC);

    private final int itextValue;

    private TextStyle(int itextValue) {
        this.itextValue = itextValue;
    }

    public int getItextValue() {
        return itextValue;
    }
}

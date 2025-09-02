package co.cfly.openpdf.helper;

import org.openpdf.text.Element;

/**
 * @author Cody Lerum
 */
public enum VerticalAlignment {
    TOP(Element.ALIGN_TOP),
    MIDDLE(Element.ALIGN_MIDDLE),
    BOTTOM(Element.ALIGN_BOTTOM);

    private final int itextValue;

    VerticalAlignment(int itextValue) {
        this.itextValue = itextValue;
    }

    public int getItextValue() {
        return itextValue;
    }
}

package com.outjected.itext.helper;

import com.lowagie.text.Element;

/**
 * @author Cody Lerum
 */
public enum HorizontalAlignment {
    LEFT(Element.ALIGN_LEFT),
    CENTER(Element.ALIGN_CENTER),
    RIGHT(Element.ALIGN_RIGHT),
    JUSTIFIED(Element.ALIGN_JUSTIFIED);

    private int itextValue;

    private HorizontalAlignment(int itextValue) {
        this.itextValue = itextValue;
    }

    public int getItextValue() {
        return itextValue;
    }
}

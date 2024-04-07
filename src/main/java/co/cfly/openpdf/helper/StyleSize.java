package co.cfly.openpdf.helper;

/**
 * @author Cody Lerum
 */
public enum StyleSize {
    ITALIC5(5, TextStyle.ITALIC),
    NORMAL6(6, TextStyle.NORMAL),
    BOLD6(6, TextStyle.BOLD),
    ITALIC6(6, TextStyle.ITALIC),
    NORMAL7(7, TextStyle.NORMAL),
    BOLD7(7, TextStyle.BOLD),
    NORMAL8(8, TextStyle.NORMAL),
    BOLD8(8, TextStyle.BOLD),
    NORMAL9(9, TextStyle.NORMAL),
    BOLD9(9, TextStyle.BOLD),
    NORMAL10(10, TextStyle.NORMAL),
    BOLD10(10, TextStyle.BOLD),
    ITALIC10(10, TextStyle.ITALIC),
    NORMAL11(11, TextStyle.NORMAL),
    BOLD11(11, TextStyle.BOLD),
    NORMAL12(12, TextStyle.NORMAL),
    BOLD12(12, TextStyle.BOLD),
    NORMAL14(14, TextStyle.NORMAL),
    BOLD14(14, TextStyle.BOLD);

    private final float size;
    private final TextStyle style;

    private StyleSize(float size, TextStyle style) {
        this.size = size;
        this.style = style;
    }

    public float getSize() {
        return size;
    }

    public TextStyle getStyle() {
        return style;
    }
}

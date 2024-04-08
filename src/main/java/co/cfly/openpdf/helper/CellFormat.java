package co.cfly.openpdf.helper;

/**
 * @author Cody Lerum
 */
public class CellFormat {

    private Float padding;
    private Float paddingLeft;
    private Float paddingRight;
    private Float paddingTop;
    private Float paddingBottom;

    private Float border;
    private Float borderLeft;
    private Float borderRight;
    private Float borderTop;
    private Float borderBottom;

    private boolean noWrap;

    private HorizontalAlignment horizontalAlignment = HorizontalAlignment.LEFT;
    private VerticalAlignment verticalAlignment = VerticalAlignment.MIDDLE;

    public CellFormat() {
        this.padding = 5f;
        this.border = 0f;
    }

    public CellFormat(Float padding, Float border) {
        this.padding = padding;
        this.border = border;
    }

    public Float getPadding() {
        return padding;
    }

    public void setPadding(Float padding) {
        this.padding = padding;
    }

    public Float getPaddingLeft() {
        return paddingLeft;
    }

    public void setPaddingLeft(Float paddingLeft) {
        this.paddingLeft = paddingLeft;
    }

    public Float getPaddingRight() {
        return paddingRight;
    }

    public void setPaddingRight(Float paddingRight) {
        this.paddingRight = paddingRight;
    }

    public Float getPaddingTop() {
        return paddingTop;
    }

    public void setPaddingTop(Float paddingTop) {
        this.paddingTop = paddingTop;
    }

    public Float getPaddingBottom() {
        return paddingBottom;
    }

    public void setPaddingBottom(Float paddingBottom) {
        this.paddingBottom = paddingBottom;
    }

    public Float getBorder() {
        return border;
    }

    public void setBorder(Float border) {
        this.border = border;
    }

    public Float getBorderLeft() {
        return borderLeft;
    }

    public void setBorderLeft(Float borderLeft) {
        this.borderLeft = borderLeft;
    }

    public Float getBorderRight() {
        return borderRight;
    }

    public void setBorderRight(Float borderRight) {
        this.borderRight = borderRight;
    }

    public Float getBorderTop() {
        return borderTop;
    }

    public void setBorderTop(Float borderTop) {
        this.borderTop = borderTop;
    }

    public Float getBorderBottom() {
        return borderBottom;
    }

    public void setBorderBottom(Float borderBottom) {
        this.borderBottom = borderBottom;
    }

    public boolean isNoWrap() {
        return noWrap;
    }

    public void setNoWrap(boolean noWrap) {
        this.noWrap = noWrap;
    }

    public HorizontalAlignment getHorizontalAlignment() {
        return horizontalAlignment;
    }

    public void setHorizontalAlignment(HorizontalAlignment horizontalAlignment) {
        this.horizontalAlignment = horizontalAlignment;
    }

    public VerticalAlignment getVerticalAlignment() {
        return verticalAlignment;
    }

    public void setVerticalAlignment(VerticalAlignment verticalAlignment) {
        this.verticalAlignment = verticalAlignment;
    }
}

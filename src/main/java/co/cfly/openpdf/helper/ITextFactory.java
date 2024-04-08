package co.cfly.openpdf.helper;

public class ITextFactory {

    private final Font font;

    public ITextFactory(Font font) {
        this.font = font;
    }

    public Phrase phrase(String content) {
        return new Phrase(font, content);
    }

    public Phrase phrase() {
        return new Phrase(font);
    }

    public Chunk chunk(String string) {
        return new Chunk(string, font);
    }
}

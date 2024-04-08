package co.cfly.openpdf.helper;

/**
 * @author Cody Lerum
 */
public class Anchor extends com.lowagie.text.Anchor {

    public Anchor() {
        super();
    }

    public Anchor(Phrase phrase) {
        super(phrase);
    }

    public Anchor(Chunk chunk) {
        super(chunk);
    }

    public static Anchor instance() {
        return new Anchor();
    }

    public static Anchor instance(Phrase phrase) {
        return new Anchor(phrase);
    }

    public static Anchor instance(Chunk chunk) {
        return new Anchor(chunk);
    }

    public Anchor name(String name) {
        setName(name);
        return this;
    }

    public Anchor docReference(String reference) {
        setReference("#" + reference);
        return this;
    }
}

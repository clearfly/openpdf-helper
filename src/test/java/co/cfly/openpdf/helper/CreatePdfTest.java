package co.cfly.openpdf.helper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.pdf.PdfWriter;
import org.junit.Assert;
import org.junit.Test;

public class CreatePdfTest {

    @Test
    public void create() throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            final Document document = new Document(PageSize.LETTER, 20f, 20f, 20f, 50f);
            PdfWriter writer = PdfWriter.getInstance(document, os);
            writer.setPdfVersion(PdfWriter.VERSION_1_7);
            writer.setFullCompression();
            document.open();

            var p = Paragraph.instance(Phrase.instance("Foo").styleSize(StyleSize.BOLD6));

            Assert.assertEquals("Foo", p.getChunks().getFirst().toString());

            var element = p.getChunks().getFirst();
            Assert.assertEquals(6f, ((com.lowagie.text.Chunk) p.getChunks().getFirst()).getFont().getSize(), 0);
            document.add(p);
            document.add(Table.instance(2).addCell(Cell.instance().add(Paragraph.getInstance("Bar"))));
            document.close();
        }
    }
}

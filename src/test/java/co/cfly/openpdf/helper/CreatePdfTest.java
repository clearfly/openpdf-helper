package co.cfly.openpdf.helper;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import org.junit.Assert;
import org.junit.Test;
import org.openpdf.text.Document;
import org.openpdf.text.PageSize;
import org.openpdf.text.pdf.PdfWriter;

public class CreatePdfTest {

    @Test
    public void create() throws IOException {
        try (ByteArrayOutputStream os = new ByteArrayOutputStream()) {
            final Document document = new Document(PageSize.LETTER, 20f, 20f, 20f, 50f);
            PdfWriter writer = PdfWriter.getInstance(document, os);
            writer.setPdfVersion(PdfWriter.PDF_VERSION_2_0);
            writer.setFullCompression();
            document.open();

            var p = Paragraph.instance(Phrase.instance("Foo").styleSize(StyleSize.BOLD6));

            Assert.assertEquals("Foo", p.getChunks().getFirst().toString());

            var element = p.getChunks().getFirst();
            Assert.assertEquals(6f, ((org.openpdf.text.Chunk) p.getChunks().getFirst()).getFont().getSize(), 0);
            document.add(p);
            document.add(Table.instance(2).addCell(Cell.instance().add(Paragraph.getInstance("Bar"))));
            document.close();
        }
    }
}

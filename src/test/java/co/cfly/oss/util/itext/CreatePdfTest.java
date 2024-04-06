package co.cfly.oss.util.itext;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import com.lowagie.text.Document;
import com.lowagie.text.PageSize;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;
import com.outjected.itext.helper.Cell;
import com.outjected.itext.helper.Table;
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
            document.add(Paragraph.getInstance("Foo"));
            document.add(Table.instance(2).addCell(Cell.instance().add(Paragraph.getInstance("Bar"))).get());
            document.close();
        }
    }
}

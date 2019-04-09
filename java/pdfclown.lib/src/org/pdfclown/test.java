package org.pdfclown;

import org.pdfclown.documents.Document;
import org.pdfclown.documents.Page;
import org.pdfclown.documents.contents.composition.*;
import org.pdfclown.documents.contents.fonts.Font;
import org.pdfclown.objects.Rectangle;

import java.awt.geom.Rectangle2D;
import java.io.FileNotFoundException;

public class test {
    public static void main(String [ ] args) throws FileNotFoundException {
        org.pdfclown.files.File mFile = new org.pdfclown.files.File("/home/jeti/Projects/fndt/ditec/pdf/ecupopc.pdf");
        Document mDocument = mFile.getDocument();


        Font font = Font.get(mDocument, "/home/jeti/Projects/fndt/ditec/ecupopc/src/main/resources/ubuntu/Ubuntu-R.ttf");
        String sampleText = "不窓植治料";
        font.encode(sampleText);

//        String sampleText = "bobor";
//        TextFitter tf = new TextFitter(sampleText, 0.0D, font, 12D, false, '-');
//
//        Integer index = 0; //sampleText.length();
//        Boolean fit = tf.fit(index, 300, true);
//        System.out.println(fit);

//        Rectangle area = new Rectangle(200, 200, 200, 200);
//
//        Page page = mDocument.getPages().get(0);
//        PrimitiveComposer composer = new PrimitiveComposer(page);
//        BlockComposer blockComposer = new BlockComposer(composer);
//        blockComposer.begin(area.toRectangle2D(), XAlignmentEnum.Left, YAlignmentEnum.Top);
//        composer.setFont(font, 12D);
//        blockComposer.showText(sampleText);
//        blockComposer.end();
//        composer.flush();

//        String sampleText2 = "bobor";
//        tf = new TextFitter(sampleText2, 0.0D, font, 12D, false, '-');
//        index = 0; //sampleText2.length();
//        fit = tf.fit(index, 300, true);
//        System.out.println(fit);

    }
}

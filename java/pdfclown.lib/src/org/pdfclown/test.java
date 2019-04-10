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
        org.pdfclown.files.File mFile = new org.pdfclown.files.File("d:\\Projects\\Ditec\\ecupopc.pdf");
        Document mDocument = mFile.getDocument();


        Font font = Font.get(mDocument, "d:\\Projects\\Ditec\\ubuntu-font-family-0.83\\Ubuntu-R.ttf");
        String sampleText1 = "不窓植治料";
        String sampleText2 = "Lorem 不窓植治料";
        String sampleText3 = "Lorem úäňéťžč";
        System.out.println(font.isFullyEncodable(sampleText1));
        System.out.println(font.isFullyEncodable(sampleText2));
        System.out.println(font.isFullyEncodable(sampleText3));

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

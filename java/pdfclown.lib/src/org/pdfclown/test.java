package org.pdfclown;

import org.pdfclown.documents.Document;
import org.pdfclown.documents.contents.composition.TextFitter;
import org.pdfclown.documents.contents.fonts.Font;

import java.io.FileNotFoundException;

public class test {
    public static void main(String [ ] args) throws FileNotFoundException {
        org.pdfclown.files.File mFile = new org.pdfclown.files.File("/home/jeti/Projects/fndt/ditec/pdf/ecupopc.pdf");
        Document mDocument = mFile.getDocument();


        Font font = Font.get(mDocument, "/home/jeti/Projects/fndt/ditec/ecupopc/src/main/resources/ubuntu/Ubuntu-R.ttf");
        String sampleText = "不窓植治料";
        TextFitter tf = new TextFitter(sampleText, 0.0D, font, 12D, false, '-');

        Integer index = 0; //sampleText.length();
        Boolean fit = tf.fit(index, 300, true);
        System.out.println(fit);

//        String sampleText2 = "bobor";
//        tf = new TextFitter(sampleText2, 0.0D, font, 12D, false, '-');
//        index = 0; //sampleText2.length();
//        fit = tf.fit(index, 300, true);
//        System.out.println(fit);

    }
}

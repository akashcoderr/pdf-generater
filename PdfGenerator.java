/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pdfgenerator;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;



/**
 *
 * @author Rajiv Pathak
 */
public class PdfGenerator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        // TODO code application logic here
        Document document=new Document();
        PdfWriter writer=PdfWriter.getInstance(document, new FileOutputStream("akash.pdf"));
        document.open();
        document.add(new Paragraph("Hello I am created in java..:)"));
        document.close();
        writer.close();
        
    }
    
}

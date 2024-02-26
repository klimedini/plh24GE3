/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gr.eap.myteam.plh24ge3.export;


import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.kernel.pdf.PdfDocument; 
import com.itextpdf.kernel.pdf.PdfWriter; 
import com.itextpdf.layout.Document; 
import com.itextpdf.layout.element.Paragraph; 



/**
 *
 * @author alex
 */
public class PdfUtil {
    
    public static void createPdf(){
        try {
       	//Create Document instance.
	String dest = "C:/itextExamples/addingParagraph.pdf";       
      PdfWriter writer = new PdfWriter(dest);           
      
      // Creating a PdfDocument       
      PdfDocument pdf = new PdfDocument(writer);              
      
      // Creating a Document        
      Document document = new Document(pdf);              
      String para1 = "Tutorials Point originated from the idea that there exists a class of readers who respond better to online content and prefer to learn new skills at their own pace from the comforts of their drawing rooms.";  
      
      String para2 = "The journey commenced with a single tutorial on HTML in 2006 and elated by the response it generated, we worked our way to adding fresh tutorials to our repository which now proudly flaunts a wealth of tutorials and allied articles on topics ranging from programming languages to web designing to academics and much more.";              
      
      // Creating Paragraphs       
      Paragraph paragraph1 = new Paragraph(para1);             
      Paragraph paragraph2 = new Paragraph(para2);              
      
      // Adding paragraphs to document       
      document.add(paragraph1);       
      document.add(paragraph2);           
      
      // Closing the document       
      document.close();             
      System.out.println("Paragraph added");    
    } catch (Exception e) {
	e.printStackTrace();
    }
    }
    
}

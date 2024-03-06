package gr.eap.myteam.plh24ge3.export;


import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.border.SolidBorder;

import com.itextpdf.kernel.color.Color; 
import com.itextpdf.kernel.font.PdfFontFactory; 
import com.itextpdf.kernel.font.PdfFont; 
import com.itextpdf.kernel.geom.PageSize;

import com.itextpdf.layout.element.Text;
import com.itextpdf.layout.property.HorizontalAlignment;
import gr.eap.myteam.plh24ge3.models.Searches;

import java.util.ArrayList;
/**
 *
 * @author alex
 */
public class PdfUtil {

    public static void createPdf(ArrayList<Searches> searchesData) {
        try {
            //Create Document instance.
            String dest = "Wheather.pdf";
            PdfWriter writer = new PdfWriter(dest);

            // Creating a PdfDocument       
            PdfDocument pdf = new PdfDocument(writer);

            // Adding a new page 
            pdf.addNewPage(PageSize.A4);

           // Create a TextStamp object
           //TextStamp textStamp = new TextStamp("Header Text");
           //textStamp.setBackground(false);
           //textStamp.setXIndent(100);
           //textStamp.setYIndent(200);
           
            // Creating a Document        
            Document document = new Document(pdf); 
            // Creating text object       
            Text header = new Text("ΔΗΜΟΦΙΛΗΣ ΑΝΑΖΗΤΗΣΕΙΣ ΑΝΑ ΠΟΛΗ");
            header.setHorizontalAlignment(HorizontalAlignment.CENTER);
           
            // Setting font of the text       
            //PdfFont font = PdfFontFactory.createFont(FontConstants.HELVETICA, "CP1253");   
            PdfFont font = PdfFontFactory.createFont("src/main/resources/arial.ttf", "Identity-H", true);
            header.setFont(font);
            
            // Setting font color
            header.setFontColor(Color.BLUE);

           
            // Creating Paragraphs       
            Paragraph paragraph1 = new Paragraph(header);
            Paragraph paragraph2 = new Paragraph();
            
            // Adding header to the paragraph
           // paragraph1.add(header);
            
            // Adding paragraphs to document       
            document.add(paragraph1);


            // Creating an ImageData object       
            //String imageFile = "C:/itextExamples/javafxLogo.jpg";
            //ImageData data = ImageDataFactory.create(imageFile);

            

            float columnWidht[] = {200f,200f};
            Table table = new Table(columnWidht);
           // Table table = new Table(6);
            
            Cell town = new Cell();                        // Creating cell temp
            town.setFont(font);
            town.add("Πόλη");                       // Adding name to temp   
            town.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            town.setBorder(new SolidBorder(Color.BLACK, 3));              // Setting border
            town.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(town);

            
            Cell temp = new Cell();                        // Creating cell temp
            temp.setFont(font);
            temp.add("Αναζητήσεις");                       // Adding name to temp   
            temp.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            temp.setBorder(new SolidBorder(Color.BLACK, 3));              // Setting border
            temp.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(temp);

           
            for (int i = 0; i < searchesData.size(); i++) {
                Searches data = searchesData.get(i);
                
            
            //table.town(new Cell().add.town);
           // town.setBorder(new SolidBorder(Color.BLACK, 3));
            
            
            Cell townCell = new Cell();
            townCell.add(data.getTown());
            townCell.setFont(font);
            townCell.setBorder(new SolidBorder(Color.BLACK, 3));
            townCell.setTextAlignment(TextAlignment.CENTER);
            table.addCell(townCell);

            Cell timesCell = new Cell();
            timesCell.add(String.valueOf(data.getTimesSearched()));
            timesCell.setFont(font);
            timesCell.setBorder(new SolidBorder(Color.BLACK, 3));
            timesCell.setTextAlignment(TextAlignment.CENTER);
            table.addCell(timesCell);
            }
           
            //Cell image = new Cell();
            //image.add(Image.setAutoScale(true));

            
            // Creating an ImageData object       
            //String imFile = "C:/";       
            //ImageData data = ImageDataFactory.create(imFile);              
            
            // Setting the position of the image to the center of the page       
            //image.setFixedPosition();
            
            // Creating an Image object        
            //Image image = new Image(data);                        
      
            // Adding image to the document       
            //document.add(image);              
      
            // Closing the document       
            //document.close();             
      
      
            // Adding Table to document        
            //pdf.add(table);
            document.add(table);
            
            // Save the PDF document
           // pdf.save("wheather.pdf");
            
            document.close();
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Paragraph added successfully");
        System.out.println("Table created successfully");
    
    }

}
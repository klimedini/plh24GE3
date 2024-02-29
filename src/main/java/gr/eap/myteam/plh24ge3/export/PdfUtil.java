package gr.eap.myteam.plh24ge3.export;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;
import com.itextpdf.kernel.pdf.PdfDocument;
import com.itextpdf.kernel.pdf.PdfWriter;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.element.Cell;
import com.itextpdf.layout.element.Table;
import com.itextpdf.layout.property.TextAlignment;
import com.itextpdf.layout.border.Border;
import com.itextpdf.layout.border.SolidBorder;
import com.itextpdf.io.image.ImageData;
import com.itextpdf.io.image.ImageDataFactory;
import com.itextpdf.layout.element.Image;
import com.itextpdf.io.font.FontConstants; 
import com.itextpdf.kernel.color.Color; 
import com.itextpdf.kernel.font.PdfFontFactory; 
import com.itextpdf.kernel.font.PdfFont; 
import com.itextpdf.layout.element.Text;
/**
 *
 * @author alex
 */
public class PdfUtil {

    public static void createPdf() {
        try {
            //Create Document instance.
            String dest = "C:/itextExamples/Wheather.pdf";
            PdfWriter writer = new PdfWriter(dest);

            // Creating a PdfDocument       
            PdfDocument pdf = new PdfDocument(writer);

            // Adding a new page 
            pdf.addNewPage();

           // Create a TextStamp object
           //TextStamp textStamp = new TextStamp("Header Text");
           //textStamp.setBackground(false);
           //textStamp.setXIndent(100);
           //textStamp.setYIndent(200);
           
            // Creating a Document        
            Document document = new Document(pdf); 
           
            // Creating text object       
            Text header = new Text("ΔΗΜΟΦΙΛΗΣ ΑΝΑΖΗΤΗΣΕΙΣ ΑΝΑ ΠΟΛΗ");
           
            // Setting font of the text       
            PdfFont font = PdfFontFactory.createFont(FontConstants.TIMES_BOLD);       
            header.setFont(font);
            
            // Setting font color
            header.setFontColor(Color.BLUE);

           
            // Creating Paragraphs       
            Paragraph paragraph1 = new Paragraph(header);
            Paragraph paragraph2 = new Paragraph();
            
            // Adding header to the paragraph
            paragraph1.add(header);
            
            // Adding paragraphs to document       
            document.add(paragraph1);


            // Creating an ImageData object       
            //String imageFile = "C:/itextExamples/javafxLogo.jpg";
            //ImageData data = ImageDataFactory.create(imageFile);

            

            float columnWidht[] = {100f,100f, 100f, 100f, 100f, 200f};
            Table table = new Table(columnWidht);
            
            Cell town = new Cell();                        // Creating cell temp
            town.add("Πόλη");                       // Adding name to temp   
            town.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            town.setBorder(Border.NO_BORDER);              // Setting border
            town.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(town);
            
            
            Cell temp = new Cell();                        // Creating cell temp
            temp.add("Θερμοκρασία");                       // Adding name to temp   
            temp.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            temp.setBorder(Border.NO_BORDER);              // Setting border
            temp.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(temp);

            Cell hum = new Cell();                        // Creating cell hum
            hum.add("Υγρασία");                            // Adding name to hum   
            hum.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            hum.setBorder(new SolidBorder(Color.BLACK, 3)); // Setting border
            hum.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(hum);                            //Adding c_temp to the table 

            Cell wind = new Cell();                        // Creating cell wind
            wind.add("Ταχ.Ανέμου");                            // Adding name to wind   
            wind.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            wind.setBorder(new SolidBorder(Color.BLACK, 3)); // Setting border
            wind.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(wind);                            //Adding c_temp to the table

            Cell UV = new Cell();                        // Creating cell UV
            UV.add("Δείκτης UV");                            // Adding name to UV   
            UV.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            UV.setBorder(new SolidBorder(Color.BLACK, 3)); // Setting border
            UV.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(UV);                            //Adding c_temp to the table

            Cell wDesc = new Cell();                            // Creating cell wDesk
            wDesc.add("Λεκτική Πρόγνωση Καιρού");            // Adding name to wdesk   
            wDesc.setBackgroundColor(Color.LIGHT_GRAY);      // Setting background color
            wDesc.setBorder(new SolidBorder(Color.BLACK, 3)); // Setting border
            wDesc.setTextAlignment(TextAlignment.CENTER);   // Setting text alignment      
            table.addCell(wDesc);
            
            
            //table.town(new Cell().add.town);
            town.setBorder(new SolidBorder(Color.BLACK, 3));
            town.setTextAlignment(TextAlignment.CENTER);
            
            Cell tempValue = new Cell();
            //table.addtempValue(new Cell().add.temperature);
            tempValue.setBorder(new SolidBorder(Color.BLACK, 3));
            tempValue.setTextAlignment(TextAlignment.CENTER);

            Cell humValue = new Cell();
            //table.addhumValue(new Cell().add.humidity);
            humValue.setBorder(new SolidBorder(Color.BLACK, 3));
            humValue.setTextAlignment(TextAlignment.CENTER);

            Cell windValue = new Cell();
           // table.addhumValue(new Cell().add.windspeedKmph);
            windValue.setBorder(new SolidBorder(Color.BLACK, 3));
            windValue.setTextAlignment(TextAlignment.CENTER);

            Cell UVValue = new Cell();
            //table.addUV(new Cell().add.uvIndex);
            UVValue.setBorder(new SolidBorder(Color.BLACK, 3));
            UVValue.setTextAlignment(TextAlignment.CENTER);

            Cell wDescValue = new Cell();
            //table.addwDesc(new Cell().add.weatherDesc);
            wDescValue.setBorder(new SolidBorder(Color.BLACK, 3));
            wDescValue.setTextAlignment(TextAlignment.CENTER);

            Cell image = new Cell();
            //image.add(Image.setAutoScale(true));

            
            // Creating an ImageData object       
            //String imFile = "C:/";       
            //ImageData data = ImageDataFactory.create(imFile);              
            
            // Setting the position of the image to the center of the page       
            //image.setFixedPosition();
            
            // Creating an Image object        
            //Image image = new Image(data);                        
      
            // Adding image to the document       
            document.add(image);              
      
            // Closing the document       
            document.close();             
      
      
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
package lab10;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.util.*;

public class flashcardreader {
    ArrayList<Double> cards;

    public flashcardreader() {
        cards = new ArrayList<Double>();
        try {
            FileInputStream fis = new FileInputStream("questions.txt");
            Scanner fin = new Scanner(fis);
            BufferedReader br = new BufferedReader(new InputStreamReader(fis));
            String Line;

            while((Line = br.readLine())!= null) cards.add(Double.parseDouble(Line));

        } catch(FileNotFoundException fne) {
			textAreaOut.setText("shapes.txt file Not Found");}
        
        catch(Exception e){
            System.out.println(e);
        }

     }
}
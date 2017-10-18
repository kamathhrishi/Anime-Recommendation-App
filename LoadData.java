package animerec1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LoadData {
    
    ArrayList<String[]> Data=new ArrayList<String[]>();
    
    public LoadData(String filepath)
    {
        
    //Load Data from CSV files and return as a 2D array representing corresponding rows and columns of data\\
     
        String line;
        
        try{
            
            FileReader filereader=new FileReader(filepath);
            BufferedReader bufferedreader = new BufferedReader(filereader);
            
            while((line=bufferedreader.readLine())!=null)
            {
                
                ProcessData Pd=new ProcessData();
                String [] Array=line.split(",");
                Data.add(Array);
                
            }
            
            bufferedreader.close();
            
            
        }
        catch(FileNotFoundException ex)
        {
            
            System.out.println("File path: "+filepath+" not found");
            
        }
        catch(IOException io)
        {
            
            System.out.printf(io.getLocalizedMessage());
            
        }
        
        
    }
    
    public ArrayList<String[]> GetData()
    {
        //Returns the corresponding array obtained from the CSV file\\ 
        return Data;
        
    }
    
    
}

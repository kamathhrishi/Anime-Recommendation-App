package animerec1;

import java.awt.Color;
import java.util.ArrayList;
import java.util.HashMap;

public class AnimeRec1 {


    public static void main(String[] args)
    {
     
        LoadData Anime_Loader = new LoadData("C:\\Users\\hrish_000\\Documents\\NetBeansProjects\\AnimeRec1\\src\\animerec1\\anime.txt");
        ArrayList<String[]> Anime=Anime_Loader.GetData();
        
        ProcessData PD=new ProcessData();
        
        Anime.remove(0);
        
        
        HashMap<Integer,String> Corpora=PD.CorporaIndex(Anime);
        
        LoadData Rating_Loader = new LoadData("C:\\Users\\hrish_000\\Documents\\NetBeansProjects\\AnimeRec1\\src\\animerec1\\rating.txt");     
        ArrayList<String[]> Ratings=Rating_Loader.GetData();
        Ratings.remove(0);
        
        ProcessData Processor=new ProcessData();
        
        HashMap<Integer,HashMap<String,Integer>> Vector=PD.Vectorize(Corpora, Ratings);
        
        App Win = new App(PD.GetAnimeNames(),Vector);
        Win.setSize(800,800);
        Win.setResizable(false);
        Win.setBackground(Color.BLUE);
        Win.setVisible(true);
        
    }
}

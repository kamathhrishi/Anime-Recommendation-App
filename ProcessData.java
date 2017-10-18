package animerec1;

import java.util.ArrayList;
import java.util.HashMap;

public class ProcessData {
    
    
    HashMap<String,String[]> Anime = new HashMap<>();
    String [] AnimeNames;
    
    
   public ArrayList<String[]> CombineData(ArrayList<String[]> Data1,ArrayList<String[]> Data2)
   {
       
       return Data1;
       
   }
    
   public HashMap<Integer,HashMap<String,Integer>> Vectorize(HashMap<Integer,String> Corpora,ArrayList<String[]> Ratings)
   {
       
       HashMap<Integer,HashMap<String,Integer>> Vector=new HashMap();
       int UserID=0;
       
       HashMap<String,Integer> VectorSpace=new HashMap();
       
       for(String [] Rating:Ratings)
       {
           
        if(UserID<5000)
        {
           if(UserID==0)
           {
               
               UserID=Integer.valueOf(Rating[0]);
               
           }
           else{
               
               
               if(Integer.valueOf(Rating[0])!=UserID)
               {
                   
                      Vector.put(UserID, VectorSpace);
                      VectorSpace=new HashMap();
                      UserID=Integer.valueOf(Rating[0]);
                      VectorSpace.put(Corpora.get(Integer.valueOf(Rating[1])),Integer.valueOf(Rating[2]));
                     
               }
               else
               {
                   
                   if(Integer.valueOf(Rating[2])!=-1)
                   {
                        
                        VectorSpace.put(Corpora.get(Integer.valueOf(Rating[1])),Integer.valueOf(Rating[2]));
                   
                   }
               }
               
           }
           
       }
       }
       
       return Vector;
       
   }
   
   public HashMap<Integer,String> CorporaIndex(ArrayList<String[]> AnimeData)
   {

      AnimeNames=new String[AnimeData.size()+1];
      AnimeNames[0]="Choose";
      HashMap<Integer,String> Corpora=new HashMap<>();
      int Index=1;
       
       for(String[] anime:AnimeData)
       {
           Corpora.put(Integer.valueOf(anime[0]), anime[1]);
           AnimeNames[Index]=anime[1];
           Index+=1;
           
       }
       
       return Corpora;
       
   }
   
   public String[] GetAnimeNames()
   {
       
       return AnimeNames;
       
   }
   
   public String [] GetVariable(ArrayList<String[]> Animes,int Value)
   {
       
       String [] Variables = new String[Animes.size()];
       HashMap<String,Integer> Variable = new HashMap<>();
       
       for(int i=0;i<Animes.size();i++)
       {
      
           if(!Variable.containsKey(Animes.get(i)[Value]))
           {
               
               Variable.put(Animes.get(i)[Value], i);
               
           }
           
        }
       
       for(String Key:Variable.keySet())
       {
           
           Variables[Variables.length]=Key;
           
       }
       
       return Variables;
       
       
   }
   
   public void AnimeType(ArrayList<String[]>Anime,ArrayList<String[]> Rec)
   {
 
       for(int i=0;i<Anime.size();i++)
       {
           
           System.out.println(Anime.get(i));
           
       }
       
    
       
   }
   
   
   
}

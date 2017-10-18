package animerec1;

import java.util.ArrayList;
import java.util.HashMap;

public class RecSystem {
       
    
    public float[] EuclideanDistance (HashMap<Integer,HashMap<String,Integer>> Vector,int [] Ratings , String [] Anime)
    {
        
        float [] Scores=new float[Vector.size()];
        int Index=0;
        
        for(int Key:Vector.keySet())
        {
            
            for(int i=0;i<Anime.length;i++)
            {
                HashMap<String,Integer> Temp=Vector.get(Key);
                
                if(Ratings[i]!=-1 && Temp.containsKey(Anime[i]))
                {
                    
                    Scores[Index]+=(Ratings[i]-Vector.get(Key).get(Anime[i]))^(2);
                    
                }

            } 

            Index+=1;
            
            
        }        
        
        return Scores;
        
    }
    
    public int[] SimilarUsers(float [] Scores)
    {
        int [] UserID=new int[Scores.length];
        
        for(int i=0;i<Scores.length;i++)
        {
            
            UserID[i]=i+1;
            
        }
       
        for(int i=0;i<10;i++)
        {
            for(int j=0;j<Scores.length;j++)
            {
                
                if(Scores[i]>Scores[j])
                {
                    
                    float Temp1=Scores[j];
                    int Temp2=UserID[j];
                    
                    Scores[j]=Scores[i];
                    UserID[j]=UserID[i];
                    
                    Scores[i]=Temp1;
                    UserID[i]=Temp2;
                    
                    
                }
               
                
            }   
        }
        
        int [] Top_UserID=new int[10];
        
        for(int i=0;i<10;i++)
        {
            
            Top_UserID[i]=UserID[i];
            
            
        }
        
        return Top_UserID;
        
    }
    
    public ArrayList<String> Recommond(HashMap<Integer,HashMap<String,Integer>> Vector,int [] UserID,String [] Animes)
    {
        
        ArrayList<String> Suggestions=new ArrayList<>();
        
        for(int i=0;i<UserID.length;i++)
        {
           HashMap<String,Integer> Temp=Vector.get(UserID[i]);
           for(String Anime:Temp.keySet())
           {
               boolean Found=false;
               for(int j=0;j<Animes.length;j++)
               {
                   if(Animes[j]==Anime)
                   {
                       
                       Found=true;
                       
                       
                   }
               }
               if(Found!=true &&(Temp.get(Anime)>7))
               {
                   
                      System.out.println(Anime);
                      Suggestions.add(Anime);
                   
               }
           }
          
        }
        
        return Suggestions;
        
        
    }
    
    
}

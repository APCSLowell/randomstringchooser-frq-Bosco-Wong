import java.util.*;
public class RandomStringChooser
{
 private ArrayList <String> w;
public RandomStringChooser(String[] b){
  w = new ArrayList <String>();
  for(int x = 0; x < b.length; x++)
    w.add(b[x]);
    
}
  public String getNext(){
  if(w.size() > 0){
    String temp = "";
    int random = (int)(Math.random()*w.size());
    temp = w.get(random);
    w.remove(random);
    return temp;
  }
    
   return "NONE";
    
      
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}

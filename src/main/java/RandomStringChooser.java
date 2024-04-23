import java.util.*;
public class RandomStringChooser
{
 private ArrayList <String> w;
public RandomString Chooser(String[] b){
  w = new ArrayList <String>();
  for(int x = 0; x < b.length; x++)
    w.add(b[x]);
    
}
  public void getNext(int a, int[]b){
  if(words.length > 0){
    String temp = "";
    int random = (int)(Math.random*w.size());
    temp = w.get(random);
    w.remove(random);
    return temp;
  }
    
   return "NONE";
    
      
  }
  //Heads up! 
  //You will get a very confusing error message until you have working code in part b as well
}

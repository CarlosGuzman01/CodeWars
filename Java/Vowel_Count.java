//version 1

public class Vowels {

  public static int getCount(String str) {
    
    int counter = 0;
    int numberOfVowels = 0;
    
     while(counter < str.length()){
       
       if(str.charAt(counter) == 'a' || str.charAt(counter) == 'e' || str.charAt(counter) == 'i' || str.charAt(counter) == 'o' || str.charAt(counter) =='u'){
                numberOfVowels++;
            }
            
            counter++;
        }

    
    
    
    return numberOfVowels;
  }

}
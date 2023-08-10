
//version 1

public class Kata {
    public static long filterString(final String value) {
      
        int i = 0;
        char character;
        String temp = "";
        long result;


        while(i < value.length()){
            
            character = value.charAt(i);
            if(Character.isDigit(character)){
                temp = temp + character;
            }
            
            i++;
        }

        result = Long.parseLong(temp);

      return result;
      

    }
}
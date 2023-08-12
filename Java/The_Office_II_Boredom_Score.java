public class TheOffice {
  public static String boredom(Person[] staff) {
    
    
    int i = 0;
    int score = 0;
    
     while(i < staff.length){

        if(staff[i].department.equals("finance")){
            score = score + 2;
        
        } else if(staff[i].department.equals("accounts")){
            score = score + 1;
        
        }else if(staff[i].department.equals("regulation")){
            score = score + 3;
        
        }else if(staff[i].department.equals("canteen")){
          score = score + 10;
          
        }else if(staff[i].department.equals("trading")){
          score = score + 6;
        
        }else if(staff[i].department.equals("change")){
          score = score + 6;
          
        }else if(staff[i].department.equals("IS")){
          score = score + 8;
        
        }else if(staff[i].department.equals("retail")){
          score = score + 5;
        
        }else if(staff[i].department.equals("cleaning")){
          score = score + 4;
        
        }else if(staff[i].department.equals("pissing about")){
          score = score + 25;
        }
       

       
       
      
        i++;
    
     }
    
    if(score >= 100){
      return "party time!!";
    }else if(score > 80 && score < 100){
      return "i can handle this";
    
    }else{
      return "kill me now";
    }
    
    
    
    
    
  }
}
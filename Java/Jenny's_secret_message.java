//version 1

package Java;
public class Greeter {
  public static String greet(String name) {
    
   
    
    if(name.equals("Johnny")){
      return "Hello, my love!";
    }
    
    return String.format("Hello, %s!", name);
    
  }
}
import java.time.format.DateTimeFormatter;  
import java.time.LocalDateTime;
    
public class Ans10{    
  public static void main(String[] args) {    
   DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yy HH:mm:ss");  
   LocalDateTime n = LocalDateTime.now(); 
   
   System.out.println(dtf.format(n));  
  }    
}  
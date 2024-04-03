public class Main {
  public static void main(String[] args) {
    
    
    int temperature = -5; 

    if (temperature > 30) {
        System.out.println("It's hot outside.");
    } else if (temperature >= 20 && temperature <= 30) {
        System.out.println("It's a pleasant day.");
    } else if (temperature < 20 && temperature >= 10) {
        System.out.println("It's a bit cool.");
    } else {
        System.out.println("It's cold outside.");
    }
    
  }

  
}

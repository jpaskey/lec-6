
public class Terminal {

  /* Constants for color codes */
  public static final String RESET = "\u001B[0m";
  public static final String BLACK = "\u001B[30m";
  public static final String RED = "\u001B[31m";
  public static final String GREEN = "\u001B[32m";
  public static final String YELLOW = "\u001B[33m";
  public static final String BLUE = "\u001B[34m";
  public static final String PURPLE = "\u001B[35m";
  public static final String CYAN = "\u001B[36m";
  public static final String WHITE = "\u001B[37m";

  public Terminal() {}
  
  public void print(Car car1, Car car2) {
    // print the screen
    for(int i=0; i < 100; i++) {
      if(i == car1.locate()) {
        System.out.print(car1.color() + car1.icon()); 
        if(car1.locate() == car2.locate()) {
          System.out.print(RESET + "\n                                             XXXXXXXXXX\n                                             COLLISION!\n");
          System.exit(0);
        }
      }
      if(i == car2.locate()) {
        System.out.print(car2.color() + car2.icon());
      }
      else {
        System.out.print(" ");
      }
    }
    System.out.print(RESET + "\n");
  }

}
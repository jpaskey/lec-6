
public class RaceTrack {
	  
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
  
  /* Helper function to sleep for X milliseconds */
  private static void sleep(int time_ms){
    try {
      Thread.sleep(time_ms);
    } catch (Exception e) {
       System.out.println(e);
    }
  }
		
	public static void main(String[] args) {
    int pos = 30; 

    System.out.println(BLUE + "\n\nPress ctrl-c to quit...." + RESET);
    sleep(2000);
    
    while(true) {     
      // move the race car left or right
      // random returns a double from 0 to 1
      if(Math.random() > 0.5) {
        pos++;
      } else {
        pos--;
      }
      // print the screen
      for(int i=0; i < 100; i++) {
        if(i == pos) {
          System.out.print(RED + "V");          
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.print(RESET + "\n");
      sleep(30);
    }
  }
}

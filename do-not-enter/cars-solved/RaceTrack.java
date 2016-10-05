import java.util.Random;



public class RaceTrack {
	
  public static final int WIDTH = 100;
  
  /* Helper function to sleep for X milliseconds */
  private static void sleep(int time_ms){
    try {
      Thread.sleep(time_ms);
    } catch (Exception e) {
       System.out.println(e);
    }
  }
		
	public static void main(String[] args) {

    Car car = new Car();
    
    while(true) {     
      car.move();
      for(int i=0; i < WIDTH; i++) {
        if(car.isAt(i)) {
          car.draw();      
        }
        else {
          System.out.print(" ");
        }
      }
      System.out.print(Terminal.RESET + "\n");
      sleep(30);
    }
  }
}

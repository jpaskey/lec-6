
public class RaceTrack {
	  
  /* Helper function to sleep for X milliseconds */
  private static void sleep(int time_ms){
    try {
      Thread.sleep(time_ms);
    } catch (Exception e) {
       System.out.println(e);
    }
  }
		
	public static void main(String[] args) {
		
		Terminal track = new Terminal();
		//create a new car that is a red V at position 30
		Car car1 = new Car(30, track.RED, "V");
		Car car2 = new Car(50, track.PURPLE, "Y");
    
		System.out.println(track.BLUE + "\n\nPress ctrl-c to quit...." + track.RESET);
    sleep(2000);
		
    while(true) {   
			//randomly move the car's position
      car1.move();
			car2.move();
      track.print(car1, car2);
      sleep(30);
    }
  }
}

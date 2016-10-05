
public class Car {
  private int pos;
  
  public Car(){
    pos = (int) (Math.random() * RaceTrack.WIDTH);
  }
  
  public void move() {
    if(Math.random() > 0.5) {
      pos++;
    } else {
      pos--;
    }
    pos = Math.max(pos, 0);
    pos = Math.min(pos, RaceTrack.WIDTH);
  }
  
  public boolean isAt(int x) {
    if (x == pos) {
      return true;
    }
    else {
      return false;
    }
  }
  
  public void draw() {
    System.out.print(Terminal.RED + "V");
  }
  
}
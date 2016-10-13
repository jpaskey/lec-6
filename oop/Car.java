
public class Car {
  int pos;
  String color;
  String icon;
  
  public Car() {}
  
  public Car(int pos, String color, String icon) {
    this.pos=pos;
    this.color=color;
    this.icon=icon;
  }
  
  public void move() {
    // move the race car left or right
    // random returns a double from 0 to 1
    if(Math.random() > 0.5) {
        if(pos!=100) this.pos++;
      } else {
        if(pos!=0) this.pos--;
      }
  }
  
  public int locate() {
    return this.pos;
  }
  
  public String color() {
    return this.color;
  }
  
  public String icon() {
    return this.icon;
  }
  
}
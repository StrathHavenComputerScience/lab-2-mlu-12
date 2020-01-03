public class Lab2
{
  public static void cleanSquare()
  {
    Robot.load("square.txt");
    Robot.setDelay(0.1);
    cleanLine();
    Robot.turnLeft();
    cleanLine();
    Robot.turnLeft();
    cleanLine();
    Robot.turnLeft();
    cleanLine();
  }
  
  public static void cleanLine()
  {
     //precondition: Robot is facing a line of dirty squares
     //postcondition: Robot is on a clean square, having just cleaned a line of dirty squares
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
     Robot.makeLight();
     Robot.move();
    }
    
  public static void darkenComb()
  {
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
  }
  
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    //INSERT CODE HERE
  }
  
}

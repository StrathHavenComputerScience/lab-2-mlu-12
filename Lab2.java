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
     cleanSmallSquare();
     cleanSmallSquare();
     cleanSmallSquare();
     cleanSmallSquare();
     cleanSmallSquare();
     Robot.move();
    }
  
  public static void cleanSmallSquare()
  {
     //precondition: Robot is standing before a dirty square
     //postcondition: Robot is standing on the previously dirty square, now clean
     Robot.move();
     Robot.makeLight();
    }
    
  public static void darkenComb()
  { 
    Robot.load("comb.txt");
    Robot.setDelay(0.05);
    
    darkenSection();
    darkenSection();
    darkenSection();
    darkenSection();
    Robot.makeDark();
    darkenLine();
  }
  
  public static void darkenSection()
  {
     //precondition: Robot is standing before two clean squares in front and a line of clean squares to its right
     //postcondition: Robot has darkened the entire line to its right as well as two squares of the left vertical line
     darkenLine();
     returnOriginal();
     Robot.makeDark();
     darkenSmallSquare();
     Robot.move();
    }
    
  public static void returnOriginal()
  {
     //precondition: Robot has just darkened a line of squares, is at the end of the line
     //postcondition: Robot has returned to the beginning of the line
     Robot.turnLeft();
     Robot.turnLeft();
     Robot.move();
     Robot.move();
     Robot.move();
     Robot.move();
     Robot.move();
     Robot.move();
     turnRight();
    }
    
  public static void darkenLine()
  {
     //precondition: Robot has a line of clean squares to its right
     //postcondition: Robot is at the end of the line, just having darkened the previously clear line of squares
     turnRight();
     darkenSmallSquare();
     darkenSmallSquare();
     darkenSmallSquare();
     darkenSmallSquare();
     darkenSmallSquare();
     darkenSmallSquare();
    }
    
  public static void darkenSmallSquare()
  {
     //precondition: Robot is standing before a clean square
     //postcondition: Robot is standing on a dirty square, previously clean
     Robot.move();
     Robot.makeDark();
    }
  
  public static void turnRight()
  {
      //precondition: Robot is facing some preset direction
      //postcondition: Robot is facing a new direction, 90 degrees clockwise from its previous direction
      Robot.turnLeft();
      Robot.turnLeft();
      Robot.turnLeft();
    }
    
  public static void makeCheckered()
  {
    Robot.load("blank.txt");
    Robot.setDelay(0.05);
    
    checker2Lines();
    checker2Lines();
    checker2Lines();
    checkerLine();
    turnRight();
    Robot.move();
    turnRight();
    checkerLine();
  }
  
  public static void checker2Lines()
  {
     //precondition: Robot is standing in a line of clean squares, with a line of clean squares to its right
     //postcondition: Robot has moved over two vertical lines, having checkered the two lines to its left
     checkerLine();
     turnRight();
     Robot.move();
     turnRight();
     checkerLine();
     Robot.turnLeft();
     Robot.move();
     Robot.turnLeft();
    }
  
  public static void checkerLine()
  {
     //precondition: Robot is standing on a line of completely clean squares
     //postcondition: Robot has just checkered the line of clean squares
     checkerPattern();
     checkerPattern();
     checkerPattern();
     Robot.makeDark();
     Robot.move();
    }
    
  public static void checkerPattern()
  {
     //precondition: Robot is standing on a clean square
     //postcondition: Robot is standing on a clean square, after darkening 
     Robot.makeDark();
     Robot.move();
     Robot.move();
    }
    
}

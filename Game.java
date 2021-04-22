import java.util.Scanner;


public class Game {
    // the scanner object that we need
    Scanner sc = new Scanner(System.in);
    // use if you plan to have a game loop
    private boolean gameRunning = true;

    
    public static void main(String[] args) {
	// this is where the program starts
	Game myGame = new Game();
	myGame.run();
    }
    
    public void run() {
	/*
	  while (gameRunning) {
	      // do a bunch of stuff
	      if (playAgain == false) {
	          break; // or gameRunning = false;
	      }
	  }
	 */
	printBoard();
	System.out.println("You run into the woods and see a snake.");
	if (promptUser("Do you (a) run away or (b) eat it?", "b")) {
	    doSomething();
	}
    }

    private void doSomething() {
	System.out.println("Do whatever you want");
    }

    public void printBoard() {
	// this is an example of printing a tic tac toe
	System.out.println("   |   |   ");
	System.out.println("   |   |   ");
	System.out.println("   |   |   ");
	System.out.println("-----------");
	System.out.println("   |   |   ");
	System.out.println("   |   |   ");
	System.out.println("   |   |   ");
	System.out.println("-----------");
	System.out.println("   |   |   ");
	System.out.println("   |   |   ");
	System.out.println("   |   |   ");	
    }
    
    private boolean promptUser(String text, String answer) {
	System.out.print(text + "    ");
	String userInput = sc.next();
	if (userInput == answer) {
	    return true;
	} else {
	    return false;
	}
    }
    
    private void playAgain() {
	/*
	   1. get userInput
	   2. if input equals "y" play again
	   3. otherwise quit the game
	*/
    }
}

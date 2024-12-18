package GettingStarted;

import com.phidget22.*;

public class TugOfWar {
	  public static void main(String[] args) throws Exception{

	      //Create | Create objects for your buttons and LEDs.
	      DigitalInput redButton = new DigitalInput();
	      DigitalOutput redLED = new DigitalOutput();
	      DigitalInput greenButton = new DigitalInput();
	      DigitalOutput greenLED = new DigitalOutput();

	      //Address | Address your four objects which lets your program know where to find them.
	      redButton.setHubPort(0);
	      redButton.setIsHubPortDevice(true);
	      redLED.setHubPort(1);
	      redLED.setIsHubPortDevice(true);
	      greenButton.setHubPort(5);
	      greenButton.setIsHubPortDevice(true);
	      greenLED.setHubPort(4);
	      greenLED.setIsHubPortDevice(true);

	      //Open | Connect your program to your physical devices.
	      redButton.open(1000);
	      redLED.open(1000);
	      greenButton.open(1000);
	      greenLED.open(1000);
	      int presses1 = 0;
	      int presses2 = 0;
	      int pressed1 = 0;
	      int pressed2 = 0;
	      //Use your Phidgets | This code will turn on the LED when the matching button is pressed and turns off the LED when the matching button is released. The sleep function slows down the loop so the button state is only checked every 150ms.
	      while(true){
	    	  
	          if( greenButton.getState()){
	        	  if (pressed1 == presses1) {
	        		  presses1++;
	            	  System.out.println("Green Presses: " +presses1);
	            	  greenLED.setState(true); 
	        	  }
	        	  
	        	  
	          } else {
	        	  if (greenButton.getState() == false) {
	        		  greenLED.setState(false);
	                  pressed1 = presses1;
	        	  }
	          }

	          if(redButton.getState()){
	        	  if (pressed2 == presses2) {
	        		  presses2++;
	            	  System.out.println("Red Presses: " + presses2);
	            	  redLED.setState(true); 
	        	  }
	          } else {
	        	  
	        		  redLED.setState(false);
	                  pressed2 = presses2;
	          }
	          if (presses1 >= 10) {
	        	  System.out.println("Green Wins");
	        	  System. exit(0);
	          }
	          if (presses2 >= 10) {
	        	  System.out.println("Red Wins");
	        	  System. exit(0);
	          }
	          Thread.sleep(10);
	      }
	  }
	
}

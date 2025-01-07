package GettingStarted;
import com.phidget22.*;
public class ButtonLEDEvents {

	//Add Phidgets Library


	    //Turn on/off LEDs with Global Variables
	    static boolean turnRedLEDOn = false;
	    static boolean turnGreenLEDOn = false;
	    static int greenpress = 0;
	    static int redpress = 0;
        static int greenpress1 = 0;
        static int redpress1 = 0;

	    //Handle Exceptions
	    public static void main(String[] args) throws Exception {

	        //Create
	        DigitalInput redButton = new DigitalInput();
	        DigitalInput greenButton = new DigitalInput();
	        DigitalOutput redLED = new DigitalOutput();
	        DigitalOutput greenLED = new DigitalOutput();

	        //Address
	        redButton.setHubPort(5);
	        redButton.setIsHubPortDevice(true);
	        greenButton.setHubPort(0);
	        greenButton.setIsHubPortDevice(true);
	        redLED.setHubPort(4);
	        redLED.setIsHubPortDevice(true);
	        greenLED.setHubPort(1);
	        greenLED.setIsHubPortDevice(true);
	        


	        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. The code will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
	        redButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                //Record button state to turn on/off the red LED
	            	turnGreenLEDOn = e.getState();
	            	if (greenpress == greenpress1) {	 
	                System.out.println("Green score: " +greenpress);
	                greenpress++;
	            	} else {
	            		greenpress1 = greenpress;
	            	}
	                
	            }
	        });

	        //Event | Event code runs when data input from the sensor changes. The following event is a state change event. It will listen to the button (Digital Input Object) and only run the contain code when the button is pressed or released (state changes).
	        greenButton.addStateChangeListener(new DigitalInputStateChangeListener() {
	            public void onStateChange(DigitalInputStateChangeEvent e) {
	                //Record button state to turn on/off the green LED	   
         		   turnRedLEDOn = e.getState();
	            	if (redpress == redpress1) {
	            	
	                System.out.println("Red score: " + redpress);
	                redpress++;
	            	} else {
	            		redpress1 = redpress;
	            	}
	            	
	            }
	        });

	        //Open
	        redLED.open(1000);
	        greenLED.open(1000);
	        redButton.open(1000);
	        greenButton.open(1000);

	        //Use your Phidgets | In the button events you recorded the Button State. Here we will use that data to turn on/off the LEDs
	        while(true) {
	            //turn red LED on based on red button input
	            redLED.setState(turnRedLEDOn);
	            //turn green LED on based on green button input
	            greenLED.setState(turnGreenLEDOn);
	            //sleep for 150 milliseconds 
	            Thread.sleep(10);
	            if (redpress >= 10) {
	            	greenLED.setState(turnGreenLEDOn);
	            	redLED.setState(turnRedLEDOn);
		        	  System.out.println("Red Wins");
		        	  System. exit(0);
	            } else if (greenpress >= 10) {
	            	greenLED.setState(turnGreenLEDOn = true);
	            	redLED.setState(turnRedLEDOn = true);
		        	  System.out.println("Green Wins");
		        	  System. exit(0);
	            }
	        }
	    }
	}
	  

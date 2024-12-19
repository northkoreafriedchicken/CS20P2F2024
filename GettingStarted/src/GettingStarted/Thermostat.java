package GettingStarted;

import com.phidget22.DigitalInput;
import com.phidget22.DigitalOutput;
import com.phidget22.TemperatureSensor;

public class Thermostat {
	

	  public static void main(String[] args) throws Exception{
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
	      //Create | Here you have created a TemperatureSensor object. TemperatureSensor is a class in your Phidgets library that gathers temperature data from your Phidget. 
	      TemperatureSensor temperatureSensor = new TemperatureSensor();

	      //Open | Open establishes a connection between your object and your physical Phidget. You provide a timeout value of 1000  to give the program 1000 milliseconds (1 second) to locate your Phidget. If your Phidget can't be found, an exception will be thrown.
	      temperatureSensor.open(1000);
	      int settemp = 21;
	      int seconds = 0;
	      int pressed = settemp;
	      //Use your Phidgets | This code will print the temperature every 150ms
	      while (true) {
	    	  if (seconds >= 100) {
	    		  System.out.println("Temperature: " + temperatureSensor.getTemperature() + " °C" );
		    	  System.out.println("Set temputure is " + settemp);
	    		  seconds = 0;
	    	  }
	    	  
	    	  if (temperatureSensor.getTemperature() >= (settemp - 2) && temperatureSensor.getTemperature() <= (settemp + 2)){
	    		  redLED.setState(false);
	    		  greenLED.setState(true);
	          
	      } else {
	    	  greenLED.setState(false);
	    	  redLED.setState(true);
	      }
	    	  
	          if( greenButton.getState()){
	        	  if (pressed == settemp) {
	        		  settemp++;
	        	  }  
	          } else {
	        	  if (greenButton.getState() == false) {
	                  pressed = settemp;
	        	  }
	          }

	          if(redButton.getState()){
	        	  if (pressed == settemp) {
	        		  settemp--;
	        	  }
	          } else {
	                  pressed = settemp;
	          }
	          Thread.sleep(100);
	          seconds++;
	  }
	}
}

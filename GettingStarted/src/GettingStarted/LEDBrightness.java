package GettingStarted;


//Add Phidgets Library 
import com.phidget22.*;

public class LEDBrightness {
  //Handle Exceptions 
  public static void main(String[] args) throws Exception{

      //Create 
      DigitalOutput redLED = new DigitalOutput();

      //Address 
      redLED.setHubPort(1);
      redLED.setIsHubPortDevice(true);

      //Open 
      redLED.open(1000);
      double i = 0;
      boolean rev = false;
      //Use your Phidgets with Duty Cycle | Duty Cycle controls the power to your Phidget (Digital Output object). Duty Cycle values range from 0.0 - 1.0.
      while(true) {
    	  if (rev == false){
    		  i++;
    	  } else if (i > 0){
    		  i--;
    	  } else {
    		  System. exit(0);
      }
    	  if (i >= 10) {
    		  rev = true;
    	  }
    	  double d = i / 10;
          redLED.setDutyCycle(d);
          Thread.sleep(100);
      }

  }
}


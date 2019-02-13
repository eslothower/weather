import java.util.Arrays;

public class weatherConditionals{
        
    public static String bellringerStatement = "";
        
    public static String getWeatherAdvice(int temperature, String description){
                
            //return "It's " + temperature + " degrees " + "with " + description + "."; 
            //boolean windy = false;  //this boolean seems uneccessary
                
            if ((description.toLowerCase().contains("windy") || description.toLowerCase().contains("snow"))&& temperature <= 32){
                    
                //windy = true;
                return "Too windy or cold! Enjoy watching the weather through the window.";
                    
            } else if (description.toLowerCase().contains("sunny") && temperature == 34){
                    
                return "It’s safe to go outside, 34 degrees and sunny.";
                    
            } else if (description.toLowerCase().contains("snow") && temperature == 33){
                    
                return "It’s safe to go outside, 33 degrees and snow.";
                    
            } else if (description.toLowerCase().contains("snow") && temperature > 100){
                    
                return "no";
                    
        } else {
                
            return "The world has ended because these perameters do not follow the 1.1.4 steps that the assignment requires.";
            
        }
    }
    
    
    static String[] coldScripts = new String[]{"snow", "sleet", "freezing", "flurries", "cold"};
    static String[] hotScripts = new String[]{"hot", "warm", "humid"};
    static String[] rainScripts = new String[]{"tropical storm", "thunderstorm", "thundershower", "rainstorm"};
    static String[] dangerScripts = new String[]{"tornado", "hurricane", "earthquake", "fire", "death"};
    static String[] niceScripts = new String[]{"clear", "sunny", "fair", "nice"};
    static String[] miscScripts = new String[]{"hail", "dust", "fog", "haze", "smoke", "wind"};
    
    public static String getHikingAdvice(int temperature,int windchill, int humidity, String description){
        
        boolean tester = false;
        boolean largeTester = false;
        int i = 0;
        String statement = "There were no results"; //this is what prints if no results were found
        
        while (largeTester == false){
        
           while (tester == false){ //dangerScripts

               if (i == 5){  //this is so that it doesn't run into an indexing problem
                    
                   i = 0;
                   tester = true; //this breaks out of the loop
                    
               } else if (description.contains(dangerScripts[i])){ 
                   
                   statement = "*WARNING* DO NOT PROCEED TO HIKE. " +  dangerScripts[i].toUpperCase() + " IMMINENT. TEMPERATURES UP TO " + temperature + ", WITH A WINDCHILL OF " + windchill + ". HUMIDITY LEVELS REACHING " + humidity + "."; //sets the statement for what the weather condition is
                   tester = true; //breaks this loop
                   largeTester = true; //sets the big loop true
                   break; //breaks out of the big loop so the other while loops don't run
                   
               } else {
                   
                   i += 1; //adds one to i for indexing
                   
               }
               
           }
            
           tester = false;
           i = 0;
           
           while (tester == false){ //coldScripts

               if (i == 5){
                   
                   tester = true;
                   i = 0;
                   
               } else if (description.contains(coldScripts[i])){    
                   
                   if (temperature <= 32){
                       
                       statement = "It is too cold to go outside. There is " + coldScripts[i] + ". Currently, the temperature is " + temperature + ", with a windchill of " + windchill + ". Humidity is at " + humidity + ".";
                   
                   } else {
                        
                       statement = "You lie. It is not possible for any of these conditions (i.e. snow, flurries, etc) when the temperature is above 32 degrees.";
                   
                   }
                   
                   tester = true;
                   largeTester = true;
                   break;
                   
               } else {
                   
                   i += 1;
                   
               }
           
           }
           
           tester = false;
           i = 0;
           
           while (tester == false){ //hotScripts

                if (i == 3){
                    
                    tester = true;
                    i = 0;
                    
                } else if (description.contains(hotScripts[i])){   
                    
                    statement = "It is safe to go outside. It is " + hotScripts[i] + ". Currently, the temperature is " + temperature + ", with a windchill of " + windchill + ". Humidity is at " + humidity + ".";
                    tester = true;
                    largeTester = true;
                    break;
                    
                } else {
                    
                    i += 1;
                    
                }
           }
           
           tester = false;
           i = 0;
            
           while (tester == false){ //rainScripts

                if (i == 4){
                    
                    tester = true;
                    i = 0;
                    
                } else if (description.contains(rainScripts[i])){   
                    
                    statement = "It is somewhat safe to go outside. There is a " + rainScripts[i] + ". Currently, the temperature is " + temperature + ", with a windchill of " + windchill + ". Humidity is at " + humidity + ".";
                    tester = true;
                    largeTester = true;
                    break;
                    
                } else {
                    
                    i += 1;
                    
                }
           }
           
           tester = false;
           i = 0;
            
           while (tester == false){ //niceScripts

                if (i == 4){
                    
                    tester = true;
                    i = 0;
                    
                } else if (description.contains(niceScripts[i])){ 
                    
                    statement = "It is safe to go outside. It is " + niceScripts[i] + ". Currently, the temperature is " + temperature + ", with a windchill of " + windchill + ". Humidity is at " + humidity + ".";
                    tester = true;
                    largeTester = true;
                    break;
                    
                } else {
                    
                    i += 1;
                    
                }
           }
          
           tester = false;
           i = 0;
            
           while (tester == false){ //miscScripts

                if (i == 6){
                    
                    tester = true;
    
                } else if (description.contains(miscScripts[i])){ 
                    
                    statement = "It may be safe to go outside. There is " + miscScripts[i] + ". Currently, the temperature is " + temperature + ", with a windchill of " + windchill + ". Humidity is at " + humidity + ".";
                    tester = true;
                    largeTester = true;
                    break;
                    
                } else {
                    
                    i += 1;
                    
                }
           }
        
           break; // if no conditions are mean't, this breaks the loop
        
      }

      return statement; //prints the statement of the weather
    
      // public static String bellringer(int temperature){
              // if (temperature < 28){
                  // bellringerStatement = "It's too cold";
              // } else if (temperature < 35){
                  // bellringerStatement = "It's chilly";
              // } else {
                  // bellringerStatement = "It's nice weather";
              // }
              // return bellringerStatement;
      //  }
    
   }
}


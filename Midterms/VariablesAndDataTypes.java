public class VariablesAndDataTypes {

	public static void main (String [] args) {
		//1
		String sent = "The temperature in Baguio City hhas warmed throughout the years.";
        boolean a = true;
        //2      
        char letter = 'A';
        //3      
        float day = 16;
        //4      
        double c = 23.5;
        //5      
        byte hrs = 24;
        //6
        short day2 = 7;
        //7
        int  w = 4;
        //8
        long m = 12;
        
        if (a) {
          System.out.println(sent + "\n\t" + letter + " recent news article stated that the City has been averaging " + day + " degrees celsius at dawn and " + c + " at noon." + "\n\t\t" + "Regarless, lowlanders still feel cold " + hrs + " hours a day, " + day2 + " days a week, " + " weeks per month and " + m + " month each year.");
        }
        else {
          System.out.println ("The boolean was changed to false");
        }
  }
}

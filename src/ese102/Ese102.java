package ese102;

import complexnumber.*; 

import java.io.*;

public class Ese102{
	
  public static void main(String[] args) throws IOException{
    ComplexNumber coordinate = new ComplexNumber();
    boolean correctValue = false;
    double readNumber = 0;
    short choice = 0;
    while(choice != 1 && choice != 2){
        choice = (short)readInput("Inserisci '1' se vuoi Rectangular, '2' se vuoi Polar", "You entered an illegal number");
    }
    if(choice == 1){
        coordinate.setRectangular(readInput("Coordinata di x: ", "You entered an illegal number"), readInput("Coordinata di Y: ", "You entered an illegal number"));
        System.out.println("\n" + "Modulo: " + coordinate.getModulus());
        System.out.println("Argomento: " + coordinate.getArgument());       
        }
        else if(choice == 2){
        	readNumber = readInput("Argomento: ", "You entered an illegal number");
        	while(!correctValue){
        		try{
	        		coordinate.setPolar(readNumber, readInput("Modulo (= o > di 0): ", "You entered an illegal number"));
	        		correctValue = true;
	        	}
	        	catch (IllegalArgumentException e){
	                System.out.println("Il modulo deve essere uguale o maggiore di 0.");
	            }
        	}      	
        	System.out.println("\n" + "Reale: " + coordinate.getRe());
	        System.out.println("Immaginario: " + coordinate.getIm());
        }
    }
    private static double readInput(String output, String error) throws IOException{
    	InputStreamReader input = new InputStreamReader(System.in);
    	BufferedReader keyboard = new BufferedReader(input);
    	String readInput;
    	boolean correctValue = false;
    	double readNumber = 0;
        while(!correctValue){
            System.out.println(output);
            readInput = keyboard.readLine();
            try{
            	readNumber = Double.valueOf(readInput).doubleValue();
                correctValue = true;
            }
            catch (NumberFormatException e){
                System.out.println(error);
            }
        }
        return readNumber;
    }
}
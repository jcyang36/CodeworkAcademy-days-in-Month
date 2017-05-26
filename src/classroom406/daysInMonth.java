package classroom406;

import java.util.Scanner;

public class daysInMonth {
	public static void main (String[] args){
		System.out.println("Enter the first three letters of a month: ");
		Scanner scannerInput=new Scanner(System.in);
		/* while (!scannerInput.hasNextInt())  {
			 System.out.println("Enter a month: ");
			 scannerInput=new Scanner(System.in);
		 }

		int randomNumber = scannerInput.nextInt();
		if(randomNumber==1){
			System.out.println("The number of days in month" + randomNumber+" is 31");
		}else if (randomNumber==2){
			System.out.println("The number of days in month "+ randomNumber+" is 28");
		}else if (randomNumber==3){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber ==4){
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==5) {
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if(randomNumber ==6){
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==7){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber==8){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber==9){ 
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==10){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else if (randomNumber ==11){
			System.out.println("The number of days in month "+ randomNumber+" is 30");
		}else if (randomNumber ==12){
			System.out.println("The number of days in month "+ randomNumber+" is 31");
		}else {
			System.out.println("Please enter a number between 1 and 12");
		}*/
		String repeatSwitch="y";
		do{
			while (!scannerInput.hasNext())  {
				 System.out.println("Enter the first three letters of a month: ");
				 scannerInput=new Scanner(System.in);
			 }
			String inMonth = scannerInput.next();
			if(inMonth.equalsIgnoreCase("Jan")){
				System.out.println("The number of days in January is 31");
			}else if(inMonth.equalsIgnoreCase("Feb")){
				System.out.println("The number of days in February is 28");
			}else if(inMonth.equalsIgnoreCase("Mar")){
				System.out.println("The number of days in March is 31");
			}else if(inMonth.equalsIgnoreCase("Apr")){
				System.out.println("The number of days in April is 30");
			}else if(inMonth.equalsIgnoreCase("May")){
				System.out.println("The number of days in May is 31");
			}else if(inMonth.equalsIgnoreCase("Jun")){
				System.out.println("The number of days in June is 30");
			}else if(inMonth.equalsIgnoreCase("Jul")){
				System.out.println("The number of days in July is 31");
			}else if(inMonth.equalsIgnoreCase("Aug")){
				System.out.println("The number of days in August is 31");
			}else if(inMonth.equalsIgnoreCase("Sep")){
				System.out.println("The number of days in September is 30");
			}else if(inMonth.equalsIgnoreCase("Oct")){
				System.out.println("The number of days in October is 31");
			}else if(inMonth.equalsIgnoreCase("Nov")){
				System.out.println("The number of days in November is 30");
			}else if(inMonth.equalsIgnoreCase("Dec")){
				System.out.println("The number of days in December is 31");
			}
			System.out.println("Would you like to enter a new month? Enter 'Y' for yes or 'N' for no ");
			repeatSwitch = scannerInput.next();
			if (repeatSwitch.equalsIgnoreCase("N")){
				break;
			}
		}while(repeatSwitch.equalsIgnoreCase("Y"));
		System.out.println("Thank you for using the days teller!");
	}
}

package beginners;
import java.util.Scanner;


public class Maruti extends Car implements UserChoices {
public void setCompany(){
	company="Maruti";
	}
	
	public void setModel(){
	System.out.println("--------enter model of car--------\n");	
	System.out.println(" enter 1: alto Price=Rs 4,00,000 \n enter 2: swift  Price=Rs 7,60,000 \n enter 3: ciaz  Price=Rs 11,50,000");
	Scanner getInput=new Scanner(System.in);
	int inputModelNo=getInput.nextInt();
	switch (inputModelNo) {
	case ALTO:
	model="alto ";
	resaleValueOfCar=0.4*400000;
	break;
	case SWIFT:
	model="swift ";
	resaleValueOfCar=0.4*760000;
	break;
	case CIAZ:
	model="ciaz ";
	resaleValueOfCar=0.4*1150000;
	break;
	default:
		System.out.println("enter a valid input");
	}
  }
}

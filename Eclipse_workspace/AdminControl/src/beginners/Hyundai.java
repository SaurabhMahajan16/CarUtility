package beginners;
import java.util.Scanner;

public class Hyundai extends Car implements UserChoices {
	public void setCompany(){
	company="Hyundai";
}
	public void setModel(){
	System.out.println("\n--------enter model of car-------- \n");	
	System.out.println(" enter 1: i10  Price=Rs 4,50,000 \n enter 2: i20  Price=Rs 8,80,000 \n enter 3: verna  Price=Rs 11,70,000");
	Scanner getInput=new Scanner(System.in);
	int inputModelNo=getInput.nextInt();
	switch (inputModelNo) {
	case I10:
	model="i10 ";
	resaleValueOfCar=0.6*450000;
	break;
	case I20:
	model="i20 ";
	resaleValueOfCar=0.6*880000;
	break;
	case VERNA:
	model="verna ";
	resaleValueOfCar=0.6*1170000;
	break;
	default:
		System.out.println("enter a valid input");
	 }
   }
}

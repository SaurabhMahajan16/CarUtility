package beginners;

import java.util.Scanner;

public class Toyota extends Car implements UserChoices{

	public void setCompany(){
		company="Toyota";
		}
		
		public void setModel(){
		System.out.println("--------enter model of car--------\n");	
		System.out.println(" enter 1: etios  Price=Rs 5,50,000 \n enter 2: livia Price=Rs 10,80,000 \n enter 3: fortuner Price=Rs 27,70,000");
		Scanner getInput=new Scanner(System.in);
		int inputModelNo=getInput.nextInt();
		switch (inputModelNo) {
		case ETIOS:
		model="etios ";
		resaleValueOfCar=0.8*550000;
		break;
		case LIVIA:
		model="Livia ";
		resaleValueOfCar=0.8*1080000;
		break;
		case FORTUNER:
		model="fortuner ";
		resaleValueOfCar=0.8*2770000;
		break;
		default:
			System.out.println("enter a valid input");
		}
		
		
		}
}

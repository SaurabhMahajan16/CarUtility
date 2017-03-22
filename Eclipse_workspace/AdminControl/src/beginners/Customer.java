package beginners;
import java.util.*;
public class Customer implements UserChoices {
	private final int Customer_Id;
	private String customerName;
	private static int Id_Assign=0;
	
	
	ArrayList<Car>carPurchasedList=new ArrayList<Car>();
	Scanner getInput=new Scanner(System.in);
	public ArrayList<Car> listOfPurchasedCars(){
    return carPurchasedList;
	}
	
	Customer(){
		
		Customer_Id=Id_Assign++;
	
	}
	
	public int getCustomerId(){
		return Customer_Id;
	}
	
	public String getNameOfCustomer(){
		return customerName;
	}
	
	public void setNameOfCustomer(String customerName){
		this.customerName=customerName;
	}
	public void addCarToCustomer(){
		System.out.println("---------------Enter the Company of Car------------"+"\n ");
		
		System.out.println("   enter 1 : Hyundai \n   enter 2 : Toyota \n   enter 3 : Maruti ");
		
		int inputCarCompany=getInput.nextInt();
		Car addNewCar=null;
		switch(inputCarCompany){
		case hyundai:
		addNewCar=new Hyundai();
		break;
		case toyota:
		addNewCar=new Toyota();
		break;
		case maruti:
		addNewCar=new Maruti();
		break;
		default:
		System.out.println("enter valid input");
		
		
		}
		if(inputCarCompany==hyundai ){
			addNewCar.setCarId();
			addNewCar.setCompany();
			addNewCar.setModel();
			
		}
		else if( inputCarCompany==toyota){
			addNewCar.setCarId();
			addNewCar.setCompany();
			addNewCar.setModel();
			
		}
		else if(inputCarCompany==maruti){
			addNewCar.setCarId();
			addNewCar.setCompany();
			addNewCar.setModel();
			
		}
		carPurchasedList.add(addNewCar);
	}
	
	
}

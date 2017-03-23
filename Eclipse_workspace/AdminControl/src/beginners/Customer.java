package beginners;
import java.util.*;
public class Customer implements UserChoices {
	private final int Customer_Id;
	private String customerName;
	private static int ID_ASSIGN=0;
	
	
	ArrayList<Car>carPurchasedList=new ArrayList<Car>();
	Scanner getInput=new Scanner(System.in);
	public ArrayList<Car> listOfPurchasedCars(){
    return carPurchasedList;
	}
	
	Customer(){
		
		Customer_Id=ID_ASSIGN++;
	
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
		case HYUNDAI:
		addNewCar=new Hyundai();
		break;
		case TOYOTA:
		addNewCar=new Toyota();
		break;
		case MARUTI:
		addNewCar=new Maruti();
		break;
		default:
		System.out.println("enter valid input");
		
		
		}
		if(inputCarCompany==HYUNDAI ){
			addNewCar.setCarId();
			addNewCar.setCompany();
			addNewCar.setModel();
			
		}
		else if( inputCarCompany==TOYOTA){
			addNewCar.setCarId();
			addNewCar.setCompany();
			addNewCar.setModel();
			
		}
		else if(inputCarCompany==MARUTI){
			addNewCar.setCarId();
			addNewCar.setCompany();
			addNewCar.setModel();
			
		}
		carPurchasedList.add(addNewCar);
	}
	
	
}

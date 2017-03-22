package beginners;
import java.util.*;

public class AdminControl implements UserChoices {
	ArrayList<Customer> customerList=new ArrayList<Customer>();
	ArrayList<Car>carsOfCustomer;
	boolean continueUrWindow=true;
	Scanner inputChoice=new Scanner(System.in);

	int idOfExistingCustomer;
	Customer existingCustomer=new Customer();
	public void display(){
		do{
			System.out.println("\n ---------AdminPanel---------");
			System.out.println(" enter 1: add New Customer \n enter 2: add Car To Existing Customer \n enter 3: sort Customer By Name  \n enter 4: generate Prize Of Customer \n enter 5: exit");
			System.out.println(" \n ----------Enter your Input---------- ");

			int inputYourChoice=inputChoice.nextInt();

			switch(inputYourChoice){
			case addNewCustomer:
				addCustomer();
				break;
			case addCarToExistingCustomer:
				//displayListOfCustomers();
				System.out.println(" --------enter id of customer to which you want to add car---------");

				int id=inputChoice.nextInt();
				addCartoExistingCustomer(id);
				break;
			case sortCustomerByName:
				displayListOfCustomers();
				break;
			case generatePrizeOfCustomer:
				generatePrizeOfCustomer();
				break;
			case exit:
				System.exit(0);
			default:
				System.out.println("enter correct input");
			}


		}
		while(continueUrWindow);
	}
	private void addCustomer(){
		Customer newCustomer=new Customer();
		System.out.println(" ---------Enter Name Of Customer----------");
		Scanner inputName=new Scanner(System.in) ;
		String nameOfCustomer=inputName.nextLine();
		if(nameOfCustomer==null){
			System.out.println("\n enter name");
		}
		else{
			newCustomer.setNameOfCustomer(nameOfCustomer);
		}
		newCustomer.addCarToCustomer();
		
		customerList.add(newCustomer);
	}

	private void addCartoExistingCustomer(int id){
		boolean check=true;
		int customerIndex=0;
		
		while(customerIndex<customerList.size()){
			existingCustomer=customerList.get(customerIndex);
			if(existingCustomer.getCustomerId()==id){
				idOfExistingCustomer=customerIndex;
				existingCustomer=customerList.get(idOfExistingCustomer);
				check=false;
			}
			
			
			customerIndex++;
		}
		if(!check){
		existingCustomer.addCarToCustomer();
		}
		else if(check){
			System.out.println("id is not valid");
		}
	
	}
	public void displayListOfCustomers(){
		int customerIndex=0;
		Collections.sort(customerList, new Comparator<Customer>() {
			public int compare(Customer customer1, Customer customer2 ){
				return customer1.getNameOfCustomer().compareTo(customer2.getNameOfCustomer()) ;
			}
		});
		System.out.println("---------List Of Customers---------");
		System.out.println("CustomerId          CustomerName       Cars ");
		while(customerIndex<customerList.size()){
			existingCustomer=customerList.get(customerIndex);
		System.out.print(existingCustomer.getCustomerId()+"             ");
		System.out.print("           "+existingCustomer.getNameOfCustomer()+"             ");
		//System.out.println("     "+existingCustomer.listOfPurchasedCars());
		carsOfCustomer=existingCustomer.listOfPurchasedCars();
		int indexForCar=0;
		while(indexForCar<carsOfCustomer.size()){
			System.out.print(""+carsOfCustomer.get(indexForCar).nameOfCar+" ");
			indexForCar++;
		}
		customerIndex++;
		System.out.println("");

		}
	}

	public void generatePrizeOfCustomer(){
		Random randomNumbers = new Random();
		int rand = randomNumbers.nextInt(customerList.size());
		//int minimum = 1;     // beginning of range
		//int maximum = customerList.size();      // end of range
		boolean randomNumberCheck=false;
		int generatedRandomnumber;
		while(!randomNumberCheck){
			//generatedRandomnumber = minimum + randomNumbers.nextInt( maximum - minimum + 1 );
			generatedRandomnumber = rand;
			if(generatedRandomnumber<=customerList.size()){
				existingCustomer=customerList.get(generatedRandomnumber);
				System.out.println("Congratulations.........."+existingCustomer.getCustomerId()+" "+existingCustomer.getNameOfCustomer()+" "+"has won the prize");
				break;	
		}
		else{
				randomNumberCheck=false;	
			}
		}
	}
	public static void main(String []args){
		AdminControl admin=new AdminControl();
		admin.display();
	}

}

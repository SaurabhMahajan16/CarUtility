package beginners;

public abstract class Car {
	 int idOfCar;
	private static int Id_Of_Car_Set=0;
	double priceOfCar;
	String companyOfCar;
	String nameOfCar;
	double resaleValueOfCar;
	
	public int  setCarId(){
	return idOfCar=++Id_Of_Car_Set;
	}
	
	int getId(){
	return idOfCar;
	}
	abstract public void setCompany();
    abstract public void setModel();
    
}

package beginners;

public abstract class Car {
	public int idOfCar;
	private static int SET_ID=0;
	public double priceOfCar;
	public String company;
	public String model;
	public double resaleValueOfCar;
	
	public int  setCarId(){
	return idOfCar=++SET_ID;
	}
	
	public int getId(){
	return idOfCar;
	}
	abstract public void setCompany();
    abstract public void setModel();
    
}

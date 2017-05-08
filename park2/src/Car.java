
public class Car implements Valuable {
	private String name;
	private double price;

	int i=0;
	
	public Car(String name, double price){
		this.name = name;
		this.price = price;
	}
	public double EstimateValue(int month){
		if(i==0){
		price = (price*(0.8));
		i=1;
		}
		for(int i = 0; i< month; i++){
			price = (price*(0.99));
			}
		return price;
	}
	public double EstimateValue(){
		
		return EstimateValue(1);
	}
	
	public String toString(){
		
		return String.format("car name : %s \ninitial price : %.2f" ,name , price);
	}

}

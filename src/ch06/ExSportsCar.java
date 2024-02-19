package ch06;

public class ExSportsCar {
	
	public static void main(String[] args) {
		
		Car car = new Car ();
		
		car.brand="Porsche";
		car.model="타이칸";
		car.carType=5;
		car.power=498.12;
		
		System.out.println("car.brand : " + car.brand);
		System.out.println("car.model : " + car.model);
		System.out.println("car.carType : " + car.carType);
		System.out.println("car.power : " + car.power);
	}

}

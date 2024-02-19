package ch06;

public class ExCar {

public static void main(String[] args) {
	
	Car car = new Car (); //생성자 이름은 무조건 클래스 이름과 동일
	Car car3=new Car("BMW", "520i", 2, 300.12);
	Car car4=new Car("Audi", "A7", 1, 478.36);
	
	car.brand="benz"; // . 앞의 car >> 메모리 내부에 저장된 변수를 가리킴
	car.model="G-wargen";
	car.carType=1;
	car.power=503.12;
	
System.out.println("car.brand : " + car.brand);
System.out.println("car.model : " + car.model);
System.out.println("car.carType : " + car.carType);
System.out.println("car.power : " + car.power);
	
System.out.println("================");

	Car car1 = new Car ();
	
	car1.brand="현대";
	car1.model="그랜저";
	car1.carType=3;
	car1.power=201.78;
	
System.out.println("car.brand : " + car1.brand);
System.out.println("car.model : " + car1.model);
System.out.println("car.carType : " + car1.carType);
System.out.println("car.power : " + car1.power);

System.out.println("================");

Car car2 = new Car();

	car2.brand = "기아";
	car2.model="K7";
	car2.carType=2;
	car2.power=233.12;

System.out.println("car.brand : " + car2.brand);
System.out.println("car.model : " + car2.model);
System.out.println("car.carType : " + car2.carType);
System.out.println("car.power : " + car2.power);

System.out.println("================");

car.go();
car.back();
car.right();
car.left();

System.out.println("================");

System.out.println("car.brand : " + car3.brand);
System.out.println("car.model : " + car3.model);
System.out.println("car.carType : " + car3.carType);
System.out.println("car.power : " + car3.power);

System.out.println("================");

System.out.println("car.brand : " + car4.brand);
System.out.println("car.model : " + car4.model);
System.out.println("car.carType : " + car4.carType);
System.out.println("car.power : " + car4.power);

}
		
	}
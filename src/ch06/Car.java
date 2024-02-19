package ch06;

public class Car {

	String brand;
	String model;
	int  carType;
	double power;
	
	//생성자 만듦
	Car (String brand, String model, int carType, double power) {
		
		this.brand=brand; //this = [3번 라인] Car class 안에 있는 것들을 지칭함, [5-8번 라인] local 변수 (해당 바운더리 안에서만 사용 가능)이기 때문에 this로 지칭 X
		this.model=model;
		this.carType=carType;
		this.power=power;
		
	}
	
	Car () { //기본생성자를 임의로 만듦으로써 ExCar 클래스에서 에러 발생 X
		
	}
	
	//함수 > 객체들의 행위를 기술함
	//함수, 변수 첫 글자는 무조건 소문자
	void go() { 
		System.out.println("앞으로 가셈");
	}
	
	void back () {
		System.out.println("뒤로 가셈");
	}
	
	void right () {
		System.out.println("오른쪽으로 가셈");
	}
	 
	void left () {
		System.out.println("왼쪽으로 가셈");
	}

	
	}


package ch07.second;

public class HandBag extends Bag{
	
	//가격 필드
	private double price;
	
	//get set
	public double getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	//가격 함수
	void bagPrice() {
		System.out.println("이 가격의 가방은 " + price + "원");
	}

	//오버라이드
	@Override
	void brandName() {
		// TODO Auto-generated method stub
		System.out.println("HandBag 브랜드 이름 보여줘");
	}

	@Override
	void modelName() {
		// TODO Auto-generated method stub
		System.out.println("HandBag 모델 이름 보여줘");
	}
	
	@Override
	void printBag() {
		// TODO Auto-generated method stub
		super.printBag();
	}

	//함수
	void print() {
		System.out.println("Brand : " + getBrand() + " | " + "Model : " + getModel() + " | " + "Price : " + price);
	}
	

	

}

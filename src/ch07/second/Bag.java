package ch07.second;

public class Bag { //부모 클래스
	
	//변수
	private String Brand;
	private String Model;
	
	//함수
	void brandName() {
		System.out.println("이 가방의 브랜드는 " + Brand);
	}
	
	void modelName() {
		System.out.println("이 가방의 모델명은 " + Model);
	}

	//getter setter
	public String getBrand() {
		return Brand;
	}

	public void setBrand(String brand) {
		Brand = brand;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}
	
	//출력 함수
	void printBag () {
		System.out.println("Brand : " + getBrand() + " | " + "Model : " + getModel());
	}
	
	
	

}

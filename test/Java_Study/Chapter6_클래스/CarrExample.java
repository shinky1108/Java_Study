package Chpater6_클래스;

public class CarrExample {
	public static void main(String[] args) {
		// 기본생성자 호출 
		Carr car1= new Carr(); 
		System.out.println("car1.company: "+car1.company);
		System.out.println("car1.model: "+car1.model);
		System.out.println("car1.color: "+car1.color);
		System.out.println("car1.maxSpeed: "+car1.maxSpeed);
		
		// 오버로딩 생성자1 호출 
		Carr car2 = new Carr("자가용");
		System.out.println("car2.company: "+car2.company);
		System.out.println("car2.model: "+car2.model);
		System.out.println("car2.color: "+car2.color);
		System.out.println("car2.maxSpeed: "+car2.maxSpeed);
		
		// 오버로딩 생성자2 호출 
		Carr car3 = new Carr("자가용", "빨강");
		System.out.println("car3.company: "+car3.company);
		System.out.println("car3.model: "+car3.model);
		System.out.println("car3.color: "+car3.color);
		System.out.println("car3.maxSpeed: "+car3.maxSpeed);
		
		// 오버로딩 생성자3 호출 
		Carr car4 = new Carr("택시", "검정", 200);
		System.out.println("car4.company: "+car4.company);
		System.out.println("car4.model: "+car4.model);
		System.out.println("car4.color: "+car4.color);
		System.out.println("car4.maxSpeed: "+car4.maxSpeed);
		
		Carr2 car5 = new Carr2("택시", "주황");
		System.out.println("car5.company: "+car5.company);
		System.out.println("car5.model: "+car5.model);
		System.out.println("car5.color: "+car5.color);
		System.out.println("car5.maxSpeed: "+car5.maxSpeed);
		
	}
}

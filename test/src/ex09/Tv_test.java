package ex09;

import java.util.Scanner;

public class Tv_test {
	public static void main(String[] args) {
		/*
		SamsungTV samsungTv = new SamsungTV();
		samsungTv.powerOn();
		samsungTv.volumeUp();
		samsungTv.volumeDown();
		samsungTv.powerOn();
		
		LgTV lgTv = new LgTV();
		lgTv.turnOn();
		lgTv.soundUp();
		lgTv.soundUp();
		lgTv.turnOff();
		*/
		
		/*
		TV samsung_tv = new SamsungTV();
		samsung_tv.powerOn();
		samsung_tv.volumeUp();
		samsung_tv.volumeDown();
		samsung_tv.powerOn();
		*/
		
		/*
		TV lg_tv = new LgTV();
		lg_tv.powerOn();
		lg_tv.volumeUp();
		lg_tv.volumeDown();
		lg_tv.powerOn();
		*/
		
		
		/*
		TV samsung_tv = new SamsungTV();
		TV lg_tv = new LgTV();

		TV[] arr_tv = new TV[2];
		arr_tv[0] = samsung_tv;
		arr_tv[1] = lg_tv;
		
		for(int i=0; i<arr_tv.length; i++) {
			arr_tv[i].powerOn();
			arr_tv[i].volumeUp();
			arr_tv[i].volumeDown();
			arr_tv[i].powerOff();
		}*/
		
		/*
		BeanFactory factory = new BeanFactory();
		TV tv3 = factory.getBean(1);	// 1 -> 삼성, 2 -> Lg 
		tv3.powerOn();
		tv3.volumeUp();
		tv3.volumeDown();
		tv3.powerOff();
		
		TV tv4 = factory.getBean(2);	// 1 -> 삼성, 2 -> Lg 
		tv4.powerOn();
		tv4.volumeUp();
		tv4.volumeDown();
		tv4.powerOff();
		
		TV tv5 = factory.getBean(3);	// 이러면 null이 반환됨	아래 메서드가 실행이 안됨 
		if(tv5 == null) {
			System.out.println("미안하지만 null이라서 실행이 안됨");
		} else {
			tv5.powerOn();
			tv5.volumeUp();
			tv5.volumeDown();
			tv5.powerOff();
		}
		*/
		
		// 추가 문제
		// 매개변수에 "samsung"이 주입되면 삼성 TV
		// 매개변수에 "lg"가 주입되면 LgTV가 적용되게 수정
		
		/*
		BeanFactory factory = new BeanFactory();
		TV tv5 = factory.getBean("삼성");
		tv5.powerOn();
		tv5.volumeUp();
		tv5.volumeDown();
		tv5.powerOff();
		
		TV tv6 = factory.getBean("lg");
		tv6.powerOn();
		tv6.volumeUp();
		tv6.volumeDown();
		tv6.powerOff();
		*/
		
		
		BeanFactory factory = new BeanFactory();
		Scanner sc = new Scanner(System.in);
		System.out.print("회사를 입력하세요 : ");
		String brand = sc.next();

		TV tv7 = factory.getBean(brand);
		tv7.powerOn();
		tv7.volumeUp();
		tv7.volumeDown();
		tv7.powerOff();
	
		
		
		
		sc.close();
	}
}

//https://chatgpt.com/c/67e0ed68-ec70-800a-b56e-b9fe98c62b57 
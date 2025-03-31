package ex06;

public class Test {

	public static void main(String[] args) {
		A a = new A(10);
		a.n  = 10;
		a.fa();
		System.out.println(a.n);

		System.out.println("--------------------------------");
		
		B b = new B(1,2);
		//b.n = 11;
		//b.m = 10;
		b.fa();
		b.fb();
		System.out.println(b.n);
		System.out.println(b.m);
		

	}
}
/*
		A a = new A();
		a.n  = 10;
		a.fa();

		System.out.println("--------------------------------");
		
		B b = new B();
		b.n = 11;
		b.m = 10;
		b.fa();
		b.fb();
		System.out.println(b.n);
		System.out.println(b.m);

		System.out.println("--------------------------------");
		
		A ab = new B();
		ab.n = 10;
		ab.fa();
		//ab.m = 11;	// 에러발생
		//ab.fb();		// 에러발생
		
		System.out.println("--------------------------------");
		
		A ab2  = new B();	 // 자식 타입으로 부모를 선언하는건 안됨 
		B bb = (B) ab2;
		bb.n = 40;
		bb.m = 43;
		bb.fa();
		bb.fb();




============================================================================


		Student s1 = new Student();
		s1.name="김이박";
		s1.gender = '남';
		s1.grade = '1';
		s1.num = 13;

		Person p1 = new Student();
		p1.gender = '여';
		p1.name = "혜자";
		
		Worker w1 = new Worker();
		Person p2 = new Worker();
		
		p2 = w1;	// 자식(Worker)는 부모(Person)로 자동 형변환이 가능하다
		w1 = (Worker)p2;	// 부모(Person)은 자식(Worker)로 자동 형변환이 안된다. 명시적(Worker)으로 형변환을 해줘야함


============================================================================


		Person[] people = new Person[3];
		Person p1 = new Person();
		Student s1 = new Student();
		Worker w1 = new Worker();
		
		// 자식의 타입은 부모 타입에 자동으로 형변환이 가능하다
		people[0] = p1;
		people[1] = s1;
		people[2] = w1;
		
		Student x = (Student)people[1];
		






*/
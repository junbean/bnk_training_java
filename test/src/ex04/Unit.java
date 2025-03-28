package ex04;

public class Unit {
	String name;
	int energy;
	

	public Unit() {
		this.energy = 10;
	}
	public Unit(String name) {
		this();
		this.name = name;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnergy() {
		return energy;
	}
	public void setEnergy(int energy) {
		this.energy = energy;
	}


	public void attack(Unit enemy) {
		enemy.decreaseEnergy();
		System.out.println(this.toString(enemy));
	}
	public void attack(Unit enemy, int demage) {
		enemy.decreaseEnergy(demage);
		System.out.println(this.toString(enemy, demage));
	}
	public void decreaseEnergy() {
		--this.energy; 
	}
	public void decreaseEnergy(int demage) {
		this.energy -= demage; 
	}
	
	
	@Override
	public String toString() {
		return "Unit [name=" + name + ", energy=" + energy + "]";
	}
	public String toString(Unit enemy) {
		return this.name + "가 " + enemy.name +  "에게 일반공격! - 1데미지!" ;
	}
	public String toString(Unit enemy, int demage) {
		return this.name + "가 " + enemy.name +  "에게 강공격!! - " + demage + "데미지!!";
	}
	
}
/*

유닛 클래스를 만듦

유닛은 공격을 할수 있어야 함
공격은 특정 대상한테 한다
공격받은 특정 대상은 체력이 감소해야 한다

메서드
	공격 메서드 - 공격 대상이 필요함
	체력 감소 메서드 - 자기 자신의 체력을 감소시킴
*/
package ex07;

import lombok.*;

//@Getter
//@Setter
//@ToString
//@EqualsAndHashCode
@Data
public class Member {
	private int mno;
	private String name;
	private String phone;
	
	/*
	@Override
	public boolean equals(Object obj) {
		
		if(this == obj) return true;
		if(obj == null || getClass() != obj.getClass()) return  false;
		
		Member target = (Member) obj;
	
		if(mno == target.getMno() && name.equals(target.getName()) && phone.equals(target.getPhone())) {
			return true;
		} else {
			return false;
		}
	}
	*/
	
	
	
	/*
	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		// return super.hashCode();
		return Objects.hash(mno, name, phone);
	}	
	*/
	
	
	
}

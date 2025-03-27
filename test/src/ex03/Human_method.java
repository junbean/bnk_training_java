package ex03;

public class Human_method {
	public void calc_gender_amount(Human[] arr_human) {
		int male_count = 0;
		int female_count = 0;

		for (int i = 0; i < arr_human.length; i++) {
			if (arr_human[i].getGender() == 'M') {
				male_count++;
			} else {
				female_count++;
			}
		}

		System.out.println("남자의 수: " + male_count);
		System.out.println("여자의 수: " + female_count);		
	}
}

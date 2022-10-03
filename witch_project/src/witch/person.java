package witch;

public class person {
	
	int age;
	int year;
	
	person(int age, int year){
		this.age = age;
		this.year = year;
	}
	
	public int calculate_year(int age, int year) {
		
		int sum = 0;
		
		sum = year - age;
		
		return sum;
	}
}

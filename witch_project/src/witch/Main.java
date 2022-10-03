package witch;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int year_of_victim;
		int victim;
		int sum = 0;
		double avg_kill;
		
		person person_a = new person(10,12);
		person person_b = new person(13,17);
		
		person[] person_list = {person_a, person_b};
		
		people_killed kill = new people_killed();
		
		for(person person : person_list) {
			
			year_of_victim = person.calculate_year(person.age, person.year);
			
			victim = kill.killed(year_of_victim);
			
			sum += victim;
		}
		
		avg_kill = (double) sum / person_list.length;
		
		System.out.println(avg_kill);
	}

}

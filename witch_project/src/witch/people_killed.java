package witch;

public class people_killed {
	
	public int killed(int year_of_victim) {
		
		int i = 0;
		int l = 1;
		int r = 1;
		int sum = 0;
		int temp = 0;
		
		while(i<year_of_victim) {
			
			sum += l;
			temp = r;
			r += l;
			l = temp;
			
			i++;
		}
		return sum;
	}
}

package studio2;

public class Pi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double xAxis = Math.random();
		double yAxis = Math.random();
		
		int validPoints = 0;
		
		for (int count = 0; count <= 10000; count++)
		{
		if (Math.sqrt(xAxis * xAxis + yAxis * yAxis) <=1)
		{
			validPoints++;
		}
		}
		
		double Pi = 4 * validPoints / (10000 + 0.00000);
		
		System.out.println(Pi);
		

	}

}
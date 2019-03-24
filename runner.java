import java.util.*;
public class runner {
	public static Scanner in=new Scanner (System.in);
	public static void main(String[] args) {
		boolean answer = false;
		int [] runScores = new int [15];
		for (int i=0; i< runScores.length; i++)
		{
			System.out.println("input time for run number "+i+1);
			runScores[i]= in.nextInt();
		}
		answer = procces (runScores);
		
	
		if (answer==false)
		{
			System.out.println("you havwenot aprooven!!");
		}
		else
		{
			System.out.println("well done!!!");
		}
		
	}
	
	
	public static boolean procces (int [] scores)
	{
		
		int a =  scores [0];
		
		for (int i=1; i< scores.length; i++)
		{
			if ( a < scores[i])
			{
				return false;
			}
			else
			{
			a = scores[i];
				
			}
		}
		return true;
	}

}

import java.util.Scanner;

public class TableRunner
	{

		static int numberOfGameweeks;
		public static void main(String[] args)
			{
			
				CreatingCode.addingTeams();
				
				Scanner supa = new Scanner (System.in);
				System.out.println("What gameweek was last week?");
				numberOfGameweeks = supa.nextInt();
				
				
					CreatingCode.addingPoints();		
				
					System.out.println("This is the current table:");
					CreatingCode.display();
					
//going to school night of oct 7
			}

	}

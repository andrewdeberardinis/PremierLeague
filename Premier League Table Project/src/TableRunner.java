import java.util.Scanner;

public class TableRunner
	{

		public static void main(String[] args)
			{
			
				CreatingCode.addingTeams();
				
				Scanner supa = new Scanner (System.in);
				System.out.println("What gameweek was last week?");
				int numberOfGameweeks = supa.nextInt();
				
				for(int i = 0; i <= numberOfGameweeks; i ++)
					{
					
					CreatingCode.display();	
					System.out.println();
					CreatingCode.addingPoints();			
					}
				
					System.out.println("This is the current table:");
					CreatingCode.display();


			}

	}

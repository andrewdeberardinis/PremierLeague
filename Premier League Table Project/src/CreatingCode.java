import java.util.Scanner;
import java.util.ArrayList;
public class CreatingCode
	{
			static ArrayList <Teams> soccer = new ArrayList <Teams>();
		
			public static void main(String[] args)
			{
			addingTeams();
			display();	
			addingPoints();	
				
				
			}
			
			
			
				public static void addingTeams()
					{
						soccer.add(new Teams("Liverpool", 0));
						soccer.add(new Teams("Chelsea", 0));
						soccer.add(new Teams("Manchester City", 0));
						soccer.add(new Teams("Manchester United", 0));
						soccer.add(new Teams("Arsenal", 0));
						
				
					}
					
				
				public static void display()
				{
					
					for(int i = 0; i <= soccer.size(); i++)
						{
							System.out.println("_____________________");
							System.out.print(soccer.get(i).getTeamName() + " ");
							System.out.println(soccer.get(i).getTeamPoints());	
						}
					
					
				}
				
				public static void addingPoints()
				{
					
					Scanner supa = new Scanner (System.in);
					int gwpoints = supa.nextInt();
					
					for
					System.out.println("How many points did " + soccer.get(0).getTeamName() + " get this week");
		
					
					
				}
				
				
				
				
				
				
				

			

	}

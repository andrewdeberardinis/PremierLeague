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
			display();	
				
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
					
					for(int i = 0; i < soccer.size(); i++)
						{
							
							System.out.print(soccer.get(i).getTeamName() + " ");	   
							System.out.println(soccer.get(i).getTeamPoints());		
							
						}
					
					
				}
				
				public static void addingPoints()
				{
					
					Scanner supa2 = new Scanner (System.in);
			
					for(int whatGameweek = 1; whatGameweek < TableRunner.numberOfGameweeks + 1; whatGameweek++)
						{
							display();
							System.out.println();
							for(int i = 0; i < soccer.size(); i++)
								{
									System.out.println("How many points did " + soccer.get(i).getTeamName() + " get in gameweek " + whatGameweek + "?");	
									int gwpoints = supa2.nextInt();
									soccer.get(i).setTeamPoints(soccer.get(i).getTeamPoints() + gwpoints);
									
									
								}
						}
	
						
					
				}
				
	}

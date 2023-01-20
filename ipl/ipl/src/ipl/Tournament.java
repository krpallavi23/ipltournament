package ipl;
import java.util.*;
public class Tournament {
	private String tournamentName;
	private int year;
	private Team team[]=new Team[12];
	private int team_counter;
	public Tournament() {
//		super();
		team_counter=0;
	}
	public Tournament(String tournamentName, int year) {
//		super();
		this.tournamentName = tournamentName;
		this.year = year;
		team_counter=0;
	}
	public String getTournamentName() {
		return tournamentName;
	}
	public void setTournamentName(String tournamentName) {
		this.tournamentName = tournamentName;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void addTeam() {
		Scanner scan=new Scanner(System.in);
		team[team_counter]=new Team();
		System.out.println("Enter Team Name and ceo");
		team[team_counter].setTeamName(scan.next());
		team[team_counter].setCeo(scan.next());
		System.out.println("Enter number of players:");
		int nop=scan.nextInt();
		for(int i=0;i<=nop;i++)
		{
			team[team_counter].addPlayer();
		}
		team_counter++;
		}
	public void displayTournament() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Tournament name"+tournamentName);
//		tournamentName=scan.next();
		System.out.println("year"+year);
//		year=scan.nextInt();
		for(int i=0;i<team_counter;i++)
		{
			team[i].displayTeam();
		}
	}
		
}

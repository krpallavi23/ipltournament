package ipl;

import java.util.Scanner;

public class Bowler extends Batsman {
	private int overs;
	private int wickets;

	public Bowler() {
//		super();
	}

	public Bowler(int playerId, String playerName, int runs, int hundreds, int fifties, int overs, int wickets) {
		super(playerId, playerName, runs, hundreds, fifties);
		this.overs = overs;
		this.wickets = wickets;
	}


	public int getOvers() {
		return overs;
	}

	public void setOvers(int overs) {
		this.overs = overs;
	}

	public int getWickets() {
		return wickets;
	}

	public void setWickets(int wickets) {
		this.wickets = wickets;
	}

	@Override
	public String toString() {
		return super.toString() +"Bowler [overs=" + overs + ", wickets=" + wickets + "]";
	}
	public void read() {
		Scanner scan=new Scanner(System.in);
		super.read();
		System.out.println("Enter overs:");
		overs=scan.nextInt();
		System.out.println("Enter wickets:");
		wickets=scan.nextInt();
		
	}
}




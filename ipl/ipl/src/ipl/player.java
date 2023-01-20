package ipl;
import java.util.Scanner;

public class player {

	private int playerId;
	private String playerName;
	
	public player() {
		
	}

	public player(int playerId, String playerName) {
		super();
		this.playerId = playerId;
		this.playerName = playerName;
	}

	public int getPlayerId() {
		return playerId;
	}

	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + "]";
	}
	public void read() {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter playerId:");
		System.out.println("Enter playerName:");
		playerId=scan.nextInt();
		playerName=scan.next();
		}
}


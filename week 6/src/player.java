
public class player {
	public String name;
	public String team;
	public int jerseyNumber;
	public int height;
	public int weight;
	public String position;
	
	public player(String name, String team, int jerseyNumber, int height, int weight, String position) {
		this.name = name;
		this.team = team;
		this.jerseyNumber = jerseyNumber;
		this.height = height;
		this.weight = weight;
		this.position = position;
	}
	
	public String getName() {
		return name;
	}
	public String getTeam() {
		return team;
	}
	public int getJerseyNumber() {
		return jerseyNumber;
	}
	public int getHeight(player player1) {
		return height;
	}
	public int getWeight() {
		return weight;
	}
	public String getPosition() {
		return position;
	}
	
}

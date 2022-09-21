
public class Participant implements Comparable<Participant>{
	
	private String name;
	private int games;
	private int points;
	
	
	public Participant(String name, int games, int points) {
		this.name = name;
		this.games = games;
		this.points = points;
	}

	
	@Override
	public int compareTo(Participant o) {
		
		if (this.getGames() == o.getGames()) {
			if (this.getPoints() == o.getPoints()) {
				return 0;
			} else if (this.getPoints() > o.getPoints()) {
				return -1;
			} else {
				return 1;
			}
		} else if (this.getGames() > o.getGames()) {
			return 1;
		} else {
			return -1;
		}
		
	}

	public int getGames() {
		return games;
	}

	public int getPoints() {
		return points;
	}

	public String getName() {
		return name;
	}
}

  
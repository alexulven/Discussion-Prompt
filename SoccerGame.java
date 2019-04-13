
public class SoccerGame {
	public static void main(String[] args) {
		Player zidane = new Player();
		zidane.name = "zidane";
		Player matt = new Player();
		matt.name = "matt";
		zidane.commitFoul(matt);
		Referee ref = new Referee();
		if (ref.handOutCard(zidane, matt)) {
			System.out.println("Zidane is gone!");
			zidane.leaveField();
			
		}
		
	}

}

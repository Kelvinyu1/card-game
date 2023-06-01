import java.util.ArrayList;
public class Player {
		private String name;
		private int cash;
		public ArrayList<Cards> hand = new ArrayList<>();
		
		public Player() {
			name = "bot";
			cash = 0;
		}
		
		public Player(String name, int cash, ArrayList<Cards> hand) {
			this.name = name;
			this.cash = cash;
			this.hand = hand;
		}
		
		public Player(String name) {
			this.name = name;
			cash = 0;
		}
		
		public String getName() {return name;}
		public int getCash() {return cash;}
		public Cards gethand(int index){return hand.get(index);}
		public void setCash(int cash) { this.cash = cash;}
		public void setName(String name) {this.name = name;}
		public String toString() {return name + " amount of cash:" + cash;}
		
}


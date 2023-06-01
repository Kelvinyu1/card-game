import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Texas hold 'em");
		
	
		ArrayList<Cards> deck1 = new ArrayList<>();
		 deck1.add(new Cards("AS"));
		 deck1.add(new Cards("AH"));
		 deck1.add(new Cards("AC"));
		 deck1.add(new Cards("AD"));
		 deck1.add(new Cards("KS"));
		 deck1.add(new Cards("KH"));
		 deck1.add(new Cards("KC"));
		 deck1.add(new Cards("KD"));
		 deck1.add(new Cards("QS"));
		 deck1.add(new Cards("QH"));
		 deck1.add(new Cards("QC"));
		 deck1.add(new Cards("QD"));
		 deck1.add(new Cards("JS"));
		 deck1.add(new Cards("JH"));
		 deck1.add(new Cards("JC"));
		 deck1.add(new Cards("JD"));
		 deck1.add(new Cards("TenS"));
		 deck1.add(new Cards("TenH"));
		 deck1.add(new Cards("TenC"));
		 deck1.add(new Cards("TenD"));
		 deck1.add(new Cards("NineS"));
		 deck1.add(new Cards("NineH"));
		 deck1.add(new Cards("NineC"));
		 deck1.add(new Cards("NineD"));
		 deck1.add(new Cards("EightS"));
		 deck1.add(new Cards("EightH"));
		 deck1.add(new Cards("EightC"));
		 deck1.add(new Cards("EightD"));
		 deck1.add(new Cards("SevenS"));
		 deck1.add(new Cards("SevenH"));
		 deck1.add(new Cards("SevenC"));
		 deck1.add(new Cards("SevenD"));
		 deck1.add(new Cards("SixS"));
		 deck1.add(new Cards("SixH"));
		 deck1.add(new Cards("SixC"));
		 deck1.add(new Cards("SixD"));
		 deck1.add(new Cards("FiveS"));
		 deck1.add(new Cards("FiveH"));
		 deck1.add(new Cards("FiveC"));
		 deck1.add(new Cards("FiveD"));
		 deck1.add(new Cards("FourS"));
		 deck1.add(new Cards("FourH"));
		 deck1.add(new Cards("FourC"));
		 deck1.add(new Cards("FourD"));
		 deck1.add(new Cards("ThreeS"));
		 deck1.add(new Cards("ThreeH"));
		 deck1.add(new Cards("ThreeC"));
		 deck1.add(new Cards("ThreeD"));
		 deck1.add(new Cards("TwoS"));
		 deck1.add(new Cards("TwoH"));
		 deck1.add(new Cards("TwoC"));
		 deck1.add(new Cards("TwoD"));
		 
		 Random randomCards = new Random();
				

		
		
		int[] random = new int[2];
		for(int i = 0; i < 2; i++) {
		random[i] = randomCards.nextInt(52);
		}			 	
		ArrayList<Cards> hand = new ArrayList<>();
		hand.add(deck1.get(random[0]));
		hand.add(deck1.get(random[1]));
		Player p1 = new Player("Kelvin", 5000, hand);
		int value_1 = 0, value_2 = 1;
		System.out.println(random[0]);
		System.out.println(random[1]);
		
		
		System.out.println("Here is your hand: ");
		Cards.print(p1.gethand(value_1).value());
		Cards.print(p1.gethand(value_2).value());
		
		System.out.println("**************************");
		int[] random_2 = new int[5];
		for(int i = 0; i < 5; i++) {
			random_2[i] = randomCards.nextInt(13);
		}
		
		ArrayList<Cards> field = new ArrayList<>();
		
		for(int i = 0; i < 5; i++) {
			field.add(deck1.get(random_2[i]));
			Cards.print(field.get(i).value());
		}
		
		
					 			 	
					 	
					 	
}

}
			 
		 






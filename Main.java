import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;
import java.util.Collections;
public class Main {

	public static int[] randomize(ArrayList<Cards> deck, Random rand){
		
		int[] random = new int[7];
		Set<Integer> uniqueNumbers = new HashSet<>();

        for (int i = 0; i < 7; i++) {
            int randomNumber;
            do {
                randomNumber = rand.nextInt(52); 
            } while (uniqueNumbers.contains(randomNumber));

            random[i] = randomNumber;
            uniqueNumbers.add(randomNumber);
        }

		return random;
	}

	public static String check(String move, Scanner in){
		do {
			System.out.println("Please enter 'r' to raise or 'c' to call: ");
			move = in.nextLine();
		} while (!move.equals("r") && !move.equals("c"));
		return move;
	}

	public static boolean hasFlush(ArrayList<Cards> all_cards) {
		String firstSuit = all_cards.get(0).suit;
	
		for (int i = 1; i < all_cards.size(); i++) {
			if (!all_cards.get(i).suit.equals(firstSuit)) {
				return false; // If any card has a different suit, it's not a flush
			}
		}
	
		return true; // All cards have the same suit, it's a flush
	}
	

	public static void checkHandRankings(ArrayList<Cards> all_cards) {
		int doublesCount = 0;
		int triplesCount = 0;
		boolean hasFullHouse = false;
		int doublePairsCount = 0;
		boolean hasFourOfAKind = false;
		boolean hasStraight = false;
		
		for (int i = 0; i < all_cards.size(); i++) {
			Cards card1 = all_cards.get(i);
			if (card1 == null) {
				System.err.println("Null card found at index " + i);
				continue; // Skip null cards
			}
	
			int sameTypeCount = 1; // Counter for cards with the same type as card1
			
			for (int j = i + 1; j < all_cards.size(); j++) {
				Cards card2 = all_cards.get(j);
				if (card2 == null) {
					System.err.println("Null card found at index " + j);
					continue; // Skip null cards
				}
	
				String type1 = card1.type();
				String type2 = card2.type();
				if (type1 == null || type2 == null) {
					System.err.println("Null type found: card1=" + card1 + ", card2=" + card2);
					continue; // Skip cards with null type
				}
	
				if (type1.equals(type2)) {
					sameTypeCount++;
				}
			}
	
			if (sameTypeCount == 2) {
				doublesCount++;
			} else if (sameTypeCount == 3) {
				triplesCount++;
			} else if (sameTypeCount == 4) {
				hasFourOfAKind = true;
			}
		}
	
		// Check if we have a full house
		if (triplesCount >= 1 && doublesCount >= 1) {
			hasFullHouse = true;
		}
	
		// Check if we have a double pair
		if (doublesCount >= 2) {
			doublePairsCount = doublesCount / 2;
		}
	
		// Check for straight
		ArrayList<Integer> values = new ArrayList<>();
		for (Cards card : all_cards) {
			int value = card.value();
			values.add(value);
		}
		Collections.sort(values);
		
		if (values.size() >= 5) {
			for (int i = 0; i <= values.size() - 5; i++) {
				if (values.get(i + 4) - values.get(i) == 4) {
					hasStraight = true;
					break;
				}
			}
		}
		
		boolean flush = hasFlush(all_cards);

	
		System.out.println("Number of doubles: " + doublesCount);
		System.out.println("Number of triples: " + triplesCount);
		System.out.println("Has Full House: " + hasFullHouse);
		System.out.println("Number of double pairs: " + doublePairsCount);
		System.out.println("Has Four of a Kind: " + hasFourOfAKind);
		System.out.println("Has Straight: " + hasStraight);
		System.out.println("Has Flush: " + flush);
		if(doublesCount == 0 && triplesCount == 0 && hasFullHouse == false &&  doublePairsCount == 0 && hasFourOfAKind == false && flush == false){
		System.out.println("Has High card: true");
		//sorting the high card
		int max = 0;
		int index = 0; 
		for(int i = 0; i < all_cards.size(); i++){
			if(all_cards.get(i).value() > max){
				max = all_cards.get(i).value();
				index = i;
			} 
		}
		System.out.println("***********************\n your high card: " + all_cards.get(index).name(max) + "\n value of:" + max);
		}
	}
		


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Welcome to Texas hold 'em");

		System.out.println("Enter your name: ");
		String usr_name = in.nextLine();
		System.out.println("Enter the starting amount of cash: ");
		int cash = in.nextInt();
		//change it so that user has to input an integer and not other variable types
		
	
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
				
		int[] random = randomize(deck1, randomCards);

		ArrayList<Cards> hand = new ArrayList<>();
		hand.add(deck1.get(random[0]));
		hand.add(deck1.get(random[1]));
		
		Player p1 = new Player(usr_name, cash, hand);
		int value_1 = 0, value_2 = 1;
		System.out.println(random[0]);
		System.out.println(random[1]);
		
		
		System.out.println("Here is your hand: ");
		Cards.print(p1.gethand(value_1).value());
		Cards.print(p1.gethand(value_2).value());
		
		System.out.println("**************************");
		in.nextLine();
		int[] random_2 = new int[5];
		for(int i = 0; i < 5; i++) {
			random_2[i] = randomCards.nextInt(53);
		}
		
		ArrayList<Cards> field = new ArrayList<>();
		
		for(int i = 0; i < 3; i++) {
			field.add(deck1.get(random[i+2]));
			Cards.print(field.get(i).value());
			
		}
		
		
		System.out.println("**************************");



		//progress the game based on user input 
		String move = "";
		//move = check(move, in);

		if(check(move, in).equals("r")){
			System.out.println("enter the amount you want to raise: ");
			int raise = in.nextInt();
			p1.setCash(p1.getCash() - raise);
			System.out.println(p1.toString());
			field.add(deck1.get(random[5]));
			field.add(deck1.get(random[6]));
			for(int i = 0; i < field.size()-1; i++){
				Cards.print(field.get(i).value());
			}
			//move = "";
			in.nextLine();
			if(check(move, in).equals("r")){
			System.out.println("enter the amount you want to raise: ");
			raise = in.nextInt();
			p1.setCash(p1.getCash() - raise);
			System.out.println(p1.toString());
			for(int i = 0; i < field.size(); i++){
				Cards.print(field.get(i).value());
			}
			ArrayList<Cards> c = new ArrayList<>();
			c.add(p1.gethand(value_1));
			c.add(p1.gethand(value_2));
			for(int i = 0; i < field.size(); i++){
				c.add(field.get(i));
			}
			
			checkHandRankings(c);

			}
			
		
		}
		


		
		
					 			 	
					 	
		in.close();			 	
}

}
			 
		 






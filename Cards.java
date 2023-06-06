
public class Cards{
	public String name;
	int value;
	String type;
	String suit;
	public Cards() {
		
	}
	public Cards(String ss) {
		if(ss == "AS") {name = "Ace of Spades"; value = 52; type = "A"; suit = "spade";}
		if(ss == "AH") {name = "Ace of Hearts"; value = 51; type = "A"; suit = "heart";}
		if(ss == "AC") {name = "Ace of Clubs"; value = 50; type = "A"; suit = "club";}
		if(ss == "AD") {name = "Ace of Diamonds"; value = 49; type = "A"; suit = "diamond";}
		if(ss == "KS") {name = "King of Spades"; value = 48; type = "K"; suit = "spade";}
		if(ss == "KH") {name = "King of Hearts"; value = 47; type = "K"; suit = "heart";}
		if(ss == "KC") {name = "King of Clubs"; value = 46; type = "K"; suit = "club";}
		if(ss =="KD") {name = "King of Diamonds"; value = 45; type = "K"; suit = "diamond";}
		if(ss == "QS") {name = "Queen of Spades"; value = 44; type = "Q"; suit = "spade";}
		if(ss == "QH") {name = "Queen of Hearts"; value = 43; type = "Q"; suit = "heart";}
		if(ss == "QC") {name = "Queens of Clubs"; value = 42; type = "Q"; suit = "club";}
		if(ss == "QD") {name = "Queens of Diamonds"; value = 41; type = "Q"; suit = "diamond";}
		if(ss == "JS") {name = "Jack of Spades"; value = 40; type = "J"; suit = "spade";}
		if(ss == "JH") {name = "Jack of Hearts"; value = 39; type = "J"; suit = "heart";}
		if(ss == "JC") {name = "Jack of Clubs"; value = 38; type = "J"; suit = "club";}
		if(ss =="JD") {name = "Jack of Diamonds"; value = 37; type = "J"; suit = "diamond";}
		if(ss == "TenS") {name = "Ten of Spades"; value = 36; type = "10"; suit = "spade";}
		if(ss == "TenH") {name = "Ten of Hearts"; value = 35; type = "10"; suit = "heart";}
		if(ss == "TenC") {name = "Ten of Clubs"; value = 34; type = "10"; suit = "club";}
		if(ss == "TenD") {name = "Ten of Diamonds"; value = 33; type = "10"; suit = "diamond";}
		if(ss == "NineS") {name = "Nine of Spades"; value = 32; type = "9"; suit = "spade";}
		if(ss == "NineH") {name = "Nine of Hearts"; value = 31; type = "9"; suit = "heart";}
		if(ss == "NineC") {name = "Nine of Clubs"; value = 30; type = "9"; suit = "club";}
		if(ss =="NineD") {name = "Nine of Diamonds"; value = 29; type = "9"; suit = "diamond";}
		if(ss == "EightS") {name = "Eight of Spades"; value = 28; type = "8"; suit = "spade";}
		if(ss == "EightH") {name = "Eight of Hearts"; value = 27; type = "8"; suit = "heart";}
		if(ss == "EightC") {name = "Eight of Clubs"; value = 26; type = "8"; suit = "club";}
		if(ss == "EightD") {name = "Eight of Diamonds"; value = 25; type = "8"; suit = "diamond";}
		if(ss == "SevenS") {name = "Seven of Spades"; value = 24; type = "7"; suit = "spade";}
		if(ss == "SevenH") {name = "Seven of Hearts"; value = 23; type = "7"; suit = "heart";}
		if(ss == "SevenC") {name = "Seven of Clubs"; value = 22; type = "7"; suit = "club";}
		if(ss =="SevenD") {name = "Seven of Diamonds"; value = 21; type = "7"; suit = "diamond";}
		if(ss == "SixS") {name = "Six of Spades"; value = 20; type = "6"; suit = "spade";}
		if(ss == "SixH") {name = "Six of Hearts"; value = 19; type = "6"; suit = "heart";}
		if(ss == "SixC") {name = "Six of Clubs"; value = 18; type = "6"; suit = "club";}
		if(ss == "SixD") {name = "Six of Diamonds"; value = 17; type = "6"; suit = "diamond";}
		if(ss == "FiveS") {name = "Five of Spades"; value = 16; type = "5"; suit = "spade";}
		if(ss == "FiveH") {name = "Five of Hearts"; value = 15; type = "5"; suit = "heart";}
		if(ss == "FiveC") {name = "Five of Clubs"; value = 14; type = "5"; suit = "club";}
		if(ss =="FiveD") {name = "Five of Diamonds"; value = 13; type = "5"; suit = "diamond";}
		if(ss == "FourS") {name = "Four of Spades"; value = 12; type = "4"; suit = "spade";}
		if(ss == "FourH") {name = "Four of Hearts"; value = 11; type = "4"; suit = "heart";}
		if(ss == "FourC") {name = "Four of Clubs"; value = 10; type = "4"; suit = "club";}
		if(ss == "FourD") {name = "Four of Diamonds"; value = 9; type = "4"; suit = "diamond";}
		if(ss == "ThreeS") {name = "Three of Spades"; value = 8; type = "3"; suit = "spade";}
		if(ss == "ThreeH") {name = "Three of Hearts"; value = 7; type = "3"; suit = "heart";}
		if(ss == "ThreeC") {name = "Three of Clubs"; value = 6; type = "3"; suit = "club";}
		if(ss =="ThreeD") {name = "Three of Diamonds"; value = 5; type = "3"; suit = "diamond";}
		if(ss == "TwoS") {name = "Two of Spades"; value = 4; type = "2"; suit = "spade";}
		if(ss == "TwoH") {name = "Two of Hearts"; value = 3; type = "2"; suit = "heart";}
		if(ss == "TwoC") {name = "Two of Clubs"; value = 2; type = "2"; suit = "club";}
		if(ss == "TwoD") {name = "Two of Diamonds"; value = 1; type = "2"; suit = "diamond";}
		}

	public String name(int value) {return this.name;}
	public int value() {return this.value;}
	public String type() {return this.type;}
	public static void print(int value) {
		
	if(value == 52) {
		
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♠░░░░░░░░░♠│");
		System.out.println(	  "│░░░█████╗░░│");
		System.out.println(	  "│░░██╔══██╗░│");
		System.out.println(	  "│░░███████║░│");
		System.out.println(	  "│░░██╔══██║░│");
		System.out.println(	  "│░░██║░░██║░│");
		System.out.println(   "│♠░╚═╝░░╚═╝♠│");
		System.out.println(	  "└───────────┘");
	}
	if(value == 51) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♥░░░░░░░░░♥│");
		System.out.println(	  "│░░░█████╗░░│");
		System.out.println(	  "│░░██╔══██╗░│");
		System.out.println(	  "│░░███████║░│");
		System.out.println(	  "│░░██╔══██║░│");
		System.out.println(	  "│░░██║░░██║░│");
		System.out.println(   "│♥░╚═╝░░╚═╝♥│");
		System.out.println(	  "└───────────┘");
	}
	if(value == 50) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♣░░░░░░░░░♣│");
		System.out.println(	  "│░░░█████╗░░│");
		System.out.println(	  "│░░██╔══██╗░│");
		System.out.println(	  "│░░███████║░│");
		System.out.println(	  "│░░██╔══██║░│");
		System.out.println(	  "│░░██║░░██║░│");
		System.out.println(   "│♣░╚═╝░░╚═╝♣│");
		System.out.println(	  "└───────────┘");
	}
	if(value == 49) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♦░░░░░░░░░♦│");
		System.out.println(	  "│░░░█████╗░░│");
		System.out.println(	  "│░░██╔══██╗░│");
		System.out.println(	  "│░░███████║░│");
		System.out.println(	  "│░░██╔══██║░│");
		System.out.println(	  "│░░██║░░██║░│");
		System.out.println(   "│♦░╚═╝░░╚═╝♦│");
		System.out.println(	  "└───────────┘");
	}
	if(value == 48) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♠░░░░░░░░░♠│");
		System.out.println(   "│░░██╗░░██╗░│");
		System.out.println(   "│░░██║░██╔╝░│");
		System.out.println(   "│░░█████═╝░░│");
		System.out.println(   "│░░██╔═██╗░░│");
		System.out.println(   "│░░██║░╚██╗░│");
		System.out.println(   "│♠░╚═╝░░╚═╝♠│");
		System.out.println(   "└───────────┘");
	}
	if(value == 47) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♥░░░░░░░░░♥│");
		System.out.println(   "│░░██╗░░██╗░│");
		System.out.println(   "│░░██║░██╔╝░│");
		System.out.println(   "│░░█████═╝░░│");
		System.out.println(   "│░░██╔═██╗░░│");
		System.out.println(   "│░░██║░╚██╗░│");
		System.out.println(   "│♥░╚═╝░░╚═╝♥│");
		System.out.println(   "└───────────┘");
	}
	if(value == 46) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♣░░░░░░░░░♣│");
		System.out.println(   "│░░██╗░░██╗░│");
		System.out.println(   "│░░██║░██╔╝░│");
		System.out.println(   "│░░█████═╝░░│");
		System.out.println(   "│░░██╔═██╗░░│");
		System.out.println(   "│░░██║░╚██╗░│");
		System.out.println(   "│♣░╚═╝░░╚═╝♣│");
		System.out.println(   "└───────────┘");
	}
	if(value == 45) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♦░░░░░░░░░♦│");
		System.out.println(   "│░░██╗░░██╗░│");
		System.out.println(   "│░░██║░██╔╝░│");
		System.out.println(   "│░░█████═╝░░│");
		System.out.println(   "│░░██╔═██╗░░│");
		System.out.println(   "│░░██║░╚██╗░│");
		System.out.println(   "│♦░╚═╝░░╚═╝♦│");
		System.out.println(   "└───────────┘");
	}
	if(value == 44) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♠░░░░░░░░░♠│");
		System.out.println(	  "│░░██████╗░░│");
		System.out.println(   "│░██╔═══██╗░│");
		System.out.println(   "│░██║██╗██║░│");
		System.out.println(   "│░╚██████╔╝░│");
		System.out.println(   "│░░╚═██╔═╝░░│");
		System.out.println(	  "│♠░░░╚═╝░░░♠│");
		System.out.println(   "└───────────┘");
			

	}
	if(value == 43) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(	  "│░░██████╗░░│");
		System.out.println(   "│░██╔═══██╗░│");
		System.out.println(   "│░██║██╗██║░│");
		System.out.println(   "│░╚██████╔╝░│");
		System.out.println(   "│░░╚═██╔═╝░░│");
		System.out.println(	  "│♥░░░╚═╝░░░♥│");
		System.out.println(   "└───────────┘");

	}
	if(value == 42) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♣░░░░░░░░░♣│");
		System.out.println(	  "│░░██████╗░░│");
		System.out.println(   "│░██╔═══██╗░│");
		System.out.println(   "│░██║██╗██║░│");
		System.out.println(   "│░╚██████╔╝░│");
		System.out.println(   "│░░╚═██╔═╝░░│");
		System.out.println(	  "│♣░░░╚═╝░░░♣│");
		System.out.println(   "└───────────┘");
	}
	if(value == 41) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♦░░░░░░░░░♦│");
		System.out.println(	  "│░░██████╗░░│");
		System.out.println(   "│░██╔═══██╗░│");
		System.out.println(   "│░██║██╗██║░│");
		System.out.println(   "│░╚██████╔╝░│");
		System.out.println(   "│░░╚═██╔═╝░░│");
		System.out.println(	  "│♦░░░╚═╝░░░♦│");
		System.out.println(   "└───────────┘");
	}
	if(value == 40) {
		System.out.println( "┌───────────┐");
		System.out.println( "│♠░░░░░░░░░♠│");
		System.out.println( "│░░░░░░██╗░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░██╗░░██║░░│");
		System.out.println( "│░╚█████╔╝░░│");
		System.out.println( "│♠░╚════╝░░♠│");
		System.out.println( "└───────────┘");
																				
	
	}
	if(value == 39) {
		System.out.println( "┌───────────┐");
		System.out.println( "│♥░░░░░░░░░♥│");
		System.out.println( "│░░░░░░██╗░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░██╗░░██║░░│");
		System.out.println( "│░╚█████╔╝░░│");
		System.out.println( "│♥░╚════╝░░♥│");
		System.out.println( "└───────────┘");
	}
	if(value == 38) {
		System.out.println( "┌───────────┐");
		System.out.println( "│♣░░░░░░░░░♣│");
		System.out.println( "│░░░░░░██╗░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░██╗░░██║░░│");
		System.out.println( "│░╚█████╔╝░░│");
		System.out.println( "│♣░╚════╝░░♣│");
		System.out.println( "└───────────┘");
	}
	if(value == 37) {
		System.out.println( "┌───────────┐");
		System.out.println( "│♦░░░░░░░░░♦│");
		System.out.println( "│░░░░░░██╗░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░░░░░░██║░░│");
		System.out.println( "│░██╗░░██║░░│");
		System.out.println( "│░╚█████╔╝░░│");
		System.out.println( "│♦░╚════╝░░♦│");
		System.out.println( "└───────────┘");
	}
	if(value == 36) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(  "│██████████░│");
		System.out.println(  "│█▀░██─▄▄─█░│");
		System.out.println(  "│██░██─██─█░│");
		System.out.println(  "│▀▄▄▄▀▄▄▄▄▀░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(  "└───────────┘");

	}
	if(value == 35) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(  "│██████████░│");
		System.out.println(  "│█▀░██─▄▄─█░│");
		System.out.println(  "│██░██─██─█░│");
		System.out.println(  "│▀▄▄▄▀▄▄▄▄▀░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(  "└───────────┘");
	}
	if(value == 34) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(  "│██████████░│");
		System.out.println(  "│█▀░██─▄▄─█░│");
		System.out.println(  "│██░██─██─█░│");
		System.out.println(  "│▀▄▄▄▀▄▄▄▄▀░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(  "└───────────┘");
	}
	if(value == 33) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(  "│██████████░│");
		System.out.println(  "│█▀░██─▄▄─█░│");
		System.out.println(  "│██░██─██─█░│");
		System.out.println(  "│▀▄▄▄▀▄▄▄▄▀░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 32) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(	 "│░░██████░░░│");
		System.out.println(	 "│░░█░▄▄░█░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░▀▄▄▄▄▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(	 "│♠░░░░░░░░░♠│");
		System.out.println(  "└───────────┘");
				        
	
	}
	if(value == 31) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(	 "│░░██████░░░│");
		System.out.println(	 "│░░█░▄▄░█░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░▀▄▄▄▄▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(	 "│♥░░░░░░░░░♥│");
		System.out.println(  "└───────────┘");
				        
	
	}
	if(value == 30) {
        System.out.println(	 "┌───────────┐");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(	 "│░░██████░░░│");
		System.out.println(	 "│░░█░▄▄░█░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░▀▄▄▄▄▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(	 "│♣░░░░░░░░░♣│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 29) {
        System.out.println(	 "┌───────────┐");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(	 "│░░██████░░░│");
		System.out.println(	 "│░░█░▄▄░█░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░▀▄▄▄▄▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(	 "│♦░░░░░░░░░♦│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 28) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░▀█▄▄█▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(  "└───────────┘");
		

	}
	if(value == 27) {
        System.out.println(	 "┌───────────┐");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░▀█▄▄█▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 26) {
        System.out.println(	 "┌───────────┐");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░▀█▄▄█▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 25) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░█▀▄▄▀█░░░│");
		System.out.println(  "│░░▀█▄▄█▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 24) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░███░██░░░│");
		System.out.println(	 "│░░▀▀▄██▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♠░░░░░░░░░♠│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 23) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░███░██░░░│");
		System.out.println(	 "│░░▀▀▄██▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♥░░░░░░░░░♥│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 22) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░███░██░░░│");
		System.out.println(	 "│░░▀▀▄██▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♣░░░░░░░░░♣│");
		System.out.println(  "└───────────┘");
	
	}
	if(value == 21) {
		System.out.println(	 "┌───────────┐");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(  "│░░██████░░░│");
		System.out.println(  "│░░█▄▄▄░█░░░│");
		System.out.println(	 "│░░███░██░░░│");
		System.out.println(	 "│░░▀▀▄██▀░░░│");
		System.out.println(  "│░░░░░░░░░░░│");
		System.out.println(  "│♦░░░░░░░░░♦│");
		System.out.println(  "└───────────┘");
	}
	
	if(value == 20) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♠░░░░░░░░░♠│");
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█░▄▄░█░░░│");
		System.out.println(	  "│░░█▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♠░░░░░░░░░♠│");
		System.out.println(	  "└───────────┘");
				
	
	}
	if(value == 19) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♥░░░░░░░░░♥│");
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█░▄▄░█░░░│");
		System.out.println(	  "│░░█▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(	  "└───────────┘");
	
	}
	if(value == 18) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♥░░░░░░░░░♥│");
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█░▄▄░█░░░│");
		System.out.println(	  "│░░█▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(	  "└───────────┘");
	
	}
	if(value == 17) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♦░░░░░░░░░♦│");
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█░▄▄░█░░░│");
		System.out.println(	  "│░░█▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♦░░░░░░░░░♦│");
		System.out.println(	  "└───────────┘");
	
	}
	if(value == 16) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♠░░░░░░░░░♠│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█▄▄▄▒█░░░│");
		System.out.println(	  "│░░▀▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♠░░░░░░░░░♠│");
		System.out.println(   "└───────────┘");
				
}
	if(value == 15) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█▄▄▄▒█░░░│");
		System.out.println(	  "│░░▀▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(   "└───────────┘");
}
	if(value == 14) {
        System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♣░░░░░░░░░♣│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█▄▄▄▒█░░░│");
		System.out.println(	  "│░░▀▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♣░░░░░░░░░♣│");
		System.out.println(   "└───────────┘");
}
	if(value == 13) {
        System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♦░░░░░░░░░♦│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░▄▄▄█░░░│");
		System.out.println(	  "│░░█▄▄▄▒█░░░│");
		System.out.println(	  "│░░▀▄▄▄▄▀░░░│");
		System.out.println(	  "│░░░░░░░░░░░│");
		System.out.println(	  "│♦░░░░░░░░░♦│");
		System.out.println(   "└───────────┘");
}
	if(value == 12) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♠░░░░░░░░░♠│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░█░██░░░│");
		System.out.println(	  "│░░█▄▄░██░░░│");
		System.out.println(	  "│░░▀▀▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(	  "│♠░░░░░░░░░♠│");
		System.out.println(	  "└───────────┘");
				
	}
	if(value == 11) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░█░██░░░│");
		System.out.println(	  "│░░█▄▄░██░░░│");
		System.out.println(	  "│░░▀▀▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(	  "│♥░░░░░░░░░♥│");
		System.out.println(	  "└───────────┘");
    
    }
	if(value == 10) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♣░░░░░░░░░♣│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░█░██░░░│");
		System.out.println(	  "│░░█▄▄░██░░░│");
		System.out.println(	  "│░░▀▀▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(	  "│♣░░░░░░░░░♣│");
		System.out.println(	  "└───────────┘");

	}
	if(value == 9) {
		System.out.println(	  "┌───────────┐");
		System.out.println(	  "│♦░░░░░░░░░♦│");
		System.out.println(	  "│░░██████░░░│");
		System.out.println(	  "│░░█░█░██░░░│");
		System.out.println(	  "│░░█▄▄░██░░░│");
		System.out.println(	  "│░░▀▀▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(	  "│♦░░░░░░░░░♦│");
		System.out.println(	  "└───────────┘");
	}
	if(value == 8) {
		System.out.println(	    "┌───────────┐");
		System.out.println(	    "│♠░░░░░░░░░♠│");
	    System.out.println(		"│░░██████░░░│");
	    System.out.println(		"│░░█▄▄▄░█░░░│");
	    System.out.println(  	"│░░██▄▄░█░░░│");
	    System.out.println(	    "│░░▀▄▄▄▄▀░░░│");
	    System.out.println(		"│░░░░░░░░░░░│");
	    System.out.println(		"│♠░░░░░░░░░♠│");
	    System.out.println(		"└───────────┘");

	}
	if(value == 7) {
		System.out.println(	    "┌───────────┐");
		System.out.println(	    "│♥░░░░░░░░░♥│");
	    System.out.println(		"│░░██████░░░│");
	    System.out.println(		"│░░█▄▄▄░█░░░│");
	    System.out.println(  	"│░░██▄▄░█░░░│");
	    System.out.println(	    "│░░▀▄▄▄▄▀░░░│");
	    System.out.println(		"│░░░░░░░░░░░│");
	    System.out.println(		"│♥░░░░░░░░░♥│");
	    System.out.println(		"└───────────┘");

	}
	if(value == 6) {
		System.out.println(	    "┌───────────┐");
		System.out.println(	    "│♣░░░░░░░░░♣│");
	    System.out.println(		"│░░██████░░░│");
	    System.out.println(		"│░░█▄▄▄░█░░░│");
	    System.out.println(  	"│░░██▄▄░█░░░│");
	    System.out.println(	    "│░░▀▄▄▄▄▀░░░│");
	    System.out.println(		"│░░░░░░░░░░░│");
	    System.out.println(		"│♣░░░░░░░░░♣│");
	    System.out.println(		"└───────────┘");
	}
	if(value == 5) {
		System.out.println(	    "┌───────────┐");
		System.out.println(	    "│♦░░░░░░░░░♦│");
	    System.out.println(		"│░░██████░░░│");
	    System.out.println(		"│░░█▄▄▄░█░░░│");
	    System.out.println(  	"│░░██▄▄░█░░░│");
	    System.out.println(	    "│░░▀▄▄▄▄▀░░░│");
	    System.out.println(		"│░░░░░░░░░░░│");
	    System.out.println(		"│♦░░░░░░░░░♦│");
	    System.out.println(		"└───────────┘");
	}
	if(value == 4) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "│♠░░░░░░░░░♠│");	
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█▀▄▄▀█░░░│");
		System.out.println(   "│░░██▀▄██░░░│");
		System.out.println(   "│░░▀▄▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(   "│♠░░░░░░░░░♠│");
		System.out.println(   "└───────────┘");
			
	}
	if(value == 3) {
        System.out.println(	  "┌───────────┐");
		System.out.println(   "│♥░░░░░░░░░♥│");	
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█▀▄▄▀█░░░│");
		System.out.println(   "│░░██▀▄██░░░│");
		System.out.println(   "│░░▀▄▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(   "│♥░░░░░░░░░♥│");
		System.out.println(   "└───────────┘");
	}
	if(value == 2) {
        System.out.println(	  "┌───────────┐");
		System.out.println(   "│♣░░░░░░░░░♣│");	
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█▀▄▄▀█░░░│");
		System.out.println(   "│░░██▀▄██░░░│");
		System.out.println(   "│░░▀▄▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(   "│♣░░░░░░░░░♣│");
		System.out.println(   "└───────────┘");
	}
	if(value == 1) {
        System.out.println(	  "┌───────────┐");
		System.out.println(   "│♦░░░░░░░░░♦│");	
		System.out.println(   "│░░██████░░░│");
		System.out.println(   "│░░█▀▄▄▀█░░░│");
		System.out.println(   "│░░██▀▄██░░░│");
		System.out.println(   "│░░▀▄▄▄▄▀░░░│");
		System.out.println(   "│░░░░░░░░░░░│");
		System.out.println(   "│♦░░░░░░░░░♦│");
		System.out.println(   "└───────────┘");
	}
}
}


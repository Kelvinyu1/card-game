
public class Cards{
	public String name;
	int value;
	public Cards() {
		
	}
	public Cards(String type) {
		if(type == "AS") {name = "Ace of Spades"; value = 0;}
		if(type == "AH") {name = "Ace of Hearts"; value = 1;}
		if(type == "AC") {name = "Ace of Clubs"; value = 2;}
		if(type == "AD") {name = "Ace of Diamonds"; value = 3;}
		if(type == "KS") {name = "King of Spades"; value = 4;}
		if(type == "KH") {name = "King of Hearts"; value = 5;}
		if(type == "KC") {name = "King of Clubs"; value = 6;}
		if(type =="KD") {name = "King of Diamonds"; value = 7;}
		if(type == "QS") {name = "Queen of Spades"; value = 8;}
		if(type == "QH") {name = "Queen of Hearts"; value = 9;}
		if(type == "QC") {name = "Queens of Clubs"; value = 10;}
		if(type == "QD") {name = "Queens of Diamonds"; value = 11;}
		if(type == "JS") {name = "Jack of Spades"; value = 12;}
		if(type == "JH") {name = "Jack of Hearts"; value = 13;}
		if(type == "JC") {name = "Jack of Clubs"; value = 14;}
		if(type =="JD") {name = "Jack of Diamonds"; value = 15;}
		if(type == "TenS") {name = "Ten of Spades"; value = 16;}
		if(type == "TenH") {name = "Ten of Hearts"; value = 17;}
		if(type == "TenC") {name = "Ten of Clubs"; value = 18;}
		if(type == "TenD") {name = "Ten of Diamonds"; value = 19;}
		if(type == "NineS") {name = "Nine of Spades"; value = 20;}
		if(type == "NineH") {name = "Nine of Hearts"; value = 21;}
		if(type == "NineC") {name = "Nine of Clubs"; value = 22;}
		if(type =="NineD") {name = "Nine of Diamonds"; value = 23;}
		if(type == "EightS") {name = "Eight of Spades"; value = 24;}
		if(type == "EightH") {name = "Eight of Hearts"; value = 25;}
		if(type == "EightC") {name = "Eight of Clubs"; value = 26;}
		if(type == "EightD") {name = "Eight of Diamonds"; value = 27;}
		if(type == "SevenS") {name = "Seven of Spades"; value = 28;}
		if(type == "SevenH") {name = "Seven of Hearts"; value = 29;}
		if(type == "SevenC") {name = "Seven of Clubs"; value = 30;}
		if(type =="SevenD") {name = "Seven of Diamonds"; value = 31;}
		if(type == "SixS") {name = "Six of Spades"; value = 32;}
		if(type == "SixH") {name = "Six of Hearts"; value = 33;}
		if(type == "SixC") {name = "Six of Clubs"; value = 34;}
		if(type == "SixD") {name = "Six of Diamonds"; value = 35;}
		if(type == "FiveS") {name = "Five of Spades"; value = 36;}
		if(type == "FiveH") {name = "Five of Hearts"; value = 37;}
		if(type == "FiveC") {name = "Five of Clubs"; value = 38;}
		if(type =="FiveD") {name = "Five of Diamonds"; value = 39;}
		if(type == "FourS") {name = "Four of Spades"; value = 40;}
		if(type == "FourH") {name = "Four of Hearts"; value = 41;}
		if(type == "FourC") {name = "Four of Clubs"; value = 42;}
		if(type == "FourD") {name = "Four of Diamonds"; value = 43;}
		if(type == "ThreeS") {name = "Three of Spades"; value = 44;}
		if(type == "ThreeH") {name = "Three of Hearts"; value = 45;}
		if(type == "ThreeC") {name = "Three of Clubs"; value = 46;}
		if(type =="ThreeD") {name = "Three of Diamonds"; value = 47;}
		if(type == "TwoS") {name = "Two of Spades"; value = 48;}
		if(type == "TwoH") {name = "Two of Hearts"; value = 49;}
		if(type == "TwoC") {name = "Two of Clubs"; value = 50;}
		if(type == "TwoD") {name = "Two of Diamonds"; value = 51;}
		}
	
	public int value() {return this.value;}
	public static void print(int value) {
		
	if(value == 0) {
		
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
	if(value == 1) {
		System.out.println(	  "┌───────────┐");
		System.out.println(   "    │♥░░░░░░░░░♥│");
		System.out.println(	  "│░░░█████╗░░│");
		System.out.println(	  "│░░██╔══██╗░│");
		System.out.println(	  "│░░███████║░│");
		System.out.println(	  "│░░██╔══██║░│");
		System.out.println(	  "│░░██║░░██║░│");
		System.out.println(   "    │♥░╚═╝░░╚═╝♥│");
		System.out.println(	  "└───────────┘");
	}
	if(value == 2) {
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
	if(value == 3) {
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
	if(value == 4) {
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
	if(value == 5) {
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
	if(value == 6) {
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
	if(value == 7) {
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
	if(value == 8) {
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
	if(value == 9) {
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
	if(value == 10) {
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
	if(value == 11) {
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
	if(value == 12) {
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
	if(value == 13) {
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
	if(value == 14) {
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
	if(value == 15) {
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
	if(value == 16) {
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
	if(value == 17) {
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
	if(value == 18) {
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
	if(value == 19) {
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
	if(value == 20) {
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
	if(value == 21) {
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
	if(value == 22) {
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
	if(value == 23) {
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
	if(value == 24) {
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
	if(value == 25) {
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
	if(value == 27) {
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
	if(value == 28) {
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
	if(value == 29) {
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
	if(value == 30) {
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
	if(value == 31) {
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
	
	if(value == 32) {
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
	if(value == 33) {
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
	if(value == 34) {
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
	if(value == 35) {
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
	if(value == 36) {
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
	if(value == 37) {
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
	if(value == 38) {
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
	if(value == 39) {
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
	if(value == 40) {
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
	if(value == 41) {
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
	if(value == 42) {
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
	if(value == 43) {
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
	if(value == 44) {
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
	if(value == 45) {
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
	if(value == 46) {
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
	if(value == 47) {
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
	if(value == 48) {
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
	if(value == 49) {
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
	if(value == 50) {
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
	if(value == 51) {
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



public class mainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Problem 1
//		System.out.println("Problem 1");
//		Girl Sarah = new Girl(9, "Sarah", "Blonde", "Blue");
//		System.out.println(Sarah.toString());
//		
//		Girl doll = new Girl();
//		System.out.println(doll.getFig() + " " + doll.getName() + " "
//				+ doll.getHair() + " " + doll.getEye());
//		doll.setEye("Blue");
//		doll.setHair("Redhead");
//		doll.setFigure(10);
//		doll.setName("Swedish Model");
//		System.out.println(doll.toString());
//		
//		DanceCard Thursday = new DanceCard();
//		System.out.println(Thursday.toString());
//		System.out.println(Thursday.getDay()+" "+Thursday.getHour()+" "
//				+Thursday.getGirl(1));
//		Thursday.setDay(6);
//		Thursday.setHour(21);
//		Thursday.setGirl(0, 7, "Blood Red", "Black", "Satan");
//		System.out.println(Thursday.getGirl(0));
//		
//		DanceCard Friday = new DanceCard(5, 21);
//		System.out.println(Friday.cardAverage());
//		System.out.println(" ");
//		
//		//Problem 2
//		System.out.println("Problem 2");
//		Clothing StraightJeans = new Clothing();
//		System.out.println(StraightJeans); //constructs and prints using all four constructors
//		Pants FullJeans = new Pants();				  //and toStrings
//		System.out.println(FullJeans);
//		Clothing BlueTee = new Clothing('M', "Blue", true, true);
//		System.out.println(BlueTee);
//		Pants Khakis = new Pants('L', "Tan", true, 6, true);
//		System.out.println(Khakis);
//		
//		Khakis.bleach(); //oh no, my sister messed up the laundry!
//		BlueTee.bleach();
//		System.out.println(Khakis);
//		System.out.println(BlueTee);
//		
//		Khakis.convertToShorts(); //when trying to fix them, she hemmed randomly instead!
//		BlueTee.convertToShorts();
//		System.out.println(Khakis);
//		System.out.println(BlueTee);
//		System.out.println(" ");
//		
//		//Problem 3
//		System.out.println("Problem 3");
//		watch watch1 = new watch();
//		watch watch2 = new watch(14);
//		watch watch3 = new watch(15, 30);
//		watch watch4 = new watch(16, 37, 59);
//		System.out.println(watch1.toString());
//		System.out.println(watch2.toString());
//		System.out.println(watch3.toString());
//		System.out.println(watch4.toString());
//		System.out.println(" ");
//		
//		
//		//Problem 4
//		System.out.println("Problem 4");
//		TicTacToe game = new TicTacToe();
//		game.playGame();
//		System.out.println(game.toString());
//		System.out.println(" ");
//		
//		//Problem 5
//		System.out.println("Problem 5");
//		Bee Seinfeld = new Bee(6, 37, 38);
//		Harvester Charlie = new Harvester(7, 17, 27, 1, 5);
//		ThrowerAnt Jeter = new ThrowerAnt(15, 1, 1, 6);
//		
//		System.out.println(Seinfeld.toString());
//		System.out.println(Seinfeld.isAnt());
//		Seinfeld.move();
//		Jeter.throwsAt(Seinfeld);
//		System.out.println(Seinfeld.toString());
//		System.out.println(" ");
//		
//		System.out.println(Charlie.toString());
//		System.out.println(Charlie.isAnt());
//		Seinfeld.sting(Charlie);
//		System.out.println(Charlie.toString());
//		System.out.println(" ");
//		
//		System.out.println(Jeter.toString());
//		System.out.println(Jeter.isAnt());
//		Seinfeld.sting(Jeter);
//		System.out.println(Jeter.toString());
//		System.out.println(" ");
		
		//Problem 6
		System.out.println("Problem 6");
		Wordlist cry = new Wordlist("mostcommonwords.txt");
		//cry.matching();
		System.out.println(cry.nToW("364"));
		//System.out.println(cry.wToN("happy"));
		
		
	}

}

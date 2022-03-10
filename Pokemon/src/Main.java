//This project written by halekara

public class Main {
	public static void main(String[] args) {
		long start = System.currentTimeMillis();

		Player player1 = new Player("Hale");
		Player player2 = new Player("Murat");

		Character pikachu1 = new Pikachu(15);
		Character misty1 = new Misty(22);

		Character charizard2 = new Charizard(18);
		Character pikachu2 = new Pikachu(45);

		Character[] p1characterList = new Character[2];
		p1characterList[0] = pikachu1;
		p1characterList[1] = misty1;

		Character[] p2characterList = new Character[2];
		p2characterList[0] = charizard2;
		p2characterList[1] = pikachu2;

		player1.setCharacters(p1characterList);
		player2.setCharacters(p2characterList);

		PokemonGame game = new PokemonGame(player1, player2);
		game.start();
		long end = System.currentTimeMillis();
		System.out.println("Oyun süresi: " + (end - start) + " ms");
	}
}

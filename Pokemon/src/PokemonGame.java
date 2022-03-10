
public class PokemonGame {

	Player player1;
	Player player2;

	public PokemonGame(Player player1, Player player2) {
		this.player1 = player1;
		this.player2 = player2;
	}

	public void start() {
		while (player1.getHealth() > 0 && player2.getHealth() > 0) {

			Character player1Character = player1.getNextCharacter();
			Character player2Character = player2.getNextCharacter();

			if (player1.getHealth() < 10 && player1Character instanceof Boostable) {
				Boostable p = (Boostable) player1Character;
				p.boost();
			}
			System.out.println(player1.getName() + " vuruyor.");
			player1Character.hit(player2);

			if (!player2.isAlive()) {
				this.printTurnResult();

			}
//			if (player1.getHealth() < 0 || player2.getHealth() < 0) {
//				System.out.println("oyun bitti.");
//				System.exit(0);
//
//			}
			if (player2.getHealth() <= 0 && player2.getHealth() < player1.getHealth()) {
				System.out.println(player2.getName() + " kaybetti.");
				System.out.println(player2.getHealth());
				System.exit(0);
			}
			if (player2.getHealth() < 10 && player2Character instanceof Boostable) {
				Boostable p = (Boostable) player2Character;
				p.boost();
			}
			System.out.println(player2.getName() + " vuruyor.");
			player2Character.hit(player1);

			if (!player1.isAlive()) {
				this.printTurnResult();

			}

		}
		if (player1.getHealth() <= 0 && player1.getHealth() < player2.getHealth()) {
			System.out.println(player1.getName() + " kaybetti.");
			System.out.println(player1.getHealth());
			System.exit(0);

		}
//		if (player2.getHealth() <= 0 && player2.getHealth() < player1.getHealth()) {
//			System.out.println(player2.getName() + " kaybetti.");
//			System.out.println(player2.getHealth());
//			System.exit(0);
//		}

	}

	public void printTurnResult() {
		System.out.println("Player1 name: " + player1.getName());
		System.out.println("Player2 name: " + player2.getName());
		System.out.println("Player1 health: " + player1.getHealth());
		System.out.println("Player2 health: " + player2.getHealth());

	}

}

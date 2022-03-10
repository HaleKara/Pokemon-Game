
public class Character {
	public String characterName;
	protected int power;

	public Character(String characterName, int power) {
		this.characterName = characterName;
		this.power = power;

	}

	public void hit(Player p) {
		System.out.println(p.getName() + "'nın gücü: " + p.getHealth());
		System.out.println(p.getName() + "'a vuruluyor.");
		this.printAttackDetail();

		p.setHealth(p.getHealth() - this.power);
		System.out.println(p.getName() + "'nın kalan gücü: " + p.getHealth());

		System.out.println("--------------");
	}

	public void printAttackDetail() {
		System.out.println(this.characterName + " ile " + this.power + " gücünde vuruldu.");

		if (characterName == "Pikachu") {
			System.out.println("Character is Boostable");
		}

	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}

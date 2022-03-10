
public class Player {
	private String name;
	int health;
	private int currentCharacterIndice; // mevcut karakter indisini tutuyor.
	private Character[] characterList; // bir karakterin listesini tutuması için bunu koydum.

	public Player(String name) {
		this.name = name;
		this.health = 100;
		this.currentCharacterIndice = 0; // en başta hep 0 olacak. Yani 1. karakteri çağıracağız.

	}

	public void setCharacters(Character[] c) {
		// Karakter playera ait olduğu için, Playerın karakteri olduğu için burada set
		this.characterList = c;
	}

	public Character[] getCharacters() {
		return this.characterList;
	}

	public String getName() {
		return this.name;
	}

	public void printInfo() {
		System.out.println("Oyuncunun adı: " + this.name);
		System.out.println("Oyuncunun sağlığı: " + this.health);

	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public Character getNextCharacter() {
		Character character = this.characterList[this.currentCharacterIndice];
		if (this.currentCharacterIndice == 0) {
			this.currentCharacterIndice = 1;
		} else {
			this.currentCharacterIndice = 0;
		}
		return character;

	}

	public boolean isAlive() {
		if (getHealth() <= 0) {
			return false;

		} else
			return true;
	}

}

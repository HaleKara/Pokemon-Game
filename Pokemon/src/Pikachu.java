
public class Pikachu extends Character implements Boostable {

	public Pikachu(int power) {
		super("Pikachu", power);

	}

	@Override
	public void boost() {
		super.setPower(power * 2);
	}

}

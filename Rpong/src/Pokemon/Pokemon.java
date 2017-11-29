package Pokemon;

public class Pokemon {

	private int level;
	private int hp;
	private String name;
	private boolean poisoned;

	public Pokemon(String name, int level){
		this.level = level;
		this.hp = 100;
		this.name = name;
		boolean poisoned = false;
	}

	public static void main(String[] args) {
		Pokemon squirtle = new Pokemon("Squirtle",26);
		Pokemon bulbasaur = new Pokemon("Bulbasaur",26);
		squirtle.iChooseYou();
		bulbasaur.iChooseYou();
	}

	private static void printScore(Pokemon p1, Pokemon p2) {
		System.out.println(p1.getName()+", HP = "+p1.getHP());
		System.out.println(p2.getName()+", HP = "+p2.getHP());
	}

	public void iChooseYou() {
		System.out.println(name +" " +name);
	}

	public int getHP() {
		return hp;
	}

	public void setHP(int hp) {
		this.hp = hp;
	}

	public String getName() {
		return name;
	}

	public void setPoisoned(boolean b) {
		this.poisoned = b;
	}

	public void lapse() {
		if(poisoned) {
			hp -= 15;
		}
	}

	public void attack(Pokemon target, Attack attack){
		if(Math.random() < .9){
			attack.attack(target);
			System.out.println("The attack hit");
		}
		else{
			System.out.println("The attack missed");
		}
	}

	public void levelUp(Effect e) {
		this.level++;
		e.happen();
	}
}

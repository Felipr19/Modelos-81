package characters;

public abstract class Character{
	private String name;
	private Spell spell;
	
	public Character(String name,Spell spell) {
	
		this.name = name;
		this.spell = spell;
		
	}
	
	public void cast(){
		System.out.println(this.name+" uses: ");
		this.spell.castSpell();
		System.out.println();
	}
	
	public void changeSpell(Spell newSpell) {
		this.spell = newSpell;
	}
}

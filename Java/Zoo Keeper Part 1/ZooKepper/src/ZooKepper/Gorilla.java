package ZooKepper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Boooooooooooom");
		int Energy = this.getEnergyLevel() ;
		Energy -= 5 ;
		this.setEnergyLevel(Energy);
		System.out.println("Gorilla energy now : " + Energy);
	}
	public void eatBananas() {
		System.out.println("Gorillah Happy now :)");
		int Energy = this.getEnergyLevel();
		Energy += 10 ;
		this.setEnergyLevel(Energy);
		System.out.println("Gorilla energy now : " + Energy);
		
	}
	public void climb() {
		System.out.println("i'm Clombing");
		int Energy = this.getEnergyLevel() ;
		Energy -= 10 ;
		this.setEnergyLevel(Energy);
		System.out.println("Gorilla energy now : " + Energy);
	}
	
	
		
}


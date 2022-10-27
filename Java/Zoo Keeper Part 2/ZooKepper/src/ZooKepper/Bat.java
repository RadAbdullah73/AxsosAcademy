package ZooKepper;

public class Bat extends Mammal {
	public void fly() {
		this.setEnergyLevel(300);
		System.out.println("Weeeeeeeeeeeeee");
		int Energy = this.getEnergyLevel() ;
		Energy -= 50 ;
		this.setEnergyLevel(Energy);
		System.out.println("Bat flying now , its Energy equal  : " + Energy);
	}
	public void eatHumans() {
		this.setEnergyLevel(this.getEnergyLevel());
		System.out.println("Yummmmmyyyyy");
		int Energy = this.getEnergyLevel() ;
		Energy += 25 ;
		this.setEnergyLevel(Energy);
		System.out.println("Bat energy now : " + Energy);
	}
	public void attackTown() {
		this.setEnergyLevel(this.getEnergyLevel());
		System.out.println("OMG , there is a fiiiiiiiiiiire");
		int Energy = this.getEnergyLevel() ;
		Energy -= 100 ;
		this.setEnergyLevel(Energy);
		System.out.println("Bat energy now : " + Energy);
		
	}
	
	

}

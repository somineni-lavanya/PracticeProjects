package demopack;
//Abstraction

abstract class Animal {

	public abstract void animalSound();

	public void sleep() {
		System.out.println("Zzz");
	}
}

class Duck extends Animal {
	public void animalSound() {

		System.out.println("The Duck says: Beck Beck");
	}
}
public class Abstraction { 
	  public static void main(String[] args) {
	    Duck d = new Duck(); 
	    d.animalSound();
	    d.sleep();
	  }
	}



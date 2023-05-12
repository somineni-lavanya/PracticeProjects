package demopack;



class Animals{  
	void eat(){
		System.out.println("eating...");}  
	}  
	class Cat extends Animals{  
	void drink(){
		System.out.println("drinkking...");}  
	}  
	class Meow extends Cat{  
	void walk(){
		System.out.println("walking...");}  
	}  
public class Inheritance {
public static void main(String args[]){  
	Meow m=new Meow();  
	m.walk();  
	m.drink();  
	m.eat();  
	}}  

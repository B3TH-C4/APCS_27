package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
//--------------------------------------------------
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog(String a){
		name = a;
		age = 1;
		breed = "dog dog";
	}
	public Dog(String a, String b){
		name = a;
		breed = b;
		age = 1;
	}
	public Dog(String a, int c){
		name = a;
		breed = "dog dog";
		age = c;
	}
	public Dog(String a, int age, String b){
		name = a;
		this.age = age;
		breed = b;
	}
// -----------------------------------------------
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
		return;
	}

	public int getAge(){
		return age;
	}
	public void setAge(int age){
		this.age = age;
		return;
	}

	public String getBreed(){
		return breed;
	}
	public void setBreed(String breed){
		this.breed = breed;
		return;
	}
//-------------------------------------------------
	public boolean isSleep(){
		boolean isAsleep;
		int sleep = (int) (Math.random()*2);
		if (sleep == 0){
			isAsleep = true;
			return isAsleep;
		}
		else if (sleep == 1){
			isAsleep = false;
			return isAsleep;
		}
		else{
			return false;
		}
	}

	public void bark(){
		System.out.println(name + ": arf!");
	}

}

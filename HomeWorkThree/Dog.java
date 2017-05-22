package com.kateg;

import java.util.Scanner;

public class Dog {
	private String name;
	private String breed;
	private int age;
	Breed breedEnum;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}	
	
	public Dog(String name, String breed, int age) {
		this.name = name;
		this.breed = breed;
		this.age = age;
	}
	public Dog() {
		
	}


	public enum Breed {
		Malamute, Terrier, Spaniel, Beagle, Sheepdog
	}
	
	public void input (Scanner sc){
		System.out.print("Enter name ");
		name = sc.next();
		System.out.println("Enter age ");
	    age = sc.nextInt();
	    System.out.println("Choose breed: Malamute, Terrier, Spaniel, Beagle, Sheepdog ");
	    breed = sc.next() ;
	    Breed breedEnum = Breed.Beagle;
	    switch (breed.toLowerCase()){
	    case "malamute": breedEnum =Breed.Malamute; break;
	    case "terrier": breedEnum = Breed.Terrier; break;
	    case "spaniel": breedEnum = Breed.Spaniel; break;
	    case "beagle": breedEnum = Breed.Beagle;  break;
	    case "sheepdog": breedEnum = Breed.Sheepdog; break;
	    default: System.out.println("Uncknown animal");break;
	    
	    } 
	    this.breedEnum = breedEnum;	   	    
	}
	
	public void output() {
    	System.out.println("Dog name " + name + " age " + age + " breed "+ breedEnum );
    }
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner (System.in);
		Dog dogs[] = new Dog[3];
		dogs[0]=new Dog();
		dogs[0].input(sc);
		dogs[0].output();
					
		dogs[1]=new Dog();
		dogs[1].input(sc);
		dogs[1].output();
		
		dogs[2]=new Dog();
		dogs[2].input(sc);
		dogs[2].output();
		
		 sc.close(); 
		 
		
		 System.out.println("the same name between 1 and 2 "+dogs[0].equals(dogs[1]));
		 System.out.println("the same name between 2 and 3"+dogs[1].equals(dogs[2]));
		 System.out.println("the same name between 3 and 1 "+dogs[2].equals(dogs[0]));
		 
		 int old =0;
		 int oldi=0;
		 for (int i=0; i<dogs.length;i++){
			 if (old < dogs[i].age) 
			 {
				 old = dogs[i].age;
			     oldi=i;
			 }
		 }
		 System.out.println("Oldest dog is " + dogs[oldi].name + " it's breed of " + dogs[oldi].breedEnum);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}

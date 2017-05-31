package HW5;

import java.util.Scanner;

public class HomeWork5 {

	public static void main(String[] args) {

// 1. Ask user to enter the number of month. Read the value and write the amount of days in this month (create array with amount days of each month). 		
		int[] m_days  = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
         Scanner scan= new Scanner(System.in);
         System.out.print("Enter the number of month ");
         int month=scan.nextInt()-1;
         if (month<12)
         {System.out.println("Amount of days in this month: "+m_days[month]);}
         else {System.out.println("Wrong the number of month");}

// 2.Enter 10 integer numbers. Calculate the sum of first 5 elements if they are positive or product of last 5 element in the other case.
    System.out.println();         
         int[] num = {1,-5,0,-1,7,3,12,-4,6,-2};
         int sum=0;
         int prod=1;
         for (int i=0;i<num.length;i++) 
         {
	        if (i<5)
	        	{if(num[i]>0){sum+=num[i];}}
	        else {prod=prod*num[i];}
         }
         System.out.println("Sum of first 5 elements = "+sum);
         System.out.println("Product of last 5 element = "+prod);
         
// 3.Enter 5 integer numbers. 
//	-Find position of second positive number; 
//	-minimum and its position in the array.
         System.out.println();         
         int[] num2 = {1,-5,-1,5,3};
         int kp=0;
         int secp=0;
         int pmin=0;
         for (int i=0;i<num2.length;i++)
         {
        	 if (num2[i]>0){kp++;}
        	 if (kp==2){secp=i;}
        	 if (num2[pmin]>num2[i]){pmin=i;}
         }

         System.out.println("Position of second positive number : "+secp);	
         System.out.println("minimum = "+num2[pmin]+" and its position : "+pmin);	
             
         
         
// 4.Organize entering integers until the first negative number. Count the product of all entered even numbers.
         System.out.println();
         int count=0;
         int product = 1;
         int num3;
         while (true) {
			System.out.print("Enter integer number : ");
			num3=scan.nextInt();
			if (num3 % 2 == 0) {product=product*num3;count++;}
			if (num3<0) {break;}
		}
         System.out.println("Count the even numbers: "+count+", product ="+product);
         
// 5.Create class Car with fields type, year of production and engine capacity. Create and initialize four instances of class Car. Display cars
//	--certain model year  (enter year in the console);
//	--ordered by the field year.
         System.out.println();
         Car[] car=new Car[4];
         car[0]=new Car("BMW", 2.5);
         car[1]=new Car("Nissan", 2);
         car[2]=new Car("Ford", 1.6);
         car[3]=new Car("Fiat", 1.2);
         
         for (int i=0;i<car.length;i++)
         {
        	 System.out.println("Enter year car production ");
        	 System.out.println(car[i]);
        	 car[i].setYear(scan.nextInt());
         }
         
         Car tmp_car= new Car();
         for (int i = 0; i < car.length - 1; i++) {
         	for (int j = i + 1; j < car.length; j++) {
         		if (car[i].getYear() < car[j].getYear()) {
         			tmp_car = car[i];
         			car[i] = car[j];
         			car[j] = tmp_car;
         		}
         	}
         }
        for (Car cart: car) {System.out.println(cart+", year="+cart.getYear());}
	}

}


package HW5;

public class Car {
	private String type;
	private int year;
	private double engine;
	
	public Car() {}

	public Car(String type, double engine) {
		super();
		this.type = type;
		this.engine = engine;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String toString() {
		return "Car type=" + type + ", engine=" + engine + "";
	}

}

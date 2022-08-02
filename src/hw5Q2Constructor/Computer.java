package hw5Q2Constructor;

import javax.swing.plaf.synth.SynthIcon;

public class Computer{ 		
	
public String brand;  
public String model;	
public String OS;
public	String price;  
public char grade;  	
public boolean madeInUSA;	
	
public Computer() {
System.out.println("This is from default Constructor of Computer class");}	

public Computer(String brand,String model,String OS,String price,char grade,boolean madeInUSA) { 
 this.brand=brand;
 this.model=model;
 this.OS=OS;
 this.price=price;
 this.grade=grade;
 this.madeInUSA=madeInUSA;
 System.out.println("This is parameterized constructor");
}





}





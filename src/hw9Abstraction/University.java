
package hw9Abstraction;

public interface University extends  College, Hospital{
public void classSize();
public void playGround(); 
public void teacher();	


//University object =new University() {}
//Note-We can not create a Constructor inside University interface

public default void morgue (){
}
public static void pharmacy () {}
//1 keyword is used for the inheritance in Interface	
//Interface can inherit other Interfaces by extends key word	
//More than one inheritance is possible	
/* there are no keywords used  for the inheritance in Java for Abstract Class
 *yes,an Abstract Class can inherit other Abstract Class or a regular class  by extends keyword 
 *An Abstract Class can not inherit interface by extends keyword
 * 1 inheritances is possible by an Abstract Class
 * keywords are not used for the inheritance in Java for a regular Class
 * yes,a regular Class can inherit other Abstract Class or a regular class  by extends key word but not  inheritances interface by extends key word
 * 
 * 
 * 
 * 
 */	
	
}
}
	
	
	
  	
	


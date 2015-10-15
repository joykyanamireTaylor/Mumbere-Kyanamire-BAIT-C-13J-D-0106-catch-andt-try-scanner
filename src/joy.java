import java.util.Scanner; 
class joy { 
public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
	
try {
	System.out.println("please enter a number...");
	int userinput =sc.nextInt();
	System.out.println(userinput/10);
 
} catch (Exception e) { 
System.out.println("ERROR."); 
} 
} 
}
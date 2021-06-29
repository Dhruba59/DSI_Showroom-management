package package1;
import java.util.Scanner;

public class main {

//	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		controller controller1 = new controller();
		
		while(true) {		
			System.out.println("+--------------------+------------------+--------------------+------------------------+");
			System.out.println("|1 - add new vehicle | 2 - show details | 3 - remove vehicle | 4 - number of visitor  |");
			System.out.println("+--------------------+------------------+--------------------+------------------------+");
			
			try {
				String input = scanner.nextLine();
				int val = Integer.parseInt(input);
				
				if(val == 1) {
					System.out.println("Select the type of vehicle you want to add to the showroom");;
					System.out.println("+--------------------+------------------+--------------------+");
					System.out.println("|1 - Sports vehicle | 2 - Heavy Vehicle | 3 - Normal vehicle |");
					System.out.println("+--------------------+------------------+--------------------+");
				
					int typ = Integer.parseInt(scanner.nextLine());
					if(typ == 1) controller1.addVehicle("sports");
					if(typ == 2) controller1.addVehicle("heavy");
					if(typ == 3) controller1.addVehicle("normal");
					
				}
				
				else if (val == 2) {
					controller1.showDetails();
				}
				else if (val == 3) {
					System.out.println("Enter vehicle id to remove it from showroom");
					String id = scanner.nextLine();
					controller1.removeVehicle(Integer.parseInt(id));
				}
				else if(val == 4)  controller1.showExpectedVisitor();
				
				else System.out.println("Please enter a number between 1 and 4");
			}
			
			catch (Exception e) {
				System.out.println("Error occured. Try again");
			}
			
			
		}
		
		
	}

}

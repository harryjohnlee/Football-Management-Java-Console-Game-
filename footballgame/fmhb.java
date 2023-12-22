package footballgame;
import java.util.Random;
import java.util.Scanner;

public class fmhb {
public static final String ANSI_RESET = "\u001B[0m";
public static final String ANSI_RED = "\u001B[31m";
public static final String ANSI_GREEN = "\u001B[32m";
public static final String ANSI_YELLOW = "\u001B[33m";


	public static void main(String[] args) {
	
	startup();
	
	
	
	}	
	public static void startup() {
		
		Scanner keyboardInput = new Scanner(System.in);
		System.out.println("Hello and welcome to Football manager, please type your name: ");
		String managerName = keyboardInput.nextLine();
		System.out.println("Welcome " + managerName + ", please choose your team name: ");
		String teamName = keyboardInput.nextLine();
		System.out.println("which formation would you like to play?");
		System.out.println("4-4-2, 4-3-3, 4-2-3-1");
		String formation = keyboardInput.nextLine();
			
			while(true) {	
				if (formation.equals("4-4-2")==true){
					String chosenFormation = keyboardInput.nextLine();
					System.out.println("the formation of 4-4-2 has been selected");
					break;
				}
				else if (formation.equals("4-3-3")==true){
					String chosenFormation = keyboardInput.nextLine();
					System.out.println("the formation of 4-3-3 has been selected");
					break;
				}
				else if (formation.equals("4-2-3-1")==true){
					String chosenFormation = keyboardInput.nextLine();
					System.out.println("the formation of 4-2-3-1 has been selected");
					break;
				}
				else{
					System.out.println("error please retry");
					formation = keyboardInput.nextLine();
				}
			}
		String[][] players = teamGenerator();
		System.out.println("BREAKING NEWS....");
		System.out.println("_______________________________________________________________");
		System.out.println(managerName + " has been assigned as the new "+ teamName +" manager.");
		System.out.println("Favouriting the strong " + formation + ", " + managerName + " will hope to win the hearts of the fans and provide good results.");	
		System.out.println("_______________________________________________________________");
		mainMenu(players,formation);
		}
	public static String[][] teamGenerator() {
		String[][] players = new String[16][6];
		String[] randomNames = {"Erickson","Ryan","Briggs","Hunt","Rice","Leonard",
				"Sinclair","Baird","Gordon","Howard","Roberts",
				"Donnelly","Deleon","Phillips","Holland","Grant","Miller","Seymour",
				"Mcdonald","Trujillo","Rivas","Padilla","Chambers"
				,"Ford","Manning","Wilkes","Valdez","Graves","Gross","Moss","Carrol",
				"Webb","George","Hale","Morales","Atherton","Curry","Carpenter",
				"Bryant","Simmons","Pearson","Becker","O’Reilly","Brooks",
				"Ali","Cunningham","Goddard","Guerrero","Begum","Norris","Smith", "Johnson", 
				"Williams", "Brown", "Jones",
	            "Davis", "Miller", "Wilson", "Moore", "Taylor",
	            "Anderson", "Jackson", "White", "Harris", "Martin",
	            "Thompson", "García", "Martínez", "Robinson", "Clark",
	            "García", "Rodríguez", "Martínez", "López", "Hernández",
	            "Pérez", "Sánchez", "Ramírez", "González", "Torres",
	            "Flores", "Díaz", "Vásquez", "Romero", "Cruz",
	            "Reyes", "Morales", "Ortega", "Silva", "Ramos",
	            "Müller", "Schmidt", "Schneider", "Fischer", "Weber",
	            "Meyer", "Wagner", "Becker", "Hoffmann", "Schulz",
	            "Schäfer", "Koch", "Bauer", "Richter", "Klein",
	            "Wolf", "Schröder", "Neumann", "Schwarz", "Zimmermann",
	            "Martin", "Bernard", "Thomas", "Dubois", "Moreau", "Fletcher", "Quinn", "Lowe", "Higgins", "Wade",
	            "Greer", "Mercer", "McClure", "Blevins", "O'Donnell",
	            "Watts", "Shea", "Cantu", "Hobbs", "McKenzie",
	            "Estrada", "Gallagher", "Reilly", "Bass", "Boyle",
	            "Mays", "Mercado", "Dickson", "Buckner", "Dougherty",
	            "Frye", "Stanton", "O'Neill", "Mejia", "Decker",
	            "Dalton", "Mccarthy", "Juarez", "Reeves", "Whitney",
	            "Cantu", "Galloway", "Morse", "Griffith", "Fry",
	            "McMahon", "Beltran", "Ochoa", "Dotson", "McPherson",
	            "Pruitt", "Dickson", "Landry", "Madden", "Hodge",
	            "Farley", "Flynn", "Gonzales", "Bender", "Combs",
	            "Weeks", "Delgado", "Baldwin", "Powers", "Dillon",
	            "Nash", "Lancaster", "Ramirez", "Gaines", "Thornton",
	            "Schroeder", "Freeman", "Burns", "Larson", "Mullen",
	            "Herman", "Vasquez", "Cobb", "Humphrey", "Byrd",
	            "Werner", "Jarvis", "Horton", "McFarland", "Hinton",
	            "Hooper", "Best", "Luna", "Cohen", "Huffman",
	            "Golden", "Goodwin", "Webster", "Herring", "Ware",
	            "Murray", "Stafford", "Pugh", "Bolton", "Brady",
	            "Hahn", "Ochoa", "Gomez", "Adkins", "Whitaker",
	            "Pratt", "Deleon", "Nunez", "Harrison", "Pittman",
	            "McLaughlin", "Rubio", "Vega", "Hudson", "Solis"};
        int maxAttribute = 10;
        int minAttribute = 1;
        int rangeAttribute = maxAttribute - minAttribute + 1;
 
 
           
     
        
			
			for (int i = 0; i < 16; i++) {
				String randomPickedName = randomNames[new Random().nextInt(randomNames.length)];
	                players[i][0] = randomPickedName; // Store player name
                
	            for (int j = 1; j < 6; j++) {
                    int randomAttribute = (int)(Math.random() * rangeAttribute) + minAttribute;
                    players[i][j] = String.valueOf(randomAttribute); // Store the random attribute
                }

	        }
	            
			
		return(players);
		
	}
	public static void mainMenu(String[][] players, String formation){
		System.out.println("--Team--Formation--Scores--Play--Save--");
		Scanner keyboardInput = new Scanner(System.in);
		String input = keyboardInput.nextLine();
		
			if (input.equalsIgnoreCase("team")==true) {
				teamViewer(players, formation);
			}
			else if (input.equalsIgnoreCase("formation")==true) {
				formationView(players,formation);
			}
			
	}
	public static void teamViewer(String[][] players, String formation) {
		Scanner keyboardInput = new Scanner(System.in);
		String input = keyboardInput.nextLine();
		
		System.out.println(String.format("%-20s %-20s %-20s %-20s %-20s %-20s %-20s %-20s%n","PLAYER NAME","v PHYSICALITY", "v AGILITY","v PLAYMAKING","v ATTACKING ","v DEFENDING","v OVERALL","v OPTIMAL POSITION"));
		if (input.equalsIgnoreCase("return")) {
			mainMenu(players, formation);
		}
		else {
			for (int i = 0; i < 16; i++) {
				int overall = 0;
						
				    	int intPhysicalityAttribute = Integer.valueOf(players[i][1]);
				    	int intAgilityAttribute = Integer.valueOf(players[i][2]);
				    	int intPlaymakingAttribute = Integer.valueOf(players[i][3]);
				    	int intAttackingAttribute = Integer.valueOf(players[i][4]);
				    	int intDefendingAttribute = Integer.valueOf(players[i][5]);
				    	
				    	
			    System.out.print(String.format("%-20s",players[i][0])); // Print player name
			    
			    for (int j = 1; j < 6; j++) {
			    	String attributes = players[i][j];
			    	int intAttributes = Integer.valueOf(attributes);
			    	
			    	overall += intAttributes;
			    	
			    	String formattedAttributes;
			    	
			    	if (intAttributes >= 7) {
			    		formattedAttributes = ANSI_GREEN + attributes + ANSI_RESET;; // Print player attribute;
			    	}
			    	else if (intAttributes <= 3) {
			    		formattedAttributes = ANSI_RED + attributes + ANSI_RESET;; // Print player attribute;
			    	}
			    	else {
			    		formattedAttributes = ANSI_YELLOW + attributes + ANSI_RESET; // Print player attribute;
			    	}
			    	System.out.print(String.format("%-30s" , formattedAttributes));
			    	
			    	
			    }
				    String formattedOverall;
			    	
			    	if (overall >= 35) {
			    		formattedOverall = ANSI_GREEN + overall + ANSI_RESET;; // Print player attribute;
			    		;
			    	}
			    	else if (overall <= 20) {
			    		formattedOverall = ANSI_RED + overall + ANSI_RESET;; // Print player attribute;
			    	}
			    	else {
			    		formattedOverall = ANSI_YELLOW + overall + ANSI_RESET; // Print player attribute;
			    	}
				    System.out.print(String.format("%-30s" , formattedOverall));
				    
				    		
				    		String recommendedPosition;
				    		
				    		if(intPhysicalityAttribute + intAgilityAttribute >= 14 && intDefendingAttribute >=5 ){
				    			recommendedPosition = "GK";
				    		}
				    		else if(intPhysicalityAttribute + intDefendingAttribute >= 14){
				    			recommendedPosition = "CB";
				    		}
				    		else if(intDefendingAttribute + intAgilityAttribute >= 14){
				    			recommendedPosition = "FB";
				    		}
				    		else if(intPhysicalityAttribute + intPlaymakingAttribute >= 14 && overall >=25){
				    			recommendedPosition = "MF";
				    		}
				    		else if(intPlaymakingAttribute + intAgilityAttribute >= 14 && intAttackingAttribute >= 5){
				    			recommendedPosition = "W";
				    		}
				    		else if(intAttackingAttribute + intPlaymakingAttribute >= 14){
				    			recommendedPosition = "ST";
				    		}
				    		else {
				    			recommendedPosition = "Unknown";
				    		}
				    		System.out.print(String.format("%-30s" , recommendedPosition));
				    		
				    		
			    
			    System.out.println();
			}
			System.out.println("__________________________________________________________________________________________________________");
			}
		}
	public static String[][] formationView(String[][] players, String formation) {
		String[][] formationView = new String[11][2];
		Scanner keyboardInput = new Scanner(System.in);
		
		if(formation.equalsIgnoreCase("4-4-2")==true){
			
			
			System.out.println("Type the name of the player you would like to put as GK");
			String gk_input = keyboardInput.nextLine();			
			for(int i = 0; i < 16; i++) {
				if (gk_input.equalsIgnoreCase(players[i][0])==true) {
				players[i][0] = formationView[0][0] ;	
				}
				else {
				System.out.println("There is no such player in the club");
				}
			}
		}
			
		
		
		return formationView;
	}
	
			
	
			
		

	

}


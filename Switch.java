
import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {
        
        System.out.print("Enter a domain:");

        Scanner sc = new Scanner(System.in);
        String domain = sc.nextLine();

        domain = domain.trim().toLowerCase();

        switch (domain) {

            case "us":
                System.out.println("United States");
                break;

            case "de":
                System.out.println("Germany");
                break;

            case "sk":
                System.out.println("Slovakia");
                break;

            case "hu":
                System.out.println("Hungary");
                break;
                
            case "uk":
            	System.out.println("United Kindom");
            	break;
            	
            case "eu":
            	System.out.println("European Union");
            	break;
            	
            case "ar":
            	System.out.println("Argentina");
            	break;
            
            case "br":
            	System.out.println("Brazil");
            	break;
            	
            case "uy":
            	System.out.println("Uruguay");
            	break;
            	
            case "eg":
            	System.out.println("Egypt");
            	break;
            	
            case "za":
            	System.out.println("South Africa");
            	break;
            	
            case "ae":
            	System.out.println("United Arab Emirates");
            	break;
            	
            case "ps":
            	System.out.println("Palestine");
            	break;
            	
            case "sa":
            	System.out.println("Saudi Arabia");
            	break;
            	
            case "qa":
            	System.out.println("Qatar");
            	break;
            	
            case "jp":
            	System.out.println("Japan");
            	break;
            	
            case "kp":
            	System.out.println("Peoples Republic Of Korea");
            	break;
            	
            case "kr":
            	System.out.println("Republic Of Korea");
            	break;
            	
            default:
                System.out.println("Unknown");
                break;
        }
    }
}
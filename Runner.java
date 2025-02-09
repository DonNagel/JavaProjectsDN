import java.util.Scanner;

public class Runner {

    public static void main(String[] args) {

        System.out.println("Welcome to Pet.java, My first use of scanner, In the CougarView assignment it stated the need for a scanner input, so here is my attempt.");
        System.out.println("Currently, the function only works for Cat, Dog, Bird, and Opossum");
        System.out.println("Here is an example pet.");

        Scanner scanner = new Scanner(System.in);
        Pet ExPet = new Pet();
        ExPet.setName("Name");
        ExPet.setSpecies("Species");
        ExPet.setAge(0);
        ExPet.setNoise();
        System.out.println("Pet Information:");
        System.out.println(ExPet);

        /*I honnestly just attempted running scanner inside pet commands not knowing it would work, and I'm happy it did.
        Originally I was just going to set the scanner object to it's own string such that:
        String tempString = scanner.nextLine();
        YourPet.setName(tempString);

        Which looked clunky and I'm glad it worked out!
        
        Additionally, I figured out the setNoise function.
        */
        
        Pet YourPet = new Pet();
        System.out.println("Please enter a name for your pet:");
        YourPet.setName(scanner.nextLine());
        System.out.println("Please enter the species:");
        YourPet.setSpecies(scanner.nextLine());
        System.out.println("Please tell us their age:");
        YourPet.setAge(scanner.nextInt());
        YourPet.setNoise();
        System.out.println("Pet Information:");
        System.out.println(YourPet);
        
        //In some scanner documentation, and in Visual Studio code it tells me I need to close scanner. 
        scanner.close();
    

    }

}

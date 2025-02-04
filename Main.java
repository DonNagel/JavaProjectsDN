public static void main(String[] args)
    {
        //Instantiate pet, P.S. I heard something about needing more informating than just pet in the demo, but not the assignment
        //So I went ahead and took the skills gained from the video and added more fields.
        Pet myPet1 = new Pet();
        myPet1.setName("Stephen");
        myPet1.setSpecies("Bunny");
        myPet1.setAge(4);
        System.out.println("Pet Information:");
        System.out.println(myPet1);

        //Added a new line between My pet1
        System.out.println("\n");

        //Added a new pet instance to make sure I understand.
        Pet myPet2 = new Pet();
        myPet2.setName("Barry");
        myPet2.setSpecies("Lizard");
        myPet2.setAge(2);
        System.out.println("Pet 2 Information");
        System.out.println(myPet2);

        
    }
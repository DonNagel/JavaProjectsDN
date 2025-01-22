public class Tests {
    // Donovan Nagel Tests project
    public static void main(String[] args)
    {
        // Declaring the three tests as seperate variables, decided to use float for them because of the limited scope of the numbers.
        float testOne = 67.44f;
        float testTwo = 99.99f;
        float testThree = 88.25f;
        /* Declaring testAvg which uses the previous floats but outputs as double so there is more accuracy.
        The reason this happened is because I started the video and worked at the same time, but didn't realize you used double for the test Var.
        But it was still working when I changed testAvg from a float to double, so I think I accidentally did a type conversion and is this ok?*/
        double testAvg = (testOne + testTwo + testThree)/3;
        // Just doing some minor mucking about on the differences between println & print.
        System.out.println("Test Score 1: " + testOne + "\nTest Score 2: "+ testTwo + "\nTest Score 3: " + testThree);
        System.out.print("The average of the 3 test scores is: " + testAvg);
    }

    
}

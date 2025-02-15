import java.util.Scanner;

public class Tests {
    /*Donovan Nagel Tests project, Declaring variables, After a lot of testing, using int on count & score are causing a lot of issues in the father down.
    Such as in the string format, and getting a NaN.*/
    private double ave;
    private double count;
    private double score;

    //Constructors.
    public Tests()
    //The one Set method requested by schema.
    {
        this.setScore(0);
    }
    private void setScore(int newScore) {
        this.score += newScore;
    }
    //The rest of the get methods requested by schema.
    public double getScore() {
        return this.score;
    }
    public double getCount() {
        return this.count;
    }
    public double getAve() {
        return this.ave;
    }
    public void getAverage() {
        //Instantiating scanner, and setting base values to 0 for the start of this method.
        Scanner scan = new Scanner(System.in);
        int localVar = -1;
        System.out.println("Please enter a test score:");
        localVar = scan.nextInt();

        //Used a while loop to continuously go while localVar does not equal one, localVar is taken from user Input
        while (localVar != -1) {
            setScore(localVar);
            count += 1;
            System.out.println("Please enter a test score:");
            localVar = scan.nextInt();

        }
        
        /*In the assignment, if the user inputs -1 first, the output should be NaN.
        I have been unable to get a NaN because of the arithmetic below. I am not sure of a way to prevent that from happening,
        because score has to be set to 0, based on the assignment information, specifically where you specify the 3 tests we need to run.
        Tried a work around, to make sure the answer is a double, but I think java does not like that score & count are not doubles, and therefore not working.
        */
        this.ave = (getScore() / getCount());


        scan.close();

    }
    // Public toString method that will work on the main output as the program.
    public String toString() {
        //After multiple attempts at problem solving this, Here is the final answer I got to get this to work. I don't know why it made me split it up so much but it works!
        String output = ("The average score of ");
        String formatted = String.format("%.0f", this.getCount());
        output += formatted;
        formatted = String.format(" tests is: %.2f", this.getAve());
        output += formatted;
        return output;
    }


    
}

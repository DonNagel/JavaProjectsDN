public class Runner {

    public static void main(String[] args) {
        Tests test = new Tests();

        System.out.println("Welcome to Tests.java, this program will allow you to calculate your test average of an infinite number of tests.");
        System.out.println("When prompted enter a number, you can use -1 to finish inputting scores.");
        test.getAverage();
        System.out.println(test.toString());

    }

}

import java.util.Scanner;

public class App {
    /**
     * Java Methods
     * Method Declaration
     * Calling a Method
     * Method Return Types
     * Method Parameters
     * Java Constructors-> method that is invoked upon instantiation of an object
     */
    /**
     * modifier static returnType nameOfMethod (param1, param2..){
     * 
     * }
     * 
     */
    /**
     * Create a method that adds 2 numbers
     */
    // non-static
    public int addNumberNonStatic(int a, int b){
        return a + b;
    }
    // static method
    public static int addNumbers(int a, int b){
        return a + b;
    }
    // void methods have no return values
    /**
     * Create a void method that displays a message
     * @param args
     * @throws Exception
     */
    public void displayMessage(String message){
        System.out.println("The message is " + message);
    }
    /**
     * 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        /**
         * Methods -> code segmensts that perform a specific task
         * e.g. drawing a circle, levelUp()
         * 2 Types:
         * User-Defined
         * Standard Library Methods -> methods which are built-in
         * 
         */
        /**
         * Syntax
         * returnType methodName(){
         * // method body
         * return 
         * }
         * eg.
         * int addNumbers(){
         * //code
         * }
         */
        /**
         * Complete Syntax of The Method
         * modifier static returnType nameOfMethod (param1, param2..){
         * 
         * }
         * modifier -> public, private
         * static -> access a method without creating objects
         */
        // Scanner sc = new Scanner(System.in);
        /**
         * Example of Static method
         * System.out.println("Square root of a Number " + Math.sqrt(9));
         */
        int x = 100;
        int y = 200;
        // System.out.println("The Sum is " + addNumbers(x, y));
        App newApp = new App();
        // System.out.println("The Sum is " + newApp.addNumberNonStatic(x, y));
        // newApp.displayMessage("Hello World!");
        /**
         * Constructor Example
         */
        Test newTest = new Test();
        
        

    }
}

public class Test {
    /**
     * syntax for constructor
     * ClassName(param1,param2){
     * // code goes here
     * }
     * 3 Types of constructors
     * No-arg Constructors-> does not contain any parameter
     */
    /**
     * No-arg Constructor
     */
    /*Test(){
        System.out.println("Test Class Constructor Invoked!");
    }*/
    /**
     * Parameterized Constructor
     * A constructor that has arguments/parameters passed to it
     * @param args
     * @throws Exception
     */
    private String Lanuage;
    public int Num1;
    /*
    Test(String lang){
        // this.Lanuage = lang;
        System.out.println("The new Language value " + lang);
    }
    */
    /**
     * Default Constructor
     * @param args
     * @throws Exception
     */
    // Test(){
    //     Num1 = 0;
    // }

    public static void main(String[] args) throws Exception {
        /**
         * Declaring an object
         * NameOfClass userDefinedIntance/Object = new NameOfClass(param1,param2)
         */
        String strVal = "Filipino";
        // Test testObj = new Test(strVal);
        // System.out.println("The Language is " +  testObj.Lanuage);
        Test testObj = new Test();
        System.out.println("Printing value of integer " + testObj.Num1);

    }
    
}

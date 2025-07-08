class arithmeticJava {
    public static void main(String[] args) {
        int number1 = 100;
        int number2 = 0;

        try {
            //code that may throw an exception
           int answer = number1/number2;
           System.out.println("Answer: " +answer); 
        } 
        catch(ArithmeticException e)  {
            //handling the exception
            System.err.println("Error: Division by zero is not allowed!");
        }
        finally {
            System.out.println("Program continues after handling exception");
        }
    }
}

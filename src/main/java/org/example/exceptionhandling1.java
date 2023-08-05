package org.example;

public class exceptionhandling1 {

    public static void main(String[] args){
        int[] a = new int[5]; //array
        try{
       System.out.println(5/19);
            //a[5] = 9;
        }
        catch(ArrayIndexOutOfBoundsException aib){
            System.out.println(aib);
        }
        catch(ArithmeticException ae){
            System.out.println(ae);
        }
        catch(Exception e){ //In case of multiple catch blocks, the generic catch(Exception e) should always be the last catch block
            System.out.println(e);
        }
        finally{ //Finally block will execute no matter the Exception is handled or not.
            System.out.println("Finally Block");
        }
        System.out.println("Hello World");
    }
}

//Exception is an event due to which the flow of the program is stopped during execution.

//Unchecked Exception : Logical Issues.
//Ex: ArithmeticException, ArrayIndexOutOfBoundsException

//Checked Exception : Examples: IOException, FileNotFoundException, InterruptedException etc.,
//Can be handled using 'try/catch' or using 'throws' keyword.

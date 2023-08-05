package org.example;

public class Scanner {
    public static void main(String[] args)
    {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.println("Enter your input");
//        String s = sc.next();
//        String s = sc.nextLine();
        int x = sc.nextInt();
//        System.out.println(s);
        System.out.println(x+5);
    }
}

package org.example;

public class IfElse {
    public static void main(String[] args)
    {
        int arr2[]={1,2,4,5,6,7,8,9,10,122};
        char arr3[]={'e','d','r'};
        String[] arr4 ={"sonia","siddhant"};
        System.out.println(arr4);
        System.out.println(arr3);
        //2,4,6,8,122 multiply by 2

        for (int i=0;i<arr2.length;i++)
        {
            if (arr2[i]%2==0)
            {
             System.out.println(arr2[i]);
            }
            else
            {
                System.out.println("The number is not divisible by 2");
            }
            }
        }
    }


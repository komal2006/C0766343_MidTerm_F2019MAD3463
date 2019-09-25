package com.lambton;

public class C0766343_MidTerm
{
    public static void main(String[] args)
    {

        LambtonStringTools object = new LambtonStringTools();
        System.out.println(" LAMBTON : "+object.reverse("LAMBTON"));


        System.out.println("1000 : "+object.binaryToDecimal("1000"));
        System.out.println("100000 : "+object.binaryToDecimal("100000"));
        System.out.println("0100110 :"+object.binaryToDecimal("0100110"));
        System.out.println("1000.1 : "+object.binaryToDecimal("1000.1"));
        System.out.println("0001 : "+object.binaryToDecimal("0001"));
        System.out.println();

        System.out.println( object.initaials("jean luc peacrd"));



    }

}

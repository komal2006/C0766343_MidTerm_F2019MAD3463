package com.lambton;

public class LambtonStringTools
{

    public String reverse(String s)
    {

        StringBuilder rev = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--)
        {
            rev.append(s.charAt(i));
        }
        return rev.toString();
    }



    public int binaryToDecimal(String binary)
    {
        int decimal = 0;
        int binaryMultiplier = 1;
        for (char c : reverse(binary).toCharArray())
        {
            if (c == '1')
            {
                decimal += binaryMultiplier;
            } else if (c == '0')
            {
            } else
                {
                return -1;
            }
            binaryMultiplier *= 2;
        }
        return decimal;
    }
}





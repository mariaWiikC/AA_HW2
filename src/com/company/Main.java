package com.company;

public class Main
{

    public static void main(String[] args)
    {
	    String[] names = {"Alissa", "Ben", "Charlie", "Dianna"};
        String[] grades = {"B", "D", "B", "A"};
        boolean found = false;
        int i = 0;

        String key = "Charlie";
        while (!found && i < names.length)
        {
            if (names[i].equals(key))
            {
                System.out.println("Grade for " + key + ": " + grades[i] );
                found = true;
            }
            i++;
        }
    }
}

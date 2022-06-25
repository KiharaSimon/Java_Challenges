import java.util.Scanner;

class Javapedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("**﻿**﻿**﻿**﻿**Javapedia**﻿**﻿**﻿**﻿**");
        System.out.println("How many historical figures will you register?");

        int people = scan.nextInt();

        String databaseContent[][] = new String[people][3];

        scan.nextLine();

        for(int i = 0; i < databaseContent.length; i++){

            System.out.println("\n\t Figure: " + (i + 1));
            System.out.print("\t .   Name: ");
            databaseContent[i][0] = scan.next();
            System.out.print(" \t .  Date of birth: ");
            databaseContent[i][1] = scan.next();
            System.out.print(" \t .  Occupation: ");
            databaseContent[i][2]= scan.next();

            System.out.print("\n");
        }

        System.out.println("This are the values you stored: ");
        print2DElements(databaseContent);

        System.out.print("Who do you want to get their details: ");
         
        String name = scan.next();

        for(int i = 0; i < databaseContent.length; i++){
            if(databaseContent[i][0].equals(name)){
                System.out.println(".\t Name: " + databaseContent[i][0]);
                System.out.println(".\t Date of birth: " + databaseContent[i][1]);
                System.out.println(".\t Occupation: " + databaseContent[i][2]);
            } 
        }


        scan.close();
    }

    public static void print2DElements(String[][] array){
        for(int i = 0; i < array.length; i++){
            System.out.print("\t");
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }

            System.out.print("\n");
        }
    }
}
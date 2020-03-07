package com.company;

public class Main {

    // First of all, open a class (java works with classes) and the name with CamelCase, an important, java is KEYSENSITIVE, public => Access for all

    public static void main(String[] args) {
        // START FASE 1 -> Variables, conversions and console work.

        System.out.println();

        // 1. First test of working app of Java, a simple print with "Hello World".

        System.out.println("Java Test: Hello World!");

        // 2. Declare String variables of names and surnames.

        String name = "Alexandre";
        String surname1 = "Montserrat";
        String surname2 = "Auber";

        // 3. All variables type string attached in one another for general porpouse.

        String AllNameOne = surname1 + " " + surname2 + ", " + name;

        // 4. Print AllName variable in console. Println used for better view.

        System.out.println(AllNameOne);

        // 5. Declare variables type char beacuse are numbers.

        int DayOfBirth = 23;
        int BirthMonth = 7;
        int BirthYear = 1991;

        // 6. Conversion Int to String for concatenate a real Date of Birth

        String DayOfBirthString = Integer.toString(DayOfBirth);
        String BirthMonthString = Integer.toString(BirthMonth);
        String BirthYearString = Integer.toString(BirthYear);

        // 7. Declare a general variable for attaching all in one (spaces between " / " is for better view);

        String AllDateOfBirth = DayOfBirthString + " / " + BirthMonthString + " / " + BirthYearString;

        // 8. Print All data and AllDateOfBirth in console.

        System.out.println("Date of Birth: " + AllDateOfBirth);
        //System.out.println("Test without concatenation: " + DayOfBirth + " / " + BirthMonth + " / " + BirthYear);

        System.out.println();

        // END FASE 1

        // From this point, the comments only be use for a important comments or clarifications

        // START FASE 2 -> Constants.

        // 1. Declaration of variables/contants.

        final int LeapYear = 1948;
        int MyYear= 1991;
        int LeapYearsList = 0;
        int QuantityYearsBetween = 0;

        //2. Operations for complete exercise.

        for(int a = LeapYear; a < MyYear; a++){
            if(a % 4 == 0 && a % 100 != 0){
                LeapYearsList = a;
                System.out.println("- " + LeapYearsList);
                QuantityYearsBetween++;
            }
        }

        System.out.println("Leap years quantity between MyYear and LeapYear: " + QuantityYearsBetween);

        System.out.println();

        // END FASE 2.

        // START FASE 3 -> FOR loop

        //For the exercise of year, I modified my real birth year because is not a transition year. And I want appear all responses in console, working reasons.

        boolean VerificationYear = true;

        String ResultTrueString = "";
        String ResultFalseString = "";

        for(int i = LeapYearsList; i < MyYear; i++){

            if(i == MyYear ){
                VerificationYear = true;
                ResultTrueString = "The result is: " + VerificationYear + ", " + MyYear +" it's a leap year.";
            } else {
                VerificationYear = false;
                ResultFalseString = "The result is: " + VerificationYear + ", " + MyYear +" it's not a leap year.";
            }
        }

        if(VerificationYear){
            System.out.println(ResultTrueString);
        } else {
            System.out.println(ResultFalseString);
        }

        System.out.println();


        // END FASE 3.

        // START FASE 4

        boolean FinalVerification = VerificationYear;

        String AllNameTwo = name + " " + surname1 + " " + surname2;

        System.out.println("My name is: " + AllNameTwo);
        System.out.println("My date of birth is: " + AllDateOfBirth);

        System.out.println("My year is a Leap Year? " + FinalVerification);

        // END FASE 4.

    }
}

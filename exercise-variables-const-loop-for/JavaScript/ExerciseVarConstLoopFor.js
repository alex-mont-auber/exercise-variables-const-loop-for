
// START FASE 1

console.log("Hello World");

const name = "Alexandre", 
    surname1 = "Montserrat", 
    surname2 = "Auber";

var Day = 23, 
    Month = 07, 
    Year = 1991;

const DayOfBirth = Day.toString(), BirthMonth = Month.toString(); BirthYear = Year.toString();

const AllNameOne = surname1 + " " + surname2 + ", " + name;
const AllDateOfBirth = DayOfBirth + "/" + BirthMonth + "/" + BirthYear;

console.log(AllNameOne);
console.log(AllDateOfBirth);

// END FASE 1

//START FASE 2

const LeapYear = 1948;
var MyYear = 1991;
var LeapYearsList;
var QuantityYearsBetween = 0;

for(let i = LeapYear; i < MyYear; i++){
    if(i % 4 == 0 && i % 100 != 0){
        LeapYearsList = i;
        console.log("- " + LeapYearsList);
        QuantityYearsBetween++;
    }
}

console.log("Leap years quantity between MyYear and LeapYear: " + QuantityYearsBetween);

// END FASE 2

// START FASE 3

var VerificationYear, 
    ResultTrueString,  
    ResultFalseString; 

for(let i = LeapYearsList; i < 1991; i++){
    if(i == MyYear){
        VerificationYear = true;
        console.log(ResultTrueString = "The result is: " + VerificationYear + ", it's a leap year.");
    } else if(i != MyYear) {
        VerificationYear = false;
        console.log(ResultFalseString = "The result is: " + VerificationYear + ", it's not a leap year."); 
    } else {
        console.log("Syntax error, inspect your JavaScript code!");
    }
}

// END FASE 3

// START FASE 4 
var FinalVerification = Boolean;

const AllNameTwo = name + " " + surname1 + " " + surname2;

console.log("My name is: " + AllNameTwo);
console.log("My date of birth is: " + AllDateOfBirth);

if(VerificationYear == true){
    FinalVerification = true;
} else {
    FinalVerification = false;
}

console.log("My year is a Leap Year? " + VerificationYear);

// END FASE 4
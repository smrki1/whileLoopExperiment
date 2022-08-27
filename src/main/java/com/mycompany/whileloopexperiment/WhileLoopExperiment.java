
import java.util.Scanner;

public class WhileLoopExperiment {

public static void main(String[] args) {

Scanner scanner = new Scanner(System.in);


//set variables to hold height age and weight
int age, height, weight;

// I have decided to add a nice little print statement here
System.out.println("Once upon a time... ");

// I have decided to add another  little print statement here
System.out.println("Once upon a time, there was a hobbit... ");

//get user to input their age
System.out.println("Hi there! Please enter your age: ");
age = scanner.nextInt();

//if they are over the age of 10 ask for their height
if (age >= 10) {

//asking for users height
System.out.println("You are old enough to ride! Please enter your height: ");
height = scanner.nextInt();

//use logical operators to make sure they are within the right height range
//i.e if height is more than 150 BUT also less than 200 the code may continue
if (height >= 150 && height <= 200) {

System.out.println("You are the right height as well. Now, please enter your weight: ");
weight = scanner.nextInt();

//use another if statement to check their weight
//if it is under or equal to 200 continue
if (weight <= 200) {

//print statement saying they can ride
System.out.println("Congratulations, you are the right age, height and weight. Enjoy your ride!");

//now we write the code if they are too heavy
} else if (weight > 200) {
System.out.println("Sorry, you are too heavy to ride. :'(");

}
//and the code if they are too tall or short
} else if (height > 200 || height <150) {
System.out.println("Sorry, your height just aint right. :'( ");

}
//and lastly if they are under 10
} else if (age < 10) {
System.out.println("Sorry, you are not old enough to ride. :'(");
}

}
}
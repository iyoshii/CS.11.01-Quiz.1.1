import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //1.Create a Scanner object called scanner.
        Scanner scanner=new Scanner(System.in);

        //2.Declare a variable of type int called age.
        int age;

        //3.Declare a variable of type String called firstName.
        String firstName;

        //4.Declare a variable of type String called favouriteFood.
        String favouriteFood;

        //5.Write a single println statement that prompts the user to enter their age.
        System.out.println("Please enter your age: ");

        //6.Initialise age to the user input. That is, use the scanner class to initialise age to whatever value the user inputs.
        age = scanner.nextInt();
        scanner.nextLine();

        //7.Write a single println statement that prompts the user to enter their first name.
        System.out.println("Please enter your first name: ");

        //8.Initialise firstName to the user input. That is, use the scanner class to initialise firstName to whatever value the user inputs.
        firstName = scanner.nextLine();

        //9.Write a single println statement that prompts the user to enter their favourite food.
        System.out.println("Please enter your favourite food: ");

        //10.Initialise favouriteFood to the user input. That is, use the scanner class to initialise favouriteFood to whatever value the user inputs.
        favouriteFood = scanner.nextLine();

        //11.Write a single println statement that prints out the information that the user input (age, firstName, favouriteFood). Ensure that you print out this information in the following format.
        System.out.println("First name: "+firstName+"\n"+"Age: "+age+"\n"+"Favourite food: "+favouriteFood);

    }

}
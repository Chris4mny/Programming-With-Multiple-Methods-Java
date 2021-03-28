package multipleMethods;

import javax.swing.JOptionPane;

public class MethodsForEntryPoint
{

	public MethodsForEntryPoint() // constructor
	{
		String userName;
		String colorChosen;
		int favoriteNumber;
		int num1;
		int num2;
		int num3;
		int num4;
		int num5;
		int finalSum;
		int age;
		int falseAge;
		int difference;
		
		userName = askForUserName();

		showUserName(userName);
		
		favoriteNumber = askFavoriteNumber();

		outputFavoriteNumber(favoriteNumber);

		num1 = askForInteger();

		num2 = askForInteger();

		num3 = askForInteger();

		num4 = askForInteger();

		num5 = askForInteger();

		finalSum = displayFiveIntegers(num1, num2, num3, num4, num5);

		averageOfFiveIntegers(finalSum);

		colorChosen = askForFavoriteColor();

		displayFavoriteColor(colorChosen);

		age = howOldAreYou();

		falseAge = howOldDoYouWishYouAre();

		difference = ageDifferenceActualMinusWish(age, falseAge);

		displayAgeDifference(age, falseAge, difference);

	}

	public String askForUserName() // a. ask for and return the user’s name
	{
		String userName; 
		
		userName = JOptionPane.showInputDialog("Enter a user Name: ");

		return userName;

	}

	public void showUserName(String user) // b. display the name that is passed to it with appropriate labeling
	{
		JOptionPane.showMessageDialog(null, "Your User Name is: " + user);
	}

	public int askFavoriteNumber() // c.ask for and return the user’s favorite number.
	{
		String tempFavNum;
		int favoriteNumber;
		
		tempFavNum = JOptionPane.showInputDialog("What is your favorite number? \nInput a number; do not spell out the number");
		favoriteNumber = Integer.parseInt(tempFavNum);

		return favoriteNumber;
	}

	public void outputFavoriteNumber(int favoriteNumber) // d. display the number that is passed to it with appropriate
															// labeling.
	{
		JOptionPane.showMessageDialog(null, "Your favorite number is: " + favoriteNumber);
	}

	public int askForInteger() // e. ask and return an integer
	{
		String tempNumber;
		int number1;
		
		tempNumber = JOptionPane.showInputDialog("Please enter a number: \nEnter a number then press OK");
		number1 = Integer.parseInt(tempNumber);

		return number1;
	}

	public int displayFiveIntegers(int num1, int num2, int num3, int num4, int num5) // f. display 5 integers with appropriate labels.
	{
		int finalSum;
		
		finalSum = (num1 + num2 + num3 + num4 + num5);
		
		JOptionPane.showMessageDialog(null, "You entered the following numbers. First Number: " + num1 + ", Second Number: " + num2	+ ", Third Number: " + num3 + ", Fourth Number: " + num4 + ", and Fifth Number: " + num5);

		return finalSum;
	}

	public int averageOfFiveIntegers(int finalSum) // g. average 5 integers and return the average with an appropriate label.
	{
		int averageOfSum;
		
		averageOfSum= (finalSum / 5);

		JOptionPane.showMessageDialog(null, "The total for the five numbers entered is: " + finalSum + " and their average is: " + averageOfSum);

		return averageOfSum;
	}

	public String askForFavoriteColor() // h. ask for and return the user’s favorite color.
	{
		String colorChosen;
		
		colorChosen = JOptionPane.showInputDialog("What is your favorite color? ");

		return colorChosen;
	}

	public void displayFavoriteColor(String colorChosen) // i. tell the user the color passed to it with appropriate labels
	{
		JOptionPane.showMessageDialog(null, "Your favorite color is: " + "\"" + colorChosen + "\"");
	}

	public int howOldAreYou() // j. ask for and return the user’s age.
	{
		String tempAge;
		int ageActual;
		
		tempAge= JOptionPane.showInputDialog("How old are you?");
		ageActual = Integer.parseInt(tempAge);

		return ageActual;
	}

	public int howOldDoYouWishYouAre() // k. ask for and return the age the user wishes they were.
	{
		String tempWishAge;
		int falseAge;
		
		tempWishAge = JOptionPane.showInputDialog("How do you wish you were?");
		falseAge = Integer.parseInt(tempWishAge);

		return falseAge;
	}

	public int ageDifferenceActualMinusWish(int age, int falseAge) // l. calculate and return the difference between the two ages with appropriate labels.
	{
		int difference;
		
		difference = (age - falseAge);

		if (difference < 0)
		{
			return -difference; // makes difference always a positive number. Learned by doing a google search for "returning a positive number in java".
		}

		return difference;
	}

	public void displayAgeDifference(int age, int falseAge, int difference) // displays the difference between two ages
	{

		JOptionPane.showMessageDialog(null, "The difference between your actual age " + age + " and your wishful age " + falseAge + " is: " + difference + " years.");
	}

}

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Develop a program that takes the weight (in kilograms) and height (in meters) as input and calculates the BMI, then prints it.
        Scanner scn = new Scanner(System.in); // Scanner


        System.out.println("Enter height");
        float height = scn.nextFloat();
        System.out.println("Enter weight");
        float weight = scn.nextFloat();
        double BMI = weight/(height*height);
        System.out.println("BMI: "+BMI);

        //Write a program that takes the obtained marks and total marks as input and
        //calculates the percentage, then prints it.
        System.out.println("Enter obtained marks");
        float obtained_marks = scn.nextFloat();
        System.out.println("Enter total marks");
        float total_marks = scn.nextFloat();

        float percentage = (obtained_marks/total_marks)*100;

        System.out.println("Your percentage: "+ percentage);



        //Create a program that takes an amount in one currency and an exchange rate
        //as input, then converts and prints the amount in another currency.
        System.out.println("Enter amount");
        float amount = scn.nextFloat();
        System.out.println("Enter exchange rate");
        float exchange_rate = scn.nextFloat();
        float amount_after_exchange = exchange_rate*amount;

        System.out.println("Amount "+ amount_after_exchange);

        //Create a program that takes a string as input, calculates its length, and then
        //reverses the string using the StringBuilder class, finally printing both the length and
        //reversed string.
        System.out.println("Enter word");
        String user_input = scn.nextLine();
        int user_input_lentgh = user_input.length();
        StringBuilder str = new StringBuilder(user_input);
        System.out.println("The length: "+ user_input_lentgh+ " reversed: "+str.reverse());


        //Develop a program that takes a sentence as input and extracts a substring from
        //it, then prints the extracted substring.
        System.out.println("Enter sentences");
        String sentence = scn.nextLine();
        System.out.println("Enter the start index");
        int start_index = scn.nextInt();
        System.out.println("Enter the end index");
        int end_index = scn.nextInt();

        System.out.println(sentence.substring(start_index,end_index));


        //Write a program that takes a sentence and a keyword as input, then check if
        //the keyword is present in the sentence and prints the result.
        System.out.println("Enter sentences");
        String sentence2 = scn.nextLine();
        System.out.println("Enter keywords");
        String keyword = scn.nextLine();
        if(sentence2.contains(keyword)){
            System.out.println("The "+ keyword+ " is found");
        }else{
            System.out.println("not found");
        }

        //Develop a program that takes a sentence and a word to replace as input, then
        //replace all occurrences of the word with another word and prints the modified
        //sentence.

        System.out.println("Enter sentence");
        String sentence3 = scn.nextLine();
        System.out.println("Enter word to replace");
        String word = scn.next();
        System.out.println("Enter what the new word");
        String new_word = scn.next();
        System.out.println(sentence3.replace(word, new_word));

        //Write a program that takes two strings as input and check if they are equal,
        //ignoring the case, then prints whether they are equal or not.

        System.out.println("Enter word one ");
        String word1 = scn.next();
        System.out.println("Enter word two");
        String word2 = scn.next();

        if (word1.equalsIgnoreCase(word2)){
            System.out.println("Strings are equal (ignoring case).");
        }else {
            System.out.println("Strings are not equal (ignoring case). ");
        }


    }
    }

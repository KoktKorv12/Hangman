import java.util.Scanner;

public class hangman {

    public static void guess(String word, int tries){

        char filler[] = new char[word.length()];
        int i = 0;
        while(i<word.length()){
            filler[i] = '-';
            if (word.charAt(i)==' ') {
                filler[i] = ' ';
            }
            i++; // Fills word to guess with "-"
        }
        System.out.print(filler);
        System.out.println("    Försök kvar: " + tries);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String word = "Jag gillar glass"; //words to guess
        int tries = 6;
        String string;

        System.out.println("Välkommen till Hangman! \nDu har 6 liv, om du gissar fel ord tappar du ett liv, om du inte gissar rätt ord innan alla 6 liv är slut så förlorar du" +
                " men om du gissar rätt innan liven tar slut, vinner du!");

        System.out.println(" \nVill du möta 1.Datorn eller en 2.Kompis?");

        String versus = sc.nextLine();

        if(versus.equals("1")) {
            System.out.println("Datorn väljer ett ord som du ska gissa");


            guess(word,tries);
        }
        if(versus.equals("2")) {
            System.out.println("Din kompis ska nu skriva in ordet som du ska gissa");
            System.out.println("Skriv in ett ord: ");
            word = sc.nextLine();


            guess(word,tries);
        }
    }
}

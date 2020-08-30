package readability;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        int characters = 0;
        int words = 1;
        int sentences = 0;
        int syllables = 0;
        int polysyllables = 0;
        int wordVovels = 0;
        String text = "";

        File fi = new File(args[0]);
        try {
            Scanner myReader = new Scanner(fi);
            while (myReader.hasNextLine()) {
                text = myReader.nextLine();
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }

        Scanner sc = new Scanner(System.in);
        String input = sc.next();


        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != '\n' && text.charAt(i) != '\t' && text.charAt(i) != ' ') {
                characters++;
            }
            if (text.charAt(i) == '\n' || text.charAt(i) == '\t' || text.charAt(i) == ' ') {
                words++;
            }

            if (text.charAt(i) == '.' || text.charAt(i) == '!' || text.charAt(i) == '?') {
                sentences++;
            }
            if (i == text.length() - 1) {
                if (text.charAt(i) != '.' && text.charAt(i) != '!' && text.charAt(i) != '?') {
                    sentences++;
                }
            }
        }
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ' || text.charAt(i) == '\n' || text.charAt(i) == '\t') {
                if (wordVovels == 0) {
                    syllables++;
                } else {
                        syllables += wordVovels;
                }
                if (wordVovels > 2) {
                    polysyllables++;
                }
                wordVovels = 0;
                }
                if (i != text.length() - 1 && (text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u')) {
                    if (text.charAt(i + 1) == 'a' || text.charAt(i + 1) == 'e' || text.charAt(i + 1) == 'i' || text.charAt(i + 1) == 'o' || text.charAt(i + 1) == 'u') {
                        i++;
                    }
                    if (text.charAt(i) == 'e' && text.charAt(i + 1) == ' ' || text.charAt(i + 1) == '\n' || text.charAt(i + 1) == '\t') {
                        wordVovels--;
                    }
                    wordVovels++;
                }
                if (i == text.length() - 1 && text.charAt(i) == 'e') {
                    wordVovels--;
                }
            }

        int score = (int) ((4.71 * characters / words + 0.5 * words / sentences - 21.43) + 0.9);
        double fleschKincaid = 0.39 * words / sentences + 11.8 * syllables / words - 15.59;
        double SMOG = 1.043 * Math.sqrt(polysyllables * 30 / sentences) + 3.1291;
        double ColemanLiau = 0.0588 * characters / words * 100 -0.296 * sentences / words * 100 - 15.8;



        String strdouble = String.format("%.2f", 4.71 * characters / words + 0.5 * words / sentences - 21.43);
        long bis = Math.round(score) + 6;

        System.out.println("Words: " + words);
        System.out.println("Sentences: " + sentences);
        System.out.println("Characters: " + characters);
        System.out.println("Syllables: " + syllables);
        System.out.println("Polysyllables: " + polysyllables);
        System.out.println("Enter the core you want to calculate (ARI, FK, SMOG, CL, all): " +  input);


        if (input.equals("all")) {
            System.out.println();
            System.out.println("Automated Readability Index: " + score + " (about " + bis + " year olds).");
            System.out.println("Flesch–Kincaid readability tests: " + fleschKincaid + " (about " + Math.round(fleschKincaid + 6) + " year olds).");
            System.out.println("Simple Measure of Gobbledygook: " + SMOG + " (about " + Math.round(SMOG + 6) + " year olds).");
            System.out.println("Coleman–Liau index: " + ColemanLiau + " (about " + Math.round(ColemanLiau + 6) + " year olds).");
        }
    }
}

/*

                if (score <= 12) {
                System.out.println("This text should be understood by " + von + "-" + bis + " year olds.");
                } else if (Math.round(score)  == 13) {

                System.out.println("This text should be understood by 18-24 year olds.");
                } else  {
                System.out.println("This text should be understood by 24+ year olds.");
                }
                }
                } */
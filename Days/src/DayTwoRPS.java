import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class DayTwoRPS {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Days/DataFiles/Day2.txt");
        Scanner reader = new Scanner(file);

        int totalScore = 0;
        int win = 6;
        int lose = 0;
        int draw = 3;
        int rock = 1;
        int paper = 2;
        int scissors = 3;

        //part 1
        // OG: A = Rock ; B = Paper ; C = Scissors
        // player: X = Rock ; Y = Paper ; Z = Scissors
        while(reader.hasNextLine()) {
            String temp = reader.nextLine();
            String[] splitTemp = temp.split(" ");

            switch (splitTemp[1]) {
                case "X":
                    if (splitTemp[0].equals("C")) { // Win
                        totalScore = totalScore + win + rock;
                    } else if(splitTemp[0].equals("B")) { // Lose
                        totalScore = totalScore + lose + rock;
                    } else { // draw
                        totalScore = totalScore + draw + rock;
                    }
                    break;
                case "Y":
                    if(splitTemp[0].equals("A")) {
                        totalScore = totalScore + win + paper;
                    } else if (splitTemp[0].equals("C")) {
                        totalScore = totalScore + lose + paper;
                    } else {
                        totalScore = totalScore + draw + paper;
                    }
                    break;
                case "Z":
                    if(splitTemp[0].equals("B")) {
                        totalScore = totalScore + win + scissors;
                    } else if (splitTemp[0].equals("A")) {
                        totalScore = totalScore + lose + scissors;
                    } else {
                        totalScore = totalScore + draw + scissors;
                    }
                    break;
            }
        }
        reader.close();
        System.out.println(totalScore);
    }
}

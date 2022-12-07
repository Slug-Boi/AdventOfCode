import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class DayOneCalories {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Days/DataFiles/Day1.txt");
        Scanner reader = new Scanner(file);
        List<Integer> caloriesSums = new ArrayList<>();

        int tempSum = 0;
        while(reader.hasNextLine()) {
            String temp = reader.nextLine();
            if(temp.equals("")) { //Make this into a skip and then make another one to read input
                caloriesSums.add(tempSum);
                tempSum = 0;
            } else {
                tempSum = Integer.parseInt(temp) + tempSum;
            }
        }
        reader.close();

        Collections.sort(caloriesSums);
        int size = caloriesSums.size() - 1;
        System.out.println(caloriesSums.get(size));
    }
}

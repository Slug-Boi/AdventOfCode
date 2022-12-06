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
            if(reader.nextLine().equals("")) {
               tempSum = Integer.parseInt(reader.nextLine()) + tempSum;
            } else {
                caloriesSums.add(tempSum);
                tempSum = 0;
            }
        }

        Collections.sort(caloriesSums);
        int size = caloriesSums.size() - 1;
        System.out.println(caloriesSums.get(size));
    }
}

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class StreamAPI_two {

    public static void main(String args[]) {

        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> result = new ArrayList<>();

        for (int x = 0; x < intList.size(); x++) {
            if (intList.get(x) > 0 & intList.get(x) % 2 == 0) result.add(intList.get(x));
        }

        Integer minElement = 0;
        Integer countSort;

        while(true) {

            countSort = 0;
            for (int x = 0; x < result.size()-1; x++) {

                if (result.get(x) > result.get(x+1)){
                    minElement = result.get(x+1);
                    result.remove(x+1);
                    result.add(x, minElement);
                    countSort ++;
                }

            }
            if (countSort == 0) break;
        }

        System.out.println(result);
    }
}

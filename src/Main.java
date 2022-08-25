import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);

    public static void action(List<Integer> list) {
        ArrayList<Integer> temp = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i) > 0) && (list.get(i) % 2 == 0)) {
                temp.add(list.get(i));
            }
        }
        temp.sort(Comparator.naturalOrder());
        System.out.println(temp);
    }

    public static void main(String[] args) {
        action(intList);
    }
}

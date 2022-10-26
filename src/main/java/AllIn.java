import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AllIn {

    //First Task metod
    public String filler(List<String> names) {
        int i = 0;
        StringBuilder str = new StringBuilder();
        for (String name : names) {
            if (!(i % 2 == 0)) {
                str.append(i).append(" ").append(name).append(",");
            }
            i++;
        }
        return str.toString();
    }

    //Second task
    public List<String> upperSorter(List<String> lines) {
        return lines.stream()
                .map(name -> name.toUpperCase())
                .sorted((aName, bName) -> bName.compareTo(aName))
                .collect(Collectors.toList());

    }

    //third task
    public static void NumbersList() {
        String[] arrey = {"1, 2, 0", "4, 5"};

        String collect = Arrays.stream(arrey)
                .map(line -> Arrays.asList(line.split(", ")))
                .flatMap(l -> l.stream())
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println("collect = " + collect);

    }
}

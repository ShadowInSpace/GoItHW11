import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AllTasks {

    //First Task metod
    public static String filler(List<String> names) {
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
    public static List<String> upperSorter(List<String> lines) {
        return lines.stream()
                .map(name -> name.toUpperCase())
                .sorted(Comparator.reverseOrder())
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
        System.out.println(collect);

    }
    //fourth task
    public static Stream<Long> Randomator(long a, long c, long m, long seed){
        return Stream.iterate(seed,(s)-> (a*s+c)%m);
    }

    //fifth task
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second){
        Iterator<T> firstIterator = first.iterator();
        Iterator<T> secondIterator = second.iterator();
        List<T> result = new ArrayList<>();
        while (firstIterator.hasNext() && secondIterator.hasNext()){
            result.add(firstIterator.next());
            result.add(secondIterator.next());
        }
        return result.stream();
    }
}

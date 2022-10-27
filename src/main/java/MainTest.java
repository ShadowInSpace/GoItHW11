import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainTest {
    public static void main(String[] args) {
        List<String> names = List.of("Vasyl", "Vlad", "Semen", "john", "Mary","Anna", "Sofiya", "Taras");
            //test for first
        System.out.println("First task test: " + AllTasks.filler(names));

        //test for second
        System.out.println("Second task test: " + AllTasks.upperSorter(names));

        //test for third task
        AllTasks.NumbersList();

        //test for 4 task
        List<Long> list = new ArrayList<Long>();
        list = AllTasks.Randomator(25214903917L,11L,2^48L,0L)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println("forth task test " + list);



    }


}

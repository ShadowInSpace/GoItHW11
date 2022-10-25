import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class AllIn {

    //First Task metod
    public String filler (ArrayList<String> names){
        int i =0;
        StringBuilder str = new StringBuilder();
        for (String name: names) {
            if(!(i%2==0)){
                str.append(i).append(" ").append(name).append(",");
            }
            i++;
        }
        return str.toString();
    }

//    public ArrayList<String> upperSorter (ArrayList<String> lines){
//        lines.stream()
//
//    }

}

import java.util.ArrayList;
import java.util.List;

public class jihe {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(5);
        list.add("10086");
        list.add(8972L);
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }
}

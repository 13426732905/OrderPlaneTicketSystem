import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        List list =new ArrayList();
        list.add(1);
        list.add("河池学院");
        list.add(1111L);
        list.add(1);
        System.out.println("list的长度"+list.size());
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
    }

}

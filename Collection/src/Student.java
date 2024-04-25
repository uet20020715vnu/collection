import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Student {
    public Student(int tuoi, String name){
        this.name = name;
        this.tuoi = tuoi;
    }
    public String name;
    public int tuoi;
    public static void main(String[] args) {
        HashMap<Integer,String> students = new HashMap<>();
        Student std = new Student(1, "kai1");
        students.put(std.tuoi, std.name);
        std = new Student(2, "kai2");
        students.put(std.tuoi, std.name);
        std = new Student(3,"kai3");
        students.put(std.tuoi, std.name);
        Iterator<Integer> it = students.keySet().iterator();
        while(it.hasNext()){
            Integer key = it.next();
            if ( key ==2) {

                it.remove();
            }
        }

        Set<Integer> keys = students.keySet();
        for(Integer key : keys){
            System.out.println(key +": "+students.get(key));
        }
    }
}

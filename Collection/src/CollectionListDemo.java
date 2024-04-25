import java.util.ArrayList;
import java.util.Vector;

public class CollectionListDemo {
    public static void main(String[] args) {
        // Khởi tạo ArrayList và Vector
        ArrayList<String> list = new ArrayList<String>();
        Vector<String> list2 = new Vector<>();

        // Thêm phần tử vào ArrayList
        list.add("Java");
        list.add("Python");
        list.add("C++");

        // Thêm phần tử vào Vector
        list2.add("C#");
        list2.add("JavaScript");

        // In ra các phần tử của ArrayList
        System.out.println("ArrayList:");
        for (String str : list) {
            System.out.println(str);
        }

        // In ra các phần tử của Vector
        System.out.println("\nVector:");
        for (String str : list2) {
            System.out.println(str);
        }

        // Xóa phần tử từ ArrayList
        list.remove("Python");

        // Xóa phần tử từ Vector
        list2.remove("C#");

        // In ra các phần tử sau khi xóa
        System.out.println("\nArrayList after removing 'Python':");
        for (String str : list) {
            System.out.println(str);
        }

        System.out.println("\nVector after removing 'C#':");
        for (String str : list2) {
            System.out.println(str);
        }

        // Truy cập phần tử bằng chỉ số
        String element = list.get(0);
        System.out.println("\nFirst element of ArrayList: " + element);

        // Kiểm tra ArrayList có chứa một phần tử cụ thể không
        boolean containsPython = list.contains("Python");
        System.out.println("\nArrayList contains 'Python': " + containsPython);

        // Kiểm tra Vector có rỗng không
        boolean vectorIsEmpty = list2.isEmpty();
        System.out.println("\nIs Vector empty: " + vectorIsEmpty);
    }
}

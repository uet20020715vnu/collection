import java.util.*;
import java.util.Collections;

public class bai1 {
    public static void menu() {
        System.out.print("+---------------------------------------------------+\n\r" +
            "1. Nhập sản phẩm\n\r" +
            "2. Sắp xếp\n\r" +
            "3. Tìm và xóa sản phẩm\n\r" +
            "4. Thoát\n\r" +
            "+---------------------------------------------------+\n\r" +
            "Chọn chức năng:");
    }
    public HashMap<String,Integer> hashmap = new HashMap<String, Integer>();
    Scanner sc = new Scanner(System.in);
    public void nhap(){
        System.out.print("Nhập sản phẩm");
        String s = sc.nextLine();
        System.out.print("Nhập giá");
        Integer i = sc.nextInt();
        sc.nextLine();
        hashmap.put(s, i);
    }

    public void sapxep() {
        ArrayList<Map.Entry<String, Integer>> list = new ArrayList<>(hashmap.entrySet());

        Collections.sort(list, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        }
        );
        HashMap<String, Integer> sortedHashMap = new LinkedHashMap<>();
        for (Map.Entry<String, Integer> entry : list) {
            sortedHashMap.put(entry.getKey(), entry.getValue());
        }
        for (Map.Entry<String, Integer> entry : sortedHashMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " : " + value);
        }
    }

    public void xoa() {
        System.out.print("Nhập sản phẩm cần xóa: ");
        String x = sc.nextLine();

        for (Iterator<Map.Entry<String, Integer>> iterator = hashmap.entrySet().iterator(); iterator.hasNext();) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (entry.getKey().equals(x)) {
                iterator.remove();  // Xóa Entry bằng iterator
                System.out.println("Đã xóa sản phẩm: " + x);
                return;
            }
        }
        System.out.println("Không tìm thấy sản phẩm có key là: " + x);
    }

        public static void main(String[] args) {
            bai1 bang = new bai1();
            menu();
            Scanner sc = new Scanner(System.in);

            while (true) {
                Integer t = sc.nextInt();
                sc.nextLine();
                if (t == 1) {
                    bang.nhap();
                    menu();
                }
                if (t == 2) {
                    bang.sapxep();
                    menu();
                }
                if (t == 3) {
                    bang.xoa();
                    menu();
                }
                if (t == 4) {
                    break;
                }

            }
        }
}

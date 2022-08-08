import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập chuỗi lung tung beng vào:!!!!");
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

//        String str = "hello words hello";
        s = s.replaceAll(",","");
        s = s.replaceAll(" ","");
        String[]arr = s.trim().split("");
        String key = "";
        Integer value;
        TreeMap<String,Integer> map = new TreeMap<>();
        for (int i = 0; i < arr.length; i++) {
            key = arr[i];
            if (map.containsKey(key)){
                value = map.get(key);
                map.remove(key);
                map.put(key,value + 1);
            }else {
                map.put(key,new Integer(1));
            }

        }
        Set set = map.keySet();
        Iterator i = set.iterator();

        while (i.hasNext()){
            key = (String) i.next();
            System.out.println("Từ: " + key +" "+ "xuất hiện: " + map.get(key) + " lần");
        }

    }
}

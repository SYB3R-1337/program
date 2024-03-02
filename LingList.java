import java.util.LinkedLis;

public class LingList {

    public static void main(String[] args) {
        ArrayList<Integer> L1 = new ArrayList<>();
        ArrayList<Integer> l2 = new ArrayList<>(5);
        l2.add(2);
        l2.add(3);
        l2.add(4);
        l2.add(51);
        l2.add(5);
            // insert the data in first arraylist and second arraylist to check the out simultaneously  
        L1.add(4);
        L1.add(41);
        L1.add(24);
        L1.add(43);
        L1.add(45);
        L1.add(54);
        L1.add(4);

        // l1.add

        System.out.println(L1.contains(31));
        System.out.println(l2.indexOf(4));

    }
}
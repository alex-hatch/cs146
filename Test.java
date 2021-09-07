package cs146F21.hatch.project1;

import java.util.Random;

public class Test {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        LinkedList<Integer> intList1 = new LinkedList<>();
        LinkedList<Integer> intList2 = new LinkedList<>();
        Random r = new Random();
        intList1.remove(5);
        intList2.remove(100);



        for(int i = 0; i < 15000; i++) {
            intList1.add(r.nextInt());
        }


        LinkedList<Integer> intersectionList = intList1.intersection(intList2);
        LinkedList<Integer> unionList = intList1.union(intList1);

        System.out.print("list 1: ");
        intList1.printList();
        System.out.println("size: " + intList1.size());


        System.out.print("list 2: ");
        intList2.printList();
        System.out.println("size: " + intList2.size() + " ");

        System.out.print("intersection: ");
        intersectionList.printList();
        System.out.println("size: " + intersectionList.size()+ " ");

        System.out.print("union: ");
        unionList.printList();
        System.out.println("size: " + unionList.size()+ " ");

        int a = r.nextInt(5);
        System.out.println("trying to grab " + a + " from list1: ");
        System.out.println(intList1.contains(a));
        System.out.println(intList1.getItem(a));

        int b = r.nextInt(5);
        System.out.println("trying to grab " + b + " from list2: ");
        System.out.println(intList2.contains(b));
        System.out.println(intList2.getItem(b));

        System.out.println("Runtime: " + (System.currentTimeMillis() - startTime) + "ms");


    }
}

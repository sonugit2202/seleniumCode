package ArrayConcept;

import java.util.ArrayList;

public class ArrayListConcept {

    public static void main(String[] args) {
        //size is not fixed
        //Dynamic array
        //index based - maintain order
        //Create the object of the Array List Class

        ArrayList arr = new ArrayList();
        System.out.println(arr.size());
        arr.add(100);
        arr.add(200);
        arr.add(300);
        System.out.println(arr.size());
        arr.add(500);
        arr.add(600);
        System.out.println(arr.size());

        arr.remove(3);
        System.out.println(arr.get(3));
        System.out.println("*****************************");
        for(int i =0 ; i< arr.size(); i++){
            System.out.println(arr.get(i));
        }
        arr.add("India");
        arr.add(21.22);
        arr.add(true);
        System.out.println("*****************************");
        for(Object a : arr){
            System.out.println(a);
        }

        System.out.println("*****************************");
        /// for better visibility in java always use proper java structure
        ArrayList<String> empLists = new ArrayList<String>();
        empLists.add("100");
        empLists.add("Sonu");
        empLists.add("100");

        for(String s : empLists){
            System.out.println(s);
        }
        System.out.println(empLists);
        System.out.println("*****************************");
        ArrayList<Integer> empNumber = new ArrayList<Integer>();
        empNumber.add(100);
        empNumber.add(200);

        for(Integer e : empNumber){
            System.out.println(e);
        }
        System.out.println(empNumber);
        System.out.println("*****************************");
        ArrayList<Object> empData = new ArrayList<Object>();
        empData.add("Hello");
        empData.add(100);
        empData.add(true);

        for(Object e : empData){
            System.out.println(e);
        }
        System.out.println(empData);



    }
}

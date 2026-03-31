package ArrayConcept;

import net.bytebuddy.implementation.bytecode.collection.ArrayLength;

import java.util.Arrays;

public class ArrayConcept {

    public static void main(String[] args) {
        //array:
        //1. static Array: Size is fixed
        //2. Dynamic Array : Dynamic Size

        int[] arr = new int[5];
        System.out.println(arr);
        arr[0]= 10;
        arr[1]= 20;
        arr[2]= 30;
        arr[4] = 60;
        arr[3] = 50;
        System.out.println(Arrays.toString(arr));
        System.out.println(arr[4]);
        System.out.println("*************************************");

        Object empData[] = new Object[5];
        empData[0]= "Sonu Kumar";
        empData[1]= "sonuratish22@gmail.com";
        empData[2] = 32;
        empData[3]= true;
        empData[4]= 57000.68;

        for(int i =0 ; i < empData.length; i++){
            System.out.println(empData[i]);
        }
        System.out.println("*************************************");
        for(Object obj : empData){
            System.out.println(obj);
        }
        System.out.println("*************************************");

        Object carDetails[] = new Object[5];
        carDetails[0]= "Toyota Hyrder"  ; //Car Brand
        carDetails[1]= "Petrol"  ; //Car Engine
        carDetails[2]= "Sedan"  ; //Car type
        carDetails[3]= 2024  ; //Car Build
        carDetails[4]= true  ; //Car active

        for(Object info: carDetails){
            System.out.println(info);
        }

    }
}

package ClassAndObj;

public class MethodsConcept {
    //methods /function : methods are written in block
    //static /nonstatic method
    //can not ceate a method inside a method,
    //but you can call the methods from diff methods
    //duplicate methods are not allowed,
    //but we can overload the methods
    public static void main(String[] args) {
        MethodsConcept mc = new MethodsConcept();
        mc.test();
        System.out.println(mc.sum());
        System.out.println("*******************");
        int c = mc.sum();
        System.out.println(c);
        System.out.println("*******************");
        String s1 = mc.getTrainerName();
        if(s1.equals("India")){
            System.out.println("Pass");
        }else {
            System.out.println("FAIL");
        }
        mc.add(10,20);
        int sum = mc.add(10,20);
        System.out.println(sum);

    }
    //No input no return
    //1. void:- does not return anything(no return keyword)
    public void test(){
        System.out.println("test method");

    }

    //2. No input but return something
    public int sum(){
        System.out.println("Sum methods");
        int a= 10;
        int b = 20;
        int z= a+b;
        return z;
    }

    public String getTrainerName(){
        System.out.println("get Trainer name");
        String name = "Sonu";
        return name;
    }

    public int add(int a, int b){
        System.out.println("Add Method");
        int sum = a+b;
        return sum;
    }
}

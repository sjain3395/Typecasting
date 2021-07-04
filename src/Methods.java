public class Methods {
    static void myMethod(String fname) {
        System.out.println(fname + " Refsnes");

    }
    static  void myMethods(String lname , int age){
        System.out.println(lname + "is" + age);
    }
    static int myAdd(int x, int y){
        return x+y;
    }
    static void checkAge(int age) {

        // If age is less than 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");

            // If age is greater than, or equal to, 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }

    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
        System.out.println("..............");
        myMethods("jain", 20);
        System.out.println("..............");
       System.out.println(myAdd(5,10));
        System.out.println("..............");
        checkAge(20);
    }
}
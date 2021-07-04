public class Loop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);    //while loop
            i++;
        }
        System.out.println("...............");
        int j = 0;
        do {
            System.out.println(j);    // do while loop
            j++;
        }
        while (j < 5);
        System.out.println("...............");

        for(j=0 ; j<6; j++)
        {
            System.out.println(j);
        }                                       // for loop
        System.out.println("...............");
        String [] cars = {"BMW", "MARUTI","FORD","TATA","VOLVO"};
        for (String k : cars){
            System.out.println(k);
        }
        System.out.println("...............");

        for (j=0; j<10; j++){
            if(j==4){
                break;   // break statement;
            }
            System.out.println(j);
        }
        System.out.println("...............");

        for (j=0; j<7; j++){
            if(j==4){
                continue;  //continue statement;
            }
            System.out.println(j);
        }

    }
}
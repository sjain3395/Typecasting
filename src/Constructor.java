
public class Constructor {
    int modelYear;
    String modelName;

    public Constructor(int year, String name ){
    modelYear = year;
    modelName = name;

    }
    public static void main (String[] args){
        Constructor myCar = new Constructor(2005,"Swift");
        System.out.println(myCar.modelYear+" "+myCar.modelName);
    }
}

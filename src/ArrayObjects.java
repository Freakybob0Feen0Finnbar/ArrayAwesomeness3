public class ArrayObjects {
    public static void main (String[] args){
        ArrayObjects a = new ArrayObjects();
    }

    SushinmyBoosch[] soosh = new SushinmyBoosch [10];
    public ArrayObjects(){
        System.out.println("making arrays with objects!");
        SushinmyBoosch s = new SushinmyBoosch(12.00);
        soosh[0] = s;
        soosh[0].printinfo();
        //fill soosh array w sushi objects
    }
}

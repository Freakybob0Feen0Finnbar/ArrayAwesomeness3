public class SushinmyBoosch {

    //variables ingredient, type, price, size (# of pieces)
    String ingredient;
    String type;
    double price;
    int size;
    boolean isHot;

    //todo: make a constructor that sets defaults for all of our vars

    public SushinmyBoosch(double x) {
        ingredient = "rice, tuna, pee, poop. salmon, soy sauce";
        type = "spicy rool";
        price = x;
        size = 11;
        isHot = false;

    }
    // todo make a print info that print all of it in a readable way
    public void printinfo (){
        System.out.println("type" + "type");
        System.out.println("ingredients" + "ingredients");
        System.out.println("price" + "price");
        System.out.println("size" + "size");
        System.out.println("isHot" + "isHot");
    }
}

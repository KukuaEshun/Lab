public class ClothingItem {
    private String name;
    private double price;
    private Size size;
    private ClothingType type;
    private double discountedPrice;
    // Creating an instance data field and adding one class variables
    public static   int itemCount =0;

    public static int getItemCount() {
        return itemCount;
    }
// Creating public accessor  and mutator methods for each data fields
    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Size getSize(){
        return size;
    }
    public void setSize(Size size){
        this.size =size;
    }

    public ClothingType getType(){
        return type;

    }
    public void setType(ClothingType type){
        this.type = type;
    }



    // Task 3

    //Creating a parameterized constructor that initializes all fields
    public ClothingItem(String name ,double price ,Size size, ClothingType type){
        this.name = name;
        this.price =price;
        this.size=size;
        this.type=type;
        itemCount++;
    }
    //Creating a  partial constructor that initializes only name and type
    public ClothingItem(String name , ClothingType type){
        this.name = name;
        this.type=type;
        this.size = Size.M;   //
        this.price = 1000;
        itemCount++;
    }
    //Creating a default constructor
    public ClothingItem(){
        name= "Generic African Wear";
        type = ClothingType.SHIRT;
        size = Size.M;
        price = 1000;
        itemCount++;
        //
    }



    //Task four
    public void displayInfo(){
        System.out.println("Name: " + name + " | Type: " + type + " | Size: " + size + " | Price: " + price + "Zig");

    }

    public void displayInfo(boolean showPrice) {
        if(showPrice){
            System.out.println("Name: " + name + " | Type: " + type + " | Size: " + size + " | Price: " + price + "Zig");

        }else{
            System.out.println("Name: " + name + " | Type: " + type + " | Size: " + size);

        }


        }//Task 6
    public void applyDiscount() {
        if (price > 50) {
            double discountedPrice = 0.9 * price;
            double discount = price - discountedPrice;

            price = discountedPrice;

            System.out.println("Your discount is " + discount);
            System.out.println("Your new price is " + price +"Zig");//zig is currency


        } else {
            System.out.println("No discount applies");



        }

    }

}


import java.util.Scanner;
// Zimbabwe boutique code
public class ZimStyleApp {
    public static void main(String[] args) {
        ClothingType type = ClothingType.DRESS;
        System.out.println("Enter your clothing type:");
        Scanner input = new Scanner(System.in);
        String userCloth = input.next().toUpperCase();

        try {
            ClothingType selectedType = ClothingType.valueOf(userCloth);
            System.out.println(selectedType);

            //a small switch statement  that prints a description for  the clothing types.
            switch (selectedType) {
                case DRESS:
                    System.out.println("Elegant wear made from traditional fabric");
                    break;
                case TROUSER:
                    System.out.println("Perfect for formal and casual African wear.");
                    break;
            }


        }catch (IllegalArgumentException e) {
            System.out.println("Invalid input");


        }
        ClothingItem itemOne = new ClothingItem();
        ClothingItem itemTwo = new ClothingItem( "Ankara Pants" ,100, Size.S,ClothingType.TROUSER);
        ClothingItem itemThree = new ClothingItem("Blouse",ClothingType.SHIRT);



        //Task six
        //Creating  a ClothingItem array

        ClothingItem[] inventory = new ClothingItem [5];
        //creating 5 different instances
        inventory[0] = new ClothingItem();
        inventory[1] = new ClothingItem("Ankara Pants", 150, Size.S, ClothingType.TROUSER);
        inventory[2] = new ClothingItem("Blouse", ClothingType.SHIRT);
        inventory[3] = new ClothingItem("African Jacket", 2500, Size.L, ClothingType.JACKET);
        inventory[4] = new ClothingItem("Beaded Necklace", 45, Size.S, ClothingType.ACCESSORY);

        for(ClothingItem item : inventory){
            item.displayInfo();
        }
        System.out.println(ClothingItem.getItemCount());
        for(ClothingItem item : inventory){
            item.applyDiscount();
        }
        double total = 0;
        for (ClothingItem item : inventory) {
            total += item.getPrice();
        }

        double average = total / inventory.length;

        //output in two decimal places
        System.out.printf("Average Price for All Items: $%.2f%n", average);




        input.close();
    }
}




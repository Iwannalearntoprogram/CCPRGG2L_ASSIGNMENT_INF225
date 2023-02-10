import javax.swing.plaf.basic.BasicComboBoxUI.ItemHandler;

public class Cashier {

    public void checkout(GroceryItem item){
        System.out.println("you have bought "+ item.name);



     }

    public void showPrice(GroceryItem item){
        System.out.println("This item costs " + item.Price);


    } 
    







    
}

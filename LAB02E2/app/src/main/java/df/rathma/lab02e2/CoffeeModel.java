package df.rathma.lab02e2;

public class CoffeeModel {
    private boolean chocolate=false;
    private boolean cream=false;
    private int quantity=0;

    public void CoffeModel(){


    }

    public String generate_summary(){
        String order = "";
        String cream_text = "no";
        String choco_text = "no";
        double price = 4.0;
        if(cream) {
            price+=0.5;
            cream_text = "yes";
        }
        if(chocolate) {
            price+=1.0;
            choco_text = "yes";
        }
        price*=quantity;
        order += "Add whipped cream? " + cream_text;
        order += "\n";
        order += "Add chocolate? " + choco_text;
        order += "\n";
        order += "Quantity: " + quantity;
        order += "\n";
        order += "\n";
        order += "Price: $" + price;
        order += "\n";
        order += "THANK YOU!";
        return order;
    }
    public int getQuantity(){
        return quantity;
    }
    public int plusQuantity(){
        quantity++;
        return quantity;
    }
    public int minusQuantity(){
        if(quantity!=0)
            quantity--;
        return quantity;
    }
    public boolean getChocolate(){
        return chocolate;
    }
    public boolean getCream(){
        return cream;
    }
    public boolean toggleChocolate(){
        chocolate = !chocolate;
        return chocolate;
    }
    public boolean toggleCream(){
        cream = !cream;
        return cream;
    }
}

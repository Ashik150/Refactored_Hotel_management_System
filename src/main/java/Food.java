import java.io.Serializable;

public class Food implements Serializable {
    private static final long serialVersionUID = 1L;
    int itemNo;
    int quantity;

    Food(int itemno,int quantity)
    {
        this.itemNo=itemno;
        this.quantity=quantity;
    }
    public float calculatePrice() {
        if (itemNo < 1 || itemNo > FoodType.values().length) {
            throw new IllegalArgumentException("Invalid item number");
        }
        return quantity * FoodType.values()[itemNo - 1].getPrice();
    }
}

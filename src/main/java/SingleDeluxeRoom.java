import java.io.Serializable;
import java.util.ArrayList;

public class SingleDeluxeRoom implements SingleRoom, Serializable {
    private static final long serialVersionUID = 1L;
    String name;
    String contact;
    String gender;
    ArrayList<Food> food = new ArrayList<>();

    @Override
    public void setSingleRoomDetails(String name, String contact, String gender) {
        this.name = name;
        this.contact = contact;
        this.gender = gender;
    }
}

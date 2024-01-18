import java.io.Serializable;
import java.util.ArrayList;

public class DoubleLuxuryRoom implements DoubleRoom, Serializable {
    private static final long serialVersionUID = 1L;
    String name1;
    String contact1;
    String gender1;
    String name2;
    String contact2;
    String gender2;
    ArrayList<Food> food = new ArrayList<>();

    @Override
    public void setDoubleRoomDetails(String name1, String contact1, String gender1, String name2, String contact2, String gender2) {
        this.name1 = name1;
        this.contact1 = contact1;
        this.gender1 = gender1;
        this.name2 = name2;
        this.contact2 = contact2;
        this.gender2 = gender2;
    }
}

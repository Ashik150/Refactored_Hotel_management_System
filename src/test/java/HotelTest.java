import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelTest {

    @Test
    void testFeatures() {
        assertEquals("Number of double beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:4000 ",
                Hotel.features(1));
        assertEquals("Number of double beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:3000  ",
                Hotel.features(2));
        assertEquals("Number of single beds : 1\nAC : Yes\nFree breakfast : Yes\nCharge per day:2200  ",
                Hotel.features(3));
        assertEquals("Number of single beds : 1\nAC : No\nFree breakfast : Yes\nCharge per day:1200 ",
                Hotel.features(4));
    }

    // Test the availability method in Hotel class
    @Test
    void testAvailability() {
        assertEquals("Number of rooms available : 10", Hotel.availability(1));
        assertEquals("Number of rooms available : 20", Hotel.availability(2));
        assertEquals("Number of rooms available : 10", Hotel.availability(3));
        assertEquals("Number of rooms available : 20", Hotel.availability(4));
    }

    // Test the bookroom method in Hotel class
    @Test
    void testBookroom() {
        // Mocking user input for room selection
        // Assuming you have a method like bookroom in the Hotel class
        assertEquals("Room Booked", Hotel.bookroom(1));
        assertEquals("Room Booked", Hotel.bookroom(2));
        assertEquals("Room Booked", Hotel.bookroom(3));
        assertEquals("Room Booked", Hotel.bookroom(4));
    }

    // Test the order method in Hotel class
    @Test
    void testOrder() {
        // Mocking user input for room and food item selection
        // Assuming you have a method like order in the Hotel class
        assertEquals("Do you want to order anything else ? (y/n)", Hotel.order(1, 1));
        assertEquals("Do you want to order anything else ? (y/n)", Hotel.order(2, 2));
        assertEquals("Do you want to order anything else ? (y/n)", Hotel.order(3, 3));
        assertEquals("Do you want to order anything else ? (y/n)", Hotel.order(4, 4));
    }



}

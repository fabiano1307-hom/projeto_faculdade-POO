// This is a test class for the ride-sharing app.

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PrincipalQuestao10 {

    @Test
    public void testRideSharingApp() {
        // Create an instance of the ride-sharing app
        RideSharingApp app = new RideSharingApp();

        // Test creation of a new ride
        Ride ride = app.createRide("User1", "LocationA", "LocationB");
        assertNotNull(ride);
        assertEquals("User1", ride.getUserName());

        // Additional test cases...
        // 1. Test if the ride matches the right location
        // 2. Test ride cancellation
        // 3. Test driver assignment
        // 4. Test payment processing
    }
}
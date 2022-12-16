package testclasses;
import org.example.Passenger;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PassengerSuccessTest {
    private Passenger myPassenger;
    @BeforeEach
    void setUp() {
        myPassenger = new Passenger("Mr", "John Doe", 1234334567891L, 1233456789, 42);
    }




}

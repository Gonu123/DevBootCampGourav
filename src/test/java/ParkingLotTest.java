import com.java.dev.bootcamp.ParkingLot.Owner;
import com.java.dev.bootcamp.ParkingLot.Car;
import com.java.dev.bootcamp.ParkingLot.ParkingFullException;
import com.java.dev.bootcamp.ParkingLot.ParkingLot;
import com.java.dev.bootcamp.ParkingLot.Vehicle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class ParkingLotTest {

    private Owner owner;
    @BeforeEach
    void setup()
    {
        owner=Mockito.mock(Owner.class);
    }

    @Test
    public void parkVehicleException() throws ParkingFullException {
        Owner owner=new Owner();
        ParkingLot parkingLot = new ParkingLot(1,owner);
        Vehicle vehicle = new Car();
        vehicle.setVehicleNumber("KA123");
        parkingLot.park(vehicle);
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleNumber("KA1234");
        Assertions.assertThrows(ParkingFullException.class,() -> parkingLot.park(vehicle1));
    }
    @Test
    public void parkVehicle() throws ParkingFullException {
        Owner owner=new Owner();
        ParkingLot parkingLot = new ParkingLot(2,owner);
        Vehicle vehicle = new Car();
        vehicle.setVehicleNumber("KA123");
        parkingLot.park(vehicle);
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleNumber("KA1234");
        parkingLot.park(vehicle1);
    }

    @Test
    public void parkVehicleDuplicate() throws ParkingFullException {
        Owner owner=new Owner();
        ParkingLot parkingLot = new ParkingLot(2,owner);
        Vehicle vehicle = new Car();
        vehicle.setVehicleNumber("KA123");
        parkingLot.park(vehicle);
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleNumber("KA123");
        Assertions.assertThrows(ParkingFullException.class,() -> parkingLot.park(vehicle1));
    }
    @Test
    public void unParkVehicle() throws ParkingFullException {
        Owner owner=new Owner();
        ParkingLot parkingLot = new ParkingLot(1,owner);
        Vehicle vehicle = new Car();
        vehicle.setVehicleNumber("KA123");
        parkingLot.park(vehicle);
        Assertions.assertEquals(1,parkingLot.getVehicleCache().size());
        parkingLot.unpark(vehicle);
        Assertions.assertEquals(0,parkingLot.getVehicleCache().size());
    }

    @Test
    public void parkVehicleStatus() throws ParkingFullException {
        Owner owner=new Owner();
        ParkingLot parkingLot = new ParkingLot(1,owner);
        Vehicle vehicle = new Car();
        vehicle.setVehicleNumber("KA123");
        parkingLot.park(vehicle);
        Assertions.assertEquals(true, parkingLot.status(vehicle));
    }
@Test
    public void ownerShouldBeNotifiedWhenParkingIfFull() throws ParkingFullException {

        ParkingLot parkingLot=new ParkingLot(1,owner);
        Vehicle vehicle = new Car();
        vehicle.setVehicleNumber("KA123");
        parkingLot.park(vehicle);
        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleNumber("KA1234");
    Assertions.assertThrows(ParkingFullException.class,() -> parkingLot.park(vehicle1));
    Mockito.verify(owner).notifyParking();


    }

}

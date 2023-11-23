import com.java.dev.bootcamp.entities.Invoice;
import com.java.dev.bootcamp.service.CabRide;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class FareCalculationTest {
    @Test
    public void getFarePerKM()
    {
     CabRide cabRide=new CabRide();
     List<Integer> distanceTravelled = new ArrayList<>();
     distanceTravelled.add(2);
     List<Integer> waitTimeInMinutes = new ArrayList<>();
     waitTimeInMinutes.add(0);
     int result=cabRide.getFare(distanceTravelled, waitTimeInMinutes);
        Assertions.assertEquals(40,result);
    }

    @Test
    public void getFarePerMinutes()
    {
        CabRide cabRide = new CabRide();
        List<Integer> distanceTravelled = new ArrayList<>();
        distanceTravelled.add(0);
        List<Integer> waitTimeInMinutes = new ArrayList<>();
        waitTimeInMinutes.add(6);
        int result = cabRide.getFare(distanceTravelled,waitTimeInMinutes);
        Assertions.assertEquals(40,result);


    }
   @Test
    public void getFare()
    {
        CabRide cabRide=new CabRide();
        List<Integer> distanceTravelled=new ArrayList();
        distanceTravelled.add(2);
        List<Integer> waitTimeInminutes=new ArrayList();
waitTimeInminutes.add(3);
        int result=cabRide.getFare(distanceTravelled,waitTimeInminutes);
        Assertions.assertEquals(40,result);
    }
@Test
    public void getFareByMultipRides()
    {
        CabRide cabRide=new CabRide();
        List<Integer> distanceTravelled = new ArrayList<>();
        distanceTravelled.add(10);
        distanceTravelled.add(10);
        List<Integer> waitTimeInMinutes = new ArrayList<>();
        waitTimeInMinutes.add(2);
        waitTimeInMinutes.add(2);
        int result = cabRide.getFare(distanceTravelled,waitTimeInMinutes);
        Assertions.assertEquals(208,result);

    }
@Test
public void generateInvoice()
{

    CabRide cabride=new CabRide();
    List<Integer> distanceTravelled = new ArrayList<>();
    distanceTravelled.add(10);
    distanceTravelled.add(10);
    List<Integer> waitTimeInMinutes = new ArrayList<>();
    waitTimeInMinutes.add(2);
    waitTimeInMinutes.add(2);
    int totalFare = cabride.getFare(distanceTravelled,waitTimeInMinutes);
    Invoice invoice = new Invoice(cabride.getTotalTrips(),totalFare,totalFare/ cabride.getTotalTrips());
    Assertions.assertEquals(208,invoice.getTotalFare());
    Assertions.assertEquals(104,invoice.getAvgFare());
    Assertions.assertEquals(2,invoice.getTotalNumberofRides());

}

}

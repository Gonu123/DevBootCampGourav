import com.java.dev.bootcamp.ParkingLot.Observer;
import com.java.dev.bootcamp.ParkingLot.Subject;

public class TrafficObserver implements Observer {
    @Override
    public void update() {
        System.out.println("TrafficObserver Notified");
    }

    @Override
    public void setSubject(Subject sub) {

    }
}

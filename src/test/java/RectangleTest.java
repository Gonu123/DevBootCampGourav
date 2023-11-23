import com.java.problem2.entities.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {
    @Test
    public void shouldReturnRectangleAreaAs12WithLength4AndWidth3() {
        Rectangle rectangle = new Rectangle(4, 3);
        int area = rectangle.area();
        Assertions.assertEquals(12, area);
    }

    @Test
    public void shouldReturnRectangleAreaAs15WithLength5AndWidth3() {
        Rectangle rectangle = new Rectangle(5, 3);
        int area = rectangle.area();
        Assertions.assertEquals(15, area);
    }

    @Test
    public void shouldReturnRectangleperimeterAs14WithLength4AndWidth3() {
        Rectangle rectangle = new Rectangle(4, 3);
        int perimeter = rectangle.perimeter();
        Assertions.assertEquals(14, perimeter);
    }

    @Test
    public void shouldReturnRectangleperimeterAs20WithLength5AndWidth5() {
        Rectangle rectangle = new Rectangle(5, 5);
        int perimeter = rectangle.perimeter();
        Assertions.assertEquals(20, perimeter);
    }


}

import com.java.problem2.entities.Rectangle;
import com.java.problem2.entities.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTest {
    @Test
    public void shouldReturnSquareAreaAs16WithLength4()
    {
        Square square=new Square(4);
        int area=square.area();
        Assertions.assertEquals(16,area);
    }

    @Test
    public void shouldReturnSquareAreaAs9WithLength3()
    {
        Square square=new Square(3);
        int area=square.area();
        Assertions.assertEquals(9,area);
    }

    @Test
    public void shouldReturnSquarePerimeterAs16WithLength4()
    {
        Square squre= new Square(4);
        int perimeter = squre.perimeter();
        Assertions.assertEquals(16,perimeter);
    }
    @Test
    public void shouldReturnSquarePerimeterAs12WithLength3()
    {
        Square squre= new Square(3);
        int perimeter = squre.perimeter();
        Assertions.assertEquals(12,perimeter);
    }


}

import com.java.dev.bootcamp.problem3.Distance;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DistanceTest {

    @Test
    public void testDistance()
    {
        int d1=1000;
        String d2="meters";
        int d3=1000;
        String d4="meters";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertTrue(result);
    }

    @Test
    public void testDistance1()
    {
        int d1=1;
        String d2="meters";
        int d3=2;
        String d4="meters";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertFalse(result);
    }
   @Test
    public void testDistance2()
    {
        int d1=1000;
        String d2="meters";
        int d3=1;
        String d4="Kilometer";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertTrue(result);
    }

    @Test
    public void testDistance3()
    {

        int d1=1;
        String d2="Kilometer";
        int d3=1000;
        String d4="meter";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertFalse(result);
    }
    @Test
    public void testDistance4()
    {

        int d1=100;
        String d2="centimeter";
        int d3=1;
        String d4="meters";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertTrue(result);
    }
    @Test
    public void testDistance5()
    {

        int d1=10;
        String d2="meters";
        int d3=1000;
        String d4="centimeter";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertTrue(result);
    }
    @Test
    public void testDistance6()
    {

        int d1=5;
        String d2="Kilometer";
        int d3=500000;
        String d4="centimeter";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        boolean result=obj1.equals(obj2);
        Assertions.assertTrue(result);
    }
       @Test
        public void testDistance7()
        {

            int d1=1000;
            String d2="meters";
            int d3=1000;
            String d4="meters";
            Distance obj1=new Distance(d1,d2);
            Distance obj2=new Distance(d3,d4);
             Distance expectedDistance =new Distance(2000, "meters");
               Distance ans=obj1.add(obj1,obj2);
               boolean x=expectedDistance.equals(ans);
                Assertions.assertTrue(x);
        }
    @Test
    public void testDistance8()
    {

        int d1=1;
        String d2="kilometer";
        int d3=300;
        String d4="meters";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        Distance expectedDistance =new Distance(1.3, "kilometer");
        Distance ans=obj1.add(obj1,obj2);
        boolean x=expectedDistance.equals(ans);
        Assertions.assertTrue(x);
    }
    @Test
    public void testDistance9()
    {

        int d1=500;
        String d2="meters";
        int d3=1;
        String d4="kilometer";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        Distance expectedDistance =new Distance(1500, "meters");
        Distance ans=obj1.add(obj1,obj2);
        boolean x=expectedDistance.equals(ans);
        Assertions.assertTrue(x);
    }
    @Test
    public void testDistance10()
    {

        int d1=1000;
        String d2="meters";
        int d3=1000;
        String d4="meters";
        Distance obj1=new Distance(d1,d2);
        Distance obj2=new Distance(d3,d4);
        Distance expectedDistance =new Distance(2, "kilometer");
        Distance ans=obj1.add(obj1,obj2);
        boolean unitCheck = obj1.UnitCheck(ans,expectedDistance);
        //x=unitCheck && x;
        Assertions.assertFalse(unitCheck);
    }
    }



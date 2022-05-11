import management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director ;

    @Before
    public void before(){
        director = new Director("Bruce Wayne", "dont need one", 150000.00,
                "none of your business", 1000000.00);
    }

    @Test
    public void canGetRaise(){
        director.raiseSalary(10000.00);
        assertEquals(160000, director.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(3000, director.payBonus(), 0.0);
    }

    @Test
    public void hasName(){
        assertEquals("Bruce Wayne", director.getName());
    }

    @Test
    public void canChangeName(){
        director.setName("Brucie");
        assertEquals("Brucie", director.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("dont need one", director.getNi());
    }

    @Test
    public void canChangeNi(){
        director.setNi("NE22222A");
        assertEquals("NE22222A", director.getNi());
    }

    @Test
    public void cannotRaiseWithNegativeNumber(){
        director.raiseSalary(-2000);
        assertEquals(150000, director.getSalary(), 0.0);
    }

    @Test
    public void setNameCannotBeEmptyorNull(){
        director.setName("");
        director.setName(null);
        assertEquals("Bruce Wayne", director.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(150000, director.getSalary(), 0.0);
    }

    @Test
    public void canChangeSalary(){
        director.setSalary(100000);
        assertEquals(100000, director.getSalary(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("none of your business", director.getDeptName());
    }

   @Test
    public void hasBudget(){
        assertEquals(1000000.00, director.getBudget(), 0.0);
   }

}

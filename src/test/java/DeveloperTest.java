import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Borat", "FT145633B", 35000.00);
    }

    @Test
    public void canGetARaise(){
        developer.raiseSalary(1000.00);
        assertEquals(36000, developer.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(350, developer.payBonus(), 0.0);
    }
    @Test
    public void hasName(){
        assertEquals("Borat", developer.getName());
    }

    @Test
    public void canChangeName(){
        developer.setName("Brucie");
        assertEquals("Brucie", developer.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("FT145633B", developer.getNi());
    }

    @Test
    public void canChangeNi(){
        developer.setNi("NE22222A");
        assertEquals("NE22222A", developer.getNi());
    }

    @Test
    public void cannotRaiseWithNegativeNumber(){
        developer.raiseSalary(-2000);
        assertEquals(35000.00, developer.getSalary(), 0.0);
    }

    @Test
    public void setNameCannotBeEmptyorNull(){
        developer.setName("");
        developer.setName(null);
        assertEquals("Borat", developer.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, developer.getSalary(), 0.0);
    }

    @Test
    public void canChangeSalary(){
        developer.setSalary(100000);
        assertEquals(100000, developer.getSalary(), 0.0);
    }
}

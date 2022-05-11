import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;


import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Borat", "FT145633B", 35000.00);
    }

    @Test
    public void canGetARaise(){
        databaseAdmin.raiseSalary(1000.00);
        assertEquals(36000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(350, databaseAdmin.payBonus(), 0.0);
    }

    @Test
    public void hasName(){
        assertEquals("Borat", databaseAdmin.getName());
    }

    @Test
    public void canChangeName(){
        databaseAdmin.setName("Brucie");
        assertEquals("Brucie", databaseAdmin.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("FT145633B", databaseAdmin.getNi());
    }

    @Test
    public void canChangeNi(){
        databaseAdmin.setNi("NE22222A");
        assertEquals("NE22222A", databaseAdmin.getNi());
    }

    @Test
    public void cannotRaiseWithNegativeNumber(){
        databaseAdmin.raiseSalary(-2000);
        assertEquals(35000.00, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void setNameCannotBeEmptyorNull(){
        databaseAdmin.setName("");
        databaseAdmin.setName(null);
        assertEquals("Borat", databaseAdmin.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(35000, databaseAdmin.getSalary(), 0.0);
    }

    @Test
    public void canChangeSalary(){
        databaseAdmin.setSalary(100000);
        assertEquals(100000, databaseAdmin.getSalary(), 0.0);
    }
}


import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Dick", "ES20193A", 67000.00, "Department of silly walking");
    }

    @Test
    public void canGetARaise(){
        manager.raiseSalary(2500.56);
        assertEquals(69500.56, manager.getSalary(), 0.0);
    }

    @Test
    public void canGetBonus(){
        assertEquals(670, manager.payBonus(), 0.0);
    }

    @Test
    public void hasName(){
        assertEquals("Dick", manager.getName());
    }

    @Test
    public void canChangeName(){
        manager.setName("Brucie");
        assertEquals("Brucie", manager.getName());
    }

    @Test
    public void hasNi(){
        assertEquals("ES20193A", manager.getNi());
    }

    @Test
    public void canChangeNi(){
        manager.setNi("NE22222A");
        assertEquals("NE22222A", manager.getNi());
    }

    @Test
    public void cannotRaiseWithNegativeNumber(){
        manager.raiseSalary(-2000);
        assertEquals(67000, manager.getSalary(), 0.0);
    }

    @Test
    public void setNameCannotBeEmptyorNull(){
        manager.setName("");
        manager.setName(null);
        assertEquals("Dick", manager.getName());
    }

    @Test
    public void hasSalary(){
        assertEquals(67000, manager.getSalary(), 0.0);
    }

    @Test
    public void canChangeSalary(){
        manager.setSalary(100000);
        assertEquals(100000, manager.getSalary(), 0.0);
    }

    @Test
    public void hasDept(){
        assertEquals("Department of silly walking", manager.getDeptName());
    }

}

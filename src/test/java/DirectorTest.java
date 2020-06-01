import staff.management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    
    private Director director;

    @Before
    public void before() {
        this.director = new Director("Richard Branson", "UU123456U",
                1000000.00, 1000000000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Richard Branson", director.getName());
    }

    @Test
    public void hasNatInsNo() {
        assertEquals("UU123456U", director.getNatInsNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void hasDepName() {
        assertEquals("Management", director.getDepName());
    }

    @Test
    public void hasBudget() {
        assertEquals(1000000000, director.getBudget(),0.01);
    }

    @Test
    public void canCalcRaise() {
        director.raiseSalary(1000.00);
        assertEquals(1001000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(10000.00, director.payBonus(), 0.01);
    }

    @Test
    public void doesNotChangeSalaryWhenRiseIsNegative() {
        director.raiseSalary(-10000.00);
        assertEquals(1000000.00, director.getSalary(), 0.01);
    }

    @Test
    public void canSetName() {
        director.setName("Jimmy Jo");
        assertEquals("Jimmy Jo", director.getName());
    }

    @Test
    public void canNotSetNameToNull() {
        director.setName(null);
        assertEquals("Richard Branson", director.getName());
    }
}

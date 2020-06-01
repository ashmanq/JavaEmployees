import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    
    private Developer developer;

    @Before
    public void before() {
        this.developer = new Developer("Steve Wozniak", "BB123456B",
                80000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Steve Wozniak", developer.getName());
    }

    @Test
    public void hasNatInsNo() {
        assertEquals("BB123456B", developer.getNatInsNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(80000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void hasDepName() {
        assertEquals("Tech Staff", developer.getDeptName());
    }

    @Test
    public void canCalcRaise() {
        developer.raiseSalary(2000.00);
        assertEquals(82000.00, developer.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(800.00, developer.payBonus(), 0.01);
    }

    @Test
    public void doesNotChangeSalaryWhenRiseIsNegative() {
        developer.raiseSalary(-10000.00);
        assertEquals(80000.00, developer.getSalary(), 0.01);
    }
}

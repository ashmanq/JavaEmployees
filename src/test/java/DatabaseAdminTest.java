import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    
    private DatabaseAdmin databaseAdmin;

    @Before
    public void before() {
        this.databaseAdmin = new DatabaseAdmin("Joe Bloggs", "ZZ123456Z",
                70000.00);
    }

    @Test
    public void hasName() {
        assertEquals("Joe Bloggs", databaseAdmin.getName());
    }

    @Test
    public void hasNatInsNo() {
        assertEquals("ZZ123456Z", databaseAdmin.getNatInsNo());
    }

    @Test
    public void hasSalary() {
        assertEquals(70000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void hasDepName() {
        assertEquals("Tech Staff", databaseAdmin.getDeptName());
    }

    @Test
    public void canCalcRaise() {
        databaseAdmin.raiseSalary(2000.00);
        assertEquals(72000.00, databaseAdmin.getSalary(), 0.01);
    }

    @Test
    public void canGetBonusAmount() {
        assertEquals(700.00, databaseAdmin.payBonus(), 0.01);
    }
}

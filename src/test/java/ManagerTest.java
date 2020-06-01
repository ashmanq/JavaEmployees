import staff.management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    private Manager manager;

   @Before
   public void before() {
       this.manager = new Manager("Charles Xavier", "AB123456A",
               30000.00);
   }

   @Test
    public void hasName() {
       assertEquals("Charles Xavier", manager.getName());
   }

   @Test
    public void hasNatInsNo() {
       assertEquals("AB123456A", manager.getNatInsNo());
   }

   @Test
    public void hasSalary() {
       assertEquals(30000.00, manager.getSalary(), 0.01);
   }

   @Test
    public void hasDepName() {
       assertEquals("Management", manager.getDepName());
   }

   @Test
    public void canCalcRaise() {
       manager.raiseSalary(1000.00);
       assertEquals(31000.00, manager.getSalary(), 0.01);
   }

   @Test
    public void canGetBonusAmount() {
       assertEquals(300.00, manager.payBonus(), 0.01);
   }

   @Test
    public void doesNotChangeSalaryWhenRiseIsNegative() {
       manager.raiseSalary(-10000.00);
       assertEquals(30000.00, manager.getSalary(), 0.01);
   }
}

import com.partum.pojo.Employee;
import com.partum.service.EmployeeService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/applicationContext.xml"})
public class EmployeeServiceImplTest {

    @Autowired
    private EmployeeService employeeService;

    @Test
    public void insertEmployee() throws Exception {
        Employee employee = new Employee();
        employee.setEmpName("peter");
        employee.setEmpPassword("123456");
        employeeService.insertEmployee(employee);

    }

}
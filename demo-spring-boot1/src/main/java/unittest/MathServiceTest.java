package unittest;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
        (value = "classpath:/beans.xml")
public class MathServiceTest {
    @Autowired
    MathService mathService;
    @Test
    public void testAdd_UC001(){
        int actualResult = mathService.add(2,3);
        int expectedResult=5;
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testDivide_UC001(){
        double actualResult =  mathService.divide(7,2);
        double expectedResult = 3.5;
        assertEquals(expectedResult,actualResult,0.0001);
    }
    double divide(int a,int b){
        return(double) a / b;
    }
    @Test(expected = ArithmeticException.class)
    public void testDivide_UC002(){
        mathService.divide(2,0);
    }
}
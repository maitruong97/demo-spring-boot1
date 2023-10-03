package unittest;

import org.junit.jupiter.api.Test;

public class MathService {
    MathHelper mathHelper;
    public MathService(MathHelper mathHelper){
        this.mathHelper=mathHelper;
    }
    int add(int a, int b){
        return mathHelper.add(a,b);
    }
    double divide(int a, int b){
        if(b==0){
            throw new ArithmeticException("Division by zero");
        }
        return mathHelper.divide(a,b);
    }
    @Test
    public void testDivide_UC001(){
        double actualResult = mathHelper.divide(7,2);
        double expectedResult = 3.5;

    }
}
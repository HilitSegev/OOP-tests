import java.util.Map;
import java.util.TreeMap;

/**
 * Add this to build.xml:
 * <target name="run-test" depends="compile" >
        <java classname="TestForAss4" classpath="${classpath}" fork="true"/>
    </target>
 * 
 * Then run `ant run-test`
 */
public class TestForAss4 {
    public static void main(String[] args) {
        Expression e1 = new Cos(new Neg(new Var("x")));
        System.out.println("Test 1: cos(-x) = cos(x)");
        System.out.println(e1.toString());
        System.out.println(e1.simplify().toString());
        System.out.println();

        Expression e2 = new Sin(new Neg(new Var("x")));
        System.out.println("Test 2: sin(-x) = -sin(x)");
        System.out.println(e2.toString());
        System.out.println(e2.simplify().toString());
        System.out.println();

        Expression e3 = new Div(new Num(0.0), new Var("x"));
        System.out.println("Test 3: 0/x = 0");
        System.out.println(e3.toString());
        System.out.println(e3.simplify().toString());
        System.out.println();

        Expression e4 = new Div(new Var("x"), new Neg(new Var("x")));
        System.out.println("Test 4: x/-x = -1");
        System.out.println(e4.toString());
        System.out.println(e4.simplify().toString());
        System.out.println();

        Expression e5 = new Div(new Neg(new Var("x")), new Var("x"));
        System.out.println("Test 5: -x/x = -1");
        System.out.println(e5.toString());
        System.out.println(e5.simplify().toString());
        System.out.println();

        Expression e6 = new Mult(new Var("x"), new Var("x"));
        System.out.println("Test 6: x*x = x^2");
        System.out.println(e6.toString());
        System.out.println(e6.simplify().toString());
        System.out.println();

        Expression e8 = new Neg(new Neg(new Var("x")));
        System.out.println("Test 8: -(-x) = x");
        System.out.println(e8.toString());
        System.out.println(e8.simplify().toString());
        System.out.println();

        Expression e9 = new Plus(new Var("x"), new Neg(new Var("x")));
        System.out.println("Test 9: x + (-x) = 0");
        System.out.println(e9.toString());
        System.out.println(e9.simplify().toString());
        System.out.println();

        Expression e10 = new Plus(new Neg(new Var("x")), new Var("x"));
        System.out.println("Test 10: (-x) + x = 0");
        System.out.println(e10.toString());
        System.out.println(e10.simplify().toString());
        System.out.println();

        Expression e11 = new Plus(new Var("x"), new Var("x"));
        System.out.println("Test 11: x + x = 2x");
        System.out.println(e11.toString());
        System.out.println(e11.simplify().toString());
        System.out.println();

        Expression e12 = new Pow(new Pow(new Pow(new Pow(new Var("x"), new Var("y")), new Var("y")), new Var("y")),
                new Var("y"));
        System.out.println("Test 12: (x)^y^y^y^y = x^4y");
        System.out.println(e12.toString());
        System.out.println(e12.simplify().toString());
        System.out.println();

        Expression e13 = new Neg(new Neg(new Num(2.0)));
        System.out.println("Test 13: -(-2) = 2");
        System.out.println(e13.toString());
        System.out.println(e13.simplify().toString());
        System.out.println();

        Expression e15 = new Minus(new Neg(new Var("x")), new Var("x"));
        System.out.println("Test 15: -x -x = 2(-x)");
        System.out.println(e15.toString());
        System.out.println(e15.simplify().toString());
        System.out.println();

        Expression e16 = new Minus(new Var("x"), new Neg(new Var("x")));
        System.out.println("Test 16: -x -x = 2(-x)");
        System.out.println(e16.toString());
        System.out.println(e16.simplify().toString());
        System.out.println();

        Expression e17 = new Pow(new Var("x"), new Plus(new Var("x"), new Var("x")));
        System.out.println("Test 17: x^(x+x) = x^2x");
        System.out.println(e17.toString());
        System.out.println(e17.simplify().toString());
        System.out.println();
    
        // might be too much
        // Expression e18 = new Plus(new Var("x"), new Plus(new Var("y"), new Plus(new Var("x"), new Var("y"))));
        // System.out.println("Test 18: x + y + x + y = 2x + 2y");
        // System.out.println(e18.toString());
        // System.out.println(e18.simplify().toString());
        // System.out.println();
        
        Expression e19 = new Pow(new Plus(new Var("x"), new Var("y")), new Num(2));
        System.out.println("Test (differentiate) 19: (x+y)^2 = (x+y)^2 * (2/(x+y)) = 2(x+y)");
        System.out.println(e19.differentiate("x"));
        System.out.println(e19.differentiate("x").simplify());
        System.out.println();

        Expression e20 = new Pow(new Var("e"), new Var("x"));
        System.out.println("Test (differentiate) 20: e^x = e^x");
        System.out.println(e20.differentiate("x"));
        System.out.println(e20.differentiate("x").simplify());
        System.out.println();

        Expression e21 = new Mult(new Pow(new Var("x"), new Num(2.0)), new Var("x"));
        System.out.println("Test (differentiate) 21: (x^2) * x = ((x^2) * (2/x) * x) + (x^2)");
        System.out.println(e21.toString());
        System.out.println(e21.differentiate("x"));
        System.out.println(e21.differentiate("x").simplify());
        System.out.println();

        Expression e22 = new Mult(new Pow(new Var("x"), new Num(0.0)), new Var("x"));
        System.out.println("Test (differentiate) 22: (x^0) * x = 1");
        System.out.println(e22.toString());
        System.out.println(e22.differentiate("x"));
        System.out.println(e22.differentiate("x").simplify());
        System.out.println();

        Expression e23 = new Mult(new Var("Pi"), new Pow(new Var("x"), new Var("y")));
        System.out.println("Test (differentiate) 23: Pi * (x^y) = (x^y) * (y/x) * Pi");
        System.out.println(e23.toString());
        System.out.println(e23.differentiate("x"));
        System.out.println(e23.differentiate("x").simplify());
        System.out.println();

        Expression e24 = new Neg(new Minus(new Mult(new Var("x"), new Var("x")), new Mult(new Var("x"), new Var("x"))));
        System.out.println("Test (differentiate) 23: -(x*x - x*x) = 0");
        System.out.println(e24.toString());
        System.out.println(e24.simplify().toString());
        System.out.println(e24.differentiate("x"));
        System.out.println(e24.differentiate("x").simplify());
        System.out.println();
    }
}
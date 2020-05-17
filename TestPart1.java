import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TestPart1 {
    public static void main(String[] args) throws Exception {
        System.out.println("*********************");
        System.out.println("CHECK NUM");
        Num num = new Num(2.0);
        System.out.println("check evaluate (should return 2.0): " + num.evaluate());
        List<String> listNum = num.getVariables();
        if (!listNum.isEmpty()) {
            for (String s : listNum) {
                System.out.println("check getVariables " + s);
            }
        }
        else {
            System.out.println("num.getVariables returns empty list (its ok)");
        }
        System.out.println("check toString (should return 2.0): " + num.toString());
        System.out.println("check assign (should return 2.0): " + num.assign("x", new Num(5)).toString());
        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK VAR");
        Var var = new Var("x");
        //try to check if exception works
        //System.out.println("check evaluate - exception" + var.evaluate());
        Map<String, Double> assignment = new TreeMap<String, Double>();
        assignment.put("y", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + var.evaluate(assignment));
        assignment.put("x", 2.0);
        System.out.println("check evaluate (should return 2.0): " + var.evaluate(assignment));
        List<String> list = var.getVariables();
        if (!list.isEmpty()) {
            for (String s : list) {
                System.out.println("check getVariables (should return x): " + s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return x): " + var.toString());
        System.out.println("check assign (should replace x by 5.0): " + var.assign("x", new Num(5)).toString());
        System.out.println("check assign (should return x): " + var.assign("y", new Num(5)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK PLUS");
        Var x = new Var("x");
        Var y = new Var("y");
        Plus plus = new Plus(x, y);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + plus.evaluate());
        Map<String, Double> assignmentPlus = new TreeMap<String, Double>();
        assignmentPlus.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + plus.evaluate(assignmentPlus));
        assignmentPlus.put("y", 5.0);
        assignmentPlus.put("x", 2.0);
        System.out.println("check evaluate (should return 7.0): " + plus.evaluate(assignmentPlus));
        List<String> listPlus = plus.getVariables();
        System.out.println("check getVariables (should print x, y): ");
        if (!listPlus.isEmpty()) {
            for (String s : listPlus) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return (x + y)): " + plus.toString());
        System.out.println("check assign (should replace x by 3.0): " + plus.assign("x", new Num(3)).toString());
        System.out.println("check assign  (should replace y by 4.0): " + plus.assign("y", new Num(4)).toString());
        System.out.println("check assign (should return (x + y)): " + plus.assign("z", new Num(4)).toString());


        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK MINUS");
        Var x2 = new Var("x");
        Var y2 = new Var("y");
        Minus minus = new Minus(x2, y2);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + minus.evaluate());
        Map<String, Double> assignmentMinus = new TreeMap<String, Double>();
        assignmentMinus.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + minus.evaluate(assignmentMinus));
        assignmentMinus.put("y", 12.5);
        assignmentMinus.put("x", 5.0);
        System.out.println("check evaluate (should return -7.5): " + minus.evaluate(assignmentMinus));
        List<String> listMinus = minus.getVariables();
        System.out.println("check getVariables (should print x, y): ");
        if (!listMinus.isEmpty()) {
            for (String s : listMinus) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return (x - y)): " + minus.toString());
        System.out.println("check assign (should replace x by 2.0): " + minus.assign("x", new Num(2)).toString());
        System.out.println("check assign  (should replace y by 1.0): " + minus.assign("y", new Num(1)).toString());
        System.out.println("check assign (should return (x - y)): " + minus.assign("z", new Num(4)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK PLUS + MINUS (MULTI EXPRESSION)");
        Var xx = new Var("x");
        Var yy = new Var("y");
        Var zz = new Var("z");
        Plus p = new Plus(xx, yy);
        Minus m = new Minus(p, zz);
        Plus p2 = new Plus(m, yy);
        Plus pFinal = new Plus(p2, m);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + pFinal.evaluate());
        Map<String, Double> ass = new TreeMap<String, Double>();
        ass.put("w", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + pFinal.evaluate(ass));
        ass.put("z", 3.0);
        ass.put("y", 2.5);
        ass.put("x", 8.0);
        System.out.println("check evaluate (should return 17.5): " + pFinal.evaluate(ass));
        List<String> listP = pFinal.getVariables();
        System.out.println("check getVariables (should print x, y, z): ");
        if (!listP.isEmpty()) {
            for (String s : listP) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return ((((x + y) - z) + y) + ((x + y) - z)) ): " + pFinal.toString());
        System.out.println("check assign (should replace x by 3.0): " + pFinal.assign("x", new Num(3)).toString());
        System.out.println("check assign  (should replace y by 4.0): " + pFinal.assign("y", new Num(4)).toString());
        System.out.println("check assign  (should replace z by 6.5): " + pFinal.assign("z", new Num(6.5)).toString());
        System.out.println("check assign (should return original): " + pFinal.assign("w", new Num(4)).toString());


        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK MULT");
        Mult mult = new Mult(x, y);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + mult.evaluate());
        Map<String, Double> assignmentMult = new TreeMap<String, Double>();
        assignmentMinus.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + mult.evaluate(assignmentMult));
        assignmentMult.put("y", 3.0);
        assignmentMult.put("x", 5.0);
        System.out.println("check evaluate (should return 15.0): " + mult.evaluate(assignmentMult));
        List<String> listMult = mult.getVariables();
        System.out.println("check getVariables (should print x, y): ");
        if (!listMult.isEmpty()) {
            for (String s : listMult) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return (x * y)): " + mult.toString());
        System.out.println("check assign (should replace x by 2.0): " + mult.assign("x", new Num(2)).toString());
        System.out.println("check assign  (should replace y by 1.0): " + mult.assign("y", new Num(1)).toString());
        System.out.println("check assign (should return (x * y)): " + mult.assign("z", new Num(4)).toString());


        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK DIV");
        Var x3 = new Var("x");
        Var y3 = new Var("y");
        Div div = new Div(x3, y3);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + div.evaluate());
        Map<String, Double> assignmentDiv = new TreeMap<String, Double>();
        assignmentDiv.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + div.evaluate(assignmentDiv));
        assignmentDiv.put("y", 3.0);
        assignmentDiv.put("x", 15.0);
        System.out.println("check evaluate (should return 5.0): " + div.evaluate(assignmentDiv));
        List<String> listDiv = div.getVariables();
        System.out.println("check getVariables (should print x, y): ");
        if (!listDiv.isEmpty()) {
            for (String s : listDiv) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return (x / y)): " + div.toString());
        System.out.println("check assign (should replace x by 2.0): " + div.assign("x", new Num(2)).toString());
        System.out.println("check assign  (should replace y by 1.0): " + div.assign("y", new Num(1)).toString());
        System.out.println("check assign (should return (x / y)): " + div.assign("z", new Num(4)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK POW");
        Pow pow = new Pow(x3, y3);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + div.evaluate());
        Map<String, Double> assignmentPow = new TreeMap<String, Double>();
        assignmentPow.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + pow.evaluate(assignmentPow));
        assignmentPow.put("y", 3.0);
        assignmentPow.put("x", 5.0);
        System.out.println("check evaluate (should return 125.0): " + pow.evaluate(assignmentPow));
        List<String> listPow = pow.getVariables();
        System.out.println("check getVariables (should print x, y): ");
        if (!listDiv.isEmpty()) {
            for (String s : listDiv) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return (x^y)): " + pow.toString());
        System.out.println("check assign (should replace x by 2.0): " + pow.assign("x", new Num(2)).toString());
        System.out.println("check assign  (should replace y by 1.0): " + pow.assign("y", new Num(1)).toString());
        System.out.println("check assign (should return (x^y)): " + pow.assign("z", new Num(4)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK LOG");
        Log log = new Log(x3, y3);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + log.evaluate());
        Map<String, Double> assignmentLog = new TreeMap<String, Double>();
        assignmentLog.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + log.evaluate(assignmentLog));
        assignmentLog.put("y", 8.0);
        assignmentLog.put("x", 2.0);
        System.out.println("check evaluate (should return 3.0): " + log.evaluate(assignmentLog));

        //try to check if exception works - negative or 1 in log
        /*
        assignmentLog.clear();
        assignmentLog.put("y", 8.0); //you can change to negative number
        assignmentLog.put("x", 0.0); //you can change to negative number
        System.out.println("check evaluate (should return 3.0): " + log.evaluate(assignmentLog));
         */
        List<String> listLog = log.getVariables();
        System.out.println("check getVariables (should print x, y): ");
        if (!listLog.isEmpty()) {
            for (String s : listLog) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return log(x, y)): " + log.toString());
        System.out.println("check assign (should replace x by 2.0): " + log.assign("x", new Num(2)).toString());
        System.out.println("check assign  (should replace y by 1.0): " + log.assign("y", new Num(1)).toString());
        System.out.println("check assign (should return log(x, y)) ): " + log.assign("z", new Num(4)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK SIN");
        Var x4 = new Var("x");
        Sin sin = new Sin(x4);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + sin.evaluate());
        Map<String, Double> assignmentSin = new TreeMap<String, Double>();
        assignmentSin.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + sin.evaluate(assignmentSin));
        assignmentSin.put("x", 90.0);
        System.out.println("check evaluate (should return 1.0): " + sin.evaluate(assignmentSin));
        List<String> listSin = sin.getVariables();
        System.out.println("check getVariables (should print x): ");
        if (!listSin.isEmpty()) {
            for (String s : listSin) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return sin(x)): " + sin.toString());
        System.out.println("check assign (should replace x by 45.0): " + sin.assign("x", new Num(45)).toString());
        System.out.println("check assign (should return sin(x)) ): " + sin.assign("z", new Num(4)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK COS");
        Cos cos = new Cos(x4);
        //try to check if exception works
        //System.out.println("check evaluate - exception" + cos.evaluate());
        Map<String, Double> assignmentCos = new TreeMap<String, Double>();
        assignmentCos.put("z", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + cos.evaluate(assignmentCos));
        assignmentCos.put("x", 90.0);
        //try to check if exception works - dividing by zero
        //Div div1 = new Div(new Num(5), cos);
        //System.out.println("check evaluate (should return -1.0): " + div1.evaluate(assignmentCos));
        System.out.println("check evaluate (should return ~0): " + cos.evaluate(assignmentCos));
        List<String> listCos = cos.getVariables();
        System.out.println("check getVariables (should print x): ");
        if (!listCos.isEmpty()) {
            for (String s : listCos) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return cos(x)): " + cos.toString());
        System.out.println("check assign (should replace x by 45.0): " + cos.assign("x", new Num(45)).toString());
        System.out.println("check assign (should return cos(x)) ): " + cos.assign("z", new Num(4)).toString());

        ////////////////////////////////////
        System.out.println();
        System.out.println("*********************");
        System.out.println("CHECK NEG");
        Var u = new Var("u");
        Var v = new Var("v");
        Var z = new Var("z");
        Var y4 = new Var("y");
        Neg neg = new Neg(new Pow(new Plus(new Cos(x4), new Sin(y4)), new Log(new Mult(u, v), z)));
        //try to check if exception works
        //System.out.println("check evaluate - exception" + neg.evaluate());
        Map<String, Double> assignmentNeg = new TreeMap<String, Double>();
        assignmentNeg.put("w", 2.0);
        //try to check if exception works
        //System.out.println("check evaluate - exception " + neg.evaluate(assignmentNeg));
        assignmentNeg.put("x", 0.0);
        assignmentNeg.put("y", 90.0);
        assignmentNeg.put("u", 2.0);
        assignmentNeg.put("v", 1.0);
        assignmentNeg.put("z", 8.0);
        System.out.println("check evaluate (should return -8.0): " + neg.evaluate(assignmentNeg));
        List<String> listNeg = neg.getVariables();
        System.out.println("check getVariables (should print x, y, u, v, z): ");
        if (!listNeg.isEmpty()) {
            for (String s : listNeg) {
                System.out.println(s);
            }
        }
        else {
            System.out.println("the list is empty - problem with var.getVariables");
        }
        System.out.println("check toString (should return (-((cos(x) + sin(y))^log((u * v), z))) ): " + neg.toString());
        System.out.println("check assign (should replace x by 45.0): " + neg.assign("x", new Num(45)).toString());
        System.out.println("check assign (should replace z by 4.0 ): " + neg.assign("z", new Num(4)).toString());
    }
}

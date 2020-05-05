public class LineFinalTest {
    public static void main(String[] args) {

        Line l1 = new Line(200, 100, 600, 100);
        Line l2 = new Line(450, 100, 450, 100);
        Line l11 = new Line(600, 100, 200, 100); //opposite l1

        Line l3 = new Line(650, 0, 650, 400);
        Line l4 = new Line(650, 235, 650, 235);
        Line l12 = new Line(650, 400, 650, 0); //opposite l3

        Line l5 = new Line(330, 15, 330, 240); //vertical
        Line l6 = new Line(380, 150, 150, 150); //parallel
        Line l13 = new Line(150, 150, 380, 150); //opposite l6
        Line l14 = new Line(330, 240, 330, 15); //opposite l5

        Line l7 = new Line(250, 470, 300, 470);//parallel
        Line l8 = new Line(300, 450, 300, 500); //right side
        Line l15 = new Line(300, 470, 250, 470); //opposite l7
        Line l16 = new Line(300, 500, 300, 450); //opposite l8
        Line l17 = new Line(250, 314, 250, 620); //left side
        Line l18 = new Line(250, 620, 250, 314); //opposite l17

        Line l9 = new Line(300, 450, 300, 500);//vertical
        Line l10 = new Line(190, 450, 305, 450); //down
        Line l19 = new Line(240, 500, 390, 500); //up
        Line l20 = new Line(300, 500, 300, 450); //opposite l9
        Line l21 = new Line(305, 450, 190, 450); //opposite l10
        Line l22 = new Line(390, 500, 240, 500); //opposite l19

        Line a1 = new Line(400, 550, 630, 550); //parallel
        Line a2 = new Line(400, 550, 400, 550); //left side
        Line a3 = new Line(630, 550, 400, 550); //opposite a1
        Line a4 = new Line(630, 550, 630, 550); //right side


        Line a5 = new Line(70, 10, 70, 30); //vertical
        Line a6 = new Line(70, 30, 70, 30); //up
        Line a7 = new Line(70, 30, 70, 10); //opposite a5
        Line a8 = new Line(70, 10, 70, 10); //down

        Line a9 = new Line(0, 20, 0, 300); //vertical
        Line a10 = new Line(-15, 302, 70, 302); //up
        Line a11 = new Line(0, 300, 0, 20); //opposite a9
        Line a12 = new Line(70, 302, -15, 302); //opposite a10

        Line a90 = new Line(0, 20, 0, 300); //vertical
        Line a100 = new Line(-15, 15, 70, 15); //up
        Line a110 = new Line(0, 300, 0, 20); //opposite a9
        Line a120 = new Line(70, 15, -15,15); //opposite a10

        Line t1 = new Line(50, 20, 100, 20); //parallel
        Line t2 = new Line(110, 10, 110, 27); //vertical right
        Line t3 = new Line(20, 5, 20, 40); //vertical left

        Line t4 = new Line(50, 20, 100, 20); //parallel
        Line t5 = new Line(110, 20, 110, 50); //vertical right
        Line t6 = new Line(240, 10, 240, 20); //vertical left


        Line c5 = new Line(120, 500, 120, 570); //vertical
        Line c6 = new Line(120, 500, 200, 500); //parallel
        Line c13 = new Line(200, 500, 120, 500); //opposite c6
        Line c14 = new Line(120, 570, 120, 500); //opposite c5

        Line b1 = new Line(120, 500, 200, 500); //parallel
        Line b2 = new Line(155, 700, 170, 220); //true
        Line b3 = new Line(110, 700, 119, 220); //false
        Line b4 = new Line(250, 700, 202, 220); //false
        Line b5 = new Line(150, 501, 170, 550); //false
        Line b6 = new Line(250, 499, 202, 430); //false
        Line b7 = new Line(150, 500, 170, 550); //true
        Line b8 = new Line(150, 430, 170, 500); //true

        //parallel + point
        assertEquals(l1.isIntersecting(l2), true, "test 1");
        assertEquals(l2.isIntersecting(l1), true, "test 2");
        assertEquals(l11.isIntersecting(l2), true, "test 1.2");
        assertEquals(l2.isIntersecting(l11), true, "test 1.3");

        //vertical + point
        assertEquals(l3.isIntersecting(l4), true, "test 3");
        assertEquals(l4.isIntersecting(l3), true, "test 4");
        assertEquals(l12.isIntersecting(l4), true, "test 3.2");
        assertEquals(l4.isIntersecting(l12), true, "test 3.3");

        //vertical + parallel same range x+y
        assertEquals(l5.isIntersecting(l6), true, "test 5");
        assertEquals(l6.isIntersecting(l5), true, "test 6");
        assertEquals(l5.isIntersecting(l13), true, "test 5");
        assertEquals(l13.isIntersecting(l5), true, "test 6");
        assertEquals(l14.isIntersecting(l6), true, "test 5");
        assertEquals(l6.isIntersecting(l14), true, "test 6");

        //vertical + parallel - intersection point in the edge of parallel
        assertEquals(l7.isIntersecting(l8), true, "test 7");
        assertEquals(l8.isIntersecting(l7), true, "test 8");
        assertEquals(l15.isIntersecting(l8), true, "test 7.1");
        assertEquals(l8.isIntersecting(l15), true, "test 7.2");
        assertEquals(l16.isIntersecting(l7), true, "test 7.3");
        assertEquals(l7.isIntersecting(l16), true, "test 7.4");
        assertEquals(l16.isIntersecting(l15), true, "test 7.5");
        assertEquals(l15.isIntersecting(l16), true, "test 7.6");
        assertEquals(l17.isIntersecting(l7), true, "test 7.7");
        assertEquals(l7.isIntersecting(l17), true, "test 7.8");
        assertEquals(l18.isIntersecting(l7), true, "test 7.9");
        assertEquals(l7.isIntersecting(l18), true, "test 8.1");
        assertEquals(l17.isIntersecting(l15), true, "test 8.2");
        assertEquals(l15.isIntersecting(l17), true, "test 8.3");
        assertEquals(l18.isIntersecting(l15), true, "test 8.4");
        assertEquals(l15.isIntersecting(l18), true, "test 8.5");

        //vertical + parallel - intersection point in the edge of vertical
        assertEquals(l9.isIntersecting(l10), true, "test 9");
        assertEquals(l10.isIntersecting(l9), true, "test 10");
        assertEquals(l9.isIntersecting(l19), true, "test 9.1");
        assertEquals(l19.isIntersecting(l9), true, "test 10.1");
        assertEquals(l9.isIntersecting(l21), true, "test 9.2");
        assertEquals(l21.isIntersecting(l9), true, "test 10.2");
        assertEquals(l9.isIntersecting(l22), true, "test 9.3");
        assertEquals(l22.isIntersecting(l9), true, "test 10.3");
        assertEquals(l20.isIntersecting(l10), true, "test 9.4");
        assertEquals(l10.isIntersecting(l20), true, "test 10.4");
        assertEquals(l20.isIntersecting(l19), true, "test 9.5");
        assertEquals(l19.isIntersecting(l20), true, "test 10.5");
        assertEquals(l20.isIntersecting(l21), true, "test 9.6");
        assertEquals(l21.isIntersecting(l20), true, "test 10.6");
        assertEquals(l20.isIntersecting(l22), true, "test 9.7");
        assertEquals(l22.isIntersecting(l20), true, "test 10.7");

        //parallel + point in the edge of parallel
        assertEquals(a1.isIntersecting(a2), true, "test 11");
        assertEquals(a2.isIntersecting(a1), true, "test 12");
        assertEquals(a3.isIntersecting(a2), true, "test 11.1");
        assertEquals(a2.isIntersecting(a3), true, "test 12.1");
        assertEquals(a1.isIntersecting(a4), true, "test 11.2");
        assertEquals(a4.isIntersecting(a1), true, "test 12.2");
        assertEquals(a3.isIntersecting(a4), true, "test 11.3");
        assertEquals(a4.isIntersecting(a3), true, "test 12.3");

        //vertical + point in the edge of vertical
        assertEquals(a5.isIntersecting(a6), true, "test 13");
        assertEquals(a6.isIntersecting(a5), true, "test 14");
        assertEquals(a5.isIntersecting(a8), true, "test 13.1");
        assertEquals(a8.isIntersecting(a5), true, "test 14.1");
        assertEquals(a7.isIntersecting(a6), true, "test 13.2");
        assertEquals(a6.isIntersecting(a7), true, "test 14.2");
        assertEquals(a7.isIntersecting(a8), true, "test 13.3");
        assertEquals(a8.isIntersecting(a7), true, "test 14.3");

        //vertical + parallel above the vertical - different y range, same x range
        assertEquals(a9.isIntersecting(a10), false, "test 15");
        assertEquals(a10.isIntersecting(a9), false, "test 16");
        assertEquals(a9.isIntersecting(a12), false, "test 15.1");
        assertEquals(a12.isIntersecting(a9), false, "test 16.1");
        assertEquals(a11.isIntersecting(a10), false, "test 15.2");
        assertEquals(a10.isIntersecting(a11), false, "test 16.2");
        assertEquals(a11.isIntersecting(a12), false, "test 15.3");
        assertEquals(a12.isIntersecting(a11), false, "test 16.3");

        //vertical + parallel down the vertical - different y range, same x range
        assertEquals(a90.isIntersecting(a100), false, "test 155");
        assertEquals(a100.isIntersecting(a90), false, "test 165");
        assertEquals(a90.isIntersecting(a120), false, "test 15.51");
        assertEquals(a120.isIntersecting(a90), false, "test 16.51");
        assertEquals(a110.isIntersecting(a100), false, "test 15.52");
        assertEquals(a100.isIntersecting(a110), false, "test 16.52");
        assertEquals(a110.isIntersecting(a120), false, "test 15.53");
        assertEquals(a120.isIntersecting(a110), false, "test 16.53");

        //parallel + vertical on side of the parallel - different x range, same y range
        assertEquals(t1.isIntersecting(t2), false, "test 20");
        assertEquals(t2.isIntersecting(t1), false, "test 21");
        assertEquals(t1.isIntersecting(t3), false, "test 22");
        assertEquals(t3.isIntersecting(t1), false, "test 23");

        //parallel + vertical on side of the parallel - different x range, same y range (start/end point)
        assertEquals(t4.isIntersecting(t5), false, "test 24");
        assertEquals(t5.isIntersecting(t4), false, "test 25");
        assertEquals(t4.isIntersecting(t6), false, "test 26");
        assertEquals(t6.isIntersecting(t4), false, "test 27");

        //vertical + parallel same range x+y, intersection point in the edge
        assertEquals(c5.isIntersecting(c6), true, "test 50");
        assertEquals(c6.isIntersecting(c5), true, "test 60");
        assertEquals(c5.isIntersecting(c13), true, "test 51");
        assertEquals(c13.isIntersecting(c5), true, "test 61");
        assertEquals(c14.isIntersecting(c6), true, "test 52");
        assertEquals(c6.isIntersecting(c14), true, "test 62");

        //parallel tests
        //x+y in range
        assertEquals(b1.isIntersecting(b2), true, "test 70");
        assertEquals(b2.isIntersecting(b1), true, "test 71");
        //y in range, x not
        assertEquals(b1.isIntersecting(b3), false, "test 72");
        assertEquals(b3.isIntersecting(b1), false, "test 73");
        assertEquals(b1.isIntersecting(b4), false, "test 74");
        assertEquals(b4.isIntersecting(b1), false, "test 75");
        //x in range, y not
        assertEquals(b1.isIntersecting(b5), false, "test 76");
        assertEquals(b5.isIntersecting(b1), false, "test 77");
        assertEquals(b1.isIntersecting(b6), false, "test 78");
        assertEquals(b6.isIntersecting(b1), false, "test 79");
        //intersection point in  the edge
        assertEquals(b1.isIntersecting(b7), true, "test 80");
        assertEquals(b7.isIntersecting(b1), true, "test 81");
        assertEquals(b1.isIntersecting(b8), true, "test 82");
        assertEquals(b8.isIntersecting(b1), true, "test 83");
    }

    static void assertEquals(Boolean actual, Boolean expected, String message) {
        if (actual == expected) {
            System.out.println("[PASSED] " + message);
        } else {
            System.out.println("[FAILED] " + message + " {EXPECTED: " + expected + ", ACTUAL: " + actual + "}");
        }
    }
}

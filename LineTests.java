public class LineTests {
    public static void main(String[] args) {
        boolean problem = false;
        Line l1 = new Line(1, 1, 2, 2);
        Line l2 = new Line(3, 3, 2, 2);
        Line l3 = new Line(1.1, 0, 1.1, 1.1);
        Line l4 = new Line(0, 1.75, 2, 1.75);
        Line l5 = new Line(2.5, 2.5, 2.5, 2.5);
        if (!l1.intersectionWith(l2).equals(new Point(2, 2))) {
            problem = true;
            System.out.println("ERROR, intersectionWith problematic");
        }
        if (l2.isIntersecting(l4) || l2.intersectionWith(l4) != null) {
            problem = true;
            System.out.println("ERROR, intersectionWith or isIntersecting problematic");
        }
        if (l3.isIntersecting(l4) || l3.intersectionWith(l4) != null) {
            problem = true;
            System.out.println("ERROR, intersectionWith problematic");
        }
        if (!l1.middle().equals(new Point(1.5, 1.5)) || !l2.middle().equals(new Point(2.5, 2.5))) {
            problem = true;
            System.out.println("ERROR, middle problematic");
        }
        if (!l5.intersectionWith(l2).equals(l5.start())) {
            System.out.println("ERROR, intersectionWith problematic");
        }
        if (!problem) {
            System.out.println("Your line is fine, although you can check again because why not. yair koskas");
        }
    }
}

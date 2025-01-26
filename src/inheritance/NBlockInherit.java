package inheritance;

public class NBlockInherit {
    class Box1 {
        {
            System.out.println(1);
        }
    }

    class Box2 extends Box1 {
        {
            System.out.println(2);
        }
    }

    class Box3 extends Box2 {
        {
            System.out.println(3);
        }
    }

    public static void main(String[] args) {
        NBlockInherit outer = new NBlockInherit();

        System.out.println("Test Case 1:");
        Box3 c1 = outer.new Box3();
        System.out.println(c1);

        System.out.println("Test Case 2:");
        Box2 c2 = outer.new Box2();
        System.out.println(c2);

        System.out.println("Test Case 3:");
        Box1 c3 = outer.new Box1();
        System.out.println(c3);
    }
}

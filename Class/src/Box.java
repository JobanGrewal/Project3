public class Box {
    private int l;
    private int b;
    private int h;

    public Box() {
        System.out.println("Constructor");
    }

    public Box(int l) {
        this.l = l;
    }

    public Box(int l, int b) {
        this(l);
        this.b = b;
    }

    public Box(int l, int b, int h) {
        this(l, b);
        this.h = h;
    }

    @Override
    public String toString() {
        return "Box{" +
                "l=" + l +
                ", b=" + b +
                ", h=" + h +
                '}';
    }
}
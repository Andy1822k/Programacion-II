public class AppEjercicio {
    public static void main(String[] args) {
        A a = new A(1, 2);
        System.out.println("A inicial: " + a.x + " " + a.z);
        a.incrementaXZ();
        System.out.println("A despues de incrementaXZ: " + a.x + " " + a.z);
        B b = new B(3, 4);
        System.out.println("\nB inicial: " + b.y + " " + b.z);
        b.incrementaYZ();
        System.out.println("B despues de incrementaYZ: " + b.y + " " + b.z);
        D d = new D(5, 6, 7);
        System.out.println("\nD inicial: " + d.x + " " + d.y + " " + d.z);
        d.incrementaXYZ();
        System.out.println("D despues de incrementaXYZ: " + d.x + " " + d.y + " " + d.z);
    }
}

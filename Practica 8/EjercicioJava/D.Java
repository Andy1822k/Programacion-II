public class D extends A{
    public int y;  
    private B b;   

    public D(int x, int y, int z) {
        super(x, z);  
        this.y = y;
        this.b = new B(y, z);  
    }

    public void incrementaXYZ() {
        x++;    
        y++;    
        z++;    
        b.z++;  
    }
}

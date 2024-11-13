public class Test {
    @SuppressWarnings("unused")
    public static void main(String args[]) throws InterruptedException {
        Test t1 = new Test();
        Test t2 = new Test();
        t1 = null;
        System.gc();
        t2 = null;
        Runtime.getRuntime().gc();
        
        // Loop to increase the chance of GC running
        for (int i = 0; i < 5; i++) {
            System.gc();
            Runtime.getRuntime().gc();
        }
    }
    
    protected void finalize() throws Throwable {
        System.out.println("Garbage Collector called");
        System.out.flush(); // Ensure the output is flushed
        System.out.println("Object Garbage Collected: " + this);
        System.out.flush(); // Ensure the output is flushed
    }
}

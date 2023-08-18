public class Printer {
    private int srNo;
    private String vendor;

    public Printer(int srNo, String vendor) {
        this.srNo = srNo;
        this.vendor = vendor;
    }

    public void info() {
        System.out.println(srNo + " " + vendor);
    }

    /*public synchronized void print(String filePath) {
        try {
            System.out.println("{");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("}");
            Thread.sleep(100);
        }
        catch (InterruptedException ie) {
        }
    }*/

    public void print(String filePath) {
        try {
            System.out.println("{");
            Thread.sleep(100);
            System.out.println(filePath);
            Thread.sleep(100);
            System.out.println("}");
            Thread.sleep(100);
        }
        catch (InterruptedException ie) {
        }
    }
}

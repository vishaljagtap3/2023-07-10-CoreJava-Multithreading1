public class Main {
    public static void main(String[] args) {

        Thread mainThread = Thread.currentThread();
        System.out.println(mainThread.getName());
        System.out.println(mainThread.getPriority());
        System.out.println(mainThread.isAlive());

        DownloadThread d1 = new DownloadThread("bitcode.in/java/file1.zip");
        d1.setName("D1");
        d1.setPriority(Thread.MAX_PRIORITY);
        d1.start();

        DownloadThread d2 = new DownloadThread("google.com/proejcts/someproject.zip");
        d2.setName("d2");
        d2.setPriority(Thread.MIN_PRIORITY);
        d2.start();

        DownloadThread d3 = new DownloadThread("amazon.com/products/");
        d3.start();

        //code to ask main thread to wait for d1 d2 and d3 to finish and then continue further execution
        try {
            d1.join();
            d2.join();
            d3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("*************** Download Completed ****************");

    }
}

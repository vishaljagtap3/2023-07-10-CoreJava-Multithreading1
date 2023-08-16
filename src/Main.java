public class Main {
    public static void main(String[] args) {

        DownloadThread d1 = new DownloadThread("bitcode.in/java/file1.zip");
        d1.start();

        DownloadThread d2 = new DownloadThread("google.com/proejcts/someproject.zip");
        d2.start();

        DownloadThread d3 = new DownloadThread("amazon.com/products/");
        d3.start();

    }
}

public class DownloadThread extends Thread {

    private String filePath;

    public DownloadThread(String filePath) {
        this.filePath = filePath;
    }

    @Override
    public void run() {

        Thread dThread = Thread.currentThread();
        System.out.println("------------------------");
        System.out.println(dThread.getName() + " " + dThread.getPriority() + " " + dThread.isAlive());
        System.out.println("------------------------");

        for(int i = 0; i <= 100; i++) {
            System.out.println("Downloading " + filePath + " " + i + "%");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

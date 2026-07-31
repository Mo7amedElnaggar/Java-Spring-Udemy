class PrinterTask implements Runnable {
    @Override
    public void run() {
        for(int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + ": Running task " + i);
        }
    }
}

class Main {
    public static void main(String[] args) throws InterruptedException {
        PrinterTask printTask = new PrinterTask();
        Thread thread1 = new Thread(printTask, "Worker-1");
        Thread thread2 = new Thread(printTask, "Worker-2");

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

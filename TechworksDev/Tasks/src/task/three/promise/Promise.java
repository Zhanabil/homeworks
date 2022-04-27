package task.three.promise;

public class Promise {

    public static void main(String args[]) {

        ThreadCall threadCallOne = new ThreadCall("First Thread", 10);
        ThreadCall threadCallTwo = new ThreadCall("Second Thread", 3);

        try {
            threadCallOne.t.join();
            threadCallTwo.t.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class ThreadCall implements Runnable {

        Thread t;
        int value;
        String name;

        public ThreadCall(String name, int value) {
            this.value = value;
            this.name = name;
            t = new Thread(this, name);
            t.start();
        }

        @Override
        public void run() {
            try {
                for(int i=0; i<10; i++) {
                    value++;
                    System.out.println(t.getName() + "'s value: " + value);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}


class Q_8 {
// Private data fields

    private long startTime;
    private long endTime;
// Getter methods

    public long getStartTime() {
        return startTime;
    }

    public long getEndTime() {
        return endTime;
    }
// No-arg constructor

    public Q_8() {
        startTime = System.currentTimeMillis();
    }
// Start method

    public void start() {
        startTime = System.currentTimeMillis();
    }
// Stop method

    public void stop() {
        endTime = System.currentTimeMillis();
    }
// Method to get elapsed time

    public long getElapsedTime() {
        return endTime - startTime;
    }
// Main method to demonstrate StopWatch

    public static void main(String[] args) {
        Q_8 sw = new Q_8();
        sw.start(); // start stopwatch
// Sample delay
        for (long i = 0; i < 1000000; i++) {
        }
        sw.stop(); // stop stopwatch
        System.out.println("Elapsed Time in milliseconds: "
                + sw.getElapsedTime());
    }
}

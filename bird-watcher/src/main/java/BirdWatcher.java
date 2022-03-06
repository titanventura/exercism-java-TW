
class BirdWatcher {
    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return this.birdsPerDay;
        // throw new UnsupportedOperationException("Please implement the
        // BirdCount.getLastWeek() method");
    }

    public int getToday() {
        try {

            return this.birdsPerDay[this.birdsPerDay.length - 1];
        } catch (Exception e) {
            return 0;
        }
        // throw new UnsupportedOperationException("Please implement the
        // BirdCount.getToday() method");
    }

    public void incrementTodaysCount() {
        this.birdsPerDay[this.birdsPerDay.length - 1]++;
        // throw new UnsupportedOperationException("Please implement the
        // BirdCount.incrementTodaysCount() method");
    }

    public boolean hasDayWithoutBirds() {
        // boolean hasDayWithoutBirdsVar = false;
        for (int i : this.birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
        // throw new UnsupportedOperationException("Please implement the
        // BirdCount.hasDayWithoutBirds() method");
    }

    public int getCountForFirstDays(int numberOfDays) {
        int acc = 0;
        int ind = 0;
        for (int i : this.birdsPerDay) {
            acc += i;
            if (++ind == numberOfDays) {
                // return acc;
                break;
            }
        }
        return acc;
        // throw new UnsupportedOperationException("Please implement the
        // BirdCount.getCountForFirstDays() method");
    }

    public int getBusyDays() {
        int busies = 0;
        for (int i : this.birdsPerDay) {
            if (i >= 5) {
                busies++;
            }
        }
        return busies;
        // throw new UnsupportedOperationException("Please implement the
        // BirdCount.getBusyDays() method");
    }
}

public class Radio {
    public int currentVolume;
    public int currentStations;

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 10) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public int getCurrentStations() {
        return currentStations;
    }

    public void setCurrentStations(int currentStations) {
        if (currentStations < 0) {
            return;
        }
        if (currentStations > 9) {
            return;
        }
        this.currentStations = currentStations;
    }

    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume <= 10) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStations < 9) {
            setCurrentStations(currentStations + 1);
        } else {
            setCurrentStations(0);
        }
    }

    public void prev() {
        if (currentStations <= 9) {
            setCurrentStations(currentStations - 1);
        } else {
            setCurrentStations(9);
        }
    }

}


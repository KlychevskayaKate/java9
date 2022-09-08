public class Radio {
    protected int currentVolume;
    protected int currentStations;
    protected int maxStations;

    public Radio() {
        maxStations = 9;
    }
    public Radio(int stationsCount) {
        maxStations = stationsCount - 1;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < 0) {
            return;
        }
        if (currentVolume > 100) {
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
        if (currentStations > maxStations) {
            return;
        }
        this.currentStations = currentStations;
    }

    public void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume = currentVolume + 1;
        }
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
    }

    public void next() {
        if (currentStations < maxStations) {
            setCurrentStations(currentStations + 1);
        } else {
            setCurrentStations(0);
        }
    }

    public void prev() {
        if (currentStations > 0) {
            setCurrentStations(currentStations - 1);
        } else {
            setCurrentStations(maxStations);
        }
    }
}


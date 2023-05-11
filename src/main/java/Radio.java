public class Radio {
    private int currentStation;
    private int volume;

    private int maximumStation;

    public Radio() {
        this.maximumStation = 9;
    }

    public Radio(int Countstation) {
        this.maximumStation = Countstation - 1;
    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int newCurrentStation) {
        if (newCurrentStation < 0) {
            return;
        }
        if (newCurrentStation > maximumStation) {
            return;
        }
        currentStation = newCurrentStation;
    }

    public void next() {
        if (currentStation == maximumStation) {
            currentStation = 0;
        } else {
            currentStation++;
        }
    }

    public void prev() {
        if (currentStation == 0) {
            currentStation = maximumStation;
        } else {
            currentStation--;
        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 100) {
            return;
        }
        volume = newVolume;
    }

    public void upVolume() {
        if (volume < 100) {
            volume++;
        }
    }

    public void downVolume() {
        if (volume > 0) {
            volume--;
        }
    }
}
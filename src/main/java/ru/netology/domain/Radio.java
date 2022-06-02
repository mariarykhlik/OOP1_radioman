package ru.netology.domain;

public class Radio {

    private int stationsNumber = 10;
    private int firstStation = 0;
    private int currentStation;
    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentVolume;

    public Radio() {
    }

    public Radio(int stationsNumber) {
        this.stationsNumber = stationsNumber;
    }

    public int getStationsNumber() {
        return stationsNumber;
    }

    public int getFirstStation() {
        return firstStation;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < firstStation) {
            return;
        }
        if (currentStation > (firstStation + stationsNumber - 1)) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchToNextStation() {
        if (this.currentStation == (firstStation + stationsNumber - 1)) {
            this.currentStation = firstStation;
        } else {
            this.currentStation++;
        }
    }

    public void switchToPrevStation() {
        if (this.currentStation == firstStation) {
            this.currentStation = (firstStation + stationsNumber - 1);
        } else {
            this.currentStation--;
        }
    }

    public int getCurrentStation() {
        return this.currentStation;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume < minVolume) {
            return;
        }
        if (currentVolume > maxVolume) {
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void turnUpVolume() {
        if (this.currentVolume == maxVolume) {
            return;
        } else {
            this.currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (this.currentVolume == minVolume) {
            return;
        } else {
            this.currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }
}
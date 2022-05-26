package ru.netology.domain;

public class Radio {

    private int currentStation;
    private int currentVolume;

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > 9) {
            return;
        }
        this.currentStation = currentStation;
    }

    public void switchToNextStation() {
        if (this.currentStation == 9) {
            this.currentStation = 0;
        } else {
            this.currentStation++;
        }
    }

    public void switchToPrevStation() {
        if (this.currentStation == 0) {
            this.currentStation = 9;
        } else {
            this.currentStation--;
        }
    }

    public int getCurrentStation() {
        return this.currentStation;
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

    public void turnUpVolume() {
        if (this.currentVolume == 10) {
            return;
        } else {
            this.currentVolume++;
        }
    }

    public void turnDownVolume() {
        if (this.currentVolume == 0) {
            return;
        } else {
            this.currentVolume--;
        }
    }

    public int getCurrentVolume() {
        return this.currentVolume;
    }
}
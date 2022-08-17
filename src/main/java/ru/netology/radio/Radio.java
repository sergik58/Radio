package ru.netology.radio;

public class Radio {
    private int currentRadio;
    private int currentVolume;

    public int getCurrentRadio() {
        return currentRadio;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < 0) {
            return;
        }
        if (newCurrentRadio > 9) {
            return;
        }
        currentRadio = newCurrentRadio;
    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 10) {
            return;
        }
        currentVolume = newCurrentVolume;
    }

    public void setToMaxRadio() {
        currentRadio = 9;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }

    public void increaseRadio() {
        if (currentRadio == 9) {
            currentRadio = 0;
        }
        else {currentRadio ++;

        }
    }


    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume ++;
        }

    }


    public void prevRadio() {
        if (currentRadio == 0) {
            currentRadio = 9;
        } else {
            currentRadio = currentRadio - 1;

        }
    }


    public void belowVolumeToMax() {
        if (currentVolume <= 0) {
            currentVolume = 0;
        } else {
            currentVolume = currentVolume - 1;
        }
    }
}


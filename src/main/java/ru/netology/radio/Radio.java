package ru.netology.radio;

public class Radio {

    private int minRadioStation = 0;
    private int maxRadioStation = 9;

    private int minVolume = 0;
    private int maxVolume = 100;
    private int currentRadio = minRadioStation;
    private int currentVolume = minVolume;
    private int stationAmount;


    public Radio() {
        stationAmount = 10;
    }

    public Radio(int stationAmount) {
        this.stationAmount = stationAmount;
    }

    public int getCurrentRadio() {
        return currentRadio;
    }

    public int getMinRadioStation() {
        return minRadioStation;
    }

    public int getMaxRadioStation() {
        return maxRadioStation;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public void setCurrentRadio(int nextCurrentRadio) {
        if (nextCurrentRadio < minRadioStation) {
            return;
        }
        if (nextCurrentRadio > stationAmount - 1) {
            return;
        }
        currentRadio = nextCurrentRadio;
    }

    public void setCurrentVolume(int nextCurrentVolume) {
        if (nextCurrentVolume < minVolume) {
            return;
        }
        if (nextCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = nextCurrentVolume;
    }



    public void increaseRadio() {
        if (currentRadio < stationAmount - 1) {
            currentRadio = currentRadio + 1;
        } else {
            currentRadio = minRadioStation;

        }
    }

    public void setToMaxRadio() {
        currentRadio = 9;
    }

    public void setToMaxVolume() {
        currentVolume = 10;
    }


    public void increaseVolume() {
        if (currentVolume < maxVolume) {
            currentVolume = currentVolume + 1;
        }

    }

    public void decreaseVolume(){
        if (currentVolume <= minVolume) {
            currentVolume = 0;
        } else {
            currentVolume--;
        }
    }



    public void prevRadio() {
        if (currentRadio == minRadioStation) {
            currentRadio = stationAmount - 1;
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

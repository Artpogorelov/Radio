package ru.netology.Radio1;

public class Radio {
    protected int currentRadio;

    protected int currentVolume;

    protected int maxStation;
    protected int minStation;
    protected int maxVolume;
    protected int minVolume;

    public Radio(){
        this.maxStation=9;
        this.minStation=0;
        this.maxVolume=100;
        this.minVolume=0;
    }
    public Radio(int StationsCount){
        this.maxStation=StationsCount-1;
    }
    public int getCurrentRadio() {

        return currentRadio;
    }
    public int getCurrentVolume() {

        return currentVolume;
    }

    public void setCurrentRadio(int newCurrentRadio) {
        if (newCurrentRadio < minStation) {
            return;
        }
        if (newCurrentRadio > maxStation) {
            return;
        }
        currentRadio = newCurrentRadio;
    }
    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            return;
        }
        currentVolume = newCurrentVolume;

    }

    public void nextStation() {
        if (currentRadio == maxStation) {
            currentRadio = minStation;
        } else {
            currentRadio = currentRadio + 1;
        }
    }

    public void prevStation() {
        if (currentRadio == minStation) {
            currentRadio = maxStation;
        } else {
            currentRadio = currentRadio - 1;
        }
    }

    public void increaseVolume() {
        if (currentVolume >= maxVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume + 1;
        }
    }
    public void decreaseVolume() {
        if (currentVolume == minVolume) {
            currentVolume = minVolume;
        } else {
            currentVolume = currentVolume - 1;
        }

    }
}
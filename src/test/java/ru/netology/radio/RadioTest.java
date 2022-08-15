package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldTestRadio() {
        Radio radio = new Radio();
        radio.currentRadio = 7;
        int expected = 7;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOfMaxBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.increaseRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);
        radio.increaseRadio();
        int expected = 3;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentStationLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentRadio(-1);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentStationMoreThanNine() {
        Radio radio = new Radio();
        radio.setCurrentRadio(11);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void buttonPrevStation() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);
        radio.prevRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevFromZero() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationOfLowerBorder() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.increaseRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationMax() {
        Radio radio = new Radio();
        radio.setToMaxRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ifCurrentVolumeLessThanZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void ifCurrentVolumeMoreThanTen() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeMax() {
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeBelowMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void volumeUpToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void buttonPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.belowVolumeToMax();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.belowVolumeToMax();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromLowerBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.belowVolumeToMax();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void buttonPrevVolumeFromUpperBorder() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.belowVolumeToMax();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}



package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldTestRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio (7);
        int expected = 7;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioOfMaxEdge() {
        Radio radio = new Radio();
        radio.setCurrentRadio(9);
        radio.increaseRadio();
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioDownMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);
        radio.increaseRadio();
        int expected = 3;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void RadioZero() {
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
    public void shouldButtonPrevRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(2);
        radio.prevRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldButtonPrevFromZero() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.prevRadio();
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldStationOfDownEdge() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.increaseRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetRadioMax() {
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
    public void shouldVolumeMax() {
        Radio radio = new Radio();
        radio.setToMaxVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeDownMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(2);
        radio.increaseVolume();
        int expected = 3;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldButtonPrevVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.belowVolumeToMax();
        int expected = 4;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldButtonPrevVolumeFromZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.belowVolumeToMax();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldButtonPrevVolumeFromDOwnEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.belowVolumeToMax();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldButtonPrevVolumeFromUpEdge() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.belowVolumeToMax();
        int expected = 9;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
}



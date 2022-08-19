package ru.netology.radio;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldTestRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(7);
        int expected = 7;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMaxVolume() {
        Radio radio = new Radio();
        radio.getMaxVolume();
        int expected = 100;
        int actual = radio.getMaxVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetToMinVolume() {
        Radio radio = new Radio();
        radio.getMinVolume();
        int expected = 0;
        int actual = radio.getMinVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldNotSetVolumeAboveMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(101);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(98);
        radio.increaseVolume();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeOnHundred() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldIncreaseVolumeOnZero() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldIncreaseVolumeOnFive() {
        Radio radio = new Radio();
        radio.setCurrentVolume(5);
        radio.increaseVolume();
        int expected = 6;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldDecreaseVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(50);
        radio.decreaseVolume();
        int expected = 49;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldDecreaseVolumeOnOne() {
        Radio radio = new Radio();
        radio.setCurrentVolume(100);
        radio.belowVolumeToMax();
        int expected = 99;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetToMinRadio() {
        Radio radio = new Radio();
        radio.getMinRadioStation();
        int expected = 0;
        int actual = radio.getMinRadioStation();
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
    public void radioDownMax() {
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
    public void shouldNextRadio() {
        Radio radio = new Radio();
        radio.setCurrentRadio(5);
        radio.increaseRadio();
        int expected = 6;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }


    @Test
    public void shouldNextRadioZero() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.increaseRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void shouldNextRadioMax() {
        Radio radio = new Radio();
        radio.setCurrentRadio(0);
        radio.increaseRadio();
        int expected = 1;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioMaxOne() {
        Radio radio = new Radio();
        radio.setCurrentRadio(1);
        radio.increaseRadio();
        int expected = 2;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void shouldNextRadioMaxNineNine() {
        Radio radio = new Radio();
        radio.setCurrentRadio(100);
        radio.increaseRadio();
        int expected = 1;
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
    public void shouldSetMAxRadio() {
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
        int actual = radio.getCurrentRadio();
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
    public void shouldVolumeUpMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.decreaseVolume();
        int expected = 8;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldVolumeUpToMax() {
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
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


    @Test
    public void shouldSetDecreaseVolumePrevMin() {
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected, actual);
    }


}




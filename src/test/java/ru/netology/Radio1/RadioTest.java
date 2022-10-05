package ru.netology.Radio1;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void shouldSetCurrentMaxRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(9);
        int expected = 9;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetCurrentMinRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(0);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetCurrentNonExistentMaxRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(11);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetCurrentNonExistentMinRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(-1);
        int expected = 0;
        int actual = radio.getCurrentRadio();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void nextMaxStationRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(9);
        radio.nextStation();
        int expected = 0;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void nextStationRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(5);
        radio.nextStation();
        int expected = 6;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevMinStationRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(0);
        radio.prevStation();
        int expected = 9;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void prevStationRadio (){
        Radio radio =new Radio();
        radio.setCurrentRadio(6);
        radio.prevStation();
        int expected = 5;
        int actual = radio.getCurrentRadio();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void shouldSetCurrentMaxVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(10);
        int expected = 10;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetCurrentNonExistentMaxVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(11);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetCurrentNonExistentMinVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(-1);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void shouldSetCurrentMinVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.getCurrentVolume();
        Assertions.assertEquals(expected,actual);
    }
    @Test
    public void increaseMaxVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int expected = 10;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void increaseMinVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseMaхVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(10);
        radio.decreaseVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void decreaseMinVolume (){
        Radio radio =new Radio();
        radio.setCurrentVolume(0);
        radio.decreaseVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

}

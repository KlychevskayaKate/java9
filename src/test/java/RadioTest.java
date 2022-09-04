import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void addOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStations(1);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxStation() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stationBeyondTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentStations(11);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stationBeyondTheMaximum2() {
        Radio radio = new Radio();
        radio.setCurrentStations(0);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void removeOneStation() {
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void removeOneStation2() {
        Radio radio = new Radio();
        radio.setCurrentStations(-3);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStation() {
        Radio radio = new Radio();
        radio.setCurrentStations(0);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void stationBelowTheMinimum() {
        Radio radio = new Radio();
        radio.setCurrentStations(-2);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void maxVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void addVolumeOneStep() {
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void volumeBeyondTheMaximum() {
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void minVolume() {
        Radio radio = new Radio();
        radio.setCurrentVolume(-1);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = -1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stepDown() {
        Radio radio = new Radio();
        radio.setCurrentVolume(7);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 6;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void turnTheVolumeDownOneStep() {
        Radio radio = new Radio();
        radio.setCurrentVolume(12);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = -1;

        Assertions.assertEquals(expected, actual);

    }
}

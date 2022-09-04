import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void addOneStation() { //добавить одну станцию
        Radio radio = new Radio();
        radio.setCurrentStations(1);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void maxStation() { // максимальная станция
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void stationBeyondTheMaximum() { // за пределами максимума
        Radio radio = new Radio();
        radio.setCurrentStations(11);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void oneStepUpFromTheMinimum() { //один шаг от минимума
        Radio radio = new Radio();
        radio.setCurrentStations(0);
        radio.next();
        int actual = radio.getCurrentStations();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void removeOneStation() { // вернуться на одну станцию
        Radio radio = new Radio();
        radio.setCurrentStations(9);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 8;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void removeOneStation1() { // вернуться на одну станцию
        Radio radio = new Radio();
        radio.setCurrentStations(10);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minStation() { // минимальная станция
        Radio radio = new Radio();
        radio.setCurrentStations(0);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void stationBelowTheMinimum() { // вернуться назад на станцию за пределами минумума
        Radio radio = new Radio();
        radio.setCurrentStations(-2);
        radio.prev();
        int actual = radio.getCurrentStations();
        int expected = 9;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maxVolume() { //максимальня  громкость шаг вперед
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void maxVolumeOneStepBack() { //максимальня  громкость шаг назад
        Radio radio = new Radio();
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 9;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void addVolumeOneStep() { // добавить громкость на один шаг
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void OneStepBack() { // шаг назад
        Radio radio = new Radio();
        radio.setCurrentVolume(1);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void addVolumeOneStepAtMin() { // добавить громкость на один шаг от минимума
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void OneStepBackTheMin() { // шаг назад
        Radio radio = new Radio();
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void volumeBeyondTheMaximum() { // добавить громкость на шаг за пределами максимума
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void minVolume() { // на один шаг назад от минимальной громкости
        Radio radio = new Radio();
        radio.setCurrentVolume(11);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void stepDown() { // один шаг назад
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 8;

        Assertions.assertEquals(expected, actual);

    }
    @Test
    public void oneStepForward() { // один шаг вперед
        Radio radio = new Radio();
        radio.setCurrentVolume(9);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 10;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneStepForwardBeyondTheMinimum() { // один шаг вперед за минимумом
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.increaseVolume();
        int actual = radio.getCurrentVolume();
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void oneStepForwardTheMinimum() { // один шаг назад за минимумом
        Radio radio = new Radio();
        radio.setCurrentVolume(-3);
        radio.reduceVolume();
        int actual = radio.getCurrentVolume();
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}

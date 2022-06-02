package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio defaultRadio = new Radio();
    Radio radio = new Radio(20);

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0,0",
                    "9,9,9",
                    "19,0,19",
                    "4,4,4",
                    "-1,0,0",
                    "10,0,10",
                    "20,0,0"
            }
    )
    void shouldSetCurrentStation(int currentStation, int defaultExpected, int expected) {

        defaultRadio.setCurrentStation(currentStation);
        radio.setCurrentStation(currentStation);

        int defaultActual = defaultRadio.getCurrentStation();
        int actual = radio.getCurrentStation();
        assertEquals(defaultExpected, defaultActual);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "9,0,10",
                    "4,5,5",
                    "10,1,11",
                    "19,1,0"
            }
    )
    void shouldSwitchToNextStation(int currentStation, int defaultExpected, int expected) {

        defaultRadio.setCurrentStation(currentStation);
        radio.setCurrentStation(currentStation);

        defaultRadio.switchToNextStation();
        radio.switchToNextStation();

        int defaultActual = defaultRadio.getCurrentStation();
        int actual = radio.getCurrentStation();
        assertEquals(defaultExpected, defaultActual);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,9,19",
                    "5,4,4",
                    "10,9,9"
            }
    )
    void shouldSwitchToPrevStation(int currentStation, int defaultExpected, int expected) {

        defaultRadio.setCurrentStation(currentStation);
        radio.setCurrentStation(currentStation);

        defaultRadio.switchToPrevStation();
        radio.switchToPrevStation();

        int defaultActual = defaultRadio.getCurrentStation();
        int actual = radio.getCurrentStation();
        assertEquals(defaultExpected, defaultActual);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0,0",
                    "100,100,100",
                    "50,50,50",
                    "-1,0,0",
                    "101,0,0"
            }
    )
    void shouldSetCurrentVolume(int currentVolume, int defaultExpected, int expected) {

        defaultRadio.setCurrentVolume(currentVolume);
        radio.setCurrentVolume(currentVolume);

        int defaultActual = defaultRadio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(defaultExpected, defaultActual);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "100,100,100",
                    "50,51,51"
            }
    )
    void shouldTurnUpVolume(int currentVolume, int defaultExpected, int expected) {

        defaultRadio.setCurrentVolume(currentVolume);
        radio.setCurrentVolume(currentVolume);

        defaultRadio.turnUpVolume();
        radio.turnUpVolume();

        int defaultActual = defaultRadio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(defaultExpected, defaultActual);
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0,0",
                    "51,50,50"
            }
    )
    void shouldTurnDownVolume(int currentVolume, int defaultExpected, int expected) {

        defaultRadio.setCurrentVolume(currentVolume);
        radio.setCurrentVolume(currentVolume);

        defaultRadio.turnDownVolume();
        radio.turnDownVolume();

        int defaultActual = defaultRadio.getCurrentVolume();
        int actual = radio.getCurrentVolume();
        assertEquals(defaultExpected, defaultActual);
        assertEquals(expected, actual);
    }
}
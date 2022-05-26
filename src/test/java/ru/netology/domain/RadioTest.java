package ru.netology.domain;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0",
                    "9,9",
                    "4,4",
                    "-1,0",
                    "10,0"
            }
    )
    void shouldSetCurrentStation(int currentStation, int expected) {

        Radio radio = new Radio();

        radio.setCurrentStation(currentStation);

        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "9,0",
                    "4,5"
            }
    )
    void shouldSwitchToNextStation(int currentStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.switchToNextStation();

        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,9",
                    "5,4"
            }
    )
    void shouldSwitchToPrevStation(int currentStation, int expected) {

        Radio radio = new Radio();
        radio.setCurrentStation(currentStation);

        radio.switchToPrevStation();

        int actual = radio.getCurrentStation();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0",
                    "10,10",
                    "5,5",
                    "-1,0",
                    "11,0"
            }
    )
    void shouldSetCurrentVolume(int currentVolume, int expected) {

        Radio radio = new Radio();

        radio.setCurrentVolume(currentVolume);

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "10,10",
                    "5,6"
            }
    )
    void shouldTurnUpVolume(int currentVolume, int expected) {

        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.turnUpVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }

    @ParameterizedTest
    @CsvSource(
            value = {
                    "0,0",
                    "6,5"
            }
    )
    void shouldTurnDownVolume(int currentVolume, int expected) {

        Radio radio = new Radio();
        radio.setCurrentVolume(currentVolume);

        radio.turnDownVolume();

        int actual = radio.getCurrentVolume();
        assertEquals(expected, actual);
    }
}
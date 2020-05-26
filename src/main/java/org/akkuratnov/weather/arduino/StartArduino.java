package org.akkuratnov.weather.arduino;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

import javax.annotation.*;

@Component
public class StartArduino {

    @Value("${spring.portDescription}")
    String portDescription;
    @Value("${spring.baud_rate}")
    int baud_rate;
    Scanner scanner;
    Arduino arduino;
    boolean connected;

    //@PostConstruct
    public boolean isConnected() throws InterruptedException {
        this.scanner = new Scanner(System.in);
        this.arduino = new Arduino(portDescription, baud_rate);
        this.connected = arduino.openConnection();
        System.out.println("Соединение с Arduino установлено: " + connected);
        Thread.sleep(2000);
        return connected;
    }

    public String readMessage(){
        return arduino.serialRead();
}

    @PreDestroy
    public void closeArduino(){
        arduino.closeConnection();
    }


}

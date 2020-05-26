package org.akkuratnov.weather.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table
@ToString(of = {"id", "temperature", "humidity", "pressure"})
@EqualsAndHashCode(of = {"id"})
public class Weather {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.IdTempTime.class)
    private Long id;
    @JsonView(Views.IdTempTime.class)
    private int temperature;
    @JsonView(Views.FullMessage.class)
    private int humidity;
    @JsonView(Views.FullMessage.class)
    private int pressure;

    @Column(updatable = false)
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonView(Views.IdTempTime.class)
    private LocalDateTime creationDate;

    public Long getId(){
        return id;
    }

    public int getTemperature(){
        return temperature;
    }

    public void setTemperature(int temperature){
        this.temperature = temperature;
    }

    public int getHumidity(){
        return humidity;
    }

    public void setHumidity(int humidity){
        this.humidity = humidity;
    }

    public int getPressure(){
        return pressure;
    }

    public void setPressure(int pressure){
        this.pressure = pressure;
    }

    public LocalDateTime getCreationDate(){
        return creationDate;
    }

    public void setCreationDate(LocalDateTime creationDate){
        this.creationDate = creationDate;
    }

}

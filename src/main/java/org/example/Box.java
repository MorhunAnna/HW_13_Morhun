package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDateTime;

public class Box
{
    private String from;
    private String material;
    private String color;

    @JsonProperty("max-lifting-capacity")
    private MaxPointCapacity MaxPointCapacity;

    private Cargo cargo;

    @JsonProperty("delivery-date")
    private LocalDateTime deliveryDate;


    public String getFrom()
    {
        return from;
    }

    public void setFrom(String from)
    {
        this.from = from;
    }

    public String getMaterial()
    {
        return material;
    }

    public void setMaterial(String material)
    {
        this.material = material;
    }

    public String getColor()
    {
        return color;
    }

    public void setColor(String color)
    {
        this.color = color;
    }

    public MaxPointCapacity getmaxPointCapacity()
    {
        return MaxPointCapacity;
    }

    public void setMaxPointCapacity(MaxPointCapacity maxPointCapacity)
    {
        this.MaxPointCapacity = maxPointCapacity;
    }

    public Cargo getCargo()
    {
        return cargo;
    }

    public void setCargo(Cargo cargo)
    {
        this.cargo = cargo;
    }

    public LocalDateTime getDeliveryDate()
    {
        return deliveryDate;
    }

    public void setDeliveryDate(LocalDateTime deliveryDate)
    {
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString()
    {
        return "Box{" +
                "from='" + from + '\'' +
                ", material='" + material + '\'' +
                ", color='" + color + '\'' +
                ", MaxPointCapacity=" + MaxPointCapacity +
                ", cargo=" + cargo +
                ", deliveryDate=" + deliveryDate +
                '}';
    }
}


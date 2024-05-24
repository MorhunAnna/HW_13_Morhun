package org.example;

public class MaxPointCapacity {
    private String unit;
    private int value;

    public String getUnit()
    {
        return unit;
    }

    public void setUnit(String unit)
    {
        this.unit = unit;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "MaxPointCapacity{" +
                "unit='" + unit + '\'' +
                ", value=" + value +
                '}';
    }
}
package org.example;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Cargo {
    private String name;

    @JsonProperty("class")
    private String class_;

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @JsonProperty("class")
    public String getClass_()
    {
        return class_;
    }

    @JsonProperty("class")
    public void setClass_(String class_)
    {
        this.class_ = class_;
    }

    @Override
    public String toString()
    {
        return "Cargo{" +
                "name='" + name + '\'' +
                ", class_='" + class_ + '\'' +
                '}';
    }
}


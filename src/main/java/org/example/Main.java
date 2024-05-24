package org.example;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();
        mapper.registerModule(new JavaTimeModule());

        try {
            Box box = mapper.readValue(new File("Box.json"), Box.class);
            System.out.println(box);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}

package com.ramitoma99.humans;

import org.json.JSONArray;
import org.json.JSONObject;

import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Field;

public class SaveHumans {

    public void saveAllHumans(Human[] humans) {

        JSONArray jsonArray = new JSONArray();

        for (Human human : humans) {

            JSONObject obj = new JSONObject();
            Field[] humanFields = Human.class.getDeclaredFields();

            for (Field field : humanFields) {

                try {
                    field.setAccessible(true);
                    obj.put(field.getName(), field.get(human));

                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }

            jsonArray.put(obj);

        }

        try (FileWriter file = new FileWriter("src/main/resources/humans.json")) {
            file.write(jsonArray.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}

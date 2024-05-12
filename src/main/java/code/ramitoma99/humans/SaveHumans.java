package code.ramitoma99.humans;

import org.json.JSONObject;
import java.lang.reflect.Field;

public class SaveHumans {

    public void saveHumans(Human human) {

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

        System.out.println(obj);



    }

}

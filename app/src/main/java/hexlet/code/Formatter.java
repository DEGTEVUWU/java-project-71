package hexlet.code;

import com.fasterxml.jackson.core.JsonProcessingException;
import hexlet.code.formatters.Json;
import hexlet.code.formatters.Plain;
import hexlet.code.formatters.Stylish;

import java.util.TreeMap;

public class Formatter {
    public static String formatter(TreeMap<String, Status> mapWithStatusKeys, String format)
            throws JsonProcessingException {
        String resultString = "";
        if (format.equals("stylish")) {
            resultString = Stylish.stylish(mapWithStatusKeys);
        } else if (format.equals("plain")) {
            resultString = Plain.plain(mapWithStatusKeys);
        } else if (format.equals("json")) {
            resultString = Json.json(mapWithStatusKeys);
        }
        return resultString;
    }
}
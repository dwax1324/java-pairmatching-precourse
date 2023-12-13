package pairmatching.utils;

import java.util.Arrays;
import java.util.List;

public class Parser {
    public static List<String> parseStringByDelimiter(String input, String delimiter){
        return Arrays.asList(input.split(delimiter));
    }
}

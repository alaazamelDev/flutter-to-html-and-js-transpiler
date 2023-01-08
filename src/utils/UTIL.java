package utils;


import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;

public class UTIL {
    public static int ID = 1;
    public static DefaultUndirectedGraph<String, DefaultEdge> g = new DefaultUndirectedGraph<>(DefaultEdge.class);

    public static String widgetToString(int ID, String name, int childCnt, String lnNum) {
        return "ID: " + ID + "\n" +
                name + " (Widget) " + "\n" +
                "child_count: " + childCnt + "\n" +
                "line: " + lnNum;
    }

    public static String propertyToString(int ID, String name, String value, int childCnt, String lnNum) {
        return "ID: " + ID + "\n" +
                name + " (Property) " + "\n" +
                ((value != null) ? "value: " + value + "\n" : "") +
                ((childCnt > 0) ? "child_count: " + childCnt + "\n" : "") +
                "line: " + lnNum;
    }

    public static String statementToString(int ID, String name, String value, String type, String lnNum) {
        return "ID: " + ID + "\n" +
                "name: " + name + "\n" +
                ((value != null) ? "value: " + value + "\n" : "") +
                ((type != null) ? "type: " + type + "\n" : "") +
                "line: " + lnNum;
    }

    public static String semanticAlreadyDeclaredProperty(int line, int column, String propertyName) {
        return "Property " + propertyName + " Already Declared " + line + ":" + column;
    }

    public static String semanticAlreadyDeclaredIdentifier(int line, int column, String id) {
        return "Identifier " + id + " Already Declared " + line + ":" + column;
    }

    public static String semanticReservedWidgetIdentifier(int line, int column, String Widget) {
        return "Widget name " + Widget + " Is Already Reserved " + line + ":" + column;
    }

    public static <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static String semanticUndeclaredIdentifier(int line, int column, String identifier) {
        return "Identifier " + identifier + " not declared " + line + ":" + column;
    }

    public static String semanticTypeMismatch(int line, int column, String expected, String found) {
        return "type mismatch " + "expected: " + expected + " found:" + found + " " + line ":" + column;
    }


}

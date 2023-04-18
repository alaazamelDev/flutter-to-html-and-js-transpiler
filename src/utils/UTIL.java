package utils;


//import org.jgrapht.graph.DefaultEdge;
//import org.jgrapht.graph.DefaultUndirectedGraph;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;

import java.io.FileWriter;
import java.io.IOException;

public class UTIL {
    public static int ID = 1;


    // page name
    public static String pageName = "";
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

    public static String procedureStatementToString(int ID, String name, String params, String lnNum) {
        return "ID: " + ID + "\n" +
                "name: " + name + "\n" +
                ((params != null) ? "params: " + params + "\n" : "") +
                "line: " + lnNum;
    }


    public static String expressionToString(int ID, String name, String value, int childCnt, String lnNum) {
        return "ID: " + ID + "\n" +
                name + " (Expression) " + "\n" +
                ((value != null) ? "value: " + value + "\n" : "") +
                ((childCnt > 0) ? "child_count: " + childCnt + "\n" : "") +
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

    public static String semanticUndeclaredIdentifier(int line, int column, String identifier) {
        return "Identifier " + identifier + " not declared " + line + ":" + column;
    }

    public static String semanticTypeMismatch(int line, int column, String expected, String found) {
        return "type mismatch " + "expected: " + expected + " found:" + found + " " + line + ":" + column;
    }


    public static <E extends Enum<E>> boolean isInEnum(String value, Class<E> enumClass) {
        for (E e : enumClass.getEnumConstants()) {
            if (e.name().equals(value)) {
                return true;
            }
        }
        return false;
    }

    public static void writeToFile(String text, String filename) {
        try {
            FileWriter fileWriter = new FileWriter(filename);
            fileWriter.write(text);
            fileWriter.close();
            System.out.println("Successfully wrote to file " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


}

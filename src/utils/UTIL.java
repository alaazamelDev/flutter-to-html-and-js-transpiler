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
}

package utils;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;

public class UTIL {
    public static int ID=1;
    public static DefaultUndirectedGraph<String, DefaultEdge> g = new DefaultUndirectedGraph<String, DefaultEdge>(DefaultEdge.class);

    public static String widgetToString(int ID, String name, int childCnt) {
        return  "ID: " + ID + "\n" +
                name + " Widget " + "\n" +
                "childCnt: " + childCnt;
    }

    public static String propertyToString(int ID, String name, String value, int childCnt) {
        if (childCnt > 0) {
            return  "ID: " + ID + "\n" +
                    name + " Property " + "\n" +
                    "value: " + value + "\n" +
                    "childCnt: " + childCnt;
        }
        return  "ID: " + ID + "\n" +
                name + " Property " + "\n" +
                "value: " + value;
    }
}
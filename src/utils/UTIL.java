package utils;

import org.jgrapht.graph.DefaultEdge;
import org.jgrapht.graph.DefaultUndirectedGraph;

public class UTIL {
    public static int ID=1;
    public static DefaultUndirectedGraph<String, DefaultEdge> g = new DefaultUndirectedGraph<String, DefaultEdge>(DefaultEdge.class);

    public static String widgetToString(int ID, String name, int childCnt, String lnNum) {
        return  "ID: " + ID + "\n" +
                name + " Widget " + "\n" +
                "CHILD_COUNT: " + childCnt +
                "LINE: " + lnNum ;
    }

    public static String propertyToString(int ID, String name, String value, int childCnt, String lnNum) {
        return  "ID: " + ID + "\n" +
                name + " Property " + "\n" +
                ((value != null) ? "value: " + value + "\n" : "") +
                ((childCnt > 0) ? "childCnt: " + childCnt : "") +
                "LINE: " + lnNum ;
    }
}
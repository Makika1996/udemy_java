package fileformat;

import java.util.ArrayList;
import java.util.List;

/**
 * Lernziel: Objekt-JSON-Mapping mit Jackson
 * - Jackson Databind einbinden und nutzen
 */

public class JSONdemo {
    public static void main(String[] args) {
        Leaf leaf1 = new Leaf();
        leaf1.area = 12;
        Leaf leaf2 = new Leaf();
        leaf2.area = 122;
        Tree tree = new Tree();
        tree.area = 12;
        tree.height = 80;
        tree.leafs.add(leaf1);
        tree.leafs.add(leaf2);

//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
////            objectMapper.enable(SerializationFeature.INDENT_OUTPUT);
//            final String string = objectMapper.writeValueAsString(tree);
//
//            String json = "{\"leafs\":[{\"area\":12.0}, {\"area\":122.0}], \"height\":80,\"area\":12,.0}";
////            objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
//            final Tree tree1 = objectMapper.readValue(json, Tree.class);
//            System.out.println(tree1);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}

//@JsonIgnoreProperties(ignoreUnknown = true)
class Tree {
    public List<Leaf> leafs = new ArrayList<>();
//    @JsonProperty("h")
    int height;
//    @JsonProperty("a")
    double area;
}

class Leaf {
    double area;
}
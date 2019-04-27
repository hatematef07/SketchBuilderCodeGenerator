package htmlelements;

import languagewrite.Tag;

import java.util.List;
import java.util.Map;

public class Column extends Tag {

    private final String classAttribute = "col";
    private final  String styleAttribute = "padding-top:10px;";

    public Column(String name) {
        super(name);
        this.setAttribute("class", this.classAttribute);
        this.setAttribute("style", this.styleAttribute);
    }

    public Column(String name, Map<String, String> attributes, List<Tag> children) {
        super(name, attributes, children);
        this.setAttribute("class", this.classAttribute);
        this.setAttribute("style", this.styleAttribute);
    }

    public Column(String name, Map<String, String> attributes, String value) {
        super(name, attributes, value);
        this.setAttribute("class", this.classAttribute);
        this.setAttribute("style", this.styleAttribute);
    }
}

package languagewrite;

import java.util.ArrayList;
import java.util.List;

public class Tag {

    private String name;
    private List<Attribute> attributes;
    private List<Tag> children;
    private String value;

    public Tag(String name) {
        this.name = name;
        this.children = new ArrayList<Tag>();
        this.attributes = new ArrayList<Attribute>();
    }
    public Tag(String name, List<Attribute> attributes, List<Tag> children) {
        this.name = name;
        this.attributes = attributes;
        this.children = children;
    }

    public Tag(String name, List<Attribute> attributes, String value) {
        this.name = name;
        this.attributes = attributes;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Attribute> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attribute> attributes) {
        this.attributes = attributes;
    }

    public List<Tag> getChildren() {
        return children;
    }

    public void setChildren(List<Tag> children) {
        if(this.value.equals("")) {
            this.children = children;
        }
    }

    public String getValue() {
        return value;
    }

    public void setTagValue(String value) {
        this.value = value;
    }

    public void setTagValue(List<Tag> children) {
        this.children = children;
    }

    public void addChild(Tag tag){
        this.children.add(tag);
    }

    public void addAttribute(Attribute attribute){
        this.attributes.add(attribute);
    }
}

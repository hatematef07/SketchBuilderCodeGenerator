package htmlelements;

import elements.Element;
import languagewrite.Tag;

public abstract class HTMLElement implements Element {
    public abstract void draw(Tag root);

    private String view;
    private String width;
    private String height;
    private String id;
    private String top;
    private String left;


    public HTMLElement ( String view ,String id,String top , String left , String width , String height ){
        this.view = view;
        this.id = id;
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = height;

    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getTop() {
        return top;
    }
    public void setTop(String top) {
        this.top = top;
    }

    public String getLeft() {
        return left;
    }
    public void setLeft(String top) {
        this.left = left;
    }

    public String getWidth() {
        return width;
    }
    public void setWidth(String top) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }
    public void setHeight(String top) {
        this.height = height;
    }

    public String getView() {
        return view;
    }
    public void setView(String top) {
        this.view = view;
    }


}

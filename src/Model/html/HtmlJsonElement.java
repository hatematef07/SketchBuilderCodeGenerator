package Model.html;

import com.google.gson.annotations.SerializedName;

public class HtmlJsonElement {

    @SerializedName("width")
    private String width;
    @SerializedName("height")
    private String height;
    @SerializedName("view")
    private String view;
    @SerializedName("id")
    private String id;
    @SerializedName("top")
    private String top;
    @SerializedName("left")
    private String left;

    public HtmlJsonElement(String width, String height, String view, String id, String top, String left) {
        this.width = width;
        this.height = height;
        this.view = view;
        this.id = id;
        this.top = top;
        this.left = left;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getView() {
        return view;
    }

    public String getId() {
        return id;
    }

    public String getTop() {
        return top;
    }

    public String getLeft() {
        return left;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setView(String view) {
        this.view = view;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTop(String top) {
        this.top = top;
    }

    public void setLeft(String left) {
        this.left = left;
    }
}

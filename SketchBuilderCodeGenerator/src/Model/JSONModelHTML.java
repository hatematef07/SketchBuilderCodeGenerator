package Model;

import com.google.gson.annotations.SerializedName;

public class JSONModelHTML {

    @SerializedName("rows")
    JSONModelHTML[] children;
    @SerializedName("columns")
    JSONModelHTML[] columns;
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

    public JSONModelHTML[] getChildren() {
        return children;
    }

    public JSONModelHTML[] getColumns() {
        return columns;
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
}

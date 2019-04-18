package androidelements;


import languagewrite.Attribute;
import languagewrite.Tag;

public class GuideLine {
    private final String GUIDE_LINE = "android.support.constraint.Guideline";
    private final String width = "0dp";
    private final String height = "0dp";
    private String id;
    private String startPercent;
    private String topPercent;
    private String endPercent;
    private String bottomPercent;

    public GuideLine(String id, String startPercent, String topPercent, String endPercent, String bottomPercent) {
        this.id = id;
        this.startPercent = startPercent;
        this.topPercent = topPercent;
        this.endPercent = endPercent;
        this.bottomPercent = bottomPercent;
    }

    public String getGUIDE_LINE() {
        return GUIDE_LINE;
    }

    public String getWidth() {
        return width;
    }

    public String getHeight() {
        return height;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStartPercent() {
        return startPercent;
    }

    public void setStartPercent(String startPercent) {
        this.startPercent = startPercent;
    }

    public String getTopPercent() {
        return topPercent;
    }

    public void setTopPercent(String topPercent) {
        this.topPercent = topPercent;
    }

    public String getEndPercent() {
        return endPercent;
    }

    public void setEndPercent(String endPercent) {
        this.endPercent = endPercent;
    }

    public String getBottomPercent() {
        return bottomPercent;
    }

    public void setBottomPercent(String bottomPercent) {
        this.bottomPercent = bottomPercent;
    }

    private String percentage(String value) {
        double x = Double.valueOf(value);
        x /= 100;
        return String.valueOf(x);
    }

    public Tag getStartGuideLine() {
        Tag startGuideline = new Tag(getGUIDE_LINE());
        startGuideline.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + getId() + "_start_guideline"));
        startGuideline.addAttribute(new Attribute(AppKeys.GUIDEPERCENT_KEY, percentage(getStartPercent())));
        startGuideline.addAttribute(new Attribute(AppKeys.WIDTH_KEY, getWidth()));
        startGuideline.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, getHeight()));
        startGuideline.addAttribute(new Attribute(AppKeys.ORIENTATION_KEY, AppKeys.VERTICAL));
        return startGuideline;
    }

    public Tag getEndGuideLine() {
        Tag endGuideline = new Tag(getGUIDE_LINE());
        endGuideline.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + getId() + "_end_guideline"));
        endGuideline.addAttribute(new Attribute(AppKeys.GUIDEPERCENT_KEY, percentage(getEndPercent())));
        endGuideline.addAttribute(new Attribute(AppKeys.WIDTH_KEY, getWidth()));
        endGuideline.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, getHeight()));
        endGuideline.addAttribute(new Attribute(AppKeys.ORIENTATION_KEY, AppKeys.VERTICAL));
        return endGuideline;
    }

    public Tag getTopGuideLine() {
        Tag topGuideline = new Tag(getGUIDE_LINE());
        topGuideline.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + getId() + "_top_guideline"));
        topGuideline.addAttribute(new Attribute(AppKeys.GUIDEPERCENT_KEY, percentage(getTopPercent())));
        topGuideline.addAttribute(new Attribute(AppKeys.WIDTH_KEY, getWidth()));
        topGuideline.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, getHeight()));
        topGuideline.addAttribute(new Attribute(AppKeys.ORIENTATION_KEY, AppKeys.HORIZONTAL));
        return topGuideline;
    }

    public Tag getBottomGuideLine() {
        Tag bottomGuideline = new Tag(getGUIDE_LINE());
        bottomGuideline.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + getId() + "_bottom_guideline"));
        bottomGuideline.addAttribute(new Attribute(AppKeys.GUIDEPERCENT_KEY, percentage(getBottomPercent())));
        bottomGuideline.addAttribute(new Attribute(AppKeys.WIDTH_KEY, getWidth()));
        bottomGuideline.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, getHeight()));
        bottomGuideline.addAttribute(new Attribute(AppKeys.ORIENTATION_KEY, AppKeys.HORIZONTAL));
        return bottomGuideline;
    }

}

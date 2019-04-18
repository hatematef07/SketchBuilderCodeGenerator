package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidProgressBar extends AndroidElement {
    private final String view = "ProgressBar";

    public AndroidProgressBar(JSONModel jsonModel) {
        super(jsonModel.getId(), jsonModel.getStart(), jsonModel.getEnd(), jsonModel.getTop(), jsonModel.getBottom());
    }

    public String getView() {
        return view;
    }

    @Override
    public void draw(Tag root) {
        Tag progressBar = new Tag(getView());
        progressBar.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        progressBar.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        progressBar.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        progressBar.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        progressBar.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        progressBar.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        progressBar.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(progressBar);
    }

    @Override
    public void drawGuideline(Tag root) {
        GuideLine gl = new GuideLine(this.getId(), this.getStart(), this.getTop(), this.getEnd(), this.getBottom());
        root.addChild(gl.getStartGuideLine());
        root.addChild(gl.getEndGuideLine());
        root.addChild(gl.getTopGuideLine());
        root.addChild(gl.getBottomGuideLine());
    }
}

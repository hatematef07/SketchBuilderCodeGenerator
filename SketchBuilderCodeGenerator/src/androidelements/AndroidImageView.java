package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidImageView extends AndroidElement {
    private final String view = "ImageView";

    public AndroidImageView(JSONModel jsonModel) {
        super(jsonModel.getId(), jsonModel.getStart(), jsonModel.getEnd(), jsonModel.getTop(), jsonModel.getBottom());
    }

    public String getView() {
        return view;
    }

    @Override
    public void draw(Tag root) {
        Tag imageView = new Tag(getView());
        imageView.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        imageView.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        imageView.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        imageView.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        imageView.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        imageView.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        imageView.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(imageView);
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

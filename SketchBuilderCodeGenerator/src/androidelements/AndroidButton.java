package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidButton extends AndroidElement {
    private final String view = "Button";
    private final String text = "ClickMe";


    public AndroidButton(JSONModel jsonModel) {
        super(jsonModel.getId(), jsonModel.getStart(), jsonModel.getEnd(), jsonModel.getTop(), jsonModel.getBottom());
    }

    public String getView() {
        return view;
    }

    public String getText() {
        return text;
    }

    @Override
    public void draw(Tag root) {
        Tag button = new Tag(getView());
        button.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        button.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        button.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        button.addAttribute(new Attribute(AppKeys.TEXT_KEY, this.getText()));
        button.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        button.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        button.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        button.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(button);
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

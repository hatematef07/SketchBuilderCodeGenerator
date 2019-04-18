package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidTextView extends AndroidElement {
    private final String view = "TextView";
    private final String text = "HelloXML";


    public AndroidTextView(JSONModel jsonModel) {
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
        Tag textView = new Tag(getView());
        textView.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        textView.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        textView.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        textView.addAttribute(new Attribute(AppKeys.TEXT_KEY, this.getText()));
        textView.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        textView.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        textView.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        textView.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(textView);
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

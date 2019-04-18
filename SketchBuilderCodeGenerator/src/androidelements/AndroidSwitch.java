package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidSwitch extends AndroidElement {
    private final String view = "Switch";
    private boolean checked;

    public AndroidSwitch(JSONModel jsonModel) {
        super(jsonModel.getId(), jsonModel.getStart(), jsonModel.getEnd(), jsonModel.getTop(), jsonModel.getBottom());
        this.checked = jsonModel.isChecked();
    }

    public String getView() {
        return view;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked(boolean checked) {
        this.checked = checked;
    }

    @Override
    public void draw(Tag root) {
        Tag iSwitch = new Tag(getView());
        iSwitch.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        iSwitch.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        iSwitch.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        iSwitch.addAttribute(new Attribute(AppKeys.CHECKED_KEY, String.valueOf(this.isChecked())));
        iSwitch.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        iSwitch.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        iSwitch.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        iSwitch.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(iSwitch);
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

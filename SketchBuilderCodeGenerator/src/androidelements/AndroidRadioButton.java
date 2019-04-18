package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidRadioButton extends AndroidElement {
    private final String view = "RadioButton";
    private boolean checked;
    private String text;

    public AndroidRadioButton(JSONModel jsonModel) {
        super(jsonModel.getId(), jsonModel.getStart(), jsonModel.getEnd(), jsonModel.getTop(), jsonModel.getBottom());
        this.checked = jsonModel.isChecked();
        this.text = jsonModel.getText();
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

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public void draw(Tag root) {
        Tag radioButton = new Tag(getView());
        radioButton.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        radioButton.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        radioButton.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        radioButton.addAttribute(new Attribute(AppKeys.CHECKED_KEY, String.valueOf(this.isChecked())));
        radioButton.addAttribute(new Attribute(AppKeys.TEXT_KEY, this.getText()));
        radioButton.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        radioButton.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        radioButton.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        radioButton.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(radioButton);
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

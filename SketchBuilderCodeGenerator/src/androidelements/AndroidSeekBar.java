package androidelements;

import Model.JSONModel;
import languagewrite.Attribute;
import languagewrite.Tag;

public class AndroidSeekBar extends AndroidElement {
    private final String view = "SeekBar";

    public AndroidSeekBar(JSONModel jsonModel) {
        super(jsonModel.getId(), jsonModel.getStart(), jsonModel.getEnd(), jsonModel.getTop(), jsonModel.getBottom());
    }

    public String getView() {
        return view;
    }

    @Override
    public void draw(Tag root) {
        Tag seekBar = new Tag(getView());
        seekBar.addAttribute(new Attribute(AppKeys.ID_KEY, "@+id/" + this.getId()));
        seekBar.addAttribute(new Attribute(AppKeys.WIDTH_KEY, this.getWidth()));
        seekBar.addAttribute(new Attribute(AppKeys.HEIGHT_KEY, this.getHeight()));
        seekBar.addAttribute(new Attribute(AppKeys.START_KEY, "@+id/" + this.getId() + "_start_guideline"));
        seekBar.addAttribute(new Attribute(AppKeys.END_KEY, "@+id/" + this.getId() + "_end_guideline"));
        seekBar.addAttribute(new Attribute(AppKeys.TOP_KEY, "@+id/" + this.getId() + "_top_guideline"));
        seekBar.addAttribute(new Attribute(AppKeys.BOTTOM_KEY, "@+id/" + this.getId() + "_bottom_guideline"));
        root.addChild(seekBar);
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

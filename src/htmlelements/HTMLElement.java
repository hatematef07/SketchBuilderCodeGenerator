package htmlelements;

import elements.Element;
import languagewrite.Tag;

public abstract class HTMLElement implements Element {
    public abstract void draw(Tag root);
}

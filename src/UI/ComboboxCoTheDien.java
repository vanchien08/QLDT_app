package UI;

import Component.ComboSuggestionUI;
import javax.swing.JComboBox;

public class ComboboxCoTheDien<E> extends JComboBox<E> {

    public ComboboxCoTheDien() {
        setUI(new ComboSuggestionUI());
    }
}

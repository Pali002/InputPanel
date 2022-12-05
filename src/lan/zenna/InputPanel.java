package lan.zenna;

import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 * Zentai Pál
 * 2022-12-05
 * Szoft-II-N
 */

public class InputPanel extends JPanel {
    private JLabel label;
    JTextField field;

    /**
    * Paraméter nélküli konstruktor
    */
    public InputPanel() {
        this.label = new JLabel("InputPanel");
        this.field = new JTextField();
        this.setLayout(new BoxLayout(this, BoxLayout.LINE_AXIS));
        this.setBorder(new EmptyBorder(5, 10, 5, 10));
        this.label.setBorder(new EmptyBorder(0, 0, 0, 10));
        this.addComponent();
    }
    private void addComponent() {
        this.add(label);
        this.add(field);
    }

    /**
     * Konstruktor, paraméterként a
     * komponens felirata megadható.
     * @param label
     */

    public InputPanel(JLabel label) {
        this.label = label;
    }

    /**
     * A komponens szövegének beállítása
     *@param text A felirat szövege
     */

    public void setText(String text) {
        this.label.setText(text);
    }

    /**
     * A komponens szövege lekérdezhető
     * @return A komponens szövegét adja
     */
    public String getText() {
        return this.label.getText();
    }
    /**
     * A komponens érékének beállítása
     * @param value A komponens értéke
     */
    public void setValue(String value) {
        this.field.setText(value);
    }
    /**
     * A komponens értékének lekérdezése
     * @return A komponens értékét adja
     */
    public String getValue() {
        return this.field.getText();
    }
}
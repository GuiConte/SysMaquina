package view;

import java.text.ParseException;

public class Main {

    public static void main(String[] args) throws ParseException {

        try {
            com.jtattoo.plaf.graphite.GraphiteLookAndFeel.setTheme("Blue", "", "Irmãos Coragem");
            javax.swing.UIManager.setLookAndFeel("com.jtattoo.plaf.graphite.GraphiteLookAndFeel");
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        Principal c = new Principal();
        c.desenharTela();
    }
}

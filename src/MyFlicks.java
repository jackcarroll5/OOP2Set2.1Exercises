import javax.swing.*;
import java.awt.*;

public class MyFlicks {
    public static void main(String[] args) {

        Film[] catalog = new Film[2];
        String title = "",director = "",runtimeAsString = "";
        int runtime = 0;

        Film film1 = new Film("","",0);

        JOptionPane.showMessageDialog(null,film1,"Empty Argument",JOptionPane.INFORMATION_MESSAGE);

        Film film2 = new Film("Tropic Thunder","Ben Stiller",102);

        JOptionPane.showMessageDialog(null,film2,"Films",
                JOptionPane.INFORMATION_MESSAGE);

            for (int i = 0; i < catalog.length; i++)
            {
                title = JOptionPane.showInputDialog("Please enter the title of any film: ");
                director = JOptionPane.showInputDialog("Please enter the director of the chosen film");
                runtimeAsString = JOptionPane.showInputDialog("Please enter the running time for your chosen film");
                runtime = Integer.parseInt(runtimeAsString);

                catalog[i] = new Film(title,director,runtime);
            }
            displayFilms(catalog);
    }

    public static void displayFilms(Film[] catalog)
    {
        String text = "";

        JTextArea jta = new JTextArea();
        Font font = new Font("monospaced",Font.PLAIN,12);
        jta.setFont(font);

        text = "Number of Films: " + catalog.length;
        jta.append(text);

        for (int i = 0; i < catalog.length; i++)
            jta.append(catalog[i].toString());

        JOptionPane.showMessageDialog(null,jta,
                "Film Catalogue",JOptionPane.INFORMATION_MESSAGE);
    }
}


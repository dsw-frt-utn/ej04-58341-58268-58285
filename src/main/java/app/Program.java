package app;

import data.Persistencia;
import java.util.InvalidPropertiesFormatException;
import views.MenuViews;

public class Program {
    public static void main(String[] args) throws IllegalArgumentException, InvalidPropertiesFormatException {
        Persistencia.inicializar();
        MenuViews view = new MenuViews();
        view.setVisible(true);
    }
}

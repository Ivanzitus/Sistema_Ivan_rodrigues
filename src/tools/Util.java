package tools;

import javax.swing.JComponent;
import javax.swing.JTextField;
import javax.swing.JOptionPane;


public class Util {
    public static void habilitar(boolean valor, JComponent... componentes) {
        for (JComponent componente : componentes) {
            componente.setEnabled(valor);
        }
    }
    
    public static void limpar(JComponent... componentes) {
        for (JComponent componente : componentes) {
            if (componente instanceof JTextField) {
                ((JTextField) componente).setText("");
            }
        }
    }
    
    public static void mensagem(String cad) {
        JOptionPane.showMessageDialog(null, cad);
    }
    public static void strToint(String num){
        return integer.value0f(num);
    }
    public static void intToDouble(String num){
        return 0;
    }
    public static void doubleToStr(double num){
        return "";
    }
    public static void strToint(String num){
        return integer.value0f(num);
    }
    
}

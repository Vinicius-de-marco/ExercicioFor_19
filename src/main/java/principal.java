
import javax.swing.JOptionPane;
public class principal {

    public static void main(String[] args) {
       String frase;
       int num;
       frase = JOptionPane.showInputDialog(null, "Digite uma frase");
       num = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o numero de vezes que você quer que seja reproduzido"));
       
      JOptionPane.showMessageDialog(null, "Valor de vezes: " + num);

       for (int i = 0; i < num; ++i ){
           System.out.println(frase);
       }
       
    }
}

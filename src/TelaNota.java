import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TelaNota extends JFrame {
    public JPanel telaNota;
    private JTextField textNota1;
    private JTextField textNota2;
    private JButton bntCalcular;
    private JTextField textSituacaoC;
    private JTextField textMedia;
    private JLabel textSituacao;
public TelaNota() {
    bntCalcular.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            Double nota1 = Double.valueOf(textNota1.getText());
            Double nota2= Double.valueOf(textNota2.getText());

            Double media = (nota1 + nota2) /2;

             textMedia.setText(media.toString());


             if (media >=7){
                 textSituacaoC.setText("Aluno aprovado");
             }else{
                 textSituacaoC.setText("Aluno reprovado");
             }
        }
    });
    textMedia.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            textMedia.setText(textMedia.getText());

        }
    });
}
}

package interfaz;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import mundo.Recta;

public class VentanaPrincipal extends JFrame implements ActionListener{

    private static final long serialVersionUID = 1L;

    private JPanel contentPane;
    private JButton btnCalcular;
    private JTextField txtX1, txtX2, txtY1, txtY2;
    private JLabel lblResultado;

    public VentanaPrincipal() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 400, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblTitulo = new JLabel("Cálculo de la Ecuación de la Recta");
        lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
        lblTitulo.setBounds(50, 10, 300, 20);
        contentPane.add(lblTitulo);

        JLabel lblX1 = new JLabel("X1:");
        lblX1.setBounds(50, 50, 50, 20);
        contentPane.add(lblX1);

        txtX1 = new JTextField();
        txtX1.setBounds(100, 50, 80, 20);
        contentPane.add(txtX1);
        
        JLabel lblY1 = new JLabel("Y1:");
        lblY1.setBounds(200, 50, 50, 20);
        contentPane.add(lblY1);
        
        txtY1 = new JTextField();
        txtY1.setBounds(250, 50, 80, 20);
        contentPane.add(txtY1);
        
        JLabel lblX2 = new JLabel("X2:");
        lblX2.setBounds(50, 80, 50, 20);
        contentPane.add(lblX2);
        
        txtX2 = new JTextField();
        txtX2.setBounds(100, 80, 80, 20);
        contentPane.add(txtX2);
        
        JLabel lblY2 = new JLabel("Y2:");
        lblY2.setBounds(200, 80, 50, 20);
        contentPane.add(lblY2);
        
        txtY2 = new JTextField();
        txtY2.setBounds(250, 80, 80, 20);
        contentPane.add(txtY2);
        
        btnCalcular = new JButton("Calcular");
        btnCalcular.setBounds(150, 120, 100, 30);
        btnCalcular.addActionListener(this);
        contentPane.add(btnCalcular);
        
        lblResultado = new JLabel("Ecuación de la recta: ");
        lblResultado.setBounds(50, 170, 300, 20);
        contentPane.add(lblResultado);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == btnCalcular) {
            double x1 = Double.parseDouble(txtX1.getText());
            double y1 = Double.parseDouble(txtY1.getText());
            double x2 = Double.parseDouble(txtX2.getText());
            double y2 = Double.parseDouble(txtY2.getText());
            
            Recta recta = new Recta(x1, y1, x2, y2);
            String ecuacion = recta.obtenerEcuacion();
            lblResultado.setText("Ecuación: " + ecuacion);
        }
    }
}


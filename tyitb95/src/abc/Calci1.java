package abc;
//
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextArea;
import javax.swing.JButton;
import java.awt.Insets;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calci1 extends JFrame {
    private JTextArea textArea;
    private double firstNumber;
    private String operator;
    private boolean newNumber;

    public Calci1() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        JPanel panel = new JPanel();
        panel.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(panel);
        GridBagLayout gbl_panel = new GridBagLayout();
        gbl_panel.columnWidths = new int[] { 0, 0, 0, 0, 0, 0, 0 };
        gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
        gbl_panel.columnWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        gbl_panel.rowWeights = new double[] { 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
        panel.setLayout(gbl_panel);

        textArea = new JTextArea();
        GridBagConstraints gbc_textArea = new GridBagConstraints();
        gbc_textArea.insets = new Insets(0, 0, 5, 5);
        gbc_textArea.fill = GridBagConstraints.BOTH;
        gbc_textArea.gridx = 1;
        gbc_textArea.gridy = 0;
        panel.add(textArea, gbc_textArea);
        
        // Create and add buttons with action listeners
        addButton(panel, "7", 0, 1);
        addButton(panel, "8", 1, 1);
        addButton(panel, "9", 2, 1);
        addButton(panel, "DEL", 3, 1);
        addButton(panel, "4", 0, 2);
        addButton(panel, "5", 1, 2);
        addButton(panel, "6", 2, 2);
        addButton(panel, "+", 3, 2);
        addButton(panel, "1", 0, 3);
        addButton(panel, "2", 1, 3);
        addButton(panel, "3", 2, 3);
        addButton(panel, "-", 3, 3);
        addButton(panel, ".", 0, 4);
        addButton(panel, "0", 1, 4);
        addButton(panel, "/", 2, 4);
        addButton(panel, "×", 3, 4);
        addButton(panel, "CLR", 1, 5);
        addButton(panel, "=", 2, 5);

    }

    private void addButton(JPanel panel, String label, int gridx, int gridy) {
        JButton button = new JButton(label);
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                buttonClicked(label);
            }
        });

        GridBagConstraints gbc_button = new GridBagConstraints();
        gbc_button.insets = new Insets(0, 0, 5, 5);
        gbc_button.gridx = gridx;
        gbc_button.gridy = gridy;
        panel.add(button, gbc_button);
    }

    private void buttonClicked(String label) {
        if (newNumber) {
            textArea.setText("");
            newNumber = false;
        }

        if (label.matches("[0-9.]")) {
            textArea.append(label);
        } else if ("+-*/×".contains(label)) {
            firstNumber = Double.parseDouble(textArea.getText());
            textArea.append(label);
            operator = label;
            newNumber = true;
        } else if (label.equals("=")) {
            double secondNumber = Double.parseDouble(textArea.getText());
            double result = calculate(firstNumber, secondNumber, operator);
            textArea.setText(Double.toString(result));
            newNumber = true;
        } else if (label.equals("CLR")) {
            textArea.setText("");
            newNumber = true;
        } else if (label.equals("DEL")) {
            String currentText = textArea.getText();
            if (!currentText.isEmpty()) {
                textArea.setText(currentText.substring(0, currentText.length() - 1));
            }
        }
    }

    private double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 - num2;
            case "*":
            case "×":
                return num1 * num2;
            case "/":
                return num1 / num2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
    	EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    Calci1 frame = new Calci1();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}


package IHM;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;

public class MaFenetre extends JFrame {
    public MaFenetre(){
        super("Biblio.exe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620,400);
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu();
        fileMenu.setText("File");
        menuBar.add(fileMenu);

        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        JFileChooser test = new JFileChooser();
        JMenuItem fichier = new JMenuItem("Ouvrir...");
        fileMenu.add(fichier);
        fichier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("fichier txt","txt");
                test.setFileFilter(filter);
                int retour = test.showOpenDialog(panel);
                test.setVisible(true);
                File fText = test.getSelectedFile();
                fText = fText.getAbsoluteFile();
                System.out.println(fText);



            }
        });
        JMenu editMenu = new JMenu();
        editMenu.setText("Edit");
        menuBar.add(editMenu);

        JMenu aboutMenu = new JMenu();
        aboutMenu.setText("About");
        menuBar.add(aboutMenu);
        Object [] [] donnees = {

                {"Harry Potter","J.K Rowling","",5,2,2009},
                {"Eragon","C.Paolini","Un monde de dragon",2,2,2000},

        };

        String[] entetes = {"Name","Auteur","Résumé","Colonne","Rangees","Parution"};

        JTable montableau = new JTable(donnees,entetes);


        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 12;
        gbc.gridheight = 1;


        getContentPane().add(montableau.getTableHeader(),gbc);


        JButton buttonPlus = new JButton("Add");
        gbc.gridx = 5;
        gbc.gridy = 7;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(buttonPlus,gbc);
        JButton buttonSup = new JButton("Sup");
        gbc.gridx = 6;
        gbc.gridy = 7;
        panel.add(buttonSup,gbc);

        JButton buttonValider = new JButton("Valider");


        JLabel label1 = new JLabel("Titre");
        JLabel label2 = new JLabel("Auteur");
        JLabel label3 = new JLabel("Parution");
        JLabel label4 = new JLabel("Colonne");
        JLabel label5 = new JLabel("Rangée");
        JLabel label6 = new JLabel("Résumé");

        JTextField textField1 = new JTextField();
        textField1.setPreferredSize(new Dimension(100,25));
        JTextField textField2 = new JTextField();
        textField2.setPreferredSize(new Dimension(100,25));
        JTextField textField3 = new JTextField();
        textField3.setPreferredSize(new Dimension(100,25));
        JTextField textField4 = new JTextField();
        textField4.setPreferredSize(new Dimension(100,25));
        JTextField textField5 = new JTextField();
        textField5.setPreferredSize(new Dimension(100,25));
        JTextArea textArea = new JTextArea();
        textArea.setPreferredSize(new Dimension(100,150));


        gbc.gridx = 13;
        gbc.gridy = 0;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(label1,gbc);
        gbc.gridy = 1;
        panel.add(label2,gbc);
        gbc.gridy = 2;
        panel.add(label3,gbc);
        gbc.gridy = 3;
        panel.add(label4,gbc);
        gbc.gridy = 4;
        panel.add(label5,gbc);


        gbc.gridx = 14;
        gbc.gridy = 0;
        panel.add(textField1,gbc);
        gbc.gridy = 1;
        panel.add(textField2,gbc);
        gbc.gridy = 2;
        panel.add(textField3,gbc);
        gbc.gridy = 3;
        panel.add(textField4,gbc);
        gbc.gridy = 4;
        panel.add(textField5,gbc);
        gbc.gridy = 5;
        panel.add(textArea,gbc);
        gbc.gridy = 6;
        panel.add(buttonValider,gbc);

        gbc.gridx = 13;
        gbc.gridy = 5;
        gbc.insets = new Insets(0,0,130,0);
        panel.add(label6,gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 12;
        gbc.gridheight = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        getContentPane().add(montableau,gbc);



    }
}

package IHM;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Calendar;

public class MaFenetre extends JFrame {

    public MaFenetre(){
        super("Biblio.exe");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(620,400);
        JPanel panel = new JPanel();
        this.setContentPane(panel);
        JMenuBar menuBar = new JMenuBar();
        this.setJMenuBar(menuBar);
        JMenu fileMenu = new JMenu("file");
        menuBar.add(fileMenu);

        GridBagLayout layout = new GridBagLayout();
        panel.setLayout(layout);

        GridBagConstraints gbc = new GridBagConstraints();

        bibiotheque bib = new bibiotheque();

        JMenuItem fichier = new JMenuItem("Ouvrir...");
        JMenuItem quitter = new JMenuItem("Quitter");

        fileMenu.add(fichier);
        fileMenu.add(quitter);

        quitter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });



        JFileChooser test = new JFileChooser();
        fichier.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FileNameExtensionFilter filter = new FileNameExtensionFilter("fichier txt","txt");
                test.setFileFilter(filter);
                int retour = test.showOpenDialog(panel);
                test.setVisible(true);
                if(retour == 0){
                    File fText = test.getSelectedFile();
                    fText = fText.getAbsoluteFile();
                }

            }
        });


        JFileChooser test2 = new JFileChooser();
        JMenuItem newsMenu = new JMenuItem("Nouveautés");
        fileMenu.add(newsMenu);
        newsMenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane dialogue = new JOptionPane();
                dialogue.showMessageDialog(newsMenu, "Livres & Auteurs parus depuis 2008 ", "Nouveautées", JOptionPane.INFORMATION_MESSAGE);
                // newsMenu.getActionListeners();
                // newsMenu.getText();
            }
        });



        JMenu editMenu = new JMenu("Edit");
        menuBar.add(editMenu);
        JMenuItem raz = new JMenuItem("RAZ");
        editMenu.add(raz);

        JMenu aboutMenu = new JMenu("About");
        menuBar.add(aboutMenu);
        JMenuItem info = new JMenuItem("À propos");
        aboutMenu.add(info);
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane msg = new JOptionPane();
                msg.showMessageDialog(panel,"À propos:\nVersions: Alpha\nDev: Anais,Léonard,Mathieu,Alban");

            }
        });

        menuBar.add(editMenu);
        menuBar.add(aboutMenu);
        aboutMenu.add(info);
        info.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane msg = new JOptionPane();
                msg.showMessageDialog(panel,"A propos:\nVersions: Alpha\nDev: Anais,Léonard,Mathieu,Alban");
            }
        });
        Object [] [] donnees = {

                {"Harry Potter","J.K Rowling","",5,2,2009},
                {"Eragon","C.Paolini","Un monde de dragon",2,2,2000},
        };

        ArrayList livres = new ArrayList();

        String[] entetes = {"Name","Auteur","Résumé","Colonne","Rangees","Parution"};

        DefaultTableModel model = new DefaultTableModel(entetes, 0);



        JTable montableau = new JTable(model){
            public boolean isCellEditable(int row, int column){
                return false;
            }
        };

        montableau.setDefaultRenderer(Object.class, new jTableRender());

        raz.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i = 0;i < donnees.length;i++){


                }

            }
        });




        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 12;
        gbc.gridheight = 1;


        getContentPane().add(montableau.getTableHeader(),gbc);

        JButton buttonPlus = new JButton("Add");
        gbc.gridx = 5;
        gbc.gridy = 6;
        gbc.gridwidth = 1;
        gbc.gridheight = 1;
        panel.add(buttonPlus,gbc);
        JButton buttonSup = new JButton("Sup");
        gbc.gridx = 6;
        gbc.gridy = 6;
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
        textArea.setPreferredSize(new Dimension(95,150));


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
        gbc.gridheight = 2;
        panel.add(textArea,gbc);
        gbc.gridy = 7;
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




        textField1.setEditable(false);
        textField2.setEditable(false);
        textField3.setEditable(false);
        textField4.setEditable(false);
        textField5.setEditable(false);
        textArea.setEditable(false);
        buttonValider.setEnabled(false);

        buttonPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField1.setEditable(true);
                textField2.setEditable(true);
                textField3.setEditable(true);
                textField4.setEditable(true);
                textField5.setEditable(true);
                textArea.setEditable(true);
                buttonValider.setEnabled(true);
            }
        });
        buttonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                Calendar c = Calendar.getInstance();
                int annee = c.get(Calendar.YEAR);

                if (textField1.getText().equals("")){
                    System.out.println("Ajouter un titre");
                    i++;
                }
                if (textField2.getText().equals("")){
                    System.out.println("Ajouter un auteur");
                    i++;
                }
                try {
                    if (Integer.parseInt(textField3.getText()) > annee){
                        System.out.println("Annee de parution non valide (max = "+ annee +")");
                        i++;
                    }
                }
                catch (NumberFormatException exception){
                    System.out.println("Ajouter une parution valide");
                    i++;
                }
                try {
                    if (Integer.parseInt(textField4.getText()) < 1 ||Integer.parseInt(textField4.getText()) > 5){
                        System.out.println("Nombre de colonne non valide (min = 1 et max = 5)");
                        i++;
                    }
                }
                catch (NumberFormatException exception){
                    System.out.println("Ajouter une colonne valide");
                    i++;
                }
                try {
                    if (Integer.parseInt(textField5.getText()) < 1 ||Integer.parseInt(textField5.getText()) > 7){
                        System.out.println("Nombre de rangée non valide (min = 1 et max = 7)");
                        i++;
                    }
                }
                catch (NumberFormatException exception){
                    System.out.println("Ajouter une rangée valide");
                    i++;
                }


                if (textArea.getText().equals("")){
                    System.out.println("Ajouter un résumé");
                    i++;
                }
                if (i == 0) {


                    String titre = textField1.getText();
                    String auteur = textField2.getText();
                    int parution = Integer.parseInt(textField3.getText());
                    int colonne = Integer.parseInt(textField4.getText());
                    int rangee = Integer.parseInt(textField5.getText());
                    String resume = textArea.getText();


                    livre livre = new livre(titre,auteur,resume,colonne,rangee,parution);
                    bib.addBook(livre);
                    String[] donne = new String[6];
                    Object[] toto = bib.getBib();
                    for(int o = 0;o<bib.getBib().length;o++){
                        donne[0] = bib.getBib()[o].getName();
                        donne[1] = bib.getBib()[o].getAuteur();
                        donne[2] = bib.getBib()[o].getResume();
                        donne[3] = Integer.toString(bib.getBib()[o].getColonnes());
                        donne[4] = Integer.toString(bib.getBib()[o].getLigne());
                        donne[5] = Integer.toString(bib.getBib()[o].getParution());

                    }
                    model.addRow(donne);


                    textField1.setEditable(false);
                    textField2.setEditable(false);
                    textField3.setEditable(false);
                    textField4.setEditable(false);
                    textField5.setEditable(false);
                    textArea.setEditable(false);
                    buttonValider.setEnabled(false);
                    textField1.setText("");
                    textField2.setText("");
                    textField3.setText("");
                    textField4.setText("");
                    textField5.setText("");
                    textArea.setText("");
                }
                System.out.println("");
            }
        });

        buttonValider.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (textArea.getText().equals("")) {
                    JOptionPane.showMessageDialog(buttonValider, " Merci de remplir toutes les cases ! ", "Erreur!", JOptionPane.ERROR_MESSAGE);
                }
            }

        });}}
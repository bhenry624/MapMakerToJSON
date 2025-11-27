package com.map_maker_to_json.main.GUI;


import java.awt.GridLayout;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MapConfigDialog extends JDialog {
    private String name;
    private int rows, cols, tileSize;
    private boolean confirmed;

    public MapConfigDialog(JFrame parent) {
        super(parent, "Map Configuration", true);

        setLayout(new GridLayout(5, 2, 10, 10));

        //Fields and labels for testing it operates as expected
        //todo: add event listeners for submission to grab the values and pass them
        JTextField nameField = new JTextField();
        JTextField rowsField = new JTextField();
        JTextField colsField = new JTextField();
        JTextField tileSizeField = new JTextField();

        add(new JLabel("Name of Map:"));
        add(nameField);

        add(new JLabel("Number of Rows:"));
        add(rowsField);

        add(new JLabel("Number of Cols:"));
        add(colsField);

        add(new JLabel("Size of Tiles (pixels):"));
        add(tileSizeField);

        pack();
        setLocationRelativeTo(parent);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRows() {
        return rows;
    }

    public int getCols() {
        return cols;
    }

    public int getTileSize() {
        return tileSize;
    }

    public boolean isConfirmed() {
        return confirmed;
    }
}

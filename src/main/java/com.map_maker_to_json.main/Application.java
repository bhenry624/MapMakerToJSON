package com.map_maker_to_json.main;

import com.map_maker_to_json.main.GUI.MapConfigDialog;

import javax.swing.JFrame;

public class Application {
    public static void main(String[] args) {
        //make a dummy frame and populate it with the dialog
        JFrame dummyFrame = new JFrame();
        MapConfigDialog dialog = new MapConfigDialog(dummyFrame);

        dialog.setVisible(true);

        //close if the dialog is exited,
        //todo: handle exits gracefully
        System.exit(0);
    }
}

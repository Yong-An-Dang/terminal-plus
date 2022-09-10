package com.g3g4x5x6;

import com.formdev.flatlaf.FlatLightLaf;

import javax.swing.*;

public class BaseFlatLaf {
    public BaseFlatLaf(){

    }


    protected static void initFlatLaf() {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        // 输入框圆角
        UIManager.put("TextComponent.arc", 5);
    }
}

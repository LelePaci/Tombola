package com.lelepaci.gui.windows;

import com.lelepaci.gui.component.base.TPanel;
import com.lelepaci.gui.component.WindowFrame;

import java.awt.*;

public class StartWindow extends TPanel {
    public StartWindow(WindowFrame windowFrame, String windowName) {
        super(windowFrame, windowName);
        this.setOpaque(false);
        this.setPreferredSize(new Dimension((int)WINDOW_WIDTH, (int) WINDOW_HEIGHT));

//        JLabel title = new JLabel("TOMBOLA");
//        title.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 70));
//        title.setForeground(Color.WHITE);
//        this.add(title);
    }

//    @Override
//    protected void paintChildren(Graphics g) {
//        Graphics2D g2d = (Graphics2D) g;
//        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//        g2d.setColor(Color.YELLOW);
//        g2d.fillRoundRect(0,0,getWidth(), getHeight(), 15,15);
//        System.out.println("Painted: " + getWindowName());
//        super.paintComponent(g);
//    }
}

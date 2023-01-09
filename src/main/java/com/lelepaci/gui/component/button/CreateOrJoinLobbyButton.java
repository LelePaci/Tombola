package com.lelepaci.gui.component.button;

import com.lelepaci.gui.component.base.TButton;
import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.FontLoader;

import java.awt.*;

public class CreateOrJoinLobbyButton extends TButton {
    public CreateOrJoinLobbyButton(WindowFrame windowFrame, String text, Dimension dimension) {
        super(windowFrame);
        this.setPreferredSize(dimension);
        this.setForeground(Color.white);
        this.setText(text);
        this.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 25));
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        if (isEnabled()){
            g2d.setPaint(PRINCIPAL_RADIAL_GRADIENT_PAINT);
        } else {
            g2d.setPaint(DISABLED_RADIAL_GRADIENT_PAINT);
        }
        g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 30,30);
        super.paintComponent(g);
    }
}

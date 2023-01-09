package com.lelepaci.gui.component;

import com.lelepaci.gui.component.base.EmptyBox;
import com.lelepaci.gui.component.core.WindowFrame;
import com.lelepaci.gui.utils.FontLoader;
import com.lelepaci.gui.utils.GridBagConstraintBuilder;

import javax.swing.*;
import java.awt.*;

public class HostBox extends EmptyBox {

    private Dimension currentDimension;
    public HostBox(WindowFrame windowFrame) {
        super(windowFrame);
        currentDimension = new Dimension(950, 100);

        this.setLayout(new GridBagLayout());

        JLabel label1 = new JLabel("Host:");
        label1.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 40));

        GridBagConstraints gridLabel1 = GridBagConstraintBuilder.build(0,0,.0f,.0f,new Insets(0,5,0,0),GridBagConstraints.LINE_START);

        JLabel hostLabel = new JLabel("192.168.1.1");
        hostLabel.setFont(FontLoader.loadFont(BEBAS_NEUE_FONT_PATH, 40));

        GridBagConstraints gridHostLabel = GridBagConstraintBuilder.build(1,0,.0f,.0f,new Insets(0,5,0,0),GridBagConstraints.LINE_START);

        this.add(label1, gridLabel1);
        this.add(hostLabel, gridHostLabel);

        currentDimension = new Dimension(currentDimension.width, currentDimension.height);

        int newWidth = label1.getPreferredSize().width + hostLabel.getPreferredSize().width + 10;
        Dimension newDimension = new Dimension(newWidth, currentDimension.height);

        this.setPreferredSize(currentDimension);
        this.setMinimumSize(currentDimension);
        System.out.println(label1.getPreferredSize());

    }
}

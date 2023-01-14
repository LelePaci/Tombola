package com.lelepaci.gui.core;

import com.lelepaci.gui.utils.WindowInfos;

import javax.swing.*;
import java.awt.*;
import java.util.Optional;

public class TCursor implements WindowInfos {
    private Cursor standard;
    private Cursor pointer;
    private Cursor text;

    public TCursor(String standardName, String pointerName, String textName) {
        setStandard(standardName);
        setPointer(pointerName);
        setText(textName);
    }

    private Cursor createCursor(Image image, String type) {
        Cursor cursor = null;
        if (image != null) {
            cursor = Toolkit.getDefaultToolkit().createCustomCursor(image, new Point(0, 0), "custom " + type + " cursor");
        }
        return cursor;
    }

    private void setStandard(String path) {
        Image image = (path != null) ? new ImageIcon(CURSORS_FOLDER + path).getImage() : null;
        standard = createCursor(image, "standard");
    }

    private void setPointer(String path) {
        Image image = (path != null) ? new ImageIcon(CURSORS_FOLDER + path).getImage() : null;
        pointer = createCursor(image, "pointer");
    }

    private void setText(String path) {
        Image image = (path != null) ? new ImageIcon(CURSORS_FOLDER + path).getImage() : null;
        text = createCursor(image, "text");
    }

    public Cursor getStandard() {
        return standard;
    }

    public Cursor getPointer() {
        return pointer;
    }

    public Cursor getText() {
        return text;
    }
}

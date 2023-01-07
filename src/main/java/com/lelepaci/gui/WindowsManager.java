package com.lelepaci.gui;

import com.lelepaci.gui.component.WindowFrame;
import com.lelepaci.gui.component.WindowPanel;
import com.lelepaci.gui.component.base.TPanel;

import java.util.ArrayList;
import java.util.List;

public class WindowsManager {

    private WindowFrame windowFrame;
    private WindowPanel windowPanel;
    private List<TPanel> windowList;

    public WindowsManager(WindowFrame windowFrame, WindowPanel windowPanel) {
        this.windowFrame = windowFrame;
        this.windowPanel = windowPanel;
        windowList = new ArrayList<>();
    }

    public void preloadWindow(TPanel window) {
        windowList.add(window);
    }

    public TPanel getWindow(String name) {
        for (TPanel w : windowList) {
            if (w.getWindowName().equals(name)) {
                return w;
            }
        }
        return null;
    }

    /**
     * @param window The window to add
     */
    public void loadWindow(TPanel window) {
        windowPanel.add(window);
        windowFrame.updateFrame();
    }

    /**
     * @param window The window to remove
     */
    public void unloadWindow(TPanel window) {
        windowPanel.remove(window);
        windowFrame.updateFrame();
    }
}

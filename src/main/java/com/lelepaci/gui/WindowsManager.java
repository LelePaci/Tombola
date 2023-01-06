package com.lelepaci.gui;

import com.lelepaci.gui.component.WindowFrame;
import com.lelepaci.gui.component.WindowPanel;
import com.lelepaci.gui.component.Window;

import java.util.ArrayList;
import java.util.List;

public class WindowsManager {

    private WindowFrame windowFrame;
    private WindowPanel windowPanel;
    private List<Window> windowList;

    public WindowsManager(WindowFrame windowFrame, WindowPanel windowPanel) {
        this.windowFrame = windowFrame;
        this.windowPanel = windowPanel;
        windowList = new ArrayList<>();
    }

    public void preloadWindow(Window window) {
        windowList.add(window);
        window.setWindowsManager(this);
    }

    public Window getWindow(String name) {
        for (Window w : windowList) {
            if (w.getWindowName().equals(name)) {
                return w;
            }
        }
        return null;
    }

    /**
     * @param window The window to add
     */
    public void loadWindow(Window window) {
        windowPanel.add(window);
        windowFrame.updateFrame();
    }

    /**
     * @param window The window to remove
     */
    public void unloadWindow(Window window) {
        windowPanel.add(window);
        windowFrame.updateFrame();
    }

    public void closeApp(){
        windowFrame.close();
    }
}

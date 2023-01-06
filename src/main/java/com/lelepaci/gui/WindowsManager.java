package com.lelepaci.gui;

import com.lelepaci.gui.component.WindowFrame;
import com.lelepaci.gui.component.WindowPanel;
import com.lelepaci.gui.component.Window;

import java.util.ArrayList;
import java.util.List;

public class WindowsManager {

    private WindowFrame windowFrame;
    private WindowPanel borderPanel;
    private List<Window> windowsList;
    public WindowsManager(WindowFrame windowFrame, WindowPanel borderPanel) {
        this.windowFrame = windowFrame;
        this.borderPanel = borderPanel;
        windowsList = new ArrayList<>();
    }

    public void preloadWindow(Window window){
        windowsList.add(window);
    }

    /**
     * @param windowName Must be the exact name of the windows
     */
    public void loadWindow(String windowName){
        for (Window w: windowsList) {
            if (w.getWindowName().equals(windowName)) {
                borderPanel.add(w);
                windowFrame.revalidate();
                windowFrame.repaint();
            }
        }
    }

    /**
     * @param windowName Must be the exact name of the windows
     */
    public void unloadWindow(String windowName){
        for (Window w: windowsList) {
            if (w.getWindowName().equals(windowName)) {
                borderPanel.remove(w);
                windowFrame.revalidate();
                windowFrame.repaint();
            }
        }
    }
}

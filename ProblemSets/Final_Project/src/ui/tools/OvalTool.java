package ui.tools;

import ui.DrawingEditor;

import javax.swing.*;

public class OvalTool extends ShapeTool {
    public OvalTool(DrawingEditor editor, JComponent parent) {
            super(editor, parent);
    }

    @Override
    protected void createButton(JComponent parent) {
        button = new JButton("Oval");
        button = customizeButton(button);
    }
}

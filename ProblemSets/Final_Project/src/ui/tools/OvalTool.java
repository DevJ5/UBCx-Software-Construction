package ui.tools;

import model.Shape;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class OvalTool extends ShapeTool {
    public OvalTool(DrawingEditor editor, JComponent parent) {
            super(editor, parent);
    }

    @Override
    protected void createButton() {
        button = new JButton("Oval");
    }

    @Override
    protected void makeShape(MouseEvent e) {
        System.out.println(this.getClass().getName());
        System.out.println(this instanceof OvalTool);

        shape = new Shape(e.getPoint(), editor.getMidiSynth());
    }
}

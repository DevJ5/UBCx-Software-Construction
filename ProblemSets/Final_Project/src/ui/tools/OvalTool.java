package ui.tools;

import model.Oval;
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
    public void makeShape(MouseEvent e) {
        System.out.println(this.getClass().getName());
        System.out.println(this instanceof OvalTool);

        shape = new Oval(e.getPoint(), editor.getMidiSynth());
    }
}

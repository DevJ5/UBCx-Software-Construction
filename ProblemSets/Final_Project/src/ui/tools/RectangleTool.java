package ui.tools;

import model.Shape;
import ui.DrawingEditor;

import javax.swing.*;
import java.awt.event.MouseEvent;

public class RectangleTool extends ShapeTool {
    public RectangleTool(DrawingEditor editor, JComponent parent) {
        super(editor, parent);
    }

    // MODIFIES: this
    // EFFECTS:  creates new button and adds to parent
    @Override
    protected void createButton() {
        button = new JButton("Rectangle");
    }

    @Override
    protected void makeShape(MouseEvent e) {
        System.out.println(this.getClass().getName());
        System.out.println(this instanceof RectangleTool);

        // create case statement for creating a rectangle/oval models?
        shape = new Shape(e.getPoint(), editor.getMidiSynth());
    }


}

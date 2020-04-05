package model;

import sound.MidiSynth;

import java.awt.*;

public class Rectangle extends Shape {
    public Rectangle(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth, new Color(230, 158, 60), 1);
    }

    @Override
    protected void drawGraphics(Graphics g) {
        g.drawRect(x, y, width, height);
    }

    @Override
    protected void fillGraphics(Graphics g) {
        g.fillRect(x, y, width, height);
    }

}

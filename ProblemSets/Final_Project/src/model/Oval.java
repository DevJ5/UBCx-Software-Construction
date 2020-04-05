package model;

import sound.MidiSynth;

import java.awt.*;

public class Oval extends Shape {

    public Oval(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth, new Color(230, 158, 60), 0);
    }

    @Override
    protected void drawGraphics(Graphics g) {
        g.drawOval(x, y, width, height);
    }

    @Override
    protected void fillGraphics(Graphics g) {
        g.fillOval(x, y, width, height);
    }

}

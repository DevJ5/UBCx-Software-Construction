package model;

import sound.MidiSynth;

import java.awt.*;

public class Oval extends Shape {

    public Oval(Point topLeft, MidiSynth midiSynth) {
        super(topLeft, midiSynth, new Color(0,255, 0), 7);
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

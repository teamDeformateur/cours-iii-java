package edu.formation.exemple;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.Label;
import java.awt.List;
import java.awt.TextField;

public class FirstApplet extends Applet {

  public void init() {
    add(new Label("Nom:"));
    add(new TextField(12));
    add(new List());
    add(new Button("OK"));
  }

  public void paint(Graphics g) {
    g.drawRect(2, 2, 400, 300);
    g.drawRect(2, 2, 400, 300);
  }
}

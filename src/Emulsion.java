/**
 * Created by benja on 2/27/2017.
 */
import bpw.Util;
import processing.core.PApplet;

import java.util.ArrayList;
import java.util.List;

public class Emulsion extends PApplet{

    public void settings(){
        fullScreen(P3D,-2);
    }

    public void draw(){
        background(10,10,30);
        noFill();
        pushMatrix();
        translate(width/2,height/2);
        rotateY(frameCount/255f);
        stroke(255);
        box(200);
        popMatrix();
    }

    public static void main(String... args){
        PApplet.main("Emulsion");
    }
}
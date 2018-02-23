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

    float ax,ay,az;
    public void draw(){
        background(10,10,30);
        noFill();
        pushMatrix();
        translate(width/2,height/2);
        rotateY(frameCount/255f);
        stroke(255);
        box(200);
        if(frameCount%63==0){
            ax=random(-1,1);
            ay=random(-1,1);
            az=random(-1,1);
        }
        pushMatrix();
        rotate(0.005f*(frameCount%63),ax,ay,az);
        stroke(255,255-5*(frameCount%63));
        box(200+frameCount%63);
        popMatrix();
        popMatrix();
    }

    public static void main(String... args){
        PApplet.main("Emulsion");
    }
}
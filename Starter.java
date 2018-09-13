import gpdraw.*;
/**
 * Write a description of class Starter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Starter
{
     public static void main(String[] args){
       SketchPad paper = new SketchPad(500, 500);
      DrawingTool pencil = new DrawingTool(paper);
       Tree tree = new Tree();
        
        
       tree.drawTree(8, 80);
        
       
   }
    
}

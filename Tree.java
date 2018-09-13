
import gpdraw.*;
public class Tree
{
    SketchPad paper = new SketchPad(500, 500);
    DrawingTool myPencil = new DrawingTool(paper);
    DrawingTool pencil = new DrawingTool(paper);
    public void drawTree(int n, int l){
        if(n==1){
            pencil.forward(l);
        }
        else
        {

            pencil.forward(l);

            pencil.turn(30);//first turn
            drawTree(n-1, l-(l/n));//second segment..thenturns again

            pencil.forward(-(l-(l/n)));
            pencil.turnRight(30);//original direction
            

            pencil.turn(-30);//draw the other side of the tree
            drawTree(n-1, l-(l/n));

            pencil.forward(-(l-(l/n)));//return to where you start
            pencil.turn(30);

        }

    }

    

}

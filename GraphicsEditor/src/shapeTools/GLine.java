package shapeTools;

import java.awt.Shape;
import java.awt.geom.Line2D;

import main.GConstants.EDrawingStyle;

public class GLine extends GShapeTool {

	public GLine() {
		super(EDrawingStyle.e2PointDrawing);
		this.shape = new Line2D.Float();
	}
	public Object clone() {
		GShapeTool cloned = (GShapeTool) super.clone();
		cloned.shape = (Shape) ((Line2D.Float)(this.shape)).clone();
		return cloned;
	}

	@Override
	public void setInitialPoint(int x, int y) {
		Line2D line = (Line2D) this.shape;
		line.setLine(x, y, x, y);
	}

	@Override
	public void setFinalPoint(int x, int y) {
		
	}

	@Override
	public void movePoint(int x, int y) {
		Line2D line = (Line2D) this.shape;
		line.setLine(line.getX1(), line.getY1(), x, y);
	}

}

package oripa.paint.pbisec;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.geom.AffineTransform;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Point2D.Double;

import javax.media.j3d.GraphStructureChangeListener;
import javax.vecmath.Vector2d;

import oripa.Config;
import oripa.Globals;
import oripa.ORIPA;
import oripa.geom.GeomUtil;
import oripa.geom.OriLine;
import oripa.paint.ElementSelector;
import oripa.paint.GraphicMouseAction;
import oripa.paint.MouseContext;
import oripa.paint.segment.SelectingFirstVertexForSegment;

public class TwoPointBisectorAction extends GraphicMouseAction {


	public TwoPointBisectorAction(){
		setActionState(new SelectingFirstVertexForBisector());
	}
	

	

	@Override
	public void onDrag(MouseContext context, AffineTransform affine, MouseEvent event) {
		// TODO Auto-generated method stub

	}

	@Override
	public void onRelease(MouseContext context, AffineTransform affine,
			MouseEvent event) {
		// TODO Auto-generated method stub

	}

	
	@Override
	public void onDraw(Graphics2D g2d, MouseContext context) {

		super.onDraw(g2d, context);
		
		Vector2d closeVertex = context.pickCandidateV;

		ElementSelector selector = new ElementSelector();
		
		if (closeVertex != null) {
            g2d.setColor(selector.selectColorByLineType(Globals.inputLineType));
            drawVertex(g2d, context, closeVertex.x, closeVertex.y);
        }


	}

}

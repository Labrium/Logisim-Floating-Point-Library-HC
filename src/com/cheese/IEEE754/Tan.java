package com.cheese.IEEE754;

import com.cburch.logisim.data.Attribute;
import com.cburch.logisim.data.BitWidth;
import com.cburch.logisim.data.Bounds;
import com.cburch.logisim.data.Direction;
import com.cburch.logisim.data.Value;
import com.cburch.logisim.instance.InstanceFactory;
import com.cburch.logisim.instance.InstancePainter;
import com.cburch.logisim.instance.InstanceState;
import com.cburch.logisim.instance.Port;
import com.cburch.logisim.instance.StdAttr;
import com.cburch.logisim.util.GraphicsUtil;
import com.cburch.logisim.util.StringGetter;

public class Tan extends InstanceFactory {

	public Tan() {
		super("Tan");
		setAttributes(new Attribute[] { }, new Object[] { });

		setOffsetBounds(Bounds.create(-20, -20, 20, 40));

		setPorts(new Port[] {
			new Port(-20, 0, Port.INPUT, 32),
			new Port(0, 0, Port.OUTPUT, 32),
		});
	}

	@Override
	public void paintInstance(InstancePainter painter) {
		painter.drawBounds();
		painter.drawPorts();
		Bounds bds = painter.getBounds();
		GraphicsUtil.drawCenteredText(painter.getGraphics(), "t", bds.getX() + bds.getWidth()/2, bds.getY() + bds.getHeight()/2);
	}

	@Override
	public void propagate(InstanceState state) {
		float a = FloatHelper.floatValueToFloat(state.getPortValue(0));
		a = (float)Math.tan((double)a);
		state.setPort(1, FloatHelper.floatToFloatValue(a), 1);
	}

}

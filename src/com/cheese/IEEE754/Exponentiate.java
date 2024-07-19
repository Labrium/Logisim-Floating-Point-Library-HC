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
import com.cburch.logisim.util.StringGetter;

public class Exponentiate extends InstanceFactory {

	public Exponentiate() {
		super("Exponentiate");
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
	}

	@Override
	public void propagate(InstanceState state) {
		float xSqrt = FloatHelper.floatValueToFloat(state.getPortValue(0));
		xSqrt = (float)Math.pow(Math.E, (double)xSqrt);
		state.setPort(1, FloatHelper.floatToFloatValue(xSqrt), 1);
	}

}

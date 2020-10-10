package com.zte.mouse.action.strategy;
import org.junit.Test;

import com.zte.mouse.util.PositionUtil;


public class MoveStrategyTest {
	@Test
	public void moveToPoint(){
		MoveStrategy moveStrategy=new MoveStrategy();
		moveStrategy.setEndPosition(new Point(500,500));
		moveStrategy.action();
	}
	@Test
	public void moveToPointAndBack(){
		MoveStrategy moveStrategy=new MoveStrategy();
		Point startPosition=PositionUtil.getCurPosition();
		moveStrategy.setStartPosition(startPosition);
		moveStrategy.setEndPosition(new Point(500,500));
		moveStrategy.setNeedBack(true);
		moveStrategy.action();
	}
}

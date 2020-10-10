package com.zte.mouse.action.strategy;
import org.junit.Test;

import com.zte.mouse.util.PositionUtil;


public class ClickStrategyTest {
	@Test
	public void clickTest(){
		ClickStrategy clickStrategy=new ClickStrategy();
		clickStrategy.setWaitTime(3000);
		clickStrategy.setClickPosition(new Point(500,500));
		clickStrategy.action();
	}
	@Test
	public void doubleClick(){
		DoubleClickStrategy doubleClickStrategy=new DoubleClickStrategy();
		doubleClickStrategy.setClickPosition(PositionUtil.getCurPosition());
		doubleClickStrategy.action();
	}
}

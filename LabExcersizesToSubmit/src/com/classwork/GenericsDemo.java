package com.classwork;

public class GenericsDemo {
	public static void main(String[] args) {

		GoodPaintBrush brush = new GoodPaintBrush();
		BestPaintBrush<Paint> best=new BestPaintBrush<Paint>();

		Paint paint = new BluePaint();
		Powder powder=new RosePowder();
		
//		brush.obj = powder;
//		brush.execute();
		
		best.setObj(paint);
		System.out.println(best.getObj());
		

		BestPaintBrush<Powder> bestPow=new BestPaintBrush<Powder>();
		bestPow.setObj(powder);
		System.out.println(bestPow.getObj());
	}

}

abstract class Paint {
	public abstract void color();
}

class RedPaint extends Paint {
	@Override
	public void color() {
		System.out.println("Red colour...");
	}
}

class BluePaint extends Paint {
	@Override
	public void color() {
		System.out.println("Blue colour...");
	}
}

abstract class Powder {
	public abstract void doMakeUp();
}

class WhitePowder extends Powder {
	@Override
	public void doMakeUp() {
		System.out.println("White powder applied");
	}
}

class RosePowder extends Powder {
	@Override
	public void doMakeUp() {
		System.out.println("Rose powder applied");
	}
}

class GoodPaintBrush {
	Object obj;

	public void execute() {
		if (obj instanceof Paint) {
			Paint paint = (Paint) obj;
			paint.color();
//			((Paint) obj).color();
		} else if (obj instanceof Powder) {
			Powder powder = (Powder) obj;
			powder.doMakeUp();
//			((Powder) obj).doMakeUp();
		}
	}
}


class BestPaintBrush<T>{
	private T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}











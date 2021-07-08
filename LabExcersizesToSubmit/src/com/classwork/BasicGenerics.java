package com.classwork;

public class BasicGenerics {
	public static void main(String[] args) {
		Sky sky=new Sky();
		Ball ball=new Ball();
		Earth earth=new Earth();
		
//		Accept accept=new Accept();
//		
//		accept.obj=earth;
//		accept.process();
		
		GenericAccept<Sky> acceptSky = new GenericAccept<Sky>();
		acceptSky.setObj(sky);
		Sky sky2=acceptSky.getObj();
		System.out.println(sky2);
		
		GenericAccept<Ball> acceptBall = new GenericAccept<Ball>();
		acceptBall.setObj(ball);
		System.out.println(acceptBall.getObj());
		
		GenericAccept<Earth> acceptEarth = new GenericAccept<Earth>();
		acceptEarth.setObj(earth);
		System.out.println(acceptEarth.getObj());
	}
}

class Earth {}

class Sky{}

class Ball{}

class GenericAccept<T>{
	T obj;

	public T getObj() {
		return obj;
	}

	public void setObj(T obj) {
		this.obj = obj;
	}
}

class Accept{
	Object obj;
	
	public void process() {
		if (obj instanceof Ball) {
			Ball ball = (Ball) obj;
			System.out.println(ball);
		} else if (obj instanceof Sky) {
			System.out.println((Sky) obj);
		}
	}
}
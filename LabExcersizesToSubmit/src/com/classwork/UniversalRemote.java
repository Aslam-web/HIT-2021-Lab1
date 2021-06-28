package com.classwork;

public class UniversalRemote {
	public static void main(String[] args) {
		Tv tv = new Tv();
		SetTopBox setTopBox=new SetTopBox();
		Netflix netflix=new Netflix();
		SoundSystem soundSystem=new SoundSystem();
		
		FatherNewsChannelCommand fncc=new FatherNewsChannelCommand(tv, setTopBox, soundSystem, netflix);
		MotherOldMovieCommand mocm=new MotherOldMovieCommand(tv, setTopBox, soundSystem, netflix);
		
		Remote remote=new Remote();
		remote.setCommand(fncc, 0);
		remote.setCommand(mocm, 1);
//		remote.executeCommand(0);
//		remote.executeCommand(1);
		remote.executeCommand(2);
	}
}

class Tv {
	public void av1() {
		System.out.println("tv switched to av1 mode...");
	}

	public void switchOn() {
		System.out.println("Tv is switched on now...");
	}
}

class SetTopBox {
	public void newsChannel() {
		System.out.println("News channel started...");
	}

	public void serialChannel() {
		System.out.println("Serial channel started...");
	}
}

class Netflix {
	public void movieOld() {
		System.out.println("Old movie started...");
	}
}

class SoundSystem {
	public void lowSound() {
		System.out.println("Sound set to low..");
	}
}

interface Command {
	public void execute();
}

class FatherNewsChannelCommand implements Command {
	Tv tv;
	SetTopBox setTopBox;
	SoundSystem ss;
	Netflix netflix;

	public FatherNewsChannelCommand(Tv tv, SetTopBox setTopBox, SoundSystem ss, Netflix netflix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.ss = ss;
		this.netflix = netflix;
	}

	@Override
	public void execute() {
		System.out.println("Father News Channel about to be activated");
		tv.switchOn();
		tv.av1();
		setTopBox.newsChannel();
		ss.lowSound();
		System.out.println("There you go the news channel");
	}
}

class MotherOldMovieCommand implements Command {
	Tv tv;
	SetTopBox setTopBox;
	SoundSystem ss;
	Netflix netflix;

	public MotherOldMovieCommand(Tv tv, SetTopBox setTopBox, SoundSystem ss, Netflix netflix) {
		this.tv = tv;
		this.setTopBox = setTopBox;
		this.ss = ss;
		this.netflix = netflix;
	}

	@Override
	public void execute() {
		System.out.println("Mother Old Movie about to be activated");
		tv.switchOn();
		tv.av1();
		setTopBox.serialChannel();
		System.out.println("There you go the old movie channel");
	}
}

class DummyCommand implements Command {
	@Override
	public void execute() {
		System.out.println("Dummy command mate !!!");
	}
}

class Remote {
	Command[] commands = new Command[5];

	public Remote() {
		for (int i = 0; i < commands.length; i++) {
			commands[i] = new DummyCommand();
		}
	}

	public void setCommand(Command c, int slot) {
		this.commands[slot] = c;
	}

	public void executeCommand(int slot) {
		this.commands[slot].execute();
	}
}
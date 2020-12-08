package com.src;

public class Factoryclass {

	public static Drawing getDrawing()
	{
		return new Rectangle();
	}
	public static Drawing getDrawing1()
	{
		return new Triangle();
	}
	public static Drawing getDrawing2()
	{
		return new Circle();
	}
	
}

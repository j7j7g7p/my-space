package com.shang.pattern.decorator.grep;

import java.io.PrintStream;

public class VGrep {
	PrintStream out;
	
	public VGrep() {
		out = System.out;
	}
	
	public void println(String line) {
		out.print(line);
	}
}

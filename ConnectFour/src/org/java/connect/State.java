package org.java.connect;

import java.util.Vector;

public class State extends SimpleBoard {
	public int v = -1;
	public int depth = 0;
	public int action = 0;
	public boolean out = false;
	public Vector suc = new Vector();

	public State() {
		action = -1;
		v = 0;
		depth = 0;
		clear();
		suc = new Vector();
		out = false;
	}
}
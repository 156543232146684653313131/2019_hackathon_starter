package com.shasta.client;

public class Shape {
	private int id;
	private int inv;
	private boolean draw = false;
	private String[] key = {"yes","right","left",""};
	public String[] road = {"####      ####",
"			 ####    ####",
"			  ####  ####",
"			     ####",
"			     ####",
"			     ####"};
	public String[] tree = {"   #","  ###"," ##### ","#######","   #   ","   #   "};
	public String[] dead = {"~FR~BR@@@@@@@@@@@@@@@@@@@@@@@@~RS","~FR~BR@@@@@@@@@@@@@@@@@@@@@@@@~RS","~FR~BR@@@@@@@@@@@@@@@@@@@@@@@@~RS"};
	public void setID(int num) {
		this.id = num;
	}
	public void setIn(int num) {
		this.inv = num;
	}
	public int pickPath(String j) {
		int send = this.id;
		if (send == 0) {
			this.setID(1);
		}
		else if(send == 1) {
			this.setID(2);
		}
		else if(send == 2) {
			this.setID(3);
			this.draw = true;
		}
		else if(send == 3) {
			this.setID(4);
		}
		else if(send == 4) {
			if(j == "yes" || j == "Yes") {
				this.setID(5);
			}
			else {
				this.setID(6);
			}
		}
		else if(send == 5 || send == 6) {
			this.setID(7);
		}
		else if(send == 7) {
			if(j == "fast" || j =="Fast") {
				this.setID(8);
			}
			else if (j == "medium" || j == "Medium") {
				this.setID(9);
			}
			else this.setID(10);
		}
		else if(send == 8) {
			this.setID(11);
		}
		else if(send == 9) {
			this.setID(12);
		}
		else if(send == 10) {
			this.setID(13);
		}
		return send;
	}
	public void setOpt(String str) {
		if(str == "yes") {
			
		}
	}
	public boolean canDraw() {
		return this.draw;
	}
	public String[] whatDraw() {
		if(this.id == 2) {
			this.draw = false;
			return tree;
			
		}
		else return null;
	}
	public String toString() {
		return "" + id;
	}
}

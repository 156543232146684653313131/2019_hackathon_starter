package com.shasta.client;

public class StringChain {
	private int lim = 415;
	private String[] enyK = {"~FRHalt,~RS ~FRwho~RS ~FRgoes~RS ~FRthere?~RS", "~FRFoul~RS ~FRrapscallion~RS ~FRI~RS ~FRshall~RS ~FRput~RS ~FRyour~RS ~FRhead~RS ~FRon~RS ~FRa~RS ~FRpike!~RS"};
	private String[] nar = new String[lim];
	
		//{"~FGWhat's~RS ~FGyour~RS ~FGname?~RS","~FGThat's~RS ~FGa~RS ~FGname~RS ~FGI~RS ~FGguess~RS","~FGHere~RS ~FGis~RS ~FGthe~RS ~FGstory~RS ~FGso~RS ~FGfar...~RS", "~FGYou~RS ~FGare~RS ~FGin~RS ~FGa~RS ~FGforest.~RS"};
	private String[] enyG = {"~FRHey.~RS", "~FRYou're~RS ~FRnew~RS ~FRhere~RS ~FRaren't~RS ~FRya?~RS", "~FRName's~RS ~FRJeremy~RS ~FRShankmuncher.~RS"};
	public void setSys() {
		this.nar[0] = "~FGWhat's~RS ~FGyour~RS ~FGname?~RS";
		this.nar[1] = "~FGThat's~RS ~FGa~RS ~FGname~RS ~FGI~RS ~FGguess~RS";
		this.nar[2] = "~FGHere~RS ~FGis~RS ~FGthe~RS ~FGstory~RS ~FGso~RS ~FGfar...~RS";
		this.nar[3] = "~FGYou~RS ~FGare~RS ~FGin~RS ~FGa~RS ~FGforest.~RS";
		this.nar[4] = "~FGSee~RS ~FGthat~RS ~FGpine~RS ~FGtree~RS ~FGthere?~RS";
		this.nar[5] = "~FGExcellent!~RS";
		this.nar[6] = "~FGWell~RS ~FGgood~RS ~FGluck~RS ~FGthen,~RS ~FGyou're~RS ~FGgonna~RS ~FGneed~RS ~FGit.~RS";
		this.nar[7] = "~FGWill~RS ~FGyou~RS ~FGlook~RS ~FGaround~RS ~FGfast~RS ~FGor~RS ~FGmedium?~RS";
		this.nar[8] = "~FGYou~RS ~FGfound~RS ~FGa~RS ~FGstrange~RS ~FGbook.~RS";
		this.nar[9] = "~FGYou~RS ~FGfound~RS ~FGa~RS ~FGshort~RS ~FGsword.~RS";
		this.nar[10] = "~FGYou~RS ~FGfound~RS ~FGdirt.~RS";
		this.nar[11] = "~FGYou~RS ~FGcan't~RS ~FGread~RS ~FGit~RS ~FGbut~RS ~FGit~RS ~FGlooks~RS ~FGexpensive.~RS";
		this.nar[12] = "~FGYou~RS ~FGplace~RS ~FGit~RS ~FGin~RS ~FGyour~RS ~FGinventory~RS ~FGto~RS ~FGsell~RS ~FGlater.~RS";
		this.nar[13] = "~FGYou~RS ~FGalready~RS ~FGhave~RS ~FGone~RS ~FGso~RS ~FGyou~RS ~FGplace~RS ~FGit~RS ~FGin~RS ~FGyour~RS ~FGinventory~RS ~FGto~RS ~FGsell~RS ~FGlater.~RS";
		this.nar[14] = "~FGYou're~RS ~FGbad~RS ~FGat~RS ~FGdigging.~RS";
		
		this.nar[98] = "~OLYou~RS ~OLDied~RS";
		this.nar[99] = "~OLThe~RS ~OLend~RS";
		this.nar[100] = "~OLLog~RS ~OLin~RS ~OLagain~RS ~OLto~RS ~OLsee~RS ~OLmore~RS ~OLscenarios.~RS";
	}
	public String toSend(int a) {
		if(a == 0) {
			this.setSys();
			return nar[0];
		}
		else if(a == 1) {
			return nar[1];
		}
		else if(a == 2) {
			return nar[2];
		}
		else if(a == 3) {
			return nar[3];
		}
		else if(a == 4) {
			return nar[4];
		}
		else if(a == 5) {
			return nar[5];
		}
		else if(a == 6) {
			return nar[6];
		}
		else if(a == 7) {
			return nar[7];
		}
		else if(a == 8) {
			return nar[8];
		}
		else if(a == 9) {
			return nar[9];
		}
		else if (a == 10) {
			return nar[10];
		}
		else if (a == 11) {
			return nar[11];
		}
		else if (a == 12) {
			return nar[12];
		}
		else if(a == 98) {
			return nar[98];
		}
		else if(a == 99) {
			return nar[99];
		}
		else if(a == 100) {
			return nar[100];
		}
		else return "unreadable string";
	}
}

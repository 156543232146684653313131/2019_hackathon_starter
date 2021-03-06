package com.shasta.client;

import java.util.regex.*;
//Thanks to amahdy at https://github.com/amahdy for writing this code
public class TextFormattingBot {
	 public static String parse(String text) {
	        int i;
	        String[] formatCodes = {

	            "~RS", "\033[0m", /* reset */

	            /* Standard stuff */
	            "~OL", "\033[1m", /* bold */
	            "~UL", "\033[4m", /* underline */
	            "~LI", "\033[5m", /* blink */
	            "~RV", "\033[7m", /* reverse */

	            /* Foreground color */
	            "~FK", "\033[30m", /* black */
	            "~FR", "\033[31m", /* red */
	            "~FG", "\033[32m", /* green */
	            "~FY", "\033[33m", /* yellow */
	            "~FB", "\033[34m", /* blue */
	            "~FM", "\033[35m", /* magenta */
	            "~FC", "\033[36m", /* cyan */
	            "~FW", "\033[37m", /* white */
	            "~FT", "\033[36m", /* turquoise */

	            /* Background color */
	            "~BK", "\033[40m", /* black */
	            "~BR", "\033[41m", /* red */
	            "~BG", "\033[42m", /* green */
	            "~BY", "\033[43m", /* yellow */
	            "~BB", "\033[44m", /* blue */
	            "~BM", "\033[45m", /* magenta */
	            "~BC", "\033[46m", /* cyan */
	            "~BW", "\033[47m", /* white */
	            "~BT", "\033[46m"  /* turquoise */
	        };
	        String tempString = text;
	        for (i = 0; i < formatCodes.length; i += 2) {
	            tempString = Pattern.compile(formatCodes[i]).matcher(tempString)
	                    .replaceAll(Matcher.quoteReplacement(formatCodes[i + 1]));
	        }
	        return tempString;
	    }

	    /**
	     * If one of the arguments expected to have spaces,
	     * you may need to reconstruct the arguments
	     * to retrieve the full text again.
	     * 
	     * @param args The original array of arguments
	     * @param start Start position at which the reconstruction should happen
	     * @return String representation of the arguments back again
	     */
	    public static String reconstructArgs(String[] args, int start) {

	        StringBuilder text = new StringBuilder(args[start]);
	        for(int i=start+1; i<args.length; i++) {
	            text.append(" ");
	            text.append(args[i]);
	        }
	        return text.toString();
	    }

	    /**
	     * Formats the Syntax part of the 'About' of a Plugin.
	     * 
	     * @param syntax The string to be formatted.
	     * @return Formatted string.
	     */
	    public static String formatAboutSyntax(String syntax) {
	        return "~FC" + syntax + "~RS\n\n";
	    }

	    /**
	     * Formats the Description part of the 'About' of a Plugin.
	     * 
	     * @param desc The string to be formatted.
	     * @return Formatted string.
	     */
	    public static String formatAboutDesc(String desc) {
	        return desc+"\n\n";
	    }

	    /**
	     * Formats the Notes part of the 'About' of a Plugin.
	     * 
	     * @param notes Array of strings (notes) to be formatted.
	     * @return Formatted notes in bullets.
	     */
	    public static String formatAboutNotes(String[] notes) {
	        StringBuilder str = new StringBuilder("~OLNotes~RS\n");
	        if(notes==null) {
	            str.append("\tNone.\n");
	        }else {      
	            for(int i=0; i<notes.length; i++) {
	                str.append("\t");
	                str.append(Character.toChars(i+97));
	                str.append(". ");
	                str.append(notes[i]);
	                str.append("\n");
	            }
	        }
	        return str.toString();
	    }
}

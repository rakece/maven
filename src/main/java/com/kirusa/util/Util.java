package com.kirusa.util;

public class Util {
	/**
	 * Checks the passed <code>String</code> is null or empty, returns true is the passed String is empty or null.
	 * @param string An instance of String object.
	 * @return true if the string null or empty
	 */
	public static boolean isEmpty(String string){
		return (string == null || string.trim().length() ==0); 
	}
	
	/**
	 * Replaces the special characters with appropriate escape character.
	 * 
	 * @param string The string to be formated.
	 * @return
	 */
	public static String formatString(String string){
		
		if(string== null || string.trim().length()==0){
			return string;
		}	
		string = string.replaceAll("\"", "&#34;").replaceAll("'", "&#39;");
		
		return string;
	}

	  /**
	   * Extracts extension from the file name. Dot is not included in the returned string.
	   */
	  public static String extractFileExtension(String fileName) {
	      int dotInd = fileName.lastIndexOf('.');

	      // if dot is in the first position,
	      // we are dealing with a hidden file rather than an extension
	      return (dotInd > 0 && dotInd < fileName.length()) ? fileName
	              .substring(dotInd + 1) : null;
	  }	
	  
	  /**
	   * Returns the GUID with the file extension appended to it.
	   *  
	   * @param filename
	   * @return
	   */
	  public static String getMediaFileName(String filename, Integer mediaId){
		  String extension = extractFileExtension(filename);
		  return mediaId.toString()+"."+extension;
	  }
}
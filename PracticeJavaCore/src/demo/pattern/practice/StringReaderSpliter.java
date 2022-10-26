public class StringReaderSpliter {
	
	public static String[] customStringSpliter(String tempData,String delimeter) {
		
		String arrayString = "";
		int arrayIndex=0;
		String [] tempArray = new String[1];
		String [] tempArrayClone;
		
		for(int i=0;i<tempData.length();i++) {
			if(tempArray.length == arrayIndex) {
				tempArrayClone = new String[tempArray.length];
				System.arraycopy(tempArray, 0, tempArrayClone, 0, tempArray.length);
				tempArray = null;
				tempArray = new String[arrayIndex+1];
				System.arraycopy(tempArrayClone, 0, tempArray, 0, tempArrayClone.length);
			}
			if(String.valueOf(tempData.charAt(i)).equals(delimeter) || (tempData.length()-1) == i) {
				tempArray[arrayIndex] = (!String.valueOf(tempData.charAt(i)).equals(delimeter) ?  arrayString+=String.valueOf(tempData.charAt(i)) :  arrayString).trim();
				arrayString = "";
				arrayIndex++;
				continue;
			}
			arrayString += String.valueOf(tempData.charAt(i));
		}
		
		return tempArray;
	}

}

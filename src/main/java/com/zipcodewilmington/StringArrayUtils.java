package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {

        return array[-1];
    }//need to be fixed

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[-2];
    }//need to be fixed

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for(String element: array) {//the type of array, variable name: what the array that you wanna loop through
            if (element == value) {
                return true;
            }

        }return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        ArrayList<String> theReverseFlash = new ArrayList<String>(Arrays.asList(array));


        return new StringBuilder(theReverse).reverse().toString();
    }







    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for(int i=0; i<= ((array.length)%2); i++) {
            for (int j = -1; i >= ((array.length) % 2); i--) {
                if (array[i] == array[j]) {
                    return true;
                } else return false;
            }
        }
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        ArrayList<String>calenderMan= new ArrayList<String>(Arrays.asList(array));
        String theWholeString= calenderMan.toString();
        for(int i=0; i< alphabet.length(); i++){
            if(theWholeString.indexOf(alphabet.charAt(i)) == -1);
        }return false;
    }



    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int numOfDaValue=0;
        ArrayList<String>checkThisArray= new ArrayList<String>(Arrays.asList(array));
        String thisArray = checkThisArray.toString();
        for(int i=0; i<= thisArray.length(); i++){
            if(i=value){
                numOfDaValue=numOfDaValue+1;
            }
        }
        return numOfDaValue;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        String valueToRemove="";
        ArrayList<String>newValue=new newValue<String>();

        return newValue.replaceAll(valueToRemove, "");
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        for(int i=0; i<= array.length; i++){
            for(int j=1; j< array.length[i]; j++){
                if(i==j){
                    array.replace(j, " ");
                }
            }
        }
        return null;
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
            for(int i=0; i<= array.length; i++){
                for(int j=1; j< array.length[i]; j++){
                    if(i==j){
                        array.replace(j, " ")=;
                    }
                }
            }
            return null;
        }

    }


}

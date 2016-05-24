/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mozart
 */
public class Helper {
    public static String removeSpaces(String str) {
        /*
         * Helper function to remove all spaces in string.
         */
        while (str.contains(" ")) {
            str = str.replaceAll(" ", "");
        }
        return str;
    }
    
    public static boolean isMathExpr(String mathExprString) {
        /*
         * Function to check if a string is a math expression.
         */
        mathExprString = Helper.removeSpaces(mathExprString);
        String mathRegexPattern = "[a-zA-Z@#\\$\\^\"&:\\'<>,;~`!:\\|\\\\]+";
        Pattern r = Pattern.compile(mathRegexPattern);
        Matcher matcher = r.matcher(mathExprString);
        return !matcher.find();
    }
}

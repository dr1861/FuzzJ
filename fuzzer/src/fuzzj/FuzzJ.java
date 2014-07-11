package fuzzj;
/**
 * Class:   FuzzJ
 * @author  Donald Raikes <don.raikes@nyu.edu>
 * @version 1.0
 * 
 * <p>This class is the main driver for the FuzzJ java class fuzzer. 
 * It is the entry point to the application, and parses all command-line arguments and 
 * orchestrates execution of the fuzzer utilities which are parts of this project/application.</p>
 */

import fuzzj.util.*;

public class FuzzJ {
    public static void main(String[] args) {
	PrintClassPath pcp = new PrintClassPath();
        PackageEnumerator packageenumerator = new PackageEnumerator();

    }       
}

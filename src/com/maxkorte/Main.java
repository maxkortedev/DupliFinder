package com.maxkorte;

public class Main {

    public static void main(String[] args) {
	    String userInput = "";
	    for(String s : args){
	        userInput += s;
        }

	    printDuplicates(userInput);
    }

    public static void printDuplicates (String s){
		char[] arr = s.toLowerCase().toCharArray();
		for(int i = 0; i < arr.length; i++){
			int count = 0;
			for(char d : arr){
				if(d == arr[i]){
					count++;
				}
			}
			boolean exit = false;
			for(int j = 0; j < i; j++){
				if (arr[i] == arr[j]) {
					exit = true;
					break;
				}
			}
			if(!exit && arr[i] != ' ' && count > 1){
				System.out.println(arr[i] + ": " + count);
			}
		}
	}
}

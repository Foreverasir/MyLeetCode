/*
2016-8-3

345. Reverse Vowels of a String
Difficulty: Easy

Write a function that takes a string as input and reverse only the vowels of a string.

Example 1:
Given s = "hello", return "holle".
Example 2:
Given s = "leetcode", return "leotcede".
Note:
The vowels does not include the letter "y".
*/

public class Solution {
    public String reverseVowels(String s) {
		char array[] = s.toCharArray();
		char temp;
		for (int i = 0, j = array.length - 1; i < j; i++, j--) {
			while (i < j && !isVowels(array[i]))
				i++;
			while (j > i && !isVowels(array[j]))
				j--;
			temp = array[i];
			array[i] = array[j];
			array[j] = temp;
		}
		return new String(array);
	}

	public boolean isVowels(char c) {
		c = Character.toLowerCase(c);
		return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? true : false;
	}
}

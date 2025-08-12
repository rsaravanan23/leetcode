//Name: Rishi Saravanan
//Date: 8/9/2025
//Program Name: strStr
//Program Goal: Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, or -1 if needle is not part of haystack.


class Solution {
    public int strStr(String haystack, String needle) {
        for(int i = 0; i < haystack.length() - needle.length() + 1; i++) { 
            if (haystack.substring(i, i + needle.length()).equals(needle)) {
                return i;
            }
        }
        return -1; 
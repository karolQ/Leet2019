package main;

import cases.testCases;
import codes._349_IntersectionOfTwoArrays;
import codes.fourSum;
import codes._024_swapNodesInPairs;

import static cases.testCases.INTERSECTION_OF_ARRAYS1;
import static cases.testCases.INTERSECTION_OF_ARRAYS2;

public class App {
    public static void main(String[] args) {
        fourSum.fourSum(testCases.FOURSUM_NUMS, 0);
        //_024_swapNodesInPairs.swapPairs(testCases.SWAPNODESLIST);
        _349_IntersectionOfTwoArrays.intersection(INTERSECTION_OF_ARRAYS1, INTERSECTION_OF_ARRAYS2);
    }
}

package com.company;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //java 5
        List<Integer> list = new ArrayList<Integer>();
        Map<String, Integer> map = new HashMap<String, Integer>();
        Map<Long, List<Integer>> listMap = new HashMap<Long, List<Integer>>();

        //java 7
        List<Integer> list1 = new ArrayList<>();
        Map<String, Integer> map1 = new HashMap<>();
        Map<Long, List<Integer>> listMap1 = new HashMap<>();

    }
}

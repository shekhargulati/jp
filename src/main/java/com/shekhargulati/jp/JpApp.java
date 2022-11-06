package com.shekhargulati.jp;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JpApp {

    public static void main(String[] args) {
        if (args == null || args.length < 1) {
            System.out.println("Please provide jsonpath you want to evaluate");
            System.out.println("Usage: jp '<jsonpath>'");
            System.out.println("For example: jp '$.store.book[*].author'");
            System.exit(0);
        }
        String jsonPath = args[0];
        DocumentContext documentContext = JsonPath.parse(System.in);
        Object extracted = documentContext.read(jsonPath);
        System.out.println(extracted);
    }
}

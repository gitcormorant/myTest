package com.hmj.hello;

import org.json.JSONException;
import org.json.JSONObject;
import org.junit.Test;
import org.yaml.snakeyaml.util.ArrayUtils;
//import org.yaml.snakeyaml.util.ArrayUtils;

import java.util.*;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;


/**
 *
 */

public class Test1  {


    public static int sq(int y){
        return y*y;
    }

    public static void main(String[] args) {
       int a=3,sq;
       sq=sq(a+1);
        System.out.println("sq="+sq);
    }
}

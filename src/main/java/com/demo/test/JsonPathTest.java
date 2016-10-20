package com.demo.test;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

import java.util.List;

public class JsonPathTest {

   public static  void main(String[] args){

      JSONArray ja = new JSONArray();
      JSONObject jobj1 = new JSONObject();
      jobj1.put("name","guofeipeng");
      jobj1.put("sex","male");

      JSONObject jobj2 = new JSONObject();
      jobj2.put("name","gaoxing");
      jobj2.put("sex","female");

      ja.add(jobj1);
      ja.add(jobj2);

      String json = ja.toJSONString();
      System.out.println("json====>"+json);

      Configuration conf = Configuration.defaultConfiguration();

//Works fine
      String name0 = JsonPath.using(conf).parse(json).read("$[0]['name']");
//PathNotFoundException thrown
      String name1 = JsonPath.using(conf).parse(json).read("$[1]['name']");
//      String name2 = JsonPath.using(conf).parse(json).read("$[1]['hello']");

      Configuration conf2 = conf.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);

//Works fine
      String name00 = JsonPath.using(conf2).parse(json).read("$[0]['name']");
//Works fine (null is returned)
      String name11 = JsonPath.using(conf2).parse(json).read("$[1]['name']");
      String name3 = JsonPath.using(conf2).parse(json).read("$[1]['hello']");


      System.out.println("g0====>"+name0);
      System.out.println("g1====>"+name1);
//      System.out.println("g2====>"+name2);
      System.out.println("g00====>"+name00);
      System.out.println("g11====>"+name11);
      System.out.println("g3====>"+name3);


      //ALWAYS_RETURN_LIST
      Configuration conf3 = Configuration.defaultConfiguration().addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
      List<String> h1 = JsonPath.using(conf3).parse(json).read("$[1]['hello']");
      List<String> h2 = JsonPath.using(conf3).parse(json).read("$[1]['name']");

      System.out.println("h1===>"+h1);
      System.out.println("h2===>"+h2+",list instance"+h2.getClass());
      List<String> s1 = Lists.newArrayList();
      s1.add("helloworld");
      System.out.println(s1);






   }
}

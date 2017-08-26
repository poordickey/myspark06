package com.zhangcheng

import java.net.InetAddress

import org.apache.spark.{SparkConf, SparkContext}
/**
  * Created by zhangcheng on 2017/6/1.
  */
object test1 {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf()
        .setAppName("FirstSpatk")
        .setMaster("local");
    val sc = new SparkContext(conf);
    val rdd = sc.parallelize(List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10), 12);
    def showName(): String = {
      val host = InetAddress.getLocalHost.getHostName();
      val thread = Thread.currentThread().getName();
      host + ":" + thread
    }
    rdd.map { x => while (true) { println("=====>" + showName() + ":" + x) } }.collect
    println("================> hello world");
    println("================> hello world");
    println("================> hello world");
    println("================> hello world");
    println("================> hello world");
    println("================> hello world");
  }
}

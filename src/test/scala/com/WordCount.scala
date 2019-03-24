package com

import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
import org.apache.spark.SparkConf

object WordCount {
  private val master = "spark://192.168.159.150:7077"
//  private val remote_file = "hdfs://spark1:9000/user/spark/data/spark.txt"
  def main(args: Array[String]) {
    val conf = new SparkConf()
      .setAppName("WordCount")
      .setMaster(master)
      .set("spark.executor.memory", "512m")
      .setJars(List("E:\\workIdea2018\\WordCount\\out\\artifacts\\WordCount_jar"))

    val sc = new SparkContext(conf)
//    val textFile = sc.textFile(remote_file)
//    val wordCount = textFile.flatMap(line => line.split(" ")).map(word => (word, 1)).reduceByKey((a, b) => a + b)
//    wordCount.foreach(println)
    println("=========="+sc.appName);
  }
}

package com.persist.tools

import scala.io.StdIn
import com.persist.JsonOps._

object RunPretty {

   def main(args: Array[String]): Unit = {
     while (true) {
       val line = StdIn.readLine()
       if (line == null) return
       try {
         val j = Json(line)
         println(Pretty(j, safe = true))
       } catch {
         case ex: Throwable => println(s"***BAD LINE:$line")
       }
     }
   }

 }

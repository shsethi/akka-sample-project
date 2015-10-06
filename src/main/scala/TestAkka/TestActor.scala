package TestAkka

import akka.actor.Actor

/**
 * Created by shsethi on 10/6/15.
 */
class TestActor extends Actor{

  override def receive = {

    case x:String =>{
      println("This is a string")
    }
    case _ => println("not a string")
  }


}

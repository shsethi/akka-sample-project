package TestAkka

import akka.actor.Actor

/**
 * Created by shsethi on 10/6/15.
 */
class TestActress extends Actor{

  override def receive = {

    case _ => println("bye")
  }

}

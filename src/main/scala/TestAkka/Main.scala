package TestAkka

import akka.actor.{Props, ActorSystem}

/**
 * Created by shsethi on 10/6/15.
 */
object Main extends App{

  override def main(args: Array[String]) {
    val system = ActorSystem("System")
    val actor = system.actorOf(Props(new TestActor) ,"TestActor")

   actor ! "message"
   actor ! 2
    system.shutdown

  }
}

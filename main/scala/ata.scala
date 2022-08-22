import scala.annotation.switch
object ata {
  //Dinero que se maneja en tienda
  var dinero: List[Int] = List(100,50,10)
  var productos: List[Int] = List(270,340,390)
  //plata version pro
  def CountChange(money2: Int, coins: List[Int], cost :Int): String = {
    //plata - costo producto
      val money :Int = money2-cost
    println("se restó y te debemos: " +money)
    //funcion de countChange
    def loop(money: Int, coins: List[Int], suelto: String): String = {
      if (money==0||coins.isEmpty ) suelto
      else if (money>=coins.head ) loop(money - coins.head, coins, suelto + coins.head+"\n" ) else  loop(money, coins.tail, suelto)
    }
    loop(money, coins, "")
  }

  val scanner = new java.util.Scanner(System.in)
  val costo : Int = 0
  var cont=0
  var plata = 0
  var change :List[Int]= List(100,50,10)
  def main(args: Array[String]): Unit = {
    println("introduzca algo :D" );
    //Escanner para ingresar datos
    val line = scanner.nextLine()
    //PRODUCTOS Y PRECIOS
    val x :Int= (line: @switch) match {
      case "A" => 270
      case "B" => 340
      case "C" => 390
    }
    do{
      println("Ingrese moneda")
      val num = scanner.nextInt()
      plata = plata + num
      cont = num
    }while(cont>0)
    println(line)
    //Funcion que evalua todos los escritos
   print(countChange(plata,change,x))
  }

}

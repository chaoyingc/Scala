
""" 7. Ecrire une fonction qui prend un n-uplet
  |de taille 2 et le renvoie avec la valeur Int
  |(si elle existe) dans la première position."""




"""6. Ecrire une fonction qui calcule la
  |différence entre une paire de points 2D
  |et retourne le résultat sous forme de point.
  | Conseil : ce serait une bonne utilisation des
  | tuples."""

def diff(a:Float,b:Float,c:Float,d:Float): Unit = {
  val pair1 = (a,b)
  val pair2 = (c,d)
  val result = (pair1._1 + pair2._1 ,pair1._2 + pair2._2)
  println(result)
}
diff(6,8,7,90)


"""5. Ecrire une fonction qui calcule la première
  |valeur augmentée à l'exposant de la seconde valeur.
  |Essayez d'écrire ceci d'abord en utilisant math.pow,
  | puis avec votre propre calcul.
  | L'avez-vous implémenté avec des variables ?
  | Existe-t-il une solution qui n'utilise que des
  | données immuables ? Avez-vous choisi un type
  | numérique suffisamment grand pour vos besoins ?"""
import math.{Pi, pow, _}
def expo(a:Float,b:Int): Unit = {
  val result = pow(a,b)
  println(result)
}
expo(20,5)

"""4. Ecrire une fonction qui prend une valeur
  |en millisecondes et retourne une chaîne décrivant
  |la valeur en jours, heures, minutes et secondes.
  |Quel est le type optimal pour la valeur d'entrée ?""".stripMargin
import java.text.SimpleDateFormat
def convert(msec:Long): Unit = {
  val sec = msec/1000
  val newtime :String = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(sec*1000)
  println(newtime)
  val hours :String = new SimpleDateFormat("hh").format(sec*1000)
  println(hours)
}
convert(234567)


"""convert date format to minutes"""
def convert2(date:String): Unit = {

  val newtime: Long = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(date).getTime
  println(newtime)
}
val date = "2017-12-18 00:01:56"
convert2(date)

"""1. Ecrire une fonction qui calcule la surface
d'un cercle en fonction de son rayon."""
import math._
def surface(rayon: Float): Unit = {
  println((Pi * pow(rayon , 2)).round)
}
surface(8)

"""2. Fournir une autre forme de la fonction
  dans l'exercice 1 qui prend le rayon comme
  une chaîne de caractères. Que se passe-t-il
  si votre fonction est invoquée avec une chaîne vide ?"""
def surface(rayon: Char): Unit = {
  println((Pi * pow(rayon , 2)).round)
}
surface('l')

"""3. Ecrire une fonction récursive qui imprime
  les valeurs de 5 à 50 par cinq, sans utiliser
  la fonction for ou while dans les boucles.
  Pouvez-vous le rendre récursive ? Avec l’optimisateur
  de récursivité scala?"""
import scala.annotation.tailrec

@tailrec def req2WithAccumulator(d:Int, accumulator: Unit):Unit = {
  if (d < 50) {
    if (d % 5 == 4) {
      req2WithAccumulator(d+1,print(d + "," + "\n"))
    }
    else {
      req2WithAccumulator(d+1,print(d+","))
    }
  }
}

req2WithAccumulator(5,print(""))




for (i <- 1 to 100)
  if (i % 3 == 0 && i%5==0) {
  println("typesafe")
} else if (i%5 == 0) {
  println("safe")
} else if (i%3==0) {
  print("type")
}else {
  println(i)
}

for (i<-1 until 100)
  i match {
    case j if j % 3==0 && i%5==0 => println("typesafe")
    case j if j %3==0 => println("safe")
    case j if j %5 ==0 => println("type")
    case j => println(j)
  }
for( a <- 1 to 100 by 5){ //loop1 a=1, loop2 a=6, etc..
  for (i <-a to a+4) { //loop1 i = 1, 2, 3, 4, 5, ; loop2 i = 6, 7, 8, 9, 10,
    print(i+", ")
  }
  println("") // back to the line
}
val c : String = "This is a character string. "
c match {
  case c if c.length !=0 => println(c)
  case _ => println("n/a")
}



def string2hex(str: String): String = {
  str.toList.map(_.toInt.toHexString).mkString
}
string2hex("cyan")





def hex2string(hex: String): String = {
  hex.sliding(2, 2).toArray.map(Integer.parseInt(_, 16).toChar).mkString
}




val x:Double = - 30.8
if( x > 10 ){
  println("plus grand")
} else if ( x == 0 ){
  println("même")
} else if ( x < 0 ){
  println("moins")
}

x match {
  case x if x > 0 => println("plus grand")
  case x if x == 0 => println("même")
  case x if x < 0 => println("moins")
}



val greetings = "Hello, World"

val cinq : Int = 5

val celsius = 22.5
(celsius * 9/5) + 32

val a : Float = 9/5
val b = 32
val res = (celsius * a) + b

res.round

val num = 2.7255
val fnum =  num.formatted("%.2f")
println(f"Vous devez $fnum $$.")
println(f"Vous devez $fnum" + " $.")

val flag = false
val result = !flag

val n=78
val n1= n.toChar
val n2 = n1.toString










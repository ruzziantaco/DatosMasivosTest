// 1. Crea una lista llamada "lista" con los elementos "rojo", "blanco", "negro"

scala> import scala.collection.mutable.ListBuffer
import scala.collection.mutable.ListBuffer

scala> var colores = new ListBuffer[String]()
colores: scala.collection.mutable.ListBuffer[String] = ListBuffer()

scala> colores += "rojo"
res1: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo)

scala> colores += "blanco"
res2: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco)

scala> colores += "negro"
res3: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco, negro)
   
scala> val listadecolores = colores.toList
listadecolores: List[String] = List(rojo, blanco, negro)

scala> listadecolores
res4: List[String] = List(rojo, blanco, negro)


// 2. Añadir 5 elementos mas a "lista" "verde" ,"amarillo", "azul", "naranja", "perla"
scala> listadecolores
res4: List[String] = List(rojo, blanco, negro)

scala> colores += "verde"
res5: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco, negro, verde)

scala> colores += "amarillo"
res6: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco, negro, verde, amarillo)

scala> colores += "naranja"
res7: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco, negro, verde, amarillo, naranja)

scala> colores += "azul"
res8: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco, negro, verde, amarillo, naranja, azul)

scala> colores += "perla"
res9: scala.collection.mutable.ListBuffer[String] = ListBuffer(rojo, blanco, negro, verde, amarillo, naranja, azul, perla)

scala> val listadecolores = colores.toList
listadecolores: List[String] = List(rojo, blanco, negro, verde, amarillo, naranja, azul, perla)

scala> listadecolores
res10: List[String] = List(rojo, blanco, negro, verde, amarillo, naranja, azul, perla)



// 3. Traer los elementos de "lista" "verde", "amarillo", "azul"
scala> listadecolores
res14: List[String] = List(rojo, blanco, negro, verde, amarillo, azul, naranja, perla)

scala> listadecolores.slice(3,6)
res15: List[String] = List(verde, amarillo, azul)


// 4. Crea un arreglo de número en rango del 1-1000 en pasos de 5 en 5
scala> Array.range(0,1000,5)
res22: Array[Int] = Array(0, 5, 10, 15, 20, 25, 30, 35, 40, 45, 50, 55, 60, 65, 70, 75, 80, 85, 90, 95, 100, 105, 110, 115, 120, 125, 130, 135, 140, 145, 150, 155, 160, 165, 170, 175, 180, 185, 190, 195, 200, 205, 210, 215, 220, 225, 230, 235, 240, 245, 250, 255, 260, 265, 270, 275, 280, 285, 290, 295, 300, 305, 310, 315, 320, 325, 330, 335, 340, 345, 350, 355, 360, 365, 370, 375, 380, 385, 390, 395, 400, 405, 410, 415, 420, 425, 430, 435, 440, 445, 450, 455, 460, 465, 470, 475, 480, 485, 490, 495, 500, 505, 510, 515, 520, 525, 530, 535, 540, 545, 550, 555, 560, 565, 570, 575, 580, 585, 590, 595, 600, 605, 610, 615, 620, 625, 630, 635, 640, 645, 650, 655, 660, 665, 670, 675, 680, 685, 690, 695, 700, 705, 710, 715, 720, 725, 730, 735, 740, 745, 750, 755, 760, 765, 770, 775, 780, 785, 790...





// 5. Cuales son los elementos unicos de la lista Lista(1,3,3,4,6,7,3,7) utilice conversion a conjuntos

scala> var y = List(1,3,3,4,6,7,3,7)
y: List[Int] = List(1, 3, 3, 4, 6, 7, 3, 7)

scala> y
res2: List[Int] = List(1, 3, 3, 4, 6, 7, 3, 7)

scala> y.distinct
res3: List[Int] = List(1, 3, 4, 6, 7)




// 6. Crea una mapa mutable llamado nombres que contenga los siguiente
//     "Jose", 20, "Luis", 24, "Ana", 23, "Susana", "27"

scala> var nombres = scala.collection.mutable.Map[String, Int]()
nombres: scala.collection.mutable.Map[String,Int] = Map()

scala> nombres += ("Jose" -> 20)
res23: scala.collection.mutable.Map[String,Int] = Map(Jose -> 20)

scala> nombres += ("Luis" -> 24)
res25: scala.collection.mutable.Map[String,Int] = Map(Luis -> 24, Jose -> 20)

scala> nombres += ("Ana" -> 23)
res26: scala.collection.mutable.Map[String,Int] = Map(Ana -> 23, Luis -> 24, Jose -> 20)

scala> nombres += ("Susana" -> 27)
res27: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Luis -> 24, Jose -> 20)



// 6 a . Imprime todas la llaves del mapa
scala> nombres
res28: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Luis -> 24, Jose -> 20)


// 7 b . Agrega el siguiente valor al mapa("Miguel", 23)

scala> nombres += ("Miguel" -> 23)
res29: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)

scala> nombres
res30: scala.collection.mutable.Map[String,Int] = Map(Susana -> 27, Ana -> 23, Miguel -> 23, Luis -> 24, Jose -> 20)


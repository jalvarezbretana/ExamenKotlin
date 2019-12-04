/*
Clase main
 */
fun main(){
    /*Creo dos objetos y los muestro en Parking*/
    var miAparcamiento = Aparcamiento("Parking", 10,5,Coches("12345","12:00","16:50"))
    println(miAparcamiento.toString())
    var aparcamiento= Aparcamiento("Parking", 10,5,Coches("12346","12:00","16:00"))
    println(aparcamiento.toString())
    /*Creo dos objetos y los muestro en Parking Público*/
    var miAparc= Aparcamiento("Parking Público", 50,1,Coches("13257","12:00","19:00"))
    println("La matricula de un coche que hay en ${miAparc.nombre} es ${miAparc.nCoches.matricula} y estuvo desde las ${miAparc.nCoches.horaEntrada} hasta las ${miAparc.nCoches.horaSalida}")
    var miAparca=Aparcamiento("Parking Público", 50,1,Coches("13258","18:00","18:30"))
    println("La matricula de un coche que hay en ${miAparca.nombre} es ${miAparca.nCoches.matricula} y estuvo desde las ${miAparca.nCoches.horaEntrada} hasta las ${miAparca.nCoches.horaSalida}")

}


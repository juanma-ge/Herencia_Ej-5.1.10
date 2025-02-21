fun main() {
    val persona = Persona("Julia", 24)
    println(persona.toString())
    println(persona.celebrarCumple())
    println(persona.toString())

    val empleado = Empleado("Pablo", 30, 30000.0, 15.0)
    println(empleado.toString())

    val gerente = Gerente("Ana", 45, 50000.0, false, 2000.0)
    println(gerente.toString())
    println(gerente.administrar())
}
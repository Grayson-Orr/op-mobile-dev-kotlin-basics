class Person(val id: Int, var firstName: String, var lastName: String) {
  override fun toString() = "Person(id=$id, firstName=$firstName, lastName=$lastName)"
}

class Rectangle(val height: Int, val width: Int) {
  val isSquare: Boolean
  get() {
    return height == width
  }
}

fun main() {
  val person = Person(1, "John", "Doe")
  person.firstName = "Joe"
  println(person)
  println(person.firstName)

  val rectangle = Rectangle(10, 20)
  val square = Rectangle(20, 20)
  println(rectangle.isSquare)
  println(square.isSquare)
}

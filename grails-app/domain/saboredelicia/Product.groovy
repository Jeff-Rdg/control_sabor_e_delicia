package saboredelicia

class Product {
    String name
    Double price
    String description

    static constraints = {
        name nullable: false, size: 5..150, unique: true
        price nullable: false
        description blank: false
    }
}

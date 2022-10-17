open class Customer(customerName: String,
                    customerPhone: String,
                    customerEmail: String) {

    //10.7.22
    var customerName: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerPhone: String = ""
        get() = field
        set(value) {
            field = value
        }
    var customerEmail: String = ""
        get() = field
        set(value) {
            field = value
        }


    init {
        this.customerName = customerName
        this.customerPhone = customerPhone
        this.customerEmail = customerEmail
    }


    //prints info about customer
    open fun printInfo(){
        println("Name: $customerName" +
                "\nPhone Number: $customerPhone" +
                "\nEmail: $customerEmail")
    }
}

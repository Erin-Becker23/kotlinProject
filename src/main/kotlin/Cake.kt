//parameters updated on 10.7.22
class Cake (customerName: String,
            customerPhone: String,
            customerEmail: String,
            size: String,
            coupon: Boolean,
            birthday: Boolean,
            price: Double,
            qty: Int,
            flavor: String)
    :Customer(customerName, customerPhone, customerEmail){

    //10.13.22
    var size: String = ""
        get() = field
        set(value) {
            field = value
        }
    var coupon: Boolean = false
        get() = field
        set(value) {
            field = value
        }
    var birthday: Boolean = true
        get() = field
        set(value) {
            field = value
        }
    var price: Double = 0.0
        get() = field
        set(value) {
            field = value
        }
    var qty: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var flavor: String = ""
        get() = field
        set(value) {
            field = value
        }

    init{
        this.size = size
        this.coupon = coupon
        this.birthday = birthday
        this.price = price
        this.qty = qty
        this.flavor = flavor
}

    override fun printInfo(){
        if (coupon == true && birthday == false){
            price = ((price-(price * .10))*qty)
        }
        else if(coupon == true && birthday == true){
            price = ((price-(price * .20))*qty)
        }
        else if(coupon == false && birthday == true){
            price = ((price-(price * .10))*qty)
        }
        else if(coupon == false && birthday == false){
            price = (price*qty)
        }

        println("Name: $customerName" +
                "\nPhone Number: $customerPhone" +
                "\nEmail: $customerEmail" +
                "\nSize: $size" +
                "\nFlavor: $flavor" +
                "\nBirthday: $birthday" +
                "\nCoupon: $coupon" +
                "\nQuantity: $qty" +
                "\nPrice: $price")
    }



}

/*parameters: Inherited from customer
              size: int
              coupon: boolean
              birthday: boolean (add discount if birthday)
              qty: int (number of cakes bought)


get input for types of cake (displayed with prices)
calculate the total cost
    make it so that you can keep buying until you exit
 */
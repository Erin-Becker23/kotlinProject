//parameters updated on 10.7.22
class Bread(customerName: String,
            customerPhone: String,
            customerEmail: String,
            fullLoaf: Boolean,
            coupon: Boolean,
            price: Double,
            qty: Int)
    :Customer(customerName, customerPhone, customerEmail){

    //10.12.22
    var loafPrice = price+(price+2.00)
        //10.11.22

    var qty: Int = 0
        get() = field
        set(value) {
            field = value
        }
    var fullLoaf: Boolean = false
            get() = field
            set(value) {
                field = value
            }
    var coupon: Boolean = false
        get() = field
        set(value) {
            field = value
        }
    //10.12.22
    var price: Double = 0.0
        get() = field
        set(value) {
            field = value
        }

    //10.11.22
    init{
            this.fullLoaf = fullLoaf
            this.coupon = coupon
            this.qty = qty
            this.price = price
        }

    //10.11.22
    //sets the price depending on if you're buying a slice or a loaf
    //also has discount if coupon is true
    override fun printInfo(){
        if(fullLoaf == true && coupon == false) {
            price = loafPrice*qty
        }
            else if (fullLoaf == true && coupon == true) {
                price = ((loafPrice - (loafPrice * .10))*qty)
            }
        else if(fullLoaf == false && coupon == false) {
            price = price*qty
        }
            else if(fullLoaf == false && coupon == true){
            price = ((price - (price * .10))*qty)
        }

        println("Name: $customerName" +
                "\nPhone Number: $customerPhone" +
                "\nEmail: $customerEmail" +
                "\nLoaf: $fullLoaf" +
                "\nCoupon: $coupon" +
                "\nQuantity: $qty" +
                "\nPrice: \$$price")
        }

}

/*
parameters: Inherited from Customer
            full loaf: boolean (if not a full loaf adjust price)
            coupon: boolean
            birthday: boolean (add discount if birthday)


qty: int (number of bread bought)


get input for types of bread (displayed with prices)
calculate the total cost
        make it so that you can keep buying until you exit
 */
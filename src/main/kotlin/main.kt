/*
Business: Bakery
Started 10/6/22
Erin B.
 */

fun main() {
    //gets user input for customer info
    //10.7.22
    println("Please enter a name")
    var input1 = readln()!!.toString()

    println("Please enter a Phone Number")
    var input2 = readln()!!.toString()

    println("Please enter an Email")
    var input3 = readln()!!.toString()
    println("---------------------------")

    //user input to select what to buy
    //10.7.22
    println("Please select what you want to buy:" +
            "\n1)Bread" +
            "\n2)Cake")
    var buyInput = readln()!!.toInt()

    //10.14.22
    if(buyInput != 1 && buyInput !=2 ){
        println("Please choose an option: ")
        buyInput = readln()!!.toInt()
    }

    //10.11.22 (updated 11.12.22)
    //gets info for customer buying bread & displays info
//updated 10.14.22
    if(buyInput == 1){
        println("Which bread would you like to buy?")
        println("1) Whole Wheat | $1.57 per slice" +
                "\n2) Banana Bread | $1.99 per slice" +
                "\n3) Cinnamon Sugar | $1.80 per slice" +
                "\n4) Exit")

    }
    var typeBreadInput = 1
    if (buyInput == 1) {
        typeBreadInput = readln()!!.toInt()
    }

    //10.12.22
    //set price for bread
    var bPrice= 0.0
    when (typeBreadInput){
        1 -> bPrice = 1.57
        2 -> bPrice = 1.99
        3 -> bPrice = 1.80
        else -> return
    }

    //10.11.22 (updated 10.13.22)
    var loafInput1 = ""
    var loafInput2 = false
    if(buyInput == 1) {
        println("Are you buying a full loaf? (y/n)")
        loafInput1 = readln()!!.toString()
        //takes user input to determine if it's a full loaf
        if (loafInput1 == "y") {
            loafInput2 = true
        } else if (loafInput1 == "n") {
            loafInput2 = false
        }
    }

        //10.13.22
        //gets info for cake
        if (buyInput == 2){
            println("Please select a size:" +
                    "\n1) 6 in.| $20" +
                    "\n2) 9 in. | $35" +
                    "\n3) 12 in. | $60"  +
                    "\n4) Exit")
        }
            var cPrice = 0.0
            var cSize = ""
        if (buyInput == 2) {
            var sizeInput = readln()!!.toInt()
            //set price and size for cake
            when (sizeInput) {
                1 -> cPrice = 20.0
                2 -> cPrice = 35.0
                3 -> cPrice = 60.0
                else -> return
            }
            //10.14.22
            when (sizeInput){
                1 -> cSize = "6 in."
                2 -> cSize = "9 in."
                3 -> cSize = "12 in."
                else -> return
            }
        }

        if(buyInput == 2){
            println("Please select a flavor: " +
                    "\n1) Vanilla" +
                    "\n2) Chocolate" +
                    "\n3) Marble" +
                    "\n4) Red Velvet" +
                    "\n5)Exit")
        }


    //updated 10.14.22
    var flavor = ""
    if (buyInput == 2){
        var flavorInput = readln()!!.toInt()

        when (flavorInput){
            1 -> flavor = "Vanilla"
            2 -> flavor = "Chocolate"
            3 -> flavor = "Marble"
            4 -> flavor = "Red velvet"
            else -> return
        }
    }

        //10.14.22
        var bDayInput1 = ""
        var bDayInput2 = false
        if (buyInput == 2){
        println("Is it your birthday? (y/n)")
            bDayInput1 = readln()!!.toString()
            if (bDayInput1 == "y") {
                bDayInput2 = true
            }
            else if (bDayInput1 == "n") {
                bDayInput2 = false
            }
            else if (bDayInput1 != "y" && bDayInput1 != "n") {
                bDayInput2 = false
            }
        }

        //10.12.22
        //updated 10.14.22
        //gets info for coupon
        println("Do you have a coupon? (y/n)")
        var inptCoupon1 = readln()!!
        var inptCoupon2 = false
        if (inptCoupon1 == "y"){
            inptCoupon2 = true
        }
        else if(inptCoupon1 == "n"){
            inptCoupon2 = false
        }

        //10.12.22
        //updated 10.14.22
        //gets info for quantity
        println("What amount are you buying?")
        var qty = readln()!!.toInt()

        println("----------------")

        var person1 = Bread(input1, input2, input3, loafInput2, inptCoupon2, bPrice, qty)
        if (buyInput == 1){
        person1.printInfo()
        }
        //10.13.22
        var person2 = Cake(input1, input2, input3, cSize, inptCoupon2, bDayInput2, cPrice, qty, flavor)
        if (buyInput == 2){
            person2.printInfo()
        }

    //person variables
    //10.7.22
    var person3 = Customer(input1,input2,input3)

    }



import matrixOperations.Multiplication
import matrixOperations.Substract
import matrixOperations.Weights

fun main(args: Array<String>) {
 //   print("hello dinamita´s team")

    //val transpo = Transpose()
    //transpo.transpose()

    //val m1 = arrayOf(intArrayOf(1, 0, 2), intArrayOf(-1, 3, 1))
    //val m2 = arrayOf(intArrayOf(3, 1), intArrayOf(2, 1), intArrayOf(1, 0))

//    val res = Substract()



    //definicion de patrones

    val m1 = arrayOf(intArrayOf(1, 1,-1), intArrayOf(-1, 1,1), intArrayOf(-1, 1,1))
    val m2 = arrayOf(intArrayOf(-1, 1,-1), intArrayOf(1, -1,1), intArrayOf(1, 1,1))


    val n= m1.size*m1[0].size



    //recuperacion

    if (2<=0.138*n){
        println("recuperacion buena")

        if (2<=(n/(4*Math.log(n.toDouble()))))
        {
            println(" pronta recuperacion")

            //ortogonalidad



            // definicion de pesos
            val mul = Weights()
            mul.Weights(m1,m2)



            //funcionamiento




        }else
        {
            println(" no pronta recuperacion")
        }

    }else
        println("recuperacion mala ")





}
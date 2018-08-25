import matrixOperations.Multiplication
import matrixOperations.Substract
import matrixOperations.Weights
import Process.Orthogonality

fun main(args: Array<String>) {
    //definicion de patrones

    val m1 = arrayOf(intArrayOf(1, 1,-1), intArrayOf(-1, 1,1), intArrayOf(-1, 1,1))
    val m2 = arrayOf(intArrayOf(-1, 1,-1), intArrayOf(1, -1,1), intArrayOf(1, 1,1))
    val mul = Weights()
   val orth = Orthogonality()
    val n= m1.size*m1[0].size


    //recuperacion

    if (2<=0.138*n){
        println("recuperacion buena")

        if (2<=(n/(4*Math.log(n.toDouble()))))
        {
            println(" pronta recuperacion")

            //ortogonalidad

            if(orth.checkOrthogonality(m1,m2)<=0)
            {
                // definicion de pesos
                mul.Weights(m1,m2)
                //funcionamiento
            }
            else
                println("No satistace la ortogonalidad")

        }else
        {
            println(" no pronta recuperacion")
        }

    }else
        println("recuperacion mala ")
}
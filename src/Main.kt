import matrixOperations.Multiplication
import matrixOperations.Substract
import matrixOperations.Weights
import Process.Orthogonality

fun main(args: Array<String>) {
    //definicion de patrones
    val m1 = arrayOf(intArrayOf(1, 1,-1,1), intArrayOf(-1, 1,1,1), intArrayOf(-1, 1,1,1),intArrayOf(1, 1,1,-1))
    val m2 = arrayOf(intArrayOf(1, 1,-1,1), intArrayOf(-1, 1,1,1), intArrayOf(-1, 1,1,1),intArrayOf(1, 1,-1,1))

    val pf = arrayOf(intArrayOf(-1, 1,1,1), intArrayOf(1, -1,-1,1), intArrayOf(1, 1,1,1), intArrayOf(1, 1,1,1))
    val m= Multiplication()

    val mul = Weights()
    val orth = Orthogonality()
    val n= m1.size*m1[0].size
    println(n*0.138)


    //recuperacion

    if (2<=0.138*n){
        println("recuperacion buena")

        if (2<=(n/(4*Math.log(n.toDouble()))))
        {
            println(" pronta recuperacion")

            //ortogonalidad

            if(orth.checkOrthogonality(m1,m2)<=0)
            {
               println("Es ortogonal")
            }
            else
                println("No es ortogonal")

        }else
        {
            println(" no pronta recuperacion")
        }

    }else
        println("recuperacion mala ")

    val weights= mul.Weights(m1,m2)
    //funcionamiento
    val fe =m.multiplyMatrices(pf,weights)
    val resultado = Array(fe.size) { IntArray(fe[0].size) }
    for (x in 0 until resultado.size) {
        for (y in 0 until resultado[x].size) {
            if (fe[x][y]>0)
            {
                resultado[x][y] = 1
            }else
            {
                resultado[x][y] = -1
            }
        }
    }
}
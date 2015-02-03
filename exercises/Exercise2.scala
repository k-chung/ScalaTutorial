object Exercise2 {
    def main(args: Array[String]) = {
        val adderFunc = adder(2)
        assert(adderFunc(5) == 7)

        assert(cubeSequence(Seq(1, 2, 3, 4, 5)) == Seq(1, 8, 27, 64, 125))

        println("Success!")
    }

    def adder(x: Int): (Int => Int) = {
        null
    }

    def cubeSequence(s: Seq[Int]): Seq[Int] = {
        null
    }
}

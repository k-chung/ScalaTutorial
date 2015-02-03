object Exercise3 {
    def main(args: Array[String]) = {
        testSearchTree()
        testCountLeaves()
        testSumOddLevels()

        println("Success!")
    }

    // return true if the value is in it
    def searchTree(search: Int, in: Tree): Boolean = {
        in match {
            case null => false
            case Node(n, l, r) => {
                if (n == search) {
                    true
                } else {
                    searchTree(search, l) || searchTree(search, r)
                }
            } 
            case Leaf(n) => n == search
        }
    }

    def testSearchTree() = {
        // single node
        assert(searchTree(1, Leaf(1)) == true)
        assert(searchTree(2, Leaf(1)) == false)

        // tree where node exists
        val tree: Tree = Node(1, Node(2, Leaf(3), Leaf(4)), Node(5, Leaf(6), Leaf (7)))
        assert(searchTree(8, tree) == false)
        assert(searchTree(4, tree) == true)
    }

    def countLeaves(in: Tree): Int = {
        in match {
            case null => 0
            case Node(n, l, r) => {
                countLeaves(l) + countLeaves(r)
            }
            case Leaf(n) => 1
        }
    }

    def testCountLeaves() = {
        val tree: Tree = Node(1, Node(2, Leaf(3), Leaf(4)), Node(5, Leaf(6), Leaf (7)))
        assert(countLeaves(tree) == 4)

        assert(countLeaves(null) == 0)
    }

    def sumOddLevels(in: Tree, levelNum: Int): Int = {
        if (in == null) {
            0
        } else {
            in match {
                case Node(n, l, r) => {
                    var sum: Int = 0
                    if (levelNum % 2 == 1) {
                        sum += n
                    }

                    sum += (sumOddLevels(l, levelNum + 1) + sumOddLevels(r, levelNum + 1))
                    
                    sum
                }

                case Leaf(n) => {
                    if (levelNum % 2 == 1) {
                        n
                    } else {
                        0
                    }
                }
            }
        }
    }

    def testSumOddLevels() = {
        val tree1: Tree = Node(1, Node(2, Leaf(3), Leaf(4)), null)
        assert(sumOddLevels(tree1, 0) == 2)

        val tree2: Tree = Node(1, Node(2, Leaf(3), Leaf(4)), Node(5, Leaf(6), Leaf (7)))
        assert(sumOddLevels(tree2, 1) == 21)
    }
}

abstract class Tree
case class Node(num: Int, left: Tree, right: Tree) extends Tree
case class Leaf(num: Int) extends Tree

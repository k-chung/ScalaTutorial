object Exercise3 {
    def main(args: Array[String]) = {
        testSearchTree()
        testCountLeaves()
        testSumOddLevels()

        println("Success!")
    }

    // return true if the value is in it
    def searchTree(search: Int, in: Tree): Boolean = {

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

    }

    def testCountLeaves() = {
        val tree: Tree = Node(1, Node(2, Leaf(3), Leaf(4)), Node(5, Leaf(6), Leaf (7)))
        assert(countLeaves(tree) == 4)

        assert(countLeaves(null) == 0)
    }

    def sumOddLevels(in: Tree, levelNum: Int): Int = {

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

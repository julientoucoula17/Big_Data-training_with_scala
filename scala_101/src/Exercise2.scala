object Exercise2 {

  // Filter a list of strings by values that begin with a given string and have a max length
  def filterList(inputList: List[String], beginsWith: String, maxLength: Int): List[String] = {
    inputList
      .filter(str => str.startsWith(beginsWith))
      .filter(str => str.length <= maxLength)
  }

  def main(args: Array[String]): Unit = {
    val list = List("penguin", "pentagon", "shape", "pen", "shopping", "pent", "shining")

    println(filterList(list, "p", 4))
    println(filterList(list, "pen", 10))
    println(filterList(list, "sh", 5))
  }

}


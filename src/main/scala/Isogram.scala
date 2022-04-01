object Isogram {


  def isIsogram(s: String) = {
    // case-insensitive
    val word = s.toLowerCase()

    // remove duplicates (allow hyphens and spaces to repeat though)
    val noDuplicates = word.foldLeft(""){(chars, c) =>
      chars.contains(c) match {
        case true => if(c == '-' || c == ' ') chars + c else chars
        case _ => chars + c
      }
    }

    word.length == noDuplicates.length
  }




    // remove duplicates and check size
//    word.size == word.toSet.size
//    }

}

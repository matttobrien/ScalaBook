object TryCatchFinally extends App {
  var text = ""
  try {
    text = openAndReadAFile("filename")
  } catch {
    case e: FileNotFoundException => println("Couldn't find that file.")
    case e: IOException => println("Had an IOException trying to read that file")
  } finally {
    // create file etc.
  }
}

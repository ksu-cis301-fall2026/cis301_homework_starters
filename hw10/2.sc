// #Sireum #Logika
//@Logika: --manual 

//YOU DO THIS
//FIRST, write an appropriate function contract (think about what multExample returns in terms of
  //its parameter.
//NEXT, add proof blocks in the multExample function and the test code
//When you finish, the assert statement should be verified

//You should not make any changes other than adding the function contract and the proof blocks

import org.sireum._
import org.sireum.justification._
import org.sireum.justification.natded.prop._

def multExample(x: Z): Z = {
  //WRITE FUNCTION CONTRACT

  var total: Z = x

  total = total + x*11

  total = total - 7*x

  return total
}

//////////// Test code (assert should hold when you finish) /////////////

val a: Z = 8

var test: Z = multExample(12-a)

assert(test == 20)

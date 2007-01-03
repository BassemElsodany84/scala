
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Wed Jan 03 13:46:54 CET 2007

package scala


/** <p>
 *    Function with 3 parameters.
 *  </p>
 *
 */
trait Function3[-T1, -T2, -T3, +R] extends AnyRef {
  def apply(v1:T1, v2:T2, v3:T3): R
  override def toString() = "<function>"

}

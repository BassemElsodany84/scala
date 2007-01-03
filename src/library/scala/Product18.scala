
/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2007, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |                                         **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id: genprod.scala 9543 2007-01-02 16:51:29Z emir $

// generated by genprod on Wed Jan 03 13:46:54 CET 2007

package scala

import Predef._

object Product18 {
  def unapply[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18](x: Product18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]): Option[Product18[T1, T2, T3, T4, T5, T6, T7, T8, T9, T10, T11, T12, T13, T14, T15, T16, T17, T18]] =
    Some(x)
}

/** Product18 is a cartesian product of 18 components
 */
trait Product18[+T1, +T2, +T3, +T4, +T5, +T6, +T7, +T8, +T9, +T10, +T11, +T12, +T13, +T14, +T15, +T16, +T17, +T18] extends Product {

  /**
   *  The arity of this product.
   *  @return 18
   */
  override def arity = 18

  /**
   *  Returns the n-th projection of this product if 0&lt;=n&lt;arity,
   *  otherwise null.
   *
   *  @param n number of the projection to be returned
   *  @return  same as _(n+1)
   *  @throws  IndexOutOfBoundsException
   */
  override def element(n: Int) = n match {
    case 0 => _1
    case 1 => _2
    case 2 => _3
    case 3 => _4
    case 4 => _5
    case 5 => _6
    case 6 => _7
    case 7 => _8
    case 8 => _9
    case 9 => _10
    case 10 => _11
    case 11 => _12
    case 12 => _13
    case 13 => _14
    case 14 => _15
    case 15 => _16
    case 16 => _17
    case 17 => _18
    case _ => throw new IndexOutOfBoundsException(n.toString())
  }

  /** projection of this product */
  def _1: T1

/** projection of this product */
  def _2: T2

/** projection of this product */
  def _3: T3

/** projection of this product */
  def _4: T4

/** projection of this product */
  def _5: T5

/** projection of this product */
  def _6: T6

/** projection of this product */
  def _7: T7

/** projection of this product */
  def _8: T8

/** projection of this product */
  def _9: T9

/** projection of this product */
  def _10: T10

/** projection of this product */
  def _11: T11

/** projection of this product */
  def _12: T12

/** projection of this product */
  def _13: T13

/** projection of this product */
  def _14: T14

/** projection of this product */
  def _15: T15

/** projection of this product */
  def _16: T16

/** projection of this product */
  def _17: T17

/** projection of this product */
  def _18: T18


}

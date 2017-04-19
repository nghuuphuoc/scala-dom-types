package com.raquo.dombuilder.builders.nodes

import com.raquo.dombuilder.nodes.Element

/** A [[Tag]] is an [[Element]] Builder. This is a builder of [[Tag]]s. */
trait TagBuilder[+El <: Element[N, R], N, +R] {

  def tag(tagName: String): Tag[El, N, R]
}

package dev.insideyou
package playground

export org.scalacheck.Arbitrary
export org.scalacheck.Cogen
export org.scalacheck.Gen

trait TestSuite extends munit.DisciplineSuite, Expectations

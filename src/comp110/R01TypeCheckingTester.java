/*
 * This is a TESTER file. Run it to check your worksheet. DO NOT MODIFY THIS FILE!
 * 
 * Similarly to our Runner classes, there are some advanced concepts and "magic"
 * being put to use in our Tester classes. Don't get anxious looking at this code,
 * you can completely ignore it for now, in fact.
 * 
 * Later on this semester we will learn more about how you can write tests like
 * these in order to check your own work. Writing code that checks code is pretty
 * advanced stuff :)
 */

package comp110;

import org.junit.Before;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class R01TypeCheckingTester {

  R01TypeCheckingWorksheet _worksheet;
  R01TypeCheckingAnswerKey _answerKey;

  @Before
  public void setUp() throws Exception {
    _worksheet = new R01TypeCheckingWorksheet();
    _answerKey = new R01TypeCheckingAnswerKey(_worksheet);
  }

  @Test
  public void p01TheJackson() {
    _answerKey.testP01TheJackson();
  }

  @Test
  public void p02ARapperConvertedToDollars() {
    _answerKey.testP02ARapperConvertedToDollars();
  }

  @Test
  public void p03WhatAndyCouldntRemember() {
    _answerKey.testP03WhatAndyCouldntRemember();
  }

  @Test
  public void p04DukeScoreOnFebruary17th() {
    _answerKey.testP04DukeScoreOnFebruary17th();
  }

  @Test
  public void p05TheAreaOfASquare() {
    _answerKey.testP05TheAreaOfASquare();
  }

  @Test
  public void p06MajorKeyToSuccessInCOMP110() {
    _answerKey.testP06MajorKeyToSuccessInCOMP110();
  }

  @Test
  public void p07MyPartnersFirstName() {
    _answerKey.testP07MyPartnersFirstName();
  }

  @Test
  public void p08YearsAtUNC() {
    _answerKey.testP08YearsAtUNC();
  }

  @Test
  public void p09AnOddBinarySearch() {
    _answerKey.testP09AnOddBinarySearch();
  }

  @Test
  public void p10CalculateAge() {
    _answerKey.testP10CalculateAge();
  }

  @Test
  public void p11YearBorn() {
    _answerKey.testP11YearBorn();
  }

  @Test
  public void p12ThePerimeterOfASquare() {
    _answerKey.testP12ThePerimeterOfASquare();
  }

  @Test
  public void p13AnotherMajorKeyToSuccessInCOMP110() {
    _answerKey.testP13AnotherMajorKeyToSuccessInCOMP110();
  }

}

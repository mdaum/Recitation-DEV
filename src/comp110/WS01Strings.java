package comp110;

/**
 * Worksheet 01 - Strings
 * 
 * In this recitation we will introduce the String class and its most useful
 * methods.
 */

public class WS01Strings {

  /*
   * GUIDED SECTION
   * 
   * We will work through these problems together in recitation.
   */

  /**
   * Problem 1
   * 
   * Finish a method that returns the year UNC was founded as a String.
   * 
   */
  String p01YearCarolinaFounded() {
    return "";
  }

  /**
   * Problem 2
   * 
   * It's in bad manners to type as if one is "yelling" on the internet and I
   * don't know about you, but this seems to be the only way my parents know how
   * to text. Let's complete a method that converts our input parameter String
   * to "yelling".
   * 
   */
  String p02Yelling(String someString) {
    return "";
  }

  /**
   * Problem 3
   * 
   * A compound word is a combination of two words that when combined has a new
   * meaning. A few compound words I can think of off the top of my head are
   * flowerpot, quarterback, and catfish. Let's finish a compound word maker
   * method that takes in two words and produces a compound word.
   * 
   */
  String p03CompoundWordMaker(String word1, String word2) {
    String compoundWord = "";
    return compoundWord;
  }

  /**
   * Problem 4
   * 
   * When alphabetizing books, one always looks at the first letter of the book
   * title. Let's complete a method to return the first letter given a book
   * title as a parameter.
   * 
   */
  char p04FirstLetter(String bookTitle) {
    return '/';
  }

  /**
   * Problem 5
   * 
   * Initialism is an abbreviation of a phrase of words formed by the first
   * initials of each word in the phrase. Two examples of initialisms are CD for
   * Compact Disc and TWC for Time Warner Cable. We are going to finish a method
   * that given a three word phrase, returns the corresponding initialism. Note
   * that initialisms are written in all caps.
   * 
   */
  String p05Initialism(String threeWordPhrase) {
    String firstLetter = "";
    String secondLetter = "";
    String thirdLetter = "";
    String initial = firstLetter + secondLetter + thirdLetter;
    return "";
  }

  /*
   * TEAMWORK SECTION
   * 
   * Work on the following problems with your partner or small group. Note that
   * everyone must submit their own worksheet.
   */

  /**
   * Problem 6
   * 
   * Finish a method that fills in the blank to these song lyrics:
   * 
   * Just a small town girl Livin' in a lonely world She took the _______ train
   * Goin' anywhere Just a city boy Born and raised in South Detroit He took the
   * _______ train Goin' anywhere
   * 
   */
  String p06SongLyricBlank() {
    return "";
  }

  /**
   * Problem 7
   * 
   * Let's finish a method that takes in a firstName String and lastName String
   * and returns one String that shows this persons's complete name. Note that
   * first and last names have a space in between. (i.e. "CarolFolt" vs.
   * "Carol Folt")
   * 
   */
  String p07FullName(String firstName, String lastName) {
    return "";
  }

  /**
   * Problem 8
   * 
   * Tweets hold tons and tons of information and have become a recent focus of
   * the Computer Science sub-discipline of Text Mining. Computers are used to
   * analyze tweets on a very large scale. One important facet of a tweet is the
   * hashtag and computers can parse tweets by their hashtag. The first step to
   * this process is finding the location in the tweet of the first hashtag,
   * '#'. Let's finish a method that produces the index of the first '#'.
   * 
   */
  int p08FirstHashtagLocation(String tweet) {
    return 0;
  }

  /**
   * Problem 9
   * 
   * Our initialism method is pretty cool, but it would be nice to know how many
   * characters it is actually saving us. Given a three word phrase, calculate
   * the difference between its original length and the length of it written as
   * an initialism.
   * 
   * Extra challenge: Instead of hardcoding the length of the initialism, use
   * our previously completed method to convert the phrase to an initialism and
   * then find the length.
   * 
   */
  int p09InitialismLengthDifference(String threeWordPhrase) {
    return 0;
  }

  /**
   * Problem 10
   * 
   * We have a WS01Calculator class and have been working on writing the methods
   * for this class, but we know that sometimes math can be a little hard. We
   * want to use Strings to make sure our WS01Calculator class's multiply method
   * is functioning correctly. A WS01Calculator object, called myCalc, has
   * already been initialized for you. Finish a method that returns:
   * 
   * "We found that __ times __ is: __"
   * 
   * where the first blank is the argument for our parameter x, the second blank
   * is the argument for our parameter y, and the third blank is the value
   * returned when multiply is called on myCalc with arguments x and y.
   * 
   * Do you think the WS01Calculator's multiply method is working correctly?
   */

  String p10CalculatorDebugger(int x, int y) {
    WS01Calculator myCalc = new WS01Calculator();
    int multiplyResult = 0; // replace 0 with the value returned by the multiply
                            // method
    return "";
  }

  /**
   * Problem 11
   * 
   * Pig Latin is a language game in which English words are altered. Depending
   * on how the word begins, there are slightly different rules for converting
   * it to Pig Latin. We will only be working with words that have a single
   * letter before their first vowel and begin with a consonant sound. The rules
   * are as follows: 1.) The single letter before the initial vowel is placed at
   * the end. 2.) Then 'ay' is added to the end.
   * 
   * Ex. 'pig' -> 'igpay' and 'happy' -> 'appyhay'
   * 
   */
  String p11PigLatin(String originalWord) {
    return "";
  }

  /*
   * CHALLENGE QUESTION SECTION
   * 
   * This question is optional. We encourage you to try it out!
   */

  /**
   * Problem 12
   * 
   * Have you heard of Joe Jonas's new band? My roommate likes to play their
   * song "Cake By the Ocean" at least four times a day. The band is called DNCE
   * (i.e. dance but in all caps and without the 'a'). Let's use a few different
   * String methods to DNCE-ify any String inputted into the method. Note that
   * we can assume the input string will have at least one 'a'. The steps to
   * DNCE-ify a word are as follows: 1.) Remove the FIRST 'a' occuring in the
   * word. 2.) Capitalize the resulting word.
   * 
   */
  String p12DNCEIfy(String originalWord) {
    return "";
  }
}
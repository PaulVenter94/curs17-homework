package ro.fasttrackit.curs17Homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RecursiveMethodsTest {
    RecursiveMethods recursiveMethods;

    @BeforeEach
    void setup() {
        recursiveMethods = new RecursiveMethods();
    }

    @Test
    @DisplayName("sum(1)=1")
    void sumForValue1() {
        assertThat(recursiveMethods.sum(1)).isEqualTo(1);
    }

    @Test
    @DisplayName("When negative number THEN throw exception")
    void negativeParam() {
        assertThrows(IllegalArgumentException.class, () -> recursiveMethods.sum(-1));
    }

    @Test
    @DisplayName("sum(10)=55")
    void sumTen() {
        assertThat(recursiveMethods.sum(10)).isEqualTo(55);
    }

    @Test
    @DisplayName("evenSum(1)=1")
    void evenSumFor1() {
        assertThat(recursiveMethods.evenSum(1)).isEqualTo(1);
    }

    @Test
    @DisplayName("evenSum(6)=9")
    void evenSumFor6() {
        assertThat(recursiveMethods.evenSum(6)).isEqualTo(9);
    }

    @Test
    @DisplayName("When given palindrome THEN return true")
    void palindromeTest() {
        assertTrue(recursiveMethods.revPalindrome("potop"));
    }

    @Test
    @DisplayName("When not given a palindrome THEN return false")
    void notPalindromeTest() {
        assertFalse(recursiveMethods.revPalindrome("notAPalindrome"));
    }

    @Test
    @DisplayName("When given palindrome for isPalindrome method THEN return true")
    void palindromeTestIsPalindromeMethod() {
        assertTrue(recursiveMethods.isPalindrome("potop"));
    }

    @Test
    @DisplayName("When not given a palindrome for isPalindrome method THEN return false")
    void notPalindromeTestforIsPalindromeMethod() {
        assertFalse(recursiveMethods.isPalindrome("notAPalindrome"));
    }

    @Test
    @DisplayName("digitSum(8)=8")
    void simpleDigitSum() {
        assertThat(recursiveMethods.digitSum(8)).isEqualTo(8);
    }

    @Test
    @DisplayName("digitSum(1053)=9")
    void digitSum() {
        assertThat(recursiveMethods.digitSum(12345)).isEqualTo(15);
    }
}
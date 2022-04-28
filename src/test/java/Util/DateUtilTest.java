package Util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class DateUtilTest {
    @Test
    public void whenIsLeapYearThenAssertTrue() {
        assertTrue(DateUtil.isLeapYear(2004));
    }

    @Test
    public void whenIsNotLeapYearThenAssertFalse() {
        assertFalse(DateUtil.isLeapYear(1999));
    }
    @Test
    public void whenIsCenturyYearThenIsLeapYearAssertFalse(){
        assertFalse(DateUtil.isLeapYear(1900));
    }
    @Test
    public void when2000ThenIsLeapYearAssertTrue(){
        assertTrue(DateUtil.isLeapYear(2000));
    }
}
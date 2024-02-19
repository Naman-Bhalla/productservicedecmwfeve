package com.scaler.productservicedecmwfeve;

import com.scaler.productservicedecmwfeve.controllers.ProductController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

import static org.junit.jupiter.api.Assertions.*;

//@SpringBootTest
public class RandomTest {
//
//    @Autowired
//    private ProductController productController;
//
//    @Test
//    void testOnePlusOneIsTwo() {
//        // act
//        int i = 1 + 1;
//
//        // assert
//        assert i == 2;
//        assert i * i == 4;
//
////        assertTrue(i == 2);
////
////        assertEquals(i, 2);
//////        assertThrows()
//////        assertTrue();
//////            assert i == null;
////            assertNull(i);
////
////            int[] ans = rotatedArray([1, 2, 3, 4]);
////            int[] expectedAns = [5, 3, 2, 1];
////
////            for (int i = 0; i < ans.length; ++i) {
////                assert ans[i] == expectedAns[i];
////            }
////
////            assertArrayEquals(expectedAns, ans);
////
////            assertTimeout(
////                    Duration.of(2L, SECONDS),
////                    someMethod()
////            );
////
////            assertInstanceOf(
////                    Pigeon.class,
////                    BirdFactory.getByName("Pigeon")
////            );
////
////        assertInstanceOf(
////                Penguin.class,
////                BirdFactory.getByName("Penguin")
////        );
//
////        assert i == 3;
//        i = 7;
//
//        assertEquals(2, i);
//    }
//
//
//    @Test
//    void testTwoTwoZaFour() {
//        int i = 2 * 2;
//
//        assertEquals(
//                4,
//                i
//        );
//    }
}

// a test case is nothing but a method
// test case method is doing: AAA
// -> arrange
// -> act
// -> assert
// A test case fails if any of the assertions within
// the test case fails

// We may want to have other kind of assertions as
// well:
// assert if the correct type of exception is
// being thrown
// what is expected should be first parameter, what is the ans should be seocnd

// Break till 10:12 PM

// java -jar name-of-jar.jar
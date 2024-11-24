// package BasicMaths.ArmstrongNumber;

// class ArmStrongNumbersTest {

//     ArmStrongNumbers armStrongNumbers = new ArmStrongNumbers();

//     @Test
//     void testSingleDigitNumbers() {
//         assertTrue(armStrongNumbers.numCheck(0), "0 is an Armstrong number");
//         assertTrue(armStrongNumbers.numCheck(1), "1 is an Armstrong number");
//         assertTrue(armStrongNumbers.numCheck(9), "9 is an Armstrong number");
//     }

//     @Test
//     void testThreeDigitArmstrongNumbers() {
//         assertTrue(armStrongNumbers.numCheck(153), "153 is an Armstrong number");
//         assertTrue(armStrongNumbers.numCheck(370), "370 is an Armstrong number");
//         assertTrue(armStrongNumbers.numCheck(371), "371 is an Armstrong number");
//         assertTrue(armStrongNumbers.numCheck(407), "407 is an Armstrong number");
//     }

//     @Test
//     void testNonArmstrongNumbers() {
//         assertFalse(armStrongNumbers.numCheck(10), "10 is not an Armstrong number");
//         assertFalse(armStrongNumbers.numCheck(123), "123 is not an Armstrong number");
//         assertFalse(armStrongNumbers.numCheck(500), "500 is not an Armstrong number");
//     }

//     @Test
//     void testFourDigitArmstrongNumbers() {
//         assertTrue(armStrongNumbers.numCheck(9474), "9474 is an Armstrong number");
//     }

//     @Test
//     void testLargeNonArmstrongNumbers() {
//         assertFalse(armStrongNumbers.numCheck(9475), "9475 is not an Armstrong number");
//         assertFalse(armStrongNumbers.numCheck(10000), "10000 is not an Armstrong number");
//     }

//     @Test
//     void testNegativeNumbers() {
//         assertFalse(armStrongNumbers.numCheck(-153), "-153 is not an Armstrong number");
//         assertFalse(armStrongNumbers.numCheck(-1), "-1 is not an Armstrong number");
//     }

//     @Test
//     void testEdgeCases() {
//         assertTrue(armStrongNumbers.numCheck(0), "0 is an Armstrong number (edge case)");
//         // assertFalse(armStrongNumbers.numCheck(Integer.MAX_VALUE), "Integer.MAX_VALUE is not an Armstrong number");
//         // assertFalse(armStrongNumbers.numCheck(Integer.MIN_VALUE), "Integer.MIN_VALUE is not an Armstrong number");
//     }
// }

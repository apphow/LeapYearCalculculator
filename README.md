# LeapYearCalculator
# Challenge from Tim Buchalka's Java Programming Masterclass for Software Developers course
Write a method isLeapYear with a parameter of type int named year.

The parameter needs to be greater than or equal to 1 and less than or equal to 9999.

If the parameter is not in that range return false.

Otherwise, if it is in the valid range, calculate if the year is a leap year and return true if it is a leap year, otherwise return false.

To determine whether a year is a lepa year, follow these steps:
1. If the year is evenly divisible by 4, go to step 2. Otherwise, go to step 5.
2. If the year is evenly divisible by 100, go to step 3. Otherwise, go to step 4.
3. If the year is evenly divisible by 400, go to step 4. Otherwise, go to step 5.
4. The year is a leap year (it has 366 days). The method isLeapYear needs to return true.
5. The year is not a leap year (it has 365 days). The method isLeapYear need to return false.

Examples of input/ouput:
  * isLeapYear(-1600); -> should return false since the parameter is not in range (1-9999)
  * isLeapYear(1600); -> should return true since 1600 is a leap year
  * isLeapYear(2017); should return false since 2017 is not a leap year
  * isLeapYear(2000); -> should return true because 2000 is a leap year
  
  NOTE: The method isLeapYear needs to be defined as public static.
  NOTE: Do not add a main method to solution code.

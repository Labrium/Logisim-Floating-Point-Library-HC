# Floating Point Library for [Logisim-Evolution (Holy Cross Edition)](https://github.com/kevinawalsh/logisim-evolution/)

After experiencing the incredible performance of [Kevin Walsh](https://github.com/kevinawalsh/)'s fork of [Logisim-Evolution](https://github.com/logisim-evolution/logisim-evolution/), I concluded that the only thing that is missing is floating point support. This small port brings [cheese3660](https://github.com/cheese3660/)'s [Logisim-Floating-Point-Library](https://github.com/cheese3660/Logisim-Floating-Point-Library/) to Logisim-Evolution HC.

It adds:

 * A floating point to binary converter
 * A binary to floating point converter
 * A floating point adder
 * A floating point subtractor
 * A floating point divider
 * A floating point multiplier
 * A floating point modulus calculator
 * Floating point trig functions
 * A floating point square rooter
 * A floating point probe
 * A floating point comparator
 * And a floating point constant

## Usage

In Logisim-Evolution:

1. Go to Project > Load Library > JAR Library...
2. Choose the IEEE754.jar
3. Enter ```com.cheese.IEEE754.IEEE754``` when it asks for a class name.

## Build

From the command line:

```bash
javac -d ./build -classpath PATH/TO/logisim-evolution.jar ./src/com/cheese/IEEE754/*.java
cd ./build
jar cvf IEEE754.jar *
```

# Vending Machine

One of my Java projects from my TXST Spring 2022 Object-Oriented Design & Programming course at TXST. 

## Description 

Java program that simulates a real vending machine using the code and OOP/SOLID principles I learned in class. The vending machine comprises four trays offering snacks priced between $1.00 and $1.75. Users can deposit (D/d), vend (V/v), request change (C/c), or quit (Q/q). Deposits accept quarters (Q/q), dimes (D/d), or nickels (N/n) denoted by D[coin]. Vending requires sufficient funds and is denoted by V[tray number]. The change option returns unused coins.

## Getting Started

### Dependencies

* Java Development Pack 
* Java Extension Pack (Visual Studio Code)

### Installing

* Download the zip file on GitHub
* Clone repository
* Fork repository

### Executing program

Open the terminal and in the root directory of the program type this command to compile: 
```
javac Main.java
```
Then type this command to run the program:
```
java Main
```

## Author

Aide Cuevas (LinkedIn in profile)

## Version History

*0.2
    * Fixed the typo error with the deposite option
    * Fixed the typo error in CoinChecker addVaild() function with change option
    * Fixed the char to int value conversion of digit in the vending option
    * Able to run correctly 

* 0.1
    * Errors with the Change and Vending functionality when running the program
    * When selecting the "change" option, instead of dispensing the list of coins (quarters, dimes, or nickels), it just resets the user's balance to zero.
    * When selecting the vend option, an error message would appear indicating the inability to convert the entered character digit into an integer variable.
    * Deposite option did not working

## License

This project is licensed under the MIT License - see the LICENSE.md file for details

## Acknowledgments 

Inspiration, code snippets, etc.
* Mr. Charles Rick King, TXST Object-Oriented Design & Programming - CS3354
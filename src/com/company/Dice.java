package com.company;
import java.util.Random; //library for Random keyword


//This is the Dice class and it is public
public class Dice
{
    //the static variable sidesOfDice is static because there are only 6 sides of the dice
    static int sidesOfDice = 6;


    //the faceValue is an instance variable because it will change and is set at 0 because the face value will change with each roll
    int faceValue = 0;

    //this is an instance method that allows you to roll a single die since this method is called on by a specific object the keyword this is used---it belongs to the object called by this method
    public int roll()
    {
        Random rand = new Random();
        this.faceValue = rand.nextInt(sidesOfDice) + 1;
        return this.faceValue;
    }

    //this is the static method that allows you to change the number of sides on the dice
    public static void changeNumSidesOfDice(int newNumberOfSides)
    {
        Dice.sidesOfDice = newNumberOfSides;
    }

    //this is an instance method that gets the face value
    public int getFaceValue()
    {
        return this.faceValue; //since this method is called on by a specific object the keyword this is used ---it belongs to the object called by this method
    }
}

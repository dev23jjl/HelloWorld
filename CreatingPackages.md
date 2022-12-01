# 📦 Creating Packages 
#### 📽️ A Trip to the Movie Theater
*Project by James Johanningmeier*

![Image of an empty movie theater](https://images.unsplash.com/photo-1595769816263-9b910be24d5f?ixlib=rb-4.0.3&ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&auto=format&fit=crop&w=1179&q=80 "Image of an empty movie theater")

##### 🧩 The Situation
After passing your semester exams, you decided that you should find a way to treat yourself. Since you have a busy weekend ahead, you decide that whatever you do, you should do it sometime next week. Being a big fan of Star Wars and given that a new one just came out, you decide to check your local theater to see if and when they will be showing the movie. Turns out, the soonest you can go see the film is on Monday, with the showing time at 7:00 PM. Being impatient and not wanting to wait (and also given that they won't be showing the movie anymore after Wednesday), you reserve tickets for Monday. It ends up costing you $12 in total. You look at the checkout section and see that a ticket costs $10, and food costs an extra $5, but you got a discount for being a student, so it ended up costing $3 less than what it could have. You decide to explore what other discounts there are, and it turns out that there are also family discounts and discounts on certain days of the week, however, only one discount is applicable at a time, so even if you did wait until Wednesday, it wouldn't affect the price because the day discount is less than the student discount. With this, you wonder how the application calculates the price (given the discounts) and since you just happen to be learning Java, you start thinking about how you could program this scenario...

##### 📄 Summarizing the Scenario
Now that we have a situation and you puzzling over how to represent this scenario in Java, how could we represent this? Since we're dealing with different discounts, that subtract specific amounts from a base price, we can use multiple classes based on a parent class to represent this. Since all of these pieces are interconnected, we'll need to use a package to group these files. Given this, let's work on the first part of our scenario - the base price.

##### 💰 The Base Price of a Ticket
In our scenario, we have the ticket (to watch the movie) and the food (because you'll be hungry 😋) which are both parts of the base price. Therefore, we'll need to create a variable for the price of the ticket and the price of the food. We should keep them separate so they can be individually modified if the pricing changes. We also need a class, of course, to hold our code. In this case, we'll call the class "BasePrice" and the variables "basePrice" and "foodCost" (both of which we'll represent using the integer data type). Finally, we'll create a method using the variable name "getTicketPrice" that calculates that overall cost by setting the value of a variable called "ticketPrice" to the sum of "basePrice" and "foodCost" to return the variable "ticketPrice." Let's take a look at our Java file which represents this scenario!

```java
/// BasePrice.java
package MovieTheaterPackage;

public class BasePrice {
    public int basePrice = 10;
    public int foodCost = 5;
    

    public int getTicketPrice(int basePrice, int foodCost) {
        int ticketPrice = basePrice + foodCost;
        return ticketPrice;
    }
}
```
As you can see, the Java program instantiates our variables and calculates them. Also notice the first line of code, which declares that this program is part of a package called "MovieTheaterPackage" - our program BasePrice.java will be the parent class in our package.

##### 🤑 Extending the Program by Calculating Discounts
Now that we have our parent class, let's work on the subclasses that we'll be creating to extend our BasePrice program to perform discounts on the base price. We'll have three discounts, one for certain days of the week, one for students, and one for families. For this, we'll create three new classes to perform these calculations. We'll call them "DayDiscount", "StudentDiscount", and "FamilyDiscount." Let's start by examining the Java program I wrote to represent the discount available on certain days of the week.

```java
/// DayDiscount.java
package MovieTheaterPackage;

public class DayDiscount extends BasePrice {
    public String discountDays[] = {"Wednesday", "Saturday", "Sunday"};
    public String today = "Monday";
    public int discountAmount = 2;

    public boolean checkIsDiscounted(String today, String discountDays[]) {
        boolean isDiscounted;
        for (int x = 0; x < 3; x++) {
            if (today == discountDays[x]) {
                isDiscounted = true;
            } else {
                isDiscounted = false;
            }
        }
        return isDiscounted;
    }

    public int getDayDiscount(boolean isDiscounted, int ticketPrice, int discountAmount) {
        if (isDiscounted == true) {
            ticketPrice -= discountAmount; 
        } else {
            ticketPrice -= 0;
        }
        return ticketPrice;
    }
}
```

In this program, I started by including that it will be included in our package, "MovieTheaterPackage." Then, I continued by declaring the class, "DayDiscount" which extends the parent class "BasePrice." Then, I instantiated an array to hold the values of the days which have discounts, a string to hold the value of the day that the person in the example got tickets for, a boolean for whether or not the price will be discounted, and an integer for the amount that will be discounted if it is a discount day. Next, a method returns the boolean as true or false depending on whether it is a discount day or not. It uses a for loop to iterate through the values of the "discountDays" array and an if-else statement to determine whether or not the value of today matches one of the values in the array. The method returns a boolean. Next, a second method is defined that determines the ticket price. It uses an if-else statement to determine whether the price should be discounted or not. It returns our discount price as an integer. Next, let's examine our student discount.

```java
///StudentDiscount.java
package MovieTheaterPackage;

public class StudentDiscount extends BasePrice {
    public boolean isStudent = true;
    public int studentDiscount = 3;

    public int getStudentPrice(boolean isStudent, int studentDiscount, int ticketPrice) {
        if (isStudent == true) {
            ticketPrice -= studentDiscount;
        } else {
            ticketPrice -= 0;
        }
        return ticketPrice;
    }
}
```
Here, I created another class in the package, "MovieTheaterPackage" that extends the "BasePrice" class called "StudentDiscount." It initiates a boolean that represents the example person in our situation which shows that they are a student. It also includes an integer variable that holds the amount of the discount if the person is a student. Then, I used a method that uses an if-else statement to determine if the boolean "isStudent" is true or not. If it is true, "studentDiscount" is subtracted from the variable "ticketPrice." This method, once again, returns our integer of "ticketPrice." Let's finish by examining the last class for a family discount.

```java
///FamilyDiscount.java
package MovieTheaterPackage;

public class FamilyDiscount extends BasePrice {
    public boolean isFamily = false;
    public int familySize = 0;
    public int familyDiscountAmount = 1;

    public int getFamilyDiscount(boolean isFamily, int familySize, int familyDiscountAmount, int ticketPrice) {
        if (isFamily = true) {
            ticketPrice -= (familyDiscountAmount * familySize);
        } else {
            ticketPrice -= 0;
        }
        return ticketPrice;
    }   
}
```
Finally, I created a class to represent a discount for families that discounts $1 per family member. The class is included in the "MovieTheaterPackage" and extends the "BasePrice" class. I started by instantiating a boolean to determine whether or not the moviegoers consisted of a family (in the example above, this is false). I also instantiated variables for the size of the family and the amount of the discount per member ($1). Then, I created a method that uses an if-else statement to determine if the boolean "isFamily" is true. If so, the "ticketPrice" variable is subtracted by the product of the variables "familyDiscountAmount" and "familySize." Regardless, the method returns the variable ticketPrice.

##### 🏳️ Conclusion
Through all of this, we created a package of classes to represent a real-world scenario. We used a multitude of different pieces of Java syntax, such as classes, extended classes, variables (including strings, arrays, integers, and booleans), for-loops, if-else statements, and methods. While a theater probably would not use this code (let alone the programming language we used), it's probably good that they wouldn't because this code was not verified to compile correctly. While it does represent the scenario correctly and uses correct syntax, it could not work, especially depending on how it would be used. In other words, it would need to be modified, and the good thing is, it can be - the variables could be changed to represent an actual theater's prices and the package could be modified to work differently and be used in a program that would actually do something. For now, though, it meets the requirements of a project and examines how one could represent a unique scenario - in Java.

[Link to Official, Published Project](https://collectednotes.com/dev23jjl/creating-packages)
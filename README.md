#Useful references:
1. http://joelabrahamsson.com/a-simple-example-of-the-openclosed-principle/ by Joel Abrahamsson
2. http://www.artima.com/weblogs/viewpost.jsp?thread=331531 by Christopher Diggins

#1. Open/Close principle
:  This Code is about the factory to produce each bakery. When they process the bakery you can process only one  time and they factory at the same factory. Adding same ingredients but somethings different. Sometimes you not want to change the default setting in the factory but You can configure it when you extends for the sub bakery for facturing in this factory. like this:
##
##BakeryFactory.java

~~~~
import java.util.ArrayList;
import java.util.List;

public class BakeryFactory { 

private int amount;
private List<String> ingredients;

public BakeryFactory() {
this.amount = amount;
this.ingredients = new ArrayList<String>();
}

public void addIngredients(String ingredient) {
ingredients.add(ingredient);
}

public void showIngredients() {
System.out.println("Ingredients");
for(int i=0;i<ingredients.size();i++) {
System.out.println(ingredients.get(i));
}
}


public void process() {
System.out.println("processing");
}

public void finish() {
System.out.println("Finish " + this.getAmount() + " pieces");
}

public int getAmount() {
return this.amount;
}

public void setAmount(int amount) {
this.amount = amount;
}

}
~~~~
##

Processing is very important because it's using to producing the all bakeries in this factory. So i show how to apply this principle to not override and using open/close to manage the factory. I will show the Cakes and Cookies. 

##Cakes.java

~~~~
public class Cakes extends BakeryFactory{

public void process() {

System.out.println("Cakes");
System.out.println();
addIngredients("White Sugar");
addIngredients("Flour");
addIngredients("Eggs");
addIngredients("Butter");
addIngredients("cream");
addIngredients("Food Color");
setAmount(20);
showIngredients();
System.out.println("processing Cakes");
finish();
System.out.println();
}

}
~~~~

##Cookies.java

~~~~
public class Cookies extends BakeryFactory {

public void process() {

System.out.println("Cookies");
System.out.println();
addIngredients("Icing Sugar");
addIngredients("Flour");
addIngredients("Eggs");
addIngredients("Butter");
addIngredients("magarine");
addIngredients("chocship");
setAmount(10);
showIngredients();
System.out.println("processing Cakes");
finish();
System.out.println();
}

}
~~~~

##BakeryShop.java

~~~~
public class BakeryShop {

public static void main(String[] args) {

Cakes cake1 = new Cakes();
cake1.process();
Cookies cookie1 = new Cookies();
cookie1.process();


}
~~~~
From that you see the bakery shop using the principle by extends it to make the special process and permission to produce it. They don't modified the BakeryFactory but extends it for use. The BakeryShop create Cakes and Cokkies extends BakeryFactory to make it.'



#2. Don't repeat yourself
:  It's the principle that eliminate the same object in the different methods it's very easy to read and fixed it. Helping to save the runtime for the programming i will give the example like this:

##Computer.java

~~~~
public class Computer {

private int count;

public void hardware() {
System.out.println("Hardware");
processing();
finishrun();

}

public void software() {
System.out.println("Software");
processing();
finishrun();
}

public void processing() {
System.out.println("processing");
}

public void finishrun() {
System.out.println("finish");
}

}
~~~~

You see that i will fixed by calling methods not create the same object in the different methods by apply the DRYS principle. The before using this principle i do like this.

~~~~
public class Computer {

private int count;

public void hardware() {
System.out.println("Hardware");
System.out.println("processing");
System.out.println("finish");

}

public void software() {
System.out.println("Software");
System.out.println("processing");
System.out.println("finish");
}
~~~~

It's repeat the object and I think why create it repeat. YOou just only called the methods and easy to understand it.'

Factory Method Pattern
======================

A Factory Pattern or Factory Method Pattern says that just ***define an interface or abstract class for creating an object but let the subclasses decide which class to instantiate***. In other words, subclasses are responsible to create the instance of the class.

The Factory Method Pattern is also known as ***Virtual Constructor***.

> Advantages

* Factory Method Pattern allows the sub-classes to choose the type of objects to create.
* It promotes the loose-coupling by eliminating the need to bind application-specific classes into the code.

> Plan.java

```
package padamara.dp.factorypattern.demo1;

public abstract class Plan {
  protected double rate;

  abstract void getRate();

  public void calculateBill(int units) {
    System.out.println(units * rate);
  }
}

```
> CommercialPlan.java

```
package padamara.dp.factorypattern.demo1;

public class CommercialPlan extends Plan {

  @Override
  void getRate() {
    rate = 7.50;
  }

}

```
> DomesticPlan.java

```
package padamara.dp.factorypattern.demo1;

public class DomesticPlan extends Plan {

  @Override
  void getRate() {
    rate = 3.50;
  }

}

```
> InstitutionalPlan.java

```
package padamara.dp.factorypattern.demo1;

public class InstitutionalPlan extends Plan {

  @Override
  void getRate() {
    rate = 5.50;
  }

}

```
> GetPlanFactory.java

```
package padamara.dp.factorypattern.demo1;

public class GetPlanFactory {
  public Plan getPlan(String planType) {
    if (planType == null) {
      return null;
    }
    if (planType.equalsIgnoreCase("DOMESTICPLAN")) {
      return new DomesticPlan();
    } else if (planType.equalsIgnoreCase("COMMERCIALPLAN")) {
      return new CommercialPlan();
    } else if (planType.equalsIgnoreCase("INSTITUTIONALPLAN")) {
      return new InstitutionalPlan();
    }
    return null;
  }
}

```
> GenerateBill.java

```
package padamara.dp.factorypattern.demo1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GenerateBill {

  public static void main(String[] args) throws IOException {
    GetPlanFactory planFactory = new GetPlanFactory();
    System.out
        .println("Enter the name of plan for which the bill will be generated");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String planName = br.readLine();
    System.out
        .println("Enter the number of units for bill will be calculated");
    int units = Integer.parseInt(br.readLine());

    Plan p = planFactory.getPlan(planName);
    // call getRate and calculateBill method for DOMESTICPLAN
    System.out.println("Bill Amount for " + planName + " of " + units
        + "unit is");
    p.getRate();
    p.calculateBill(units);

  }

}

```


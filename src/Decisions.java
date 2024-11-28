import java.util.Scanner;

public class Decisions {
    public static void main(String[] args) {
//        boolean canFly = false;
//        boolean hasFeathers = true;
//
//        if (canFly && hasFeathers) {
//
//            System.out.println("likely a bird");
//
//        } else {
//
//            System.out.println("may still fly or have feathers, but definitely not both");
//
//            if (canFly) {
//                System.out.println("a rocket?");
//                System.out.println("time?");
//            } else {
//                System.out.println("an ostrich?");
//                System.out.println("galoshes?");
//            }
//
//            if (hasFeathers) {
//                System.out.println("a penguin?");
//                System.out.println("a boa?");
//            }
//        }
//        int place = 1;
//        String ribboncolor;
//
//        switch (place) {
//            case 1:
//                ribboncolor = "blue";
//                System.out.println("first place!");
//                break;
//            case 2:
//                ribboncolor = "red";
//                System.out.println("second place!");
//            case 3:
//                ribboncolor = "white";
//                System.out.println("third place!");
//            default:
//                ribboncolor = "unknown";
//        }
//
//        System.out.println(ribboncolor);

//        Scanner console = new Scanner(System.in);
//        System.out.print("Enter your patron level: ");
//        String patronLevel = console.nextLine()
//            .trim()
//            .toLowerCase();
//
//
//        //Switch cases "fall through" if there's no break keyword.
//        // Once a case matches, it runs the rest of the code/cases under the case value matched  until it hits a break.
//        System.out.printf("Patron perks for %s support:%n", patronLevel);
//
//        switch (patronLevel) {
//            case "platinum":
//                System.out.println("- one-on-one video chat.");
//            case "gold":
//                System.out.println("- signed ticket stub.");
//            case "silver":
//                System.out.println("- impersonal photograph");
//            case "bronze":
//                System.out.println("- my best wishes");
//        }


//Case clauses can be stacked. Since execution falls through when a case matches,
// we can group cases together to trigger one code block for several cases.
            String color = "blue";

            switch (color) {
                case "red":
                case "yellow":
                case "blue":
                    System.out.println("primary color");
                    break;
                case "green":
                case "purple":
                case "orange":
                    System.out.println("secondary color");
                    break;
                default:
                    System.out.println("regular color");
            }
            /* if statements are useful when:
            We are evaluating an expression, like x < 5, instead of checking a specific value.
            Conditions are complex.
            A range of values triggers a single code block.
            switch statements are useful when:
            We have a relatively small, fixed set of values to evaluate.
            Each value's branching is unique. */
    }
}


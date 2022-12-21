
/**
 *
 * @author Krishna Tripathi😎💥👌👌👌👌
 */
import java.util.*;
import java.io.*;
import java.awt.Desktop;
import java.text.SimpleDateFormat;
import java.util.Date;

interface Delivery {
    double deliveryCharges(double price);

    double speedDeliveryCharges(double price);

    double productCharges(double price);

}

class PrintingBill {
    public void Writing(double p1, double p2, double p3, double p4) {
        Scanner sc = new Scanner(System.in);
        try {
            File log = new File("ok.txt");

            PrintWriter fWriter = new PrintWriter(new FileWriter(log, false));

            fWriter.append(
                    "*************************************************************************************************************************");
            fWriter.append("\n");
            SimpleDateFormat f = new SimpleDateFormat();
            Date date = new Date();
            fWriter.append(f.format(date));
            fWriter.append("\n");
            fWriter.append("\n");
            fWriter.append("ALL PRICES DISPLAYED IS IN INR\n\n");

            fWriter.append(
                    "TOTAL COSTS OF PRODUCT ITEMS:                                                    ");
            String str = Double.toString(p1);
            fWriter.append(str);

            fWriter.append("\n");
            fWriter.append(
                    "TOTAL COSTS OF DELIVERY CHARGES:                                                    ");

            str = Double.toString(p2 - p1);
            fWriter.append(str);

            fWriter.append("\n");
            fWriter.append(
                    "TOTAL COSTS OF SPEED DELIVERY CHARGES:                                                    ");
            str = Double.toString(p3 - p2);
            fWriter.append(str);
            fWriter.append("\n");
            fWriter.append("TOTAL AMOUNT OF TAXES:                                                                ");
            str = Double.toString(p4 - p3);
            fWriter.append(str);
            fWriter.append("\n");
            fWriter.append("                             _______________________________________________________");
            str = Double.toString(p4);
            fWriter.append("\n");
            fWriter.append("FINAL PRICES                                                                " + str);

            fWriter.append("\n");
            fWriter.append("\n");
            fWriter.append("\n");
            fWriter.append("\n");
            fWriter.append("THANK YOU FOR SHOPPING WITH US :)🤗🤗🤗🤗🤗🤗");

            fWriter.close();

        } catch (IOException e) {
            System.out.println("ERROR0");
        }
        sc.close();

    }

    // public void clearFile() {
    // try {
    // FileWriter f = new FileWriter("ok.txt", false);
    // PrintWriter p = new PrintWriter(f, false);
    // p.flush();
    // p.close();
    // f.close();

    // } catch (Exception e) {
    // System.out.println("ERROR");
    // }
    // }

    public void OpeningBill() {
        try {

            File file = new File("ok.txt");
            if (!Desktop.isDesktopSupported()) {
                System.out.println("not supported");
                return;
            }
            Desktop desktop = Desktop.getDesktop();
            if (file.exists())
                desktop.open(file);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Pricing implements Delivery {
    public double deliveryCharges(double price) {

        System.out.println("EXTRA 100RS ADDED FOR DELIVERY AND SHIPPING CHARGES");
        price = price + 100;
        return price;
    }

    public double speedDeliveryCharges(double price) {
        System.out.println("DO YOU WANT TO SPEED UP YOUR DELIVERY?\n1. YES\n2. NO\nCHOOSE YOUR OPTION");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a == 1) {
            System.out.println("EXTRA 200RS ADDED FOR SPEED DELIVERY AND SHIPPING CHARGES");
            price = price + 200;
            return price;
        } else {
            return price;
        }

    }

    public double productCharges(double price) {
        System.out.println("TOTAL COSTS OF PRODUCT AND DELIVERY IS RS " + price);
        System.out.println("18% GST: " + 0.18 * price);
        price = price + 0.18 * price;
        return price;

    }
}

class Items {

    public double listing() {
        System.out.println(
                "CHOOSE FROM OUR HUGE VARIETY OF PRODUCTS:\nWE HERE AT DELIVERY DUDES GIVE YOU GUYS THE BEST QUALITY AT THE BEST PRICE BECAUSE YOU DESERVE THE BEST");

        double sum = 0;
        while (true) {
            System.out.println(
                    "1. FRUITS AND VEGETABLES\n2. FOOD GRAINS, OIL AND MASALA\n3. BAKERY, CAKES AND DAIRY\n4. BEVERAGES\n5. SNACKS\n6. EGGS, MEAT AND FISH\n\nCHOOSE YOUR OPTION\nENTER 0 TO EXIT AND PROCEED TO PAYMENT");
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();

            if (a == 1) {
                System.out.println(
                        "1. ONIONS 42RS/KG\n2. POTATOES 40RS/KG\n3. APPLES 115RS/KG\n4. MUSHROOM 200RS/KG\n\n CHOOSE YOUR OPTION\nENTER ZERO TO EXIT THIS SECTION");
                while (true) {
                    int b = sc.nextInt();
                    if (b == 1) {
                        sum += 42;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 2) {
                        sum += 40;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 3) {
                        sum += 115;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 4) {
                        sum += 90;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 0) {
                        break;
                    }
                }
            }
            if (a == 2) {
                System.out.println(
                        "1. ASHIRVAAD AATA 450RS/10KG\n2. POPULAR SUGAR 220RS/KG\n3. RAW PEANUTS 170RS/KG\n4. FORTUNE SUNFLOWER OIL 165RS/L\n\n CHOOSE YOUR OPTION\nENTER ZERO TO EXIT THIS SECTION");

                while (true) {
                    int b = sc.nextInt();
                    if (b == 1) {
                        sum += 450;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 2) {
                        sum += 220;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 3) {
                        sum += 170;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 4) {
                        sum += 165;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 0) {
                        break;
                    }
                }

            }
            if (a == 3) {
                System.out.println(
                        "1. AMUL PANEER 92RS/200G\n2. AMUL MILK 45RS/500ML\n3. TREAT CROSSIANT 62RS/PACK\n4. WHOLE WHEAT BREAD 39RS/LOAF\n\n CHOOSE YOUR OPTION\nENTER ZERO TO EXIT THIS SECTION");

                while (true) {
                    int b = sc.nextInt();
                    if (b == 1) {
                        sum += 92;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 2) {
                        sum += 45;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 3) {
                        sum += 62;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 4) {
                        sum += 39;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 0) {
                        break;
                    }
                }
            }
            if (a == 4) {
                System.out.println(
                        "1. RED LABEL TEA 502RS/KG\n2. COCA COLA 65RS/1.25L\n3. TROPICANA LITCHI 105RS/L\n4. NESCAFE COFFEE 150/50G\n\n CHOOSE YOUR OPTION\nENTER ZERO TO EXIT THIS SECTION");

                while (true) {
                    int b = sc.nextInt();
                    if (b == 1) {
                        sum += 502;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 2) {
                        sum += 65;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 3) {
                        sum += 105;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 4) {
                        sum += 150;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 0) {
                        break;
                    }
                }
            }
            if (a == 5) {
                System.out.println(
                        "1. DAIRY MILK MULTIPACK 140RS\n2. BRITANNIA NUTRI CHOICE DIGESTIVE 39RS\n3. HALDIRAM's BHUJIA SEV 117RS/L\n4. LAY's CHIPS MULTIPACK 60RS\n\n CHOOSE YOUR OPTION\nENTER ZERO TO EXIT THIS SECTION");
                while (true) {
                    int b = sc.nextInt();
                    if (b == 1) {
                        sum += 140;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 2) {
                        sum += 39;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 3) {
                        sum += 117;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 4) {
                        sum += 60;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 0) {
                        break;
                    }
                }

            }

            if (a == 6) {
                System.out.println(
                        "1. EGGS 75RS\n2. CHICKEN CURRY CUT WITHOUT SKIN 500g + CHICKEN BREASTS 292RS\n3. MUTTON 250g 329RS\n4. FISH FILLET 359RS\n\n CHOOSE YOUR OPTION\nENTER ZERO TO EXIT THIS SECTION");
                while (true) {
                    int b = sc.nextInt();
                    if (b == 1) {
                        sum += 75;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 2) {
                        sum += 292;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 3) {
                        sum += 329;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);
                    }
                    if (b == 4) {
                        sum += 359;
                        System.out.println("PRODUCT PRICE (TOTAL): " + sum);

                    }
                    if (b == 0) {
                        break;
                    }
                }
            }
            if (a == 0) {
                break;
            }

        }
        return sum;
    }

}

class Registration {

    public void register(String filepath) {
        Scanner sc = new Scanner(System.in);
        try {
            File log = new File("file.txt");
            System.out.println("ENTER USERNAME:");
            String username = sc.nextLine();
            System.out.println("ENTER PASSWORD:");
            String password = sc.nextLine();
            PrintWriter fWriter = new PrintWriter(new FileWriter(log, true));

            fWriter.append(username);
            fWriter.append(",");
            fWriter.append(password);
            fWriter.append("\n");
            fWriter.close();

            System.out.print("\033[H\033[2J");
            System.out.flush();
            System.out.println("NOW ENTER YOUR LOGIN CREDENTIALS");
            Login alpha = new Login();
            alpha.login("file.txt");

        } catch (IOException e) {
            System.out.println("ERROR0");
        }
        sc.close();

    }

    // method overloading used
    public void register(String password, String filepath) {
        Scanner sc = new Scanner(System.in);
        try {
            File log = new File("file.txt");
            System.out.print("ENTER USERNAME:");
            String username = sc.nextLine();

            PrintWriter fWriter = new PrintWriter(new FileWriter(log, true));

            fWriter.append(username);
            fWriter.append(",");
            fWriter.append(password);
            fWriter.append("\n");
            fWriter.close();

            System.out.print("\033[H\033[2J");
            System.out.flush();

            System.out.println("NOW ENTER YOUR LOGIN CREDENTIALS");
            Login alpha = new Login();
            alpha.login("file.txt");

            sc.close();
        } catch (IOException e) {
            System.out.println("ERROR3");
        }

    }

    public char[] generatePassword(int length) {
        String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String specialCharacters = "!@#$%^&*()[{}];:''<>./?";
        String numbers = "1234567890";
        String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
        Random random = new Random();
        char[] password = new char[length];

        password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
        password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
        password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
        password[3] = numbers.charAt(random.nextInt(numbers.length()));

        for (int i = 4; i < length; i++) {
            password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
        }
        for (int i = 0; i < password.length; i++) {
            System.out.print(password[i]);
        }
        System.out.print(" IS YOUR NEW PASSWORD\n");
        Registration mp1 = new Registration();
        String password1 = String.valueOf(password);
        mp1.register(password1, "file.txt");

        return password;
    }
}

class Login {
    private static Scanner x;

    public static void login(String filepath) {
        System.out.print("ENTER USERNAME:");
        Scanner sc = new Scanner(System.in);
        String username = sc.nextLine();

        System.out.print("ENTER PASSWORD:");
        String password = sc.nextLine();
        boolean found = false;
        String tempUser = " ";
        String tempPass = " ";
        try {
            x = new Scanner(new File(filepath));
            x.useDelimiter("[,\n]");

            while (x.hasNext() && !found) {
                tempUser = x.next();
                tempPass = x.next();
                if (tempUser.trim().equals(username.trim()) && tempPass.trim().equals(password.trim())) {
                    found = true;
                }

            }
            x.close();
            if (found == false) {
                System.out.println("WRONG CREDENTIALS\nTRY AGAIN");
            }
            if (found == true) {

                passwords p1 = new passwords();
                p1.CallingPrinter();

            }

        } catch (Exception e) {
            System.out.println("ERROR1");
            e.printStackTrace();
        }
        sc.close();
    }
}

public class passwords {

    public void CallingPrinter() {
        Items i1 = new Items();
        double costs = i1.listing(); // total product charges
        Delivery d1 = new Pricing();
        double new_costs = d1.deliveryCharges(costs); // product+delivery
        double new_new_costs = d1.speedDeliveryCharges(new_costs);// product+delivery+speed delivery
        double new_new_new_costs = d1.productCharges(new_new_costs);// product+delivery+speed delivery+gst
        PrintingBill p = new PrintingBill();

        p.Writing(costs, new_costs, new_new_costs, new_new_new_costs);

        p.OpeningBill();
        // p.clearFile();

    }

    public static void main(String[] args) {

        String filepath = "file.txt";
        System.out.print("1.REGISTER\n2.LOGIN\nCHOOSE YOUR OPTION:");
        Scanner sc = new Scanner(System.in);
        Registration mp = new Registration();
        Login mp1 = new Login();

        int a = sc.nextInt();

        if (a == 1) {

            System.out.print(
                    "WANT TO GENERATE AND REGISTER RANDOM PASSWORD FOR MAXIMUM SECURITY?\n1.YES\n2.NO\n");
            System.out.print("ENTER YOUR CHOICE:");
            int k = sc.nextInt();

            if (k == 1) {
                mp.generatePassword(10);

            }
            if (k == 2) {

                mp.register(filepath);

            }
            sc.close();

        }

        if (a == 2)

        {

            mp1.login(filepath);

        }
    }

}

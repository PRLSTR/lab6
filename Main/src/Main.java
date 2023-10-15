import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Customer customer = null;

        while (true) {
            System.out.println("Меню");
            System.out.println("1. Створити користувача");
            System.out.println("2. Вивести інформацію про користувача");
            System.out.println("3. Створити модель");
            System.out.println("4. Створити замовлення");
            System.out.println("5. Створити платіж");
            System.out.println("6. Вийти");

            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    System.out.print("Введіть ім'я користувача: ");
                    String name = scanner.nextLine();
                    System.out.print("Введіть номер телефону користувача: ");
                    String phone_number = scanner.nextLine();
                    System.out.print("Введіть електрону пошту користувача: ");
                    String email = scanner.nextLine();
                    System.out.print("Введіть роль користувача: ");
                    String role = scanner.nextLine();
                    customer = new Customer(name, email, phone_number, role);
                    System.out.println("Користувач створений");
                    break;

                case "2":
                    if (customer != null) {
                        System.out.println("Ім'я " + customer.getName());
                        System.out.println("Номер телефону " + customer.getPhone_number());
                        System.out.println("Електрона пошта " + customer.getEmail());
                        System.out.println("Роль " + customer.getRole());
                        System.out.println("Id " + customer.getID());
                    }
                    } else {
                        System.out.println("Користувача ще не створено");
                    }
                    break;

                case "3":
                    System.out.print("Введіть назву моделі: ");
                    String modelName = scanner.nextLine();
                    System.out.print("Введіть категорію моделі: ");
                    String category = scanner.nextLine();
                    System.out.print("Введіть ціну моделі: ");
                    double price = Double.parseDouble(scanner.nextLine());
                    Model model = new Model(modelName, category, price);
                    System.out.println("Модель створена");
                    break;

                case "4":
                    if (user == null) {
                        System.out.println("Спочатку створіть користувача");
                    } else {
                        Order order = new Order(user);
                        System.out.println("Замовлення створено");
                        while (true) {
                            System.out.print("Введіть назву моделі для замовлення: ");
                            String modelNameForOrder = scanner.nextLine();
                            if (modelNameForOrder.isEmpty()) {
                                break;
                            }
                        }
                    }
                    break;

                case "5":
                    if (user == null) {
                        System.out.println("Спочатку створіть користувача");
                    } else {
                        System.out.print("Введіть суму платежу: ");
                        double paymentAmount = Double.parseDouble(scanner.nextLine());
                        System.out.println("Платіж створено");
                    }
                    break;

                case "6":
                    System.out.println("Виходимо");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Неправильний вибір");
            }
        }
    }
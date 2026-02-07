import java.util.Scanner;

class Student {
    String name;
    int age;
    String grade;

    Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
}

class Book {
    String title;
    int year;
    String author;

    Book(String title, int year, String author) {
        this.title = title;
        this.year = year;
        this.author = author;
    }

    void display() {
        System.out.println("Title: " + title + ", Year: " + year + ", Author: " + author);
    }
}

class Product {
    String name;
    double price;
    String category;

    Product(String name, double price, String category) {
        this.name = name;
        this.price = price;
        this.category = category;
    }

    void display() {
        System.out.println("Product: " + name + ", Price: " + price + ", Category: " + category);
    }
}

class BankAccount {
    String accountNumber;
    double balance;

    BankAccount() {
        this.accountNumber = "Default";
        this.balance = 0.0;
    }

    BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    void display() {
        System.out.println("Account: " + accountNumber + ", Balance: " + balance);
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        int w = 10;
        while (w >= 1) {
            System.out.print(w + " ");
            w--;
        }
        System.out.println();

        for (int i = 0; i <= 100; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        int divNum = 24;
        for (int i = 1; i <= divNum; i++) {
            if (divNum % i == 0) System.out.print(i + " ");
        }
        System.out.println();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println("Is Prime: " + isPrime);

        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) System.out.println("FizzBuzz");
            else if (i % 3 == 0) System.out.println("Fizz");
            else if (i % 5 == 0) System.out.println("Buzz");
            else System.out.println(i);
        }

        long f1 = 0, f2 = 1, f3 = 0;
        for (int i = 2; i < 25; i++) {
            f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        System.out.println("25th Fibonacci: " + f2);

        Student s = new Student("Alice", 20, "A");
        s.display();

        Book b = new Book("Java Basics", 2021, "John Smith");
        b.display();

        Product p = new Product("Laptop", 999.99, "Electronics");
        p.display();

        BankAccount ba1 = new BankAccount();
        BankAccount ba2 = new BankAccount("AC123", 5000.0);
        ba1.display();
        ba2.display();
    }
}
